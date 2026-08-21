package app;

import app.domain.Person;
import app.domain.User;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        Person person = new Person(100);


        int id = 15;


        user.setId(id);

        System.out.println("Numero de usuario" + user.getId() );

        System.out.println("Numero de persona" + person.getId() );




    }
}
