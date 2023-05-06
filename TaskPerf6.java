import java.util.*;
import java.io.File;
import java.io.IOException;



public class TaskPerf6 {
    private static final int MAX_USERS = 5;
    private static final String[] usernames = new String[MAX_USERS];
    private static final String[] passwords = new String[MAX_USERS];
    private static int numUsers = 0;

    
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean loggedIn = false;
        String username = "";
        String password = "";
        
        while(!loggedIn){
            System.out.println("Welcome!");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.print("Choose an option: ");
            int select = scan.nextInt();
            //choose which one to access.
            
            switch (select){
                case 1 : {
                    if(numUsers>= MAX_USERS){
                        System.out.println("Error: Maximum number of users reached.");
                        break;
                        //if the max users have been reached
                    }
                    System.out.print("Enter a username: ");
                    String newUsername = scan.next();
                    //when creating a username
                    System.out.print("Enter a password: ");
                    String newPassword = scan.next();
          
                    for(int i= 0; i < numUsers; i++){
                        if(usernames[i].equals(username)){
                            System.out.println("Error: Username already Exist");
                            loggedIn = true;
                            break;
                            //if you have a common username that exist
                        }
                    }    
                        usernames[numUsers] = newUsername;
                        passwords[numUsers] = newPassword;
                        numUsers++;
                        System.out.println("User have successfully registered."); 
                        break;
                    }
                    
                case 2 : {
                    System.out.print("Enter your Username: ");
                    username = scan.next();
                    System.out.print("Enter your Password: ");
                    password = scan.next();
                    
                    boolean ifUserExist = false;
                    for (int i = 0; i < numUsers; i++){
                        if(usernames[i].equals(username)){
                        if(passwords[i].equals(password)){
                            loggedIn = true;
                            ifUserExist = true;
                      }else{
                            System.out.println("Error: Incorrect password, Please try again.");
                            ifUserExist = true;
                            break;
                        }                        
                    }
                   }
                    if(!ifUserExist){
                        System.out.println("Error: User not found.");
                        //if you enter a user that is not registered
                    }
                    if(loggedIn){
                        System.out.println("Login Successful");
                        break;
                    }
                    break;                           
                }
                default : {
                    break;
                }   

            }      
    }
  }  
}
