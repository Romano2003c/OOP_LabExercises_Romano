package Animal;

public class Eagle extends Animal {
public Eagle(int ELevel){
    super(ELevel);
}    
public void fly(){
    System.out.println("The Eagle fly");
    ELevel -= 20;
}
public void rest(){
    System.out.println("The Eagle rest");
    ELevel += 10;
}
public void eat(){
    System.out.println("The Eagle eat");
    ELevel += 10;
}
}

    