package Animal;

public class Giraffe extends Animal {
public Giraffe(int ELevel){
    super(ELevel);
}    
public void eatGrass(){
    System.out.println("The Giraffe ate Grass");
    ELevel += 10;
}
public void run(){
    System.out.println("The Giraffe just ran");
    ELevel -= 20;
}
public void sleep(){
    System.out.println("The Giraffe Slept");
    ELevel += 10;
}
}
