package edu.sjsu.cs151timemanagement.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String username;
    private String password;

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    private LocalDate birthDay;
    private List<Event> events;
    private List<DailyRoutine> dailyRoutines;

    private List<DailySchedule> dailySchedules;

    public User() {

    }
    public User(String username,
                String password,
                LocalDate birthDay) {
        this.username = username;
        this.password = password;
        this.birthDay = birthDay;
        this.events = new ArrayList<>();
        this.dailyRoutines = new ArrayList<>();
        this.dailySchedules = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<DailyRoutine> getDailyRoutines() {
        return dailyRoutines;
    }

    public void setDailyRoutines(List<DailyRoutine> dailyRoutines) {
        this.dailyRoutines = dailyRoutines;
    }

    public List<DailySchedule> getDailySchedules() {
        return dailySchedules;
    }

    public void setDailySchedules(List<DailySchedule> dailySchedules) {
        this.dailySchedules = dailySchedules;
    }


}
