package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean topping;
    private Boolean cheese;
    private Boolean paper_bag;
    private int topping_charge;
    private Boolean isBillGenerated;
    private int total;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg? 300: 400;
        topping_charge = isVeg ? 70 : 120;
        cheese = false;
        topping = false;
        paper_bag = false;
        isBillGenerated = false;
        total = this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(cheese) return;
        cheese = true;
        total += 80;
    }

    public void addExtraToppings(){
         if(topping) return;
         topping = true;
         total += topping_charge;
    }

    public void addTakeaway(){
        if(paper_bag) return;
         paper_bag = true;
         total += 20;
    }

    public String getBill(){

        if(isBillGenerated) return bill;
        isBillGenerated = true;
         bill = ("Base Price Of The Pizza: "+this.price+"\n");
         if(cheese) {
             bill += ("Extra Cheese Added: "+80+"\n");
         }
         
         if(topping) {
             bill += ("Extra Toppings Added: "+topping_charge+"\n");
         }
         
         if(paper_bag) {
             bill += ("Paperbag Added: "+20+"\n");
         }
         
         bill += ("Total price: "+total+"\n");
         return bill;
    }
}
