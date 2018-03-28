package com.pyk.chapter3;

/* Create a class called Dog containing two Strings: name and says.
 * In main(), create two dog objects with names "spot" (who says "Ruff!") and
 * "scruffy" (who says "Wurf!").  Then display their names and what they say.
 */
class Dog {
    String name;
    String says;
    void setName(String n){
        name = n;
    }
    void showName(){
        System.out.println("name:" + name);
    }

    void setSays(String s){
        says = s;
    }
    void showSays(){
        System.out.println("says:" + says);
    }
}
public class Exercise5 {
    public static void main(String args[]){
        Dog dog1 = new Dog();
        dog1.setName("spot");
        dog1.setSays("Ruff");
        dog1.showName();
        dog1.showSays();

        Dog dog2 = new Dog();
        dog2.setName("scruffy");
        dog2.setSays("Wurf");
        dog2.showName();
        dog2.showSays();


    }
}
