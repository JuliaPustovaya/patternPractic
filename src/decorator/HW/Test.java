package decorator.HW;

public class Test {
    public static void main(String[] args) {
        Pizza p = new ThickCrustPizza();
        p = new Cheese(new Olive(new Peppers(p)));
        System.out.println(p.getDecriprion() + " cost= " + p.cost());
    }
}
