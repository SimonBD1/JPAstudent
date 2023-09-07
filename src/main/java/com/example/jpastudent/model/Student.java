package com.example.jpastudent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDate borndate;
    private LocalTime borntime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorndate() {
        return borndate;
    }

    public void setBorndate(LocalDate borndate) {
        this.borndate = borndate;
    }

    public LocalTime getBorntime() {
        return borntime;
    }

    public void setBorntime(LocalTime borntime) {
        this.borntime = borntime;
    }


}
