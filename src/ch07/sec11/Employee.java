package ch07.sec11;

import java.security.PublicKey;

public final class Employee extends Person{
    @Override
    public void work() {
        System.out.println("제품을 생산합니다.");
    }
}
