package com.guliash.dagger;

import com.guliash.dagger.scopes.ScopeA;
import com.guliash.dagger.scopes.ScopeB;
import dagger.Component;
import org.junit.Test;

/**
 * Hierarchy of simple components can't have same scopes.
 * See https://github.com/google/dagger/blob/391aeebf4fff0af03bfadb10121455592cbbba6d/javatests/dagger/internal/codegen/GraphValidationScopingTest.java#L289).
 */
public class T {

    @ScopeA
    @Component
    interface ComponentA {

    }

    @ScopeB
    @Component(dependencies = ComponentA.class)
    interface ComponentB {

    }

    @ScopeA
    @Component(dependencies = ComponentB.class)
    interface ComponentC {

    }

    @Test
    public void test() {
        //should be compile error.
    }

}
