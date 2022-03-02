package com.perscholas.java_basics;

public class StoneMonster extends Monster {

    public StoneMonster(String name) {
        super(name);
    }

        @Override
        public String attack() {
            super.attack();
            return attack3();
        }

    public String attack3(){
       return " Fight with Stones 💨💨💨💨💨💨 !!";
    }
}
