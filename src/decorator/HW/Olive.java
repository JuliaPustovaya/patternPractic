package decorator.HW;

public class Olive extends ToppingsDecorator {
    
    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getDecriprion() {
        return pizza.getDecriprion() + " with olive ";
    }
    
    @Override
    public int cost() {
        return pizza.cost() + 80;
    }
}
