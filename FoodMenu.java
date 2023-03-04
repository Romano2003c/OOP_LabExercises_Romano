package foodmenu;

import java.util.*;
public class FoodMenu {
String Name = "";
int Price = 0;
 public FoodMenu(String name, int price){
     this.Name = name;
     this.Price = price;
 }    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FoodMenu[] Menu = new FoodMenu[10];
        boolean run = true;   
        do{
            System.out.println("Food Menu");
            System.out.println("1.Insert");
            System.out.println("2.Edit");
            System.out.println("3.View");
            System.out.println("4.Exit");
            System.out.println("Enter your Food Choice");
            int Choice = scan.nextInt();
            if (Choice == 1){
                String Name = scan.next();
                int Price = scan.nextInt();
                FoodMenu Dish = new FoodMenu(Name, Price);
                for(int i = 0; i < 10;i++){
                    if(Menu[i]==null){
                        Menu[i] = Dish;
                        break;                        
                    }
                    if(Menu[i]!= null){
                        if(Menu[i].Name.equals(Dish.Name)){
                            System.out.println("Same Food Name");
                            break;
                        }
                       }
                    }
                }
            else if(Choice == 2){
                String CheckNAme = scan.next();
               }
            else if(Choice == 3){
                System.out.println("Food Menu");
                for(int i = 0; i < Menu.length;i++){
                    System.out.println(Menu[i].Name + " " + Menu[i].Price);
                }
            }
            else if(Choice == 4){
                run = false;
                System.out.println("Food Menu is Closed");
            }
        }while(run);       
    }
}
        
    
    

