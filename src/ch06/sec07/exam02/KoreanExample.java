package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        //Korean 객체 생성
        Korean K1 = new Korean("박자바", "011225-1234567");
        //Korean 객체 데이터 읽기
        System.out.println("K1.nation : " + K1.nation);
        System.out.println("K1.name : " + K1.name);
        System.out.println("K1.ssn : " + K1.ssn);
        System.out.println();

        //또 다른 Korean 객체 생성
        Korean K2 = new Korean("김자바", "930525-0654321");
        //또 다른 Korean 객체 데이터 읽기
        System.out.println("K2.nation : " + K2.nation);
        System.out.println("K2.name : " + K2.name);
        System.out.println("K2.ssn : " + K2.ssn);
    }
}
