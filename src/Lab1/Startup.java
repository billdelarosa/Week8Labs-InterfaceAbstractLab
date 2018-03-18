
package Lab1;

public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse advJava = new AdvancedJavaCourse("Advanced Java", "155-555", 4.0);
        advJava.setCourseNumber("500-100");
        ProgrammingCourse introToJava = new IntroJavaCourse("Intro to Java", "155-556", 3.0);
        introToJava.setCourseNumber("400-300");
        ProgrammingCourse introToProgramming = new IntroToProgrammingCourse("Intro to Programming", "155-557", 4.0);
        introToProgramming.setCourseNumber("200-100");
        
        /*
         * I believe that instantiating objects in this way is great for handling the creation
            of abstract classes, but in the case where something does not need to be abstract
            it would make more sense to do ObjectType objectName = new ObjectType();
         */
    }
}
