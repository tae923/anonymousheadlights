package com.example.alfie_s_app;

public class Event {

    public String name, building, room, time, description;

    public Event() {};
    public Event(String name, String building, String room, String time, String description) {
        this.name = name;
        this.building = building;
        this.room = room;
        this.time = time;
        this.description = description;
    }
}
