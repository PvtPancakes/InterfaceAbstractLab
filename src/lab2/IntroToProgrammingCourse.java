package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ITCourse{
    

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }
    
    @Override
    public String toString(){
        return "Class: " + getCourseName() + ", " + getCredits() + ", " + getCourseNumber();
    }
    
}
