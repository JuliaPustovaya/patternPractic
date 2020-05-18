package decorator.HW;

public class Peppers extends ToppingsDecorator {
    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getDecriprion() {
        return pizza.getDecriprion() + " with pepper ";
    }
    
    @Override
    public int cost() {
        return pizza.cost() + 340;
    }
}
