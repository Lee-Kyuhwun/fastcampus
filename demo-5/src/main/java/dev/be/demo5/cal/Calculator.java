package dev.be.demo5.cal;

public class Calculator {
    public int sum(int a, int b) {
        if(a < 0 || b < 0) {
            throw new RuntimeException();
        }
        return a + b;
    }
}
