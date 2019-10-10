package com.company;

public class ExtraBurger  extends Burger {

        private String Extra1Name;
        private double Extra1Price;

        private String Extra2Name;
        private double Extra2Price;

        public ExtraBurger(String meat, double price) {
            super("Healthy", meat, price, "Brown rye");
        }

        public void addExtraAddition1(String name, double price) {
            this.Extra1Name = name;
            this.Extra1Price = price;
        }

        public void addExtraAddition2(String name, double price) {
            this.Extra2Name = name;
            this.Extra2Price = price;
        }

        @Override
        public double itemizeBurger() {
            double burgerPrice = super.itemizeBurger();
            if(this.Extra1Name != null) {
                burgerPrice += this.Extra1Price;
                System.out.println("Added " + this.Extra1Name + " for an extra " + this.Extra1Price);
            }
            if(this.Extra2Name != null) {
                burgerPrice += this.Extra2Price;
                System.out.println("Added " + this.Extra2Name + " for an extra " + this.Extra2Price);
            }

            return burgerPrice;
        }
    }


