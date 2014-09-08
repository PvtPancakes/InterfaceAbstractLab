package lab1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Erik
 */
public class Lab1Start {
 
    /**
     * This method of inheritance is extremely useful because I was able to eliminate
     * many lines of code that were being reused multiple times. This makes the
     * classes much simpler and allows me to provide a template for the subclasses
     * to follow. Also, adding on more Course classes would be very easy and not
     * as time consuming as it would have been before using inheritance.
     * 
     */
    
    public static void main(String[] args) {
        
        /**
         * Using this method of instantiation is helpful because it allows for 
         * any subclass of JavaCourse to be instantiated instead of a specific one.
         * Also, any of the super classes properties and methods can be used and 
         * if the subclass methods were needed, it is simple enough to cast them
         * into their correct type.
         */
        
        Course course1 = new AdvancedJavaCourse("Advanced Java", "152-129");
        Course course2 = new IntroJavaCourse("Intro to Java", "152-526");
        Course course3 = new IntroToProgrammingCourse("Intro to Programming", "152-846");
        
        course1.createCourse(3,"Intro To Programming");
        course2.createCourse(4,"Intro To Programming");
        course3.createCourse(2,"");
        
    }
    
}
