package com.guliash.dagger;

public class Main {

    public static void main(String[] args) {
        DaggerMyComponent.create().mySubcomponentBuider().integer(42).build().inject(new B());
    }

}
