package Lab1;

import javax.swing.JOptionPane;

public class IntroToProgrammingCourse extends ProgrammingCourse {


    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        System.out.println(prerequisites + " cannot be set as a prerequisite for Intro to Programming");
    }

    @Override
    public String getPrerequisites() {
        return "No prerequisites";
    }
}
