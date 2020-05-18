package decorator.HW;

public class ThickCrustPizza extends Pizza {
    @Override
    public String getDecriprion() {
        return "ThickCrustPizza";
    }
    
    @Override
    public int cost() {
        return 12;
    }
}
