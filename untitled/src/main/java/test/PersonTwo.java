package test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PersonTwo {

    private String name;
    private final Parrot parrot;

    public PersonTwo(@Qualifier("parrot2")Parrot parrot){
        this.parrot = parrot;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return this.name;
    }

    public Parrot getParrot(){
        return this.parrot;
    }
}
