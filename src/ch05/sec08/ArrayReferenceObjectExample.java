package ch05.sec08;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "java";
        strArray[1] = "java";
        strArray[2] = new String("java");

        System.out.println( strArray[0] == strArray[1]);    //true: 같은 객체 참조
        System.out.println( strArray[0] == strArray[2]);    //false: 다른 객체 참조
        System.out.println( strArray[0].equals(strArray[1]));    //true: 문자열이 동일
    }
}
