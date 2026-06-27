package com.sharmila.quizsphere.config;

import org.springframework.stereotype.Component;

import com.sharmila.quizsphere.entity.Question;
import com.sharmila.quizsphere.entity.Quiz;
import com.sharmila.quizsphere.repository.QuestionRepository;
import com.sharmila.quizsphere.repository.QuizRepository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataLoader {

    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;

    @PostConstruct
    public void loadData() {

        // Don't insert again if quizzes already exist
       if (quizRepository.count() > 0) {
    return;
}


        Quiz javaQuiz = quizRepository.save(
                Quiz.builder()
                        .title("Java Basics")
                        .category("Java")
                        .duration(20)
                        .build());

        Quiz pythonQuiz = quizRepository.save(
                Quiz.builder()
                        .title("Python Fundamentals")
                        .category("Python")
                        .duration(20)
                        .build());

        Quiz jsQuiz = quizRepository.save(
                Quiz.builder()
                        .title("JavaScript Essentials")
                        .category("JavaScript")
                        .duration(20)
                        .build());

        Quiz dbmsQuiz = quizRepository.save(
                Quiz.builder()
                        .title("DBMS Concepts")
                        .category("DBMS")
                        .duration(20)
                        .build());

        Quiz osQuiz = quizRepository.save(
                Quiz.builder()
                        .title("Operating System")
                        .category("OS")
                        .duration(20)
                        .build());

        Quiz networkQuiz = quizRepository.save(
                Quiz.builder()
                        .title("Computer Networks")
                        .category("Networks")
                        .duration(20)
                        .build());

        Quiz aptitudeQuiz = quizRepository.save(
                Quiz.builder()
                        .title("Aptitude Test")
                        .category("Aptitude")
                        .duration(20)
                        .build());

        Quiz aiQuiz = quizRepository.save(
                Quiz.builder()
                        .title("Artificial Intelligence")
                        .category("AI/ML")
                        .duration(20)
                        .build());

        Quiz htmlQuiz = quizRepository.save(
                Quiz.builder()
                        .title("HTML & CSS")
                        .category("Programming")
                        .duration(20)
                        .build());

        Quiz springQuiz = quizRepository.save(
                Quiz.builder()
                        .title("Spring Boot")
                        .category("Programming")
                        .duration(20)
                        .build());

questionRepository.save(
        Question.builder()
                .quiz(javaQuiz)
                .questionText("What does JVM stand for?")
                .optionA("Java Virtual Machine")
                .optionB("Java Variable Method")
                .optionC("Java Vendor Machine")
                .optionD("Java Verified Machine")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(javaQuiz)
                .questionText("Which keyword is used to inherit a class?")
                .optionA("implements")
                .optionB("inherits")
                .optionC("extends")
                .optionD("instanceof")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(javaQuiz)
                .questionText("Which method is the entry point of a Java program?")
                .optionA("run()")
                .optionB("main()")
                .optionC("start()")
                .optionD("execute()")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(javaQuiz)
                .questionText("Java is a _____ language.")
                .optionA("Compiled only")
                .optionB("Interpreted only")
                .optionC("Platform Independent")
                .optionD("Machine Dependent")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(javaQuiz)
                .questionText("Which package is automatically imported in every Java program?")
                .optionA("java.io")
                .optionB("java.util")
                .optionC("java.lang")
                .optionD("java.sql")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(javaQuiz)
                .questionText("Which operator compares two values?")
                .optionA("=")
                .optionB("==")
                .optionC("!=")
                .optionD(":=")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(javaQuiz)
                .questionText("Which keyword is used to create an object?")
                .optionA("this")
                .optionB("class")
                .optionC("new")
                .optionD("create")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(javaQuiz)
                .questionText("Which loop executes at least once?")
                .optionA("for")
                .optionB("while")
                .optionC("foreach")
                .optionD("do-while")
                .correctAnswer("D")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(javaQuiz)
                .questionText("Which collection allows duplicate elements?")
                .optionA("Set")
                .optionB("Map")
                .optionC("List")
                .optionD("None")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(javaQuiz)
                .questionText("Which exception occurs when dividing by zero?")
                .optionA("IOException")
                .optionB("ArithmeticException")
                .optionC("SQLException")
                .optionD("NumberFormatException")
                .correctAnswer("B")
                .build());
                // ==========================
// PYTHON QUESTIONS
// ==========================

questionRepository.save(
        Question.builder()
                .quiz(pythonQuiz)
                .questionText("Who developed Python?")
                .optionA("James Gosling")
                .optionB("Guido van Rossum")
                .optionC("Dennis Ritchie")
                .optionD("Bjarne Stroustrup")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(pythonQuiz)
                .questionText("Which keyword is used to define a function?")
                .optionA("function")
                .optionB("define")
                .optionC("def")
                .optionD("fun")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(pythonQuiz)
                .questionText("Which data type stores True or False?")
                .optionA("String")
                .optionB("Boolean")
                .optionC("Integer")
                .optionD("Float")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(pythonQuiz)
                .questionText("Which symbol is used for comments?")
                .optionA("//")
                .optionB("#")
                .optionC("<!--")
                .optionD("/*")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(pythonQuiz)
                .questionText("Which function prints output?")
                .optionA("echo()")
                .optionB("display()")
                .optionC("print()")
                .optionD("show()")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(pythonQuiz)
                .questionText("Which collection is ordered and mutable?")
                .optionA("Tuple")
                .optionB("Set")
                .optionC("List")
                .optionD("Dictionary")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(pythonQuiz)
                .questionText("Which keyword is used for loops?")
                .optionA("repeat")
                .optionB("for")
                .optionC("iterate")
                .optionD("loop")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(pythonQuiz)
                .questionText("Which operator is used for exponentiation?")
                .optionA("^")
                .optionB("**")
                .optionC("*")
                .optionD("//")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(pythonQuiz)
                .questionText("Python is a _____ language.")
                .optionA("Compiled only")
                .optionB("Interpreted")
                .optionC("Assembly")
                .optionD("Machine")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(pythonQuiz)
                .questionText("Which keyword is used for exception handling?")
                .optionA("catch")
                .optionB("try")
                .optionC("error")
                .optionD("throw")
                .correctAnswer("B")
                .build());
                // ==========================
// JAVASCRIPT QUESTIONS
// ==========================

questionRepository.save(
        Question.builder()
                .quiz(jsQuiz)
                .questionText("JavaScript is mainly used for?")
                .optionA("Database")
                .optionB("Web Development")
                .optionC("Operating System")
                .optionD("Networking")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(jsQuiz)
                .questionText("Which keyword declares a block-scoped variable?")
                .optionA("var")
                .optionB("int")
                .optionC("let")
                .optionD("define")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(jsQuiz)
                .questionText("Which company developed JavaScript?")
                .optionA("Microsoft")
                .optionB("Netscape")
                .optionC("Google")
                .optionD("Oracle")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(jsQuiz)
                .questionText("Which method displays output in the browser console?")
                .optionA("console.print()")
                .optionB("console.log()")
                .optionC("print()")
                .optionD("show()")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(jsQuiz)
                .questionText("Which symbol starts a single-line comment?")
                .optionA("#")
                .optionB("//")
                .optionC("/*")
                .optionD("<!--")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(jsQuiz)
                .questionText("Which operator checks equality with type?")
                .optionA("==")
                .optionB("=")
                .optionC("===")
                .optionD("!=")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(jsQuiz)
                .questionText("Which function converts JSON to an object?")
                .optionA("JSON.parse()")
                .optionB("JSON.stringify()")
                .optionC("parseJSON()")
                .optionD("convert()")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(jsQuiz)
                .questionText("DOM stands for?")
                .optionA("Document Object Model")
                .optionB("Data Object Model")
                .optionC("Document Oriented Method")
                .optionD("Dynamic Object Method")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(jsQuiz)
                .questionText("Which event occurs when a button is clicked?")
                .optionA("hover")
                .optionB("submit")
                .optionC("click")
                .optionD("change")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(jsQuiz)
                .questionText("Which keyword creates a constant?")
                .optionA("var")
                .optionB("let")
                .optionC("const")
                .optionD("static")
                .correctAnswer("C")
                .build());
                // ==========================
// DBMS QUESTIONS
// ==========================

questionRepository.save(
        Question.builder()
                .quiz(dbmsQuiz)
                .questionText("What does DBMS stand for?")
                .optionA("Database Management System")
                .optionB("Data Backup Management System")
                .optionC("Database Memory System")
                .optionD("Data Machine System")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(dbmsQuiz)
                .questionText("Which language is used to interact with databases?")
                .optionA("Java")
                .optionB("Python")
                .optionC("SQL")
                .optionD("HTML")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(dbmsQuiz)
                .questionText("Which SQL command retrieves data?")
                .optionA("GET")
                .optionB("SELECT")
                .optionC("FETCH")
                .optionD("SHOW")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(dbmsQuiz)
                .questionText("Which key uniquely identifies a record?")
                .optionA("Foreign Key")
                .optionB("Candidate Key")
                .optionC("Primary Key")
                .optionD("Composite Key")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(dbmsQuiz)
                .questionText("Which normal form removes partial dependency?")
                .optionA("1NF")
                .optionB("2NF")
                .optionC("3NF")
                .optionD("BCNF")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(dbmsQuiz)
                .questionText("Which SQL command removes a table?")
                .optionA("DELETE")
                .optionB("DROP")
                .optionC("REMOVE")
                .optionD("CLEAR")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(dbmsQuiz)
                .questionText("Which JOIN returns matching rows only?")
                .optionA("LEFT JOIN")
                .optionB("RIGHT JOIN")
                .optionC("INNER JOIN")
                .optionD("FULL JOIN")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(dbmsQuiz)
                .questionText("Which clause filters grouped records?")
                .optionA("WHERE")
                .optionB("HAVING")
                .optionC("ORDER BY")
                .optionD("GROUP BY")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(dbmsQuiz)
                .questionText("Which SQL function counts rows?")
                .optionA("SUM()")
                .optionB("COUNT()")
                .optionC("TOTAL()")
                .optionD("AVG()")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(dbmsQuiz)
                .questionText("Which command inserts new data?")
                .optionA("INSERT")
                .optionB("UPDATE")
                .optionC("ADD")
                .optionD("CREATE")
                .correctAnswer("A")
                .build());
                // ==========================
// OPERATING SYSTEM QUESTIONS
// ==========================

questionRepository.save(
        Question.builder()
                .quiz(osQuiz)
                .questionText("What is the main function of an Operating System?")
                .optionA("Web Browsing")
                .optionB("Managing Computer Resources")
                .optionC("Database Storage")
                .optionD("Programming")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(osQuiz)
                .questionText("Which scheduling algorithm follows FIFO?")
                .optionA("Round Robin")
                .optionB("FCFS")
                .optionC("Priority")
                .optionD("SJF")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(osQuiz)
                .questionText("Which memory is fastest?")
                .optionA("RAM")
                .optionB("Cache")
                .optionC("Hard Disk")
                .optionD("ROM")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(osQuiz)
                .questionText("Which OS is open source?")
                .optionA("Windows")
                .optionB("Linux")
                .optionC("macOS")
                .optionD("DOS")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(osQuiz)
                .questionText("Which memory is volatile?")
                .optionA("ROM")
                .optionB("Hard Disk")
                .optionC("RAM")
                .optionD("DVD")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(osQuiz)
                .questionText("Which component manages files?")
                .optionA("Compiler")
                .optionB("File System")
                .optionC("Assembler")
                .optionD("Loader")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(osQuiz)
                .questionText("Which condition causes deadlock?")
                .optionA("Mutual Exclusion")
                .optionB("Paging")
                .optionC("Compilation")
                .optionD("Booting")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(osQuiz)
                .questionText("Which scheduling algorithm gives equal CPU time?")
                .optionA("Round Robin")
                .optionB("FCFS")
                .optionC("Priority")
                .optionD("SJF")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(osQuiz)
                .questionText("Which memory management technique avoids fragmentation?")
                .optionA("Paging")
                .optionB("Swapping")
                .optionC("Overlay")
                .optionD("Spooling")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(osQuiz)
                .questionText("Booting means?")
                .optionA("Deleting files")
                .optionB("Starting the computer")
                .optionC("Formatting disk")
                .optionD("Installing software")
                .correctAnswer("B")
                .build());
                // ==========================
// COMPUTER NETWORKS QUESTIONS
// ==========================

questionRepository.save(
        Question.builder()
                .quiz(networkQuiz)
                .questionText("What does LAN stand for?")
                .optionA("Local Area Network")
                .optionB("Large Area Network")
                .optionC("Long Area Network")
                .optionD("Linked Area Network")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(networkQuiz)
                .questionText("Which device connects multiple networks?")
                .optionA("Hub")
                .optionB("Switch")
                .optionC("Router")
                .optionD("Repeater")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(networkQuiz)
                .questionText("Which protocol is used to browse websites?")
                .optionA("FTP")
                .optionB("SMTP")
                .optionC("HTTP")
                .optionD("POP3")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(networkQuiz)
                .questionText("Which protocol assigns IP addresses automatically?")
                .optionA("DNS")
                .optionB("DHCP")
                .optionC("FTP")
                .optionD("ARP")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(networkQuiz)
                .questionText("What does IP stand for?")
                .optionA("Internet Protocol")
                .optionB("Internal Process")
                .optionC("Internet Program")
                .optionD("Internal Protocol")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(networkQuiz)
                .questionText("Which layer of the OSI model is responsible for routing?")
                .optionA("Transport")
                .optionB("Network")
                .optionC("Session")
                .optionD("Physical")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(networkQuiz)
                .questionText("Which protocol translates domain names into IP addresses?")
                .optionA("FTP")
                .optionB("SMTP")
                .optionC("DNS")
                .optionD("DHCP")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(networkQuiz)
                .questionText("Which topology connects all devices to a central hub?")
                .optionA("Ring")
                .optionB("Bus")
                .optionC("Star")
                .optionD("Mesh")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(networkQuiz)
                .questionText("Which protocol is used to send emails?")
                .optionA("SMTP")
                .optionB("HTTP")
                .optionC("DNS")
                .optionD("FTP")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(networkQuiz)
                .questionText("Which cable is commonly used for Ethernet?")
                .optionA("Coaxial")
                .optionB("Twisted Pair")
                .optionC("Fiber only")
                .optionD("Serial")
                .correctAnswer("B")
                .build());
                // ==========================
// APTITUDE QUESTIONS
// ==========================

questionRepository.save(
        Question.builder()
                .quiz(aptitudeQuiz)
                .questionText("What is 15 × 8?")
                .optionA("110")
                .optionB("120")
                .optionC("125")
                .optionD("130")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(aptitudeQuiz)
                .questionText("If a train travels 60 km in 1 hour, how far will it travel in 5 hours?")
                .optionA("240 km")
                .optionB("280 km")
                .optionC("300 km")
                .optionD("320 km")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(aptitudeQuiz)
                .questionText("Which number comes next? 2, 4, 8, 16, ?")
                .optionA("20")
                .optionB("24")
                .optionC("30")
                .optionD("32")
                .correctAnswer("D")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(aptitudeQuiz)
                .questionText("What is 25% of 200?")
                .optionA("25")
                .optionB("40")
                .optionC("50")
                .optionD("75")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(aptitudeQuiz)
                .questionText("A rectangle has length 8 and width 5. What is its area?")
                .optionA("13")
                .optionB("40")
                .optionC("26")
                .optionD("45")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(aptitudeQuiz)
                .questionText("Which is the smallest prime number?")
                .optionA("0")
                .optionB("1")
                .optionC("2")
                .optionD("3")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(aptitudeQuiz)
                .questionText("What is the average of 10, 20, 30?")
                .optionA("15")
                .optionB("20")
                .optionC("25")
                .optionD("30")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(aptitudeQuiz)
                .questionText("If x = 5, what is x²?")
                .optionA("10")
                .optionB("20")
                .optionC("25")
                .optionD("30")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(aptitudeQuiz)
                .questionText("Which is the largest number?")
                .optionA("0.9")
                .optionB("0.99")
                .optionC("0.999")
                .optionD("0.9999")
                .correctAnswer("D")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(aptitudeQuiz)
                .questionText("What is the value of 18 ÷ 3?")
                .optionA("3")
                .optionB("6")
                .optionC("9")
                .optionD("12")
                .correctAnswer("B")
                .build());
                // ==========================
// HTML & CSS QUESTIONS
// ==========================

questionRepository.save(
        Question.builder()
                .quiz(htmlQuiz)
                .questionText("What does HTML stand for?")
                .optionA("Hyper Text Markup Language")
                .optionB("High Text Machine Language")
                .optionC("Hyperlink Text Markup Language")
                .optionD("Home Tool Markup Language")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(htmlQuiz)
                .questionText("Which HTML tag is used to create a hyperlink?")
                .optionA("<link>")
                .optionB("<a>")
                .optionC("<href>")
                .optionD("<url>")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(htmlQuiz)
                .questionText("Which CSS property changes the text color?")
                .optionA("background")
                .optionB("font-color")
                .optionC("color")
                .optionD("text-style")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(htmlQuiz)
                .questionText("Which HTML tag is used for the largest heading?")
                .optionA("<heading>")
                .optionB("<head>")
                .optionC("<h1>")
                .optionD("<title>")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(htmlQuiz)
                .questionText("Which CSS property controls the space inside an element?")
                .optionA("margin")
                .optionB("padding")
                .optionC("border")
                .optionD("spacing")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(htmlQuiz)
                .questionText("Which HTML element is used to insert an image?")
                .optionA("<picture>")
                .optionB("<image>")
                .optionC("<img>")
                .optionD("<src>")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(htmlQuiz)
                .questionText("Which CSS property makes text bold?")
                .optionA("font-style")
                .optionB("font-weight")
                .optionC("text-decoration")
                .optionD("font-size")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(htmlQuiz)
                .questionText("Which HTML tag creates a line break?")
                .optionA("<break>")
                .optionB("<lb>")
                .optionC("<br>")
                .optionD("<hr>")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(htmlQuiz)
                .questionText("Which CSS property is used to round element corners?")
                .optionA("border-style")
                .optionB("border-radius")
                .optionC("corner-radius")
                .optionD("radius")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(htmlQuiz)
                .questionText("Which HTML tag is used to create an unordered list?")
                .optionA("<ol>")
                .optionB("<ul>")
                .optionC("<li>")
                .optionD("<list>")
                .correctAnswer("B")
                .build());
                // ==========================
// SPRING BOOT QUESTIONS
// ==========================

questionRepository.save(
        Question.builder()
                .quiz(springQuiz)
                .questionText("Spring Boot is mainly used for?")
                .optionA("Game Development")
                .optionB("Building Java Applications")
                .optionC("Database Design")
                .optionD("Mobile Development")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(springQuiz)
                .questionText("Which annotation marks the main Spring Boot class?")
                .optionA("@Controller")
                .optionB("@SpringBootApplication")
                .optionC("@Component")
                .optionD("@Configuration")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(springQuiz)
                .questionText("Which annotation creates a REST controller?")
                .optionA("@Service")
                .optionB("@Component")
                .optionC("@RestController")
                .optionD("@Repository")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(springQuiz)
                .questionText("Which annotation maps HTTP GET requests?")
                .optionA("@GetMapping")
                .optionB("@PostMapping")
                .optionC("@RequestBody")
                .optionD("@Autowired")
                .correctAnswer("A")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(springQuiz)
                .questionText("Which dependency manager is commonly used with Spring Boot?")
                .optionA("Gradle only")
                .optionB("Maven")
                .optionC("npm")
                .optionD("Composer")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(springQuiz)
                .questionText("Which annotation injects dependencies automatically?")
                .optionA("@Bean")
                .optionB("@Autowired")
                .optionC("@RequestParam")
                .optionD("@Value")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(springQuiz)
                .questionText("Which annotation marks a JPA entity?")
                .optionA("@Table")
                .optionB("@Column")
                .optionC("@Entity")
                .optionD("@Id")
                .correctAnswer("C")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(springQuiz)
                .questionText("Which file contains Spring Boot application properties?")
                .optionA("config.txt")
                .optionB("application.properties")
                .optionC("settings.xml")
                .optionD("pom.properties")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(springQuiz)
                .questionText("Spring Boot uses which embedded server by default?")
                .optionA("Jetty")
                .optionB("Tomcat")
                .optionC("GlassFish")
                .optionD("WildFly")
                .correctAnswer("B")
                .build());

questionRepository.save(
        Question.builder()
                .quiz(springQuiz)
                .questionText("Which annotation maps an HTTP POST request?")
                .optionA("@PutMapping")
                .optionB("@DeleteMapping")
                .optionC("@PostMapping")
                .optionD("@PatchMapping")
                .correctAnswer("C")
                .build());
                // ===========================
// COMPUTER NETWORKS QUIZ
// ===========================

questionRepository.save(Question.builder()
        .quiz(networkQuiz)
        .questionText("What does LAN stand for?")
        .optionA("Local Area Network")
        .optionB("Large Area Network")
        .optionC("Long Area Node")
        .optionD("Logical Access Network")
        .correctAnswer("A")
        .build());

questionRepository.save(Question.builder()
        .quiz(networkQuiz)
        .questionText("Which device connects multiple computers in a LAN?")
        .optionA("Router")
        .optionB("Switch")
        .optionC("Modem")
        .optionD("Gateway")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(networkQuiz)
        .questionText("Which protocol is used to browse websites?")
        .optionA("FTP")
        .optionB("SMTP")
        .optionC("HTTP")
        .optionD("POP3")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(networkQuiz)
        .questionText("Which protocol is used for sending emails?")
        .optionA("SMTP")
        .optionB("HTTP")
        .optionC("FTP")
        .optionD("TCP")
        .correctAnswer("A")
        .build());

questionRepository.save(Question.builder()
        .quiz(networkQuiz)
        .questionText("IP stands for?")
        .optionA("Internet Protocol")
        .optionB("Internal Process")
        .optionC("Input Port")
        .optionD("Internet Port")
        .correctAnswer("A")
        .build());

questionRepository.save(Question.builder()
        .quiz(networkQuiz)
        .questionText("Which layer of OSI model handles routing?")
        .optionA("Transport")
        .optionB("Application")
        .optionC("Network")
        .optionD("Session")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(networkQuiz)
        .questionText("Which cable is commonly used for Ethernet?")
        .optionA("Coaxial")
        .optionB("Fiber Optic")
        .optionC("Twisted Pair")
        .optionD("Telephone Cable")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(networkQuiz)
        .questionText("Which protocol transfers files?")
        .optionA("FTP")
        .optionB("SMTP")
        .optionC("HTTP")
        .optionD("SNMP")
        .correctAnswer("A")
        .build());

questionRepository.save(Question.builder()
        .quiz(networkQuiz)
        .questionText("Which topology connects every device to a central hub?")
        .optionA("Bus")
        .optionB("Ring")
        .optionC("Star")
        .optionD("Mesh")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(networkQuiz)
        .questionText("Which device forwards packets between networks?")
        .optionA("Switch")
        .optionB("Router")
        .optionC("Hub")
        .optionD("Bridge")
        .correctAnswer("B")
        .build());
        // ===========================
// APTITUDE QUIZ
// ===========================

questionRepository.save(Question.builder()
        .quiz(aptitudeQuiz)
        .questionText("What is 25% of 200?")
        .optionA("25")
        .optionB("40")
        .optionC("50")
        .optionD("75")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(aptitudeQuiz)
        .questionText("If a train travels 60 km in 1 hour, how far will it travel in 5 hours?")
        .optionA("240 km")
        .optionB("300 km")
        .optionC("360 km")
        .optionD("400 km")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(aptitudeQuiz)
        .questionText("Find the next number: 2, 4, 8, 16, ?")
        .optionA("18")
        .optionB("24")
        .optionC("30")
        .optionD("32")
        .correctAnswer("D")
        .build());

questionRepository.save(Question.builder()
        .quiz(aptitudeQuiz)
        .questionText("If the cost of 5 pens is ₹100, what is the cost of one pen?")
        .optionA("₹10")
        .optionB("₹15")
        .optionC("₹20")
        .optionD("₹25")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(aptitudeQuiz)
        .questionText("A man buys an item for ₹500 and sells it for ₹650. What is his profit?")
        .optionA("₹100")
        .optionB("₹150")
        .optionC("₹200")
        .optionD("₹250")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(aptitudeQuiz)
        .questionText("What is the average of 10, 20, 30, 40 and 50?")
        .optionA("20")
        .optionB("25")
        .optionC("30")
        .optionD("35")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(aptitudeQuiz)
        .questionText("If x = 12 and y = 8, what is x + y?")
        .optionA("18")
        .optionB("20")
        .optionC("22")
        .optionD("24")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(aptitudeQuiz)
        .questionText("Which number is divisible by both 2 and 5?")
        .optionA("15")
        .optionB("18")
        .optionC("20")
        .optionD("27")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(aptitudeQuiz)
        .questionText("Simplify: 18 ÷ 3 × 2")
        .optionA("6")
        .optionB("9")
        .optionC("12")
        .optionD("15")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(aptitudeQuiz)
        .questionText("What is the square of 15?")
        .optionA("125")
        .optionB("200")
        .optionC("215")
        .optionD("225")
        .correctAnswer("D")
        .build());
        // ===========================
// ARTIFICIAL INTELLIGENCE QUIZ
// ===========================

questionRepository.save(Question.builder()
        .quiz(aiQuiz)
        .questionText("What does AI stand for?")
        .optionA("Artificial Intelligence")
        .optionB("Automated Internet")
        .optionC("Advanced Interface")
        .optionD("Artificial Integration")
        .correctAnswer("A")
        .build());

questionRepository.save(Question.builder()
        .quiz(aiQuiz)
        .questionText("Machine Learning is a subset of?")
        .optionA("Cyber Security")
        .optionB("Artificial Intelligence")
        .optionC("Cloud Computing")
        .optionD("Networking")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(aiQuiz)
        .questionText("Which programming language is most commonly used for AI?")
        .optionA("Python")
        .optionB("HTML")
        .optionC("CSS")
        .optionD("PHP")
        .correctAnswer("A")
        .build());

questionRepository.save(Question.builder()
        .quiz(aiQuiz)
        .questionText("Which library is widely used for Machine Learning in Python?")
        .optionA("Bootstrap")
        .optionB("NumPy")
        .optionC("Scikit-learn")
        .optionD("jQuery")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(aiQuiz)
        .questionText("Which AI technique is used for image recognition?")
        .optionA("Computer Vision")
        .optionB("Networking")
        .optionC("Cloud Storage")
        .optionD("Compiler Design")
        .correctAnswer("A")
        .build());

questionRepository.save(Question.builder()
        .quiz(aiQuiz)
        .questionText("What is the full form of NLP?")
        .optionA("Natural Language Processing")
        .optionB("Network Layer Protocol")
        .optionC("New Logic Program")
        .optionD("Node Level Processing")
        .correctAnswer("A")
        .build());

questionRepository.save(Question.builder()
        .quiz(aiQuiz)
        .questionText("ChatGPT is an example of?")
        .optionA("Database")
        .optionB("AI Language Model")
        .optionC("Operating System")
        .optionD("Web Browser")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(aiQuiz)
        .questionText("Which algorithm is commonly used for classification?")
        .optionA("Linear Regression")
        .optionB("Decision Tree")
        .optionC("Bubble Sort")
        .optionD("Binary Search")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(aiQuiz)
        .questionText("Which of these is an application of AI?")
        .optionA("Virtual Assistants")
        .optionB("Recommendation Systems")
        .optionC("Self-driving Cars")
        .optionD("All of the Above")
        .correctAnswer("D")
        .build());

questionRepository.save(Question.builder()
        .quiz(aiQuiz)
        .questionText("AI systems learn from?")
        .optionA("Data")
        .optionB("Electricity")
        .optionC("Compiler")
        .optionD("Keyboard")
        .correctAnswer("A")
        .build());
        // ===========================
// HTML & CSS QUIZ
// ===========================

questionRepository.save(Question.builder()
        .quiz(htmlQuiz)
        .questionText("What does HTML stand for?")
        .optionA("Hyper Text Markup Language")
        .optionB("High Text Machine Language")
        .optionC("Hyper Transfer Markup Language")
        .optionD("Hyperlink Text Markup Language")
        .correctAnswer("A")
        .build());

questionRepository.save(Question.builder()
        .quiz(htmlQuiz)
        .questionText("Which HTML tag is used to create a hyperlink?")
        .optionA("<link>")
        .optionB("<a>")
        .optionC("<href>")
        .optionD("<url>")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(htmlQuiz)
        .questionText("Which HTML tag is used to insert an image?")
        .optionA("<picture>")
        .optionB("<src>")
        .optionC("<img>")
        .optionD("<image>")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(htmlQuiz)
        .questionText("Which CSS property changes the text color?")
        .optionA("font-color")
        .optionB("text-color")
        .optionC("color")
        .optionD("background-color")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(htmlQuiz)
        .questionText("Which CSS property changes the background color?")
        .optionA("bgcolor")
        .optionB("background-color")
        .optionC("color")
        .optionD("background")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(htmlQuiz)
        .questionText("Which HTML tag creates a line break?")
        .optionA("<break>")
        .optionB("<lb>")
        .optionC("<br>")
        .optionD("<hr>")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(htmlQuiz)
        .questionText("Which CSS property controls the text size?")
        .optionA("font-style")
        .optionB("font-size")
        .optionC("text-size")
        .optionD("size")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(htmlQuiz)
        .questionText("Which HTML tag is used for the largest heading?")
        .optionA("<head>")
        .optionB("<heading>")
        .optionC("<h6>")
        .optionD("<h1>")
        .correctAnswer("D")
        .build());

questionRepository.save(Question.builder()
        .quiz(htmlQuiz)
        .questionText("Which CSS property makes text bold?")
        .optionA("font-weight")
        .optionB("font-style")
        .optionC("text-weight")
        .optionD("bold")
        .correctAnswer("A")
        .build());

questionRepository.save(Question.builder()
        .quiz(htmlQuiz)
        .questionText("Which HTML element is used to create an unordered list?")
        .optionA("<ol>")
        .optionB("<ul>")
        .optionC("<li>")
        .optionD("<list>")
        .correctAnswer("B")
        .build());
        // ===========================
// SPRING BOOT QUIZ
// ===========================

questionRepository.save(Question.builder()
        .quiz(springQuiz)
        .questionText("What is Spring Boot primarily used for?")
        .optionA("Mobile App Development")
        .optionB("Java Web Application Development")
        .optionC("Game Development")
        .optionD("Database Design")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(springQuiz)
        .questionText("Which annotation marks the main Spring Boot application class?")
        .optionA("@SpringApplication")
        .optionB("@SpringBootApplication")
        .optionC("@Application")
        .optionD("@BootApplication")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(springQuiz)
        .questionText("Which annotation is used to create a REST API controller?")
        .optionA("@Controller")
        .optionB("@RestController")
        .optionC("@Service")
        .optionD("@Repository")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(springQuiz)
        .questionText("Which annotation is used for dependency injection?")
        .optionA("@Inject")
        .optionB("@Autowired")
        .optionC("@Bean")
        .optionD("@Component")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(springQuiz)
        .questionText("Which annotation maps HTTP GET requests?")
        .optionA("@PostMapping")
        .optionB("@RequestMapping")
        .optionC("@GetMapping")
        .optionD("@PutMapping")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(springQuiz)
        .questionText("Which layer contains business logic?")
        .optionA("Controller")
        .optionB("Repository")
        .optionC("Service")
        .optionD("Entity")
        .correctAnswer("C")
        .build());

questionRepository.save(Question.builder()
        .quiz(springQuiz)
        .questionText("Spring Boot commonly uses which ORM framework?")
        .optionA("Hibernate")
        .optionB("MyBatis")
        .optionC("JDBC")
        .optionD("MongoDB")
        .correctAnswer("A")
        .build());

questionRepository.save(Question.builder()
        .quiz(springQuiz)
        .questionText("Which file contains Spring Boot configuration?")
        .optionA("pom.xml")
        .optionB("application.properties")
        .optionC("index.html")
        .optionD("settings.xml")
        .correctAnswer("B")
        .build());

questionRepository.save(Question.builder()
        .quiz(springQuiz)
        .questionText("Which annotation maps a Java class to a database table?")
        .optionA("@Entity")
        .optionB("@Table")
        .optionC("@Column")
        .optionD("Both @Entity and @Table")
        .correctAnswer("D")
        .build());

questionRepository.save(Question.builder()
        .quiz(springQuiz)
        .questionText("Which embedded server is used by Spring Boot by default?")
        .optionA("GlassFish")
        .optionB("WildFly")
        .optionC("Tomcat")
        .optionD("Jetty")
        .correctAnswer("C")
        .build());
}
}