package javaobjectorientprograming.Interface;

public class Leopard extends Tiger implements Animal{

    @Override
    public void live(){
        System.out.println("Leopard lives in field");
    }
    public void walk(){
        System.out.println("Leopard can climb a Tree");
    }

}
