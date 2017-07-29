package com.guliash.dagger;

import dagger.Component;

@Component
public interface MyComponent {

    MySubcomponent.MySubcomponentBuilder mySubcomponentBuider();

}
