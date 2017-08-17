package com.chtuqu.java_playground.annotations.repeatable;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// This annotation can be specified multiple times
@Repeatable(RepeatableAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatableAnnotation {
    String value();
}
