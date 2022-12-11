package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean topping;
    private Boolean cheese;
    private Boolean paper_bag;
    private int topping_charge;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg? 300: 400;
        cheese = false;
        topping = false;
        paper_bag = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        cheese = true;
    }

    public void addExtraToppings(){
        topping = true;
        topping_charge = isVeg ? 70 : 120;
    }

    public void addTakeaway(){
         paper_bag = true;
    }

    public String getBill(){

         int total = price;
         bill = ("Base Price Of The Pizza: "+this.price+"\n");
         if(cheese) {
             total += 80;
             bill += ("Extra Cheese Added: "+80+"\n");
         }
         
         if(topping) {
             total += topping_charge;
             bill += ("Extra Toppings Added: "+topping_charge+"\n");
         }
         
         if(paper_bag) {
             total += 20;
             bill += ("Paperbag Added: "+20+"\n");
         }
         
         bill += ("Total price: "+total+"\n");
         return bill;
    }
}
