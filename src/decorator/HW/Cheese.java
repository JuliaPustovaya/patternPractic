package decorator.HW;

public class Cheese extends ToppingsDecorator {
    Cheese(Pizza p){
        this.pizza = p;
    }
    @Override
    public String getDecriprion() {
        return pizza.getDecriprion() + " + with cheese ";
    }
    
    @Override
    public int cost() {
        return pizza.cost() + 7;
    }
}
