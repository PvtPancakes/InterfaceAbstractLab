package lab2;

/**
 *
 * @author Erik
 */
public class Lab2Start {
    
    /**
     * Inheritance through an Interface is safer and more flexible than an abstract
     * or concrete class, but can result in having to implement the same code multiple
     * times if used in certain situations. Inheritance in general is really useful
     * because it allows for cleaner, less repetitive code.
     * 
     * Liskov Substitution can be used to declare a subclass as its superclass, but
     * won't work the other way around. Because a Dog "is a" Animal, a Dog can be
     * declared as an Animal through Polymorphism, but an Animal cannot be declared
     * as a Dog because that isn't always true.
     *  
     */
    
    public static void main(String[] args) {
        
        Course course1 = new AdvancedJavaCourse("Advanced Java", "152-129");
        Course course2 = new IntroJavaCourse("Intro to Java", "152-526");
        Course course3 = new IntroToProgrammingCourse("Intro to Programming", "152-846");
        
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
