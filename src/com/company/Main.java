package com.company;

import com.company.model.*;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.cpf="015.151.151-76";
        person.age=15;
        person.name="alguem";

        System.out.println(person);

        Person personal = new Person("outra",31,"120.222.333-99");
        System.out.println(personal);

    }

}
