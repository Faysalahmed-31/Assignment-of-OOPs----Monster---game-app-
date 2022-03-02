package com.perscholas.java_basics;

public class WaterMonster extends Monster {

    public WaterMonster(String name) {
        super(name);
    }

        @Override
        public String attack() {
            super.attack();
            return attack2();
        }

    public String attack2(){
         return "fight with Water ! 💦💦💦💦💦💦";
    }
}
