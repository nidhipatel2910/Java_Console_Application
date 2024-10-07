
public class Pizza {
 private int price;
 private Boolean veg =false;
 private int basePizzaPrice;
 private int extraCheesePrice=100;
 private int extraTopingsPrice=150;
 private int takeAwayPrice=20;
 private boolean extraCheese =false;
 private boolean extraTopings=false;
 private boolean takeAway =false;


 public Pizza(Boolean veg){
   this.veg=veg;
  if(this.veg){
    this.price=300;
  }
  else{
    this.price=500;
  }
  this.basePizzaPrice=price;

 }
 
 public void extraCheese(){
    this.extraCheese=true;
    this.price += extraCheesePrice;
 }
 public void extraTopings(){
    this.extraTopings=true;
    this.price +=extraTopingsPrice;


 }
 public void takeAway(){
    this.takeAway=true;
    this.price += takeAwayPrice;


 }
 public void getBill(){
    System.out.println("BasePizza Bill");
    System.out.println("Base pizza"+basePizzaPrice);
    if(this.extraCheese){
        System.out.println("Added Extra cheese" + this.extraCheesePrice);
    }
    if(this.extraTopings){
        System.out.println("Added Extra topings" + this.extraTopingsPrice);

    }
    if(this.takeAway){
        System.out.println("Take Away" + this.takeAwayPrice);

    }
    System.out.println("Total Bill" + this.price);
 }

 /*
  *base pizza   -300
  toppings = 150
  cheese =100
  total =total
  */
}