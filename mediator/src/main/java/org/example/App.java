package org.example;

import org.example.mediator.*;

public class App {
    public static void main(String[] args) {
        DeliveryPost deliveryPost = new DeliveryPost();

        User person1 = new Person("Name1", "Surname1", "1", false, deliveryPost);
        User person2 = new Person("Name2", "Surname2", "2",true, deliveryPost);
        User person3 = new Person("Name3", "Surname3", "3",true, deliveryPost);

        User company1 = new Company("Company1", "0000000001", "4", false,deliveryPost);
        User company2 = new Company("Company2", "0000000002", "5", true,deliveryPost);

        //  deliveryPost.addUserToList(person1);
        deliveryPost.addUserToList(person2);
        deliveryPost.addUserToList(person3);

        //deliveryPost.addUserToList(company1);
        deliveryPost.addUserToList(company2);

        Packages package1 = new Packages("1", 5.4);
        Packages package2 = new Packages("2", 7.2);

        person1.sendPackage(package1);
        company1.sendPackage(package2);
    }
}
