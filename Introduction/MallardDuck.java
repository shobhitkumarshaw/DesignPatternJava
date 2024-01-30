package Introduction;

public class MallardDuck extends Duck {
    
    public MallardDuck() {
        quackBehavior = new QuackBehavior() {
            
            @Override
            public void quack() {
                System.out.println("Quacking...");
                
            }
        };
        flyBehavior = new FlyWithWings();
    }
}
