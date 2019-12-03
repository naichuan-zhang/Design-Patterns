package com.company.observer;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class SportsFan implements Observer {
    String name;
    Appointment nextAppointment;

    SportsFan(String name, Appointment appointment) {
        this.name = name;
        this.nextAppointment = appointment;
    }

    @Override
    public void update(Subject s) {
        System.out.println(name + ": meet the group for another game!");
        System.out.println("" + nextAppointment.toString());
    }
}
