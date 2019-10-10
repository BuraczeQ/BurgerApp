package com.company;

public class BurgerWithChipsAndCola  extends Burger {
        public BurgerWithChipsAndCola() {
            super("Deluxe", "Sausage & Bacon", 14.54, "White");
            super.addBurgerAddition1("Chips", 2.75);
            super.addBurgerAddition2("Drink", 1.81);
        }

        @Override
        public void addBurgerAddition1(String name, double price) {
            System.out.println("Cannot not add additional items to a deluxe burger");
        }

        @Override
        public void addBurgerAddition2(String name, double price) {
            System.out.println("Cannot not add additional items to a deluxe burger");
        }

        @Override
        public void addBurgerAddition3(String name, double price) {
            System.out.println("Cannot not add additional items to a deluxe burger");
        }

        @Override
        public void addBurgerAddition4(String name, double price) {
            System.out.println("Cannot not add additional items to a deluxe burger");
        }
    }

