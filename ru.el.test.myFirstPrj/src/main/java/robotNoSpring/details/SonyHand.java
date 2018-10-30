package robotNoSpring.details;

import robotNoSpring.schemes.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("SonyHand");
    }
}
