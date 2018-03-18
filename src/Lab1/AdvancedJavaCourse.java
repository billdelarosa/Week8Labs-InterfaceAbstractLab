package Lab1;

import javax.swing.JOptionPane;

public class AdvancedJavaCourse extends ProgrammingCourse {
    private String prerequisites;
    
    public AdvancedJavaCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        
    }

    @Override
    public String getPrerequisites(){
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
       }


}
