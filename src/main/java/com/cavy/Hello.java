package com.cavy;

import java.sql.SQLOutput;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        new Person().hello();
        Person p = new Person("cavy",66.5f,1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f ;
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score <=60);
        char c = 'A';
        System.out.println( c > 'a');





    }
}
