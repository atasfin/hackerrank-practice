package javaobjectorientprograming.Interface;

public class Tiger implements Animal {

    @Override
    public void walk(){
        System.out.println("Tiger cannot climb Tree");
    }
    @Override
    public void run(){
        System.out.println("Tiger can ");
    }
    @Override
    public void live(){
        System.out.println("Tiger live in the den");
    }

    public void teeth(){
        System.out.println("Tiger has sabertooth");
    }
}
