package Lab2;


public class IntroJavaCourse implements ProgrammingCourse {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

public IntroJavaCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
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
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
       if(prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("prerequisites cannot be null and cannot be empty");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("courseName cannot be null or empty");
        }
        this.courseName = courseName;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }
    
}
