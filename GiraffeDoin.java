package Animal;


public class GiraffeDoin {
    public static void main(String[]args){
        Giraffe giraffe = new Giraffe(100);
        giraffe.eatGrass();
        giraffe.run();
        giraffe.displayEnergy();
        giraffe.sleep();
        giraffe.displayEnergy(); 
        System.out.println();       
        Bull bull = new Bull(100);
        bull.consumehay();
        bull.ram();
        bull.displayEnergy();
        bull.ram();
        bull.displayEnergy();
        System.out.println();       
        Eagle eagle = new Eagle(100);
        eagle.fly();
        eagle.rest();
        eagle.displayEnergy();
        eagle.fly();
        eagle.displayEnergy();
        System.out.println();
    }
}