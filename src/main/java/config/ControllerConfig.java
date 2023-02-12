package config;

import android.Data;
import android.TestController;
import android.HelloController;
import chap09.SimpleController;
import chap09.WelcomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static sun.security.util.KnownOIDs.Data;

@Configuration
public class ControllerConfig {

    @Bean
    public HelloController helloController() {return new HelloController(new Data());}

    @Bean
    public SimpleController simpleController() {return new SimpleController();}


    @Bean
    public TestController testController(){
        return new TestController();
    }

    @Bean
    public WelcomeController welcomeController(){
        return new WelcomeController();
    }

}