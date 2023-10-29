package com.example.dependencyinjection.model;

public class NiceWriter implements IWriter {

    @Override
    public void writer (String s){
        System.out.println("NiceWriter: " + s);
    }

}
