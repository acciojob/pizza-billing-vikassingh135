package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean isExtraCheese;
    private Boolean isExtraTopping;
    private Boolean isTake;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg? 300: 400;
        isExtraCheese = false;
        isExtraTopping = false;
        isTake = true;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        isExtraCheese = true;
    }

    public void addExtraToppings(){
       isExtraTopping = true;
    }

    public void addTakeaway(){
        isTake = true;
    }

    private int total = price;
    public String getBill(){
       if(isExtraCheese) total += 80;
       if(isExtraCheese) total += (isVeg ? 70 : 120);
       if(isTake) total += 20;
       return String.valueOf(total);
    }
}
