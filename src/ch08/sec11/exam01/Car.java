package ch08.sec11.exam01;

public class Car {
    //필드
    TIre tire1 = new HankookTire();
    TIre tire2 = new HankookTire();

    //메소드
    void run() {
        tire1.roll();
        tire2.roll();
    }
}
