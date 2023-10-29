package com.example.dependencyinjection.model;

public class Writer implements IWriter {

    @Override
    public void writer (String s){
        System.out.println("Writer: " + s);
    }

}
