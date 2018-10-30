package robotNoSpring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import robotNoSpring.details.ToshibaHead;
import robotNoSpring.schemes.Hand;
import robotNoSpring.schemes.Head;
import robotNoSpring.schemes.Leg;

@Data
@Component
public class Robot {
    private Head head;
    private Hand hand;
    private Leg leg;


    @Autowired
    public Robot(@Qualifier("sonyHead") Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public  void action(){
        head.thinking();
        hand.catchSomething();
        leg.going();
    }
}
