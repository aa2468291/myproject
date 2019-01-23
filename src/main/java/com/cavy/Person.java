package com.cavy;

public class Person {

    String name;
    float weight;
    float height;

    public float bmi(){
        float bmi = weight/(height*height);
        return bmi;
    }

    public Person(float weight,float height){
        this.weight = weight;
        this.height = height;

    }

    public Person(String name,float weight,float height){
        this(weight,height);//一定要在建構子的第一行
        this.name = name;

//        this.weight = weight;
//        this.height = height;

    }


    public void hello(){
        System.out.println("Hello world");
    }
}
