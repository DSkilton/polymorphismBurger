package com.TimBuchalka;

public class Main {

    public static void main(String[] args) {

    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
    double price = hamburger.itemiseHamburger();
    hamburger.addHamburgerAddition1("Tomato", 0.27);
    hamburger.addHamburgerAddition2("Lettuce", 0.75);
    hamburger.addHamburgerAddition3("Cheese", 1.13);
    System.out.println("Total Burger price is " + hamburger.itemiseHamburger());

    HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
    healthyBurger.addHealthAddition1("Egg", 5.43);
    System.out.println("Total Healthy Burger price is " + healthyBurger.itemiseHamburger());

    healthyBurger.itemiseHamburger();



    }
}
