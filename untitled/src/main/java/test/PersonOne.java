package test;

import org.springframework.stereotype.Component;

@Component
public class PersonOne {

    private String name;
    private final Parrot parrot;

    public PersonOne(Parrot parrot1){
        this.parrot = parrot1;
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
