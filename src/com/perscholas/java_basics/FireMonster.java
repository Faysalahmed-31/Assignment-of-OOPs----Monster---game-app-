package com.perscholas.java_basics;

 public class FireMonster extends Monster{

    public FireMonster(String name) {
      super(name);
   }

       public String attack1(){
        return " Fight with fire !! 💥💥💥💥💥";
       }

      @Override
      public String attack() {
       super.attack();
       return attack1();

      }
 }
