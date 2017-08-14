package com.chtuqu.java_playground.annotations.repeatable;

// This annotation is used as an argument for @Repeatable
public @interface Container {
    RepeatableAnnotation[] value();
}
