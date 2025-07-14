import java.util.Scanner;
public class Receipt
{
    String name = "None";
    String firstorder = "None";
    double firstorderprice = 0;
    String secondorder = "None";
    double secondorderprice = 0;
    String drink = "None";
    double drinkprice = 0;
    public Receipt(String name, String firstorder, double firstorderprice, String secondorder, double secondorderprice, String drink, double drinkprice){
        this.name = name;
        this.firstorder = firstorder;
        this.firstorderprice = firstorderprice;
        this.secondorder = secondorder;
        this.secondorderprice = secondorderprice;
        this.drink = drink;
        this.drinkprice = drinkprice;
    }
    private void receiptOrder(Scanner sc){
        System.out.println();
        System.out.println("Here is your receipt:");
        System.out.println();
        System.out.print("        215 Blossom Blvd, CA USA");
        System.out.println("\n----------------------------------------");
        System.out.println(firstorder+":"+"$"+firstorderprice);
        System.out.println(secondorder+":"+"$"+secondorderprice);
        System.out.println(drink+":"+"$"+drinkprice);
        System.out.println("Subtotal:$"+(firstorderprice+secondorderprice+drinkprice));
        System.out.println("----------------------------------------");
    }
    private void goodbye(Scanner sc){
        System.out.println("Thank you for dining with us, " + name +"!");
    }
    public static void main(String[] args){
        String firstOrder = "None";
        double firstOrderPrice = 0;
    
        String secondOrder = "None";
        double secondOrderPrice = 0;
        
        String Drink = "None";
        double DrinkPrice = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to Oishii Palace!");
        System.out.println("What is your name?");
        String userName = sc.nextLine();
        
        //firstorder
        System.out.println();
        
        System.out.println("What would you like to start with today?");
        System.out.println("----------------------------------------");
        System.out.println("Here are our Appetizers:");
        System.out.println();
        
        String[] app = {"Karage Chicken", "Cucumber Tsukemono", "Seasame Salad", "Daikon Sunomono", "Edamame", "Onigiri Rice Ball"};
        double[] appPrice = {4.99, 3.99, 3.99, 2.99, 1.99, 3.99};
        for (int i=0; i < app.length; i++){
            System.out.println(app[i]+":"+" $"+appPrice[i]);
        }
        System.out.println("----------------------------------------");
        firstOrder = sc.nextLine();
        System.out.println("Got it, " + userName + " !");
        for (int i=0; i < app.length; i++){
            if (firstOrder.equalsIgnoreCase(app[i])){
                firstOrderPrice = appPrice[i];
            }
        }
        
        
        //second order
        System.out.println("Is there anything else I can get for you? (y/n)");
        String yn = sc.nextLine();
        if (yn.equalsIgnoreCase("yes")||yn.equalsIgnoreCase("y")){
            System.out.println("----------------------------------------");
            System.out.println("Here is our menu list:");
            String [] menu = {"Miso Udon", "Chicken Katsu Curry", "Tonkotsu Ramen", "Sushi Nigiri", "Beef Sukiyaki"};
            double [] menuPrice = {9.99, 11.99, 12.99, 8.99, 10.99};
            for (int j=0; j < menu.length; j++){
                System.out.println(menu[j]+":"+"$"+menuPrice[j]);
            }
            System.out.println("----------------------------------------");
            System.out.println();
            secondOrder = sc.nextLine();
            for (int j=0; j < menu.length; j++){
                if (secondOrder.equalsIgnoreCase(menu[j])){
                    secondOrderPrice = menuPrice[j];
                }
            }
            
            //Drink
            System.out.println("Got it, and any drinks?");
            System.out.println("----------------------------------------");
            System.out.println("Here is our drink list:");
            String [] drinkity = {"Ume Mocktail", "Strawberry Calpico", "Matcha Latte", "Hojicha Tea", "Water"};
            double [] drinkityPrice = {6.99, 2.99, 4.99, 1.99, 0.00};
            for (int k=0; k < drinkity.length; k++){
                System.out.println(drinkity[k]+":"+"$"+drinkityPrice[k]);
            }
            System.out.println("----------------------------------------");
            Drink = sc.nextLine();
            for (int k=0; k < drinkity.length; k++){
                if (Drink.equalsIgnoreCase(drinkity[k])){
                    DrinkPrice = drinkityPrice[k];
                }
            }
            Receipt p = new Receipt(userName, firstOrder, firstOrderPrice, secondOrder, secondOrderPrice, Drink, DrinkPrice);
            System.out.println("Would you like your receipt? (y/n)");
            String ynrd = sc.nextLine();
            if (ynrd.equalsIgnoreCase("yes")||ynrd.equalsIgnoreCase("y")){
                p.receiptOrder(sc);
                System.out.println("Thank you for dining with us "+userName+"!");
            }
            else{
                System.out.println("Thank you for dining with us "+userName+"!");
            }
            
            
            
            
        } 
        else{
            System.out.println("Ok!\nWould you like your receipt? (y/n)");
            String ynr = sc.nextLine();
            if (ynr.equalsIgnoreCase("yes")||ynr.equalsIgnoreCase("y")){
                Receipt d = new Receipt(userName, firstOrder, firstOrderPrice, secondOrder, secondOrderPrice, Drink, DrinkPrice);
                d.receiptOrder(sc);
            }
            else{
                System.out.println("Thank you for dining with us "+userName+"!");
    
            }
            
        }
}
}
    
