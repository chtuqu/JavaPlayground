package com.chtuqu.java_playground.annotations.repeatable;

// This annotation is used twice: legal in JDK 8
@RepeatableAnnotation("first")
@RepeatableAnnotation("second")
@RepeatableAnnotation("third")
public class SampleClass {

    public static void main(String[] args) {
        // JDK 8+ approach: flattens out the structure, reads all nested annotations
        RepeatableAnnotation[] annotations = SampleClass.class.getAnnotationsByType(RepeatableAnnotation.class);
        System.out.println("Total number of annotations: " + annotations.length);

        // Older approach: read container annotation specifically, then access contents
        RepeatableAnnotations containerAnnotation = SampleClass.class.getAnnotation(RepeatableAnnotations.class);
        for (RepeatableAnnotation annotation : containerAnnotation.value()) {
            System.out.println(annotation.value());
        }
    }
}
