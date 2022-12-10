package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg? 300: 400;
        bill = String.valueOf(price);
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
//        System.out.println(bill);
        bill = String.valueOf(Integer.parseInt(bill) + 80);
    }

    public void addExtraToppings(){
        // your code goes here
        bill = String.valueOf(Integer.parseInt(bill)+ (isVeg ? 70 : 120));
    }

    public void addTakeaway(){
        // your code goes here
        bill = String.valueOf(Integer.parseInt(bill) + 20);
    }

    public String getBill(){
       
        return this.bill;
    }
}
