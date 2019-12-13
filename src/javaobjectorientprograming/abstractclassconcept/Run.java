package javaobjectorientprograming.abstractclassconcept;

public class Run {
    public static void main(String[] args) {
        MathOperation mathOperation;
        mathOperation = new MathIntOperation();
        mathOperation.sum();
        mathOperation = new MathFloatOperation();
        mathOperation.sum();
        mathOperation.message();

    }
}
