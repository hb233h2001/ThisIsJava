package ch06.sec13.exam02.package02;

import ch06.sec13.exam02.package01.*;
public class C {
    //필드 선언
    A a1 = new A(true);     //o
    A a2 = new A(1);        //x
    A a3 = new A("문자열");  //x
}
