package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isToppingAdded;
    private boolean isCheeseAdded;
    private boolean isPaperBagAdded;
    private int topping_charge;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        bill = ("Base Price Of The Pizza: " + this.price + "\n");
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!isCheeseAdded) {
            isCheeseAdded = true;
            price += 80;
        }
    }

    public void addExtraToppings() {
        if (!isToppingAdded) {
            isToppingAdded = true;
            topping_charge = isVeg ? 70 : 120;
            price += topping_charge;
        }
    }

    public void addTakeaway() {
        if (!isPaperBagAdded) {
            isPaperBagAdded = true;
            price += 20;
        }
    }

    public String getBill() {

        if (isBillGenerated) {
            return bill;
        }
        if (isCheeseAdded) {
            bill += ("Extra Cheese Added: " + 80 + "\n");
        }

        if (isToppingAdded) {
            bill += ("Extra Toppings Added: " + topping_charge + "\n");
        }

        if (isPaperBagAdded) {
            bill += ("Paperbag Added: " + 20 + "\n");
        }

        bill += ("Total Price: " + price + "\n");
        isBillGenerated = true;
        return bill;
    }
}
