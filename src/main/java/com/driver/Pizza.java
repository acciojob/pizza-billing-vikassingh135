package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int total;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){
        this.price = isVeg? 300: 400;
        this.total = this.price;
        return this.price;
    }

    public void addExtraCheese(){
        this.total += 80;
    }

    public void addExtraToppings(){
        // your code goes here
        this.total += 70;
    }

    public void addTakeaway(){
        // your code goes here
        this.total += 20;
    }

    public String getBill(){
        // your code goes here
        return String.valueOf(total);
    }
}
