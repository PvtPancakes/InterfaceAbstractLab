package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course {

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    private void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    @Override
    public String toString(){
        return "Class: " + getCourseName() + ", " + getCredits() + ", " + 
                getPrerequisites() + ", " + getCourseNumber();
    }
    
    @Override
    public void createCourse(int credits, String prerequisites) {
        setCredits(credits);
        setPrerequisites(prerequisites);
        System.out.println(this.toString());
    }
}
