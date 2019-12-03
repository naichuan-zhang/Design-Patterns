package com.company.observer;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Driver {
    public static void main(String[] args) {
        Appointment appointment =
                new Appointment("18/10/11", "7pm", "Cubs vs. Marlins");
        SportsFan trisha = new SportsFan("Trisha", appointment);
        SportsFan mark = new SportsFan("Mark", appointment);

        Subject cs = new ConcreteSubject();
        cs.addObserver(trisha);
        cs.addObserver(mark);

        cs.notifyObservers();

        appointment.changeTimeOfAppointment("3pm");
        cs.notifyObservers();

        appointment.cancelAppointment();
        cs.notifyObservers();
    }
}
