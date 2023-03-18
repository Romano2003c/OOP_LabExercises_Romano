package Animal;

public class Bull extends Animal {
public Bull(int ELevel){
    super(ELevel);
}    
public void consumehay(){
    System.out.println("The Bull ate hay");
    ELevel += 10;
}
public void ram(){
    System.out.println("The Bull just ram");
    ELevel -= 20;
}
public void idle(){
    System.out.println("The Bull idling");
    ELevel += 10;
}
}
