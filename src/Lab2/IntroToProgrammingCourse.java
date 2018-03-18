package Lab2;

import javax.swing.JOptionPane;


public class IntroToProgrammingCourse implements ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("courseNumber cannot be null or empty");
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("credits must be between 0.5 and 4.0");
        }
        this.credits = credits;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("courseName cannot be null or empty");
        }
        this.courseName = courseName;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        
    }

    @Override
    public String getPrerequisites() {
        return "No prerequisites";
    }
    
}
