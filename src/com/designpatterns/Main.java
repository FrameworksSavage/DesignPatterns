package com.designpatterns;

public class Main {

    public static void main(String[] args) {
        LazySingleton aLazySingleton = LazySingleton.getInstance();
//      LazySingleton aLazySingleton = new LazySingleton();

        System.out.println(aLazySingleton);


    }
}
