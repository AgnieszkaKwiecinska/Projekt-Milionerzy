package com.company.LifeLines;

public class Audience implements LifeLines {

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
        return "Publiczność";
    }
}
