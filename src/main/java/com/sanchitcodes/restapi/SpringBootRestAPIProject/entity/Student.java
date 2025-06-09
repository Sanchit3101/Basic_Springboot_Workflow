package com.sanchitcodes.restapi.SpringBootRestAPIProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_RollNo")
    private int RollNo;
    @Column(name = "Student_Name")
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", branch='" + branch + '\'' +
                '}';
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Column(name = "Student_Percentage")
    private float percentage;
    @Column(name = "Student_Branch")
    private String branch ;
}