package milionerzy.LifeLines;

public class Fifty_fifty implements LifeLines {

    private boolean used = false;
    @Override
    public boolean active() {
        if(!used) {
            return true;
        }
        else {
            return false;
        }
    }

    public void use() {
        used = true;
    }

    public String name(){
        return "FiftyFifty";
    }

}
