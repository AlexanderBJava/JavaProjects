package robotNoSpring;

import robotNoSpring.details.SonyHand;
import robotNoSpring.details.SonyLegs;
import robotNoSpring.details.ToshibaHead;
import robotNoSpring.schemes.Hand;
import robotNoSpring.schemes.Head;
import robotNoSpring.schemes.Leg;

import java.awt.*;

public class RobotConstructor {
    Robot robot;
    Head head=new ToshibaHead();
    Hand hand=new SonyHand();
    Leg leg=new SonyLegs();




  public  void construct(){
        robot=new Robot(head,hand,leg);
  }



}
