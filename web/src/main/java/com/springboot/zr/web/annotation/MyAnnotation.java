package com.springboot.zr.web.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {

    String name() default "hehe";
}

class Test {
    @MyAnnotation(name = "hehe")
    private String name;

    @MyAnnotation
    public void test() {

    }
}
