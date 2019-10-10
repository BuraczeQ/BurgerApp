package com.company;

public class Main {

    public static void main(String[] args) {



               Burger hamburger = new Burger("Basic", "Sausage", 3.56, "White");
                double price = hamburger.itemizeBurger();
                hamburger.addBurgerAddition1("Tomato", 0.27);
                hamburger.addBurgerAddition2("Lettuce", 0.75);
                hamburger.addBurgerAddition3("Cheese", 1.13);
                System.out.println("Total Burger price is " + hamburger.itemizeBurger());

                ExtraBurger extraBurger = new ExtraBurger("Bacon", 5.67);
                extraBurger.addExtraAddition1("Egg", 5.43);
                extraBurger.addExtraAddition2("Lentils", 3.41);
                System.out.println("Total Healthy Burger price is  " + extraBurger.itemizeBurger());

                BurgerWithChipsAndCola theTastyOne = new BurgerWithChipsAndCola();
                theTastyOne.itemizeBurger();







            }
}
