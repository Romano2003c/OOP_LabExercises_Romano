package taskperf6;
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
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("Choose an option: ");
            int select = scan.nextInt();
            //choose which one to access.
            
            switch (select){
                case 1 -> {
                    if(numUsers>= MAX_USERS){
                        System.out.println("Error: Maximum number of users reached.");
                        break;
                        //if the max users have been reached
                    }
                    System.out.print("Enter a username: ");
                    String newUsername = scan.next();
                    //when creating a username
                    System.out.print("Enter a password: ");
                    var newregisterpass = scan.next();
          
                    for(int i= 0; i < numUsers; i++){
                        if(usernames[i].equals(username)){
                            System.out.println("Error: Username already Exist");
                            loggedIn = true;
                            break;
                            //if you have a common username that exist
                        }
                    }
                        if(loggedIn){
                        System.out.println("Enter your password: ");
                        String newPassword = scan.next();
                        
                        usernames[numUsers] = newUsername;
                        passwords[numUsers] = newPassword;
                        numUsers++;
                        System.out.println("User have successfully registered."); 
                        //when entering a password, which is successfull
                        File file = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\TaskPerf6\\src\\taskperf6\\LoginHistory.txt");
                        //login history.....
                        if(!file.exists()){
                            file.createNewFile();
                        }
                        }
                        
                    }
                    
                case 2 -> {
                    System.out.print("Enter your Username: ");
                    username = scan.next();
                    System.out.print("Enter your Password: ");
                    //if you are done with the registering your user and pass
                    
                    boolean ifUserExist = false;
                    for (int i = 0; i < numUsers; i++){
                        if(usernames[i].equals(username)){
                        if(passwords[i].equals(password)){
                            loggedIn = true;
                            ifUserExist = true;
                            break;
                      }else{
                            System.out.println("Error: Incorrect password, Please try again.");
                            ifUserExist = true;
                            break;
                            //if the password is incorrect
                        }                        
                    }
                   }
                    if(!ifUserExist){
                        System.out.println("Error: User not found.");
                        //if you enter a user that is not registered
                    }
                    break;                
                              
                }
            }
              System.out.println("Welcome," + username + "!");
              //doesn't work can't enter a password nor can't see the log in the notepad
             
    }
  }  
}
