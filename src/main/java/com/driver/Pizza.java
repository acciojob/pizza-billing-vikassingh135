package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg? 300: 400;
        total = price;
        bill = ("Base Price Of The Pizza: "+this.price+"\n");
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        total += 80;
        bill += ("Extra Cheese Added: "+80+"\n");
    }

    public void addExtraToppings(){
       int curr = isVeg ? 70 : 120;
       total += curr;
       bill += ("Extra Toppings Added: "+curr+"\n");
    }

    public void addTakeaway(){
         total += 20;
         bill += ("Paperbag Added: "+20+"\n");
    }

    private int total = price;
    public String getBill(){
         bill += ("Total price: "+total+"\n");
         return bill;
    }
}
