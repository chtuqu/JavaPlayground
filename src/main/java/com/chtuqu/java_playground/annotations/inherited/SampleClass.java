package com.chtuqu.java_playground.annotations.inherited;

@InheritedAnnotation("49")
public class SampleClass {
    public static void main(String[] args) {
        // works because @InheritedAnnotation is annotated with @Inherited
        InheritedAnnotation annotation = Child.class.getAnnotation(InheritedAnnotation.class);
        System.out.println(annotation.value());

        // will not work if Child itself not annotated with @InheritedAnnotation
//        InheritedAnnotation annotation1 = Child.class.getDeclaredAnnotation(InheritedAnnotation.class);
    }
}

class Child extends SampleClass {

}