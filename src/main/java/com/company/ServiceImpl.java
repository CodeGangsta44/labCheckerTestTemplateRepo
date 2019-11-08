package com.company;

public class ServiceImpl implements Service {
    public int firstMethod(int a, int b) {
        return a+b;
    }

    public int secondMethod(int a, int b) {
        return a-b;
    }

    public int thirdMethod(int a, int b) {
        return a*b;
    }

    public int fourthMethod(int a, int b) {
        return a/b;
    }
}
