package robotNoSpring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import robotNoSpring.Robot;
import robotNoSpring.details.SonyHand;
import robotNoSpring.details.SonyHead;
import robotNoSpring.details.SonyLegs;
import robotNoSpring.details.ToshibaHead;

@Configuration
@ComponentScan(basePackageClasses = Robot.class)
public class AppConfig {

    @Bean
    public SonyHand sonyHand(){   //sonyHand(){   -- ID
        return new SonyHand();
    }
    @Bean
    public SonyHead sonyHead(){
        return new  SonyHead();
    }

    @Bean
    public SonyLegs sonyLegs(){
        return new SonyLegs();
    }

    @Bean
    public ToshibaHead toshibaHead(){
        return new ToshibaHead();
    }
}
