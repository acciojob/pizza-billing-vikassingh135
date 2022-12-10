package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){
        this.price = isVeg? 300: 400;
        return this.price;
    }

    public void addExtraCheese(){
        price += 80;
    }

    public void addExtraToppings(){
        // your code goes here
         price += (isVeg ? 70 : 120);
    }

    public void addTakeaway(){
        // your code goes here
        price += 20;
    }

    public String getBill(){
        // your code goes here
        this.bill = String.valueOf(price);
        return this.bill;
    }
}
