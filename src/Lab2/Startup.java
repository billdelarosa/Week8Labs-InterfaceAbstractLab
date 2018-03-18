
package Lab2;

public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse advJava = new AdvancedJavaCourse("Advanced Java", "222-2222", 4.0);
        advJava.setCredits(3.0);
        
        ProgrammingCourse introToProgramming = new IntroToProgrammingCourse("Intro To Programming", "333-3333", 3.0);
        introToProgramming.setCredits(2.0);
        
        ProgrammingCourse introToJava = new IntroJavaCourse("Intro to Java", "444-4444", 3.5);
        introToJava.setCredits(3.0);
        
        /*
        I believe that writing code in this way increases overall readability and gives the code a sense of hierarchy that makes
        sense and is easy to replicate and expand onto. 
        
        LSP can be used when it is possible to use a superclass with subclasses that can be derived from it. In 
        situations where a superclass would not be practical for subclasses to inherit from a superclass it would
        probably be better to go without it. 
        */
    }
}
