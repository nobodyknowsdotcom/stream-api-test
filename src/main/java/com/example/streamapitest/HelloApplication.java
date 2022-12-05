package com.example.streamapitest;
import com.example.streamapitest.model.Sample;

public class HelloApplication {

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.forEachTest();
        sample.foreachWithLogicTest();
    }
}