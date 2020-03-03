package com.company.model;

public class Person {
    public String name;
    public int age;
    public String cpf;

    public Person(){

    }

    public Person(String name, int age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + name + '\'' +
                ", idade=" + age +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}