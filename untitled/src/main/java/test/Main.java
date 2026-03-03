package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean("parrot1", Parrot.class);
        System.out.println(p);
        System.out.println(p.getName());

        PersonOne personOne = context.getBean(PersonOne.class);
        System.out.println(personOne);
        System.out.println(personOne.getParrot().getName());

        PersonTwo personTwo = context.getBean(PersonTwo.class);
        System.out.println(personTwo);
        System.out.println(personTwo.getParrot().getName());

        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
        System.out.println(person1.getParrot().getName());

        Person person2 = context.getBean("person1", Person.class);
        System.out.println(person2);
        System.out.println(person2.getParrot().getName());
    }
}
