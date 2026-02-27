import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }
}
