const API_BASE = 'http://localhost:8080/api';

const API = {
  auth: {
    register: `${API_BASE}/auth/register`,
    login: `${API_BASE}/auth/login`,
  },
  quizzes: {
    all: `${API_BASE}/quizzes`,
    questions: (id) => `${API_BASE}/quizzes/${id}/questions`,
    submit: `${API_BASE}/quizzes/submit`,
  },
  results: {
    user: (id) => `${API_BASE}/results/user/${id}`,
    leaderboard: `${API_BASE}/results/leaderboard`,
    attempts: `${API_BASE}/results/stats/attempts`,
  },
};

// AUTH
function getToken() { return localStorage.getItem('qs_token'); }

function getUser() {
  try { return JSON.parse(localStorage.getItem('qs_user')); }
  catch { return null; }
}

function setAuth(token, user) {
  localStorage.setItem('qs_token', token);
  localStorage.setItem('qs_user', JSON.stringify(user));
}

function clearAuth() {
  localStorage.removeItem('qs_token');
  localStorage.removeItem('qs_user');
}

function isLoggedIn() {
  return !!getToken();
}

function requireAuth() {
  if (!isLoggedIn()) window.location.href = 'login.html';
}

// 🔥 FIXED FETCH (MAIN BUG FIX)
async function apiFetch(url, options = {}) {
  const headers = {
    'Content-Type': 'application/json',
    ...options.headers
  };

  const token = getToken();
  if (token) headers['Authorization'] = `Bearer ${token}`;

  const res = await fetch(url, { ...options, headers });

  const text = await res.text();

  if (!res.ok) {
    throw new Error(text || `HTTP ${res.status}`);
  }

  // 🔥 SAFE PARSE FIX
  try {
    return JSON.parse(text);
  } catch {
    return text; // fallback if backend returns plain string
  }
}

// Toast
function showToast(message, type = 'success') {
  const existing = document.getElementById('qs-toast');
  if (existing) existing.remove();

  const toast = document.createElement('div');
  toast.id = 'qs-toast';
  toast.className = `qs-toast qs-toast-${type}`;
  toast.innerHTML = `
    <span>${message}</span>
  `;

  document.body.appendChild(toast);
  setTimeout(() => toast.remove(), 3000);
}

// Theme
function initTheme() {
  document.documentElement.setAttribute(
    'data-theme',
    localStorage.getItem('qs_theme') || 'light'
  );
}

function toggleTheme() {
  const cur = document.documentElement.getAttribute('data-theme');
  const next = cur === 'dark' ? 'light' : 'dark';
  document.documentElement.setAttribute('data-theme', next);
  localStorage.setItem('qs_theme', next);
}

// Spinner
function showSpinner(btn) {
  btn.dataset.original = btn.innerHTML;
  btn.innerHTML = "Loading...";
  btn.disabled = true;
}

function hideSpinner(btn) {
  btn.innerHTML = btn.dataset.original || "Submit";
  btn.disabled = false;
}

initTheme();