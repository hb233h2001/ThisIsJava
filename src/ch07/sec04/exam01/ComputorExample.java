package ch07.sec04.exam01;

public class ComputorExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적: " + calculator.areaCircle(r));
        System.out.println();
        Computor computor = new Computor();
        System.out.println("원 면적: " + computor.areaCircle(r));
    }
}
