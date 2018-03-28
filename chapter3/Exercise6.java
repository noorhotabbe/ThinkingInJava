package com.pyk.chapter3;
/* Create a class called Dog containing two Strings: name and says.
 * Following exercise 5, create a new Dog reference and assign it to spot's
 * object. Test for comparison using == and equals() for all references.
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

public class Exercise6 {
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

        dog1 = dog2;
        System.out.println("dog1 == dog2" + (dog1 == dog2));
        System.out.println("dog1 == dog2" + dog1.equals(dog2));
    }
}
