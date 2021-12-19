package com.homework.chapter7;

public class Transformation {
    public static void main( String[] args ) {
        TransformIntToBoolean transformation = value -> value % 13 == 0;
        System.out.println(transformation.transform(27));
    }
}
