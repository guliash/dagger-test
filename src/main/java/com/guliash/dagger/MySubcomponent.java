package com.guliash.dagger;

import dagger.BindsInstance;
import dagger.Subcomponent;

@Subcomponent
public interface MySubcomponent {

    @Subcomponent.Builder
    interface MySubcomponentBuilder {

        @BindsInstance
        MySubcomponentBuilder integer(Integer integer);

        MySubcomponent build();

    }

    void inject(B b);
}
