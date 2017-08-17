package com.chtuqu.java_playground.annotations.repeatable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// This annotation serves as a container
// This annotation is used as an argument for @Repeatable
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatableAnnotations {
    RepeatableAnnotation[] value();
}
