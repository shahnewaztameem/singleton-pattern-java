package com.java.singleton;

public class Main {

    public static void main(String[] args) {
        // obj can not be created directly due to private constructor
        SingletonClass obj = SingletonClass.getInstance();
        obj.display();
    }
}
