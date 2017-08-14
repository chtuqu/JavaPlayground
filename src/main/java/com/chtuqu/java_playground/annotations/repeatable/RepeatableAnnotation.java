package com.chtuqu.java_playground.annotations.repeatable;

import java.lang.annotation.Repeatable;

// This annotation can be specified multiple times
@Repeatable(Container.class)
public @interface RepeatableAnnotation {
}
