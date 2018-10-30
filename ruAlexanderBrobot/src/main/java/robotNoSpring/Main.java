package robotNoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import robotNoSpring.config.AppConfig;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

         Robot robot=context.getBean(Robot.class);
       // robot=(Robot) context.getBean("Robot");

        robot.action();
    }
}
