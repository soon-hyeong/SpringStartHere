package test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "test")
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Person person1(Parrot parrot1){
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot1);
        return p;
    }

    @Bean
    public Person person2(@Qualifier("parrot2") Parrot parrot){
        Person p = new Person();
        p.setName("Robinson");
        p.setParrot(parrot);
        return p;
    }
}
