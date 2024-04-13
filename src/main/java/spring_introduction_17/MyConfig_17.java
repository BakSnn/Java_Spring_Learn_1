package spring_introduction_17;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp_17.properties")
public class MyConfig_17 {
    @Bean
    public Person_17 myPerson_17(){
        return new Person_17(cat_17());
    }

    @Bean
    @Scope("singleton")
    public Pet_17 cat_17(){
        return new Cat_17();
    }
}
