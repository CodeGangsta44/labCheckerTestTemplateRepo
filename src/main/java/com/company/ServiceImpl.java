package com.company;

public class ServiceImpl implements Service {
    public int firstMethod(int a, int b) {
        int result = a;
        for (int i = 0; i < b; i++) {
            a++;
        }
        return a;
    }

    public int secondMethod(int a, int b) {
        int result = a;
        for (int i = 0; i < b; i++) {
            a--;
        }
        return a;
    }

    public int thirdMethod(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public int fourthMethod(int a, int b) {
        return a / b;
    }
}
