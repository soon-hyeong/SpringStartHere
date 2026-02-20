package org.example.main;

import org.example.Parrot;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//            Parrot p = context.getBean(Parrot.class);
//            System.out.println(p.getName());
            String s = context.getBean(String.class);
            System.out.println(s);
            Integer n = context.getBean(Integer.class);
            System.out.println(n);

            Parrot p1 = context.getBean("parrot", Parrot.class);
            System.out.println(p1.getName());
            Parrot p2 = context.getBean("miki", Parrot.class);
            System.out.println(p2.getName());
            Parrot p3 = context.getBean("parrot3", Parrot.class);
            System.out.println(p3.getName());

//          프로그래밍 방식으로 스프링 컨텍스트에 빈 추가
            Parrot p4 = context.getBean(Parrot.class);
            System.out.println(p4.getName());

            Parrot x = new Parrot();
            x.setName("Killkill");

            Supplier<Parrot> parrotSupplier = () -> x;
//            예제에는 bc->bc.setPrimary(true)로 되어있지만, 충돌을 고려하여 false로 설정함. 마지막 인자로 하나 이상의 빈 구성자로 빈의 다양한 특성을 설정할 수 있음을 나타냄.
            context.registerBean("parrot4", Parrot.class, parrotSupplier, bc->bc.setPrimary(false));
            Parrot p5 = context.getBean("parrot4", Parrot.class);
            System.out.println(p5.getName());
    }
}