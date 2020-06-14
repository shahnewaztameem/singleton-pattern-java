package com.java.singleton;

public class SingletonClass {
    // Static class reference
    private static SingletonClass obj = null;

    private SingletonClass() {
        // private constructor will prevent the instantiation of this class directly
    }

    public static SingletonClass getInstance() {
        if(obj == null) {
            obj = new SingletonClass();
        }
        return obj;
    }

    public void display() {
        System.out.println("Singleton class example");
    }
}
