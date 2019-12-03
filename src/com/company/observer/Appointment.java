package com.company.observer;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Appointment {

    private String date;
    private String time;
    private String topic;
    private String location = new String("UL Arena");
    private String status;

    public Appointment() {
        date = "unset";
        time = "unset";
        topic = "unset";
        status = "unset";
    }

    public Appointment(String date,
                       String time, String topic) {
        this.date = date;
        this.time = time;
        this.topic = topic;
        this.status = "Game is on!";
    }

    public String toString() {
        String tmp = status + " " + topic + " "
            + date + " " + time + " " + location;
        return tmp;
    }

    public String changeTimeOfAppointment(String newTime) {
        this.time = newTime;
        return time;
    }

    public String cancelAppointment() {
        date = "unset";
        time = "unset";
        status = "Game is cancelled";
        return topic + " " + status;
    }

    public String getStatus() {
        return topic + " " + status;
    }
}
