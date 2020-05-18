package decorator.HW;

public class ThinCrustPizza  extends  Pizza {
    @Override
    public String getDecriprion() {
        return "ThinCrustPizza";
    }
    
    @Override
    public int cost() {
        return 5;
    }
}
