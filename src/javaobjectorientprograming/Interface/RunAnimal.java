package javaobjectorientprograming.Interface;

public class RunAnimal {

    public static void main(String []args){

        Animal tiger = new Tiger();
        Animal leopard = new Leopard();

        tiger.live();
        leopard.live();
    }
}
