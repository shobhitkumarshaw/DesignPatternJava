package Introduction;
import Introduction.*;
public abstract class Duck {

    private String beakColor;
    private String featureColor;

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void perfomQuack() {
        quackBehavior.quack();
    }
    public void perfomFly() {
        flyBehavior.fly();
    }

    public void swim() {

    }

    public void display() {

    }

    
}
