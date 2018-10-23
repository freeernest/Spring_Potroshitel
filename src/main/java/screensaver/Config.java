package screensaver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
import java.util.Random;

/**
 * Created by Erik Feigin on 21/10/2018.
 */
@Configuration
@ComponentScan(basePackages = "screensaver")
public class Config {
    @Bean
    public Color color(){
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
}
