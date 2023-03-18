package Animal;

public class Animal{
    protected int ELevel = 100;
    
    public int displayEnergy(){
        System.out.println("Energy Level: " + ELevel);
        return ELevel;
    }
    public Animal(int ELevel) {
        this.ELevel = ELevel;
             
   }
}


