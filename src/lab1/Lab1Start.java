/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Erik
 */
public class Lab1Start {
 
    public static void main(String[] args) {
        
        JavaCourse course1 = new AdvancedJavaCourse("Advanced Java", "152-129");
        JavaCourse course2 = new IntroJavaCourse("Intro to Java", "152-526");
        JavaCourse course3 = new IntroToProgrammingCourse("Intro to Programming", "152-846");
        
        course1.setCredits(3);
        course2.setCredits(4);
        course3.setCredits(2);
        
        AdvancedJavaCourse advJavaCourse = (AdvancedJavaCourse)course1;
        IntroJavaCourse introJavaCourse = (IntroJavaCourse)course2;
        
        advJavaCourse.setPrerequisites("Intro To Programming");
        introJavaCourse.setPrerequisites("Intro To Programming");
        
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println(course3.toString());
        
    }
    
}
