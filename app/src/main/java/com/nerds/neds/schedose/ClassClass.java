package com.nerds.neds.schedose;

public class ClassClass {
    private String className;
    private double length;
    private int days,priority;
    public ClassClass(String name,double Length,int day, int prior){
        className = name;
        length = Length;
        days = day;
        priority = prior;
    }

    public String getName(){
        return className;
    }

    public double getLength(){
        return length;
    }

    public int getDay(){
        return days;
    }

    public int getPriority(){
        return priority;
    }

    public void setName(String name){
        className = name;
    }

    public void setLength(double Length){
        length = Length;
    }

    public void setDay(int day){
        days = day;
    }

    public void setPriority(int prior){
        priority = prior;
    }

    public String toString(){
        return "Name: " + className + " Length: " + length + "";
    }
}
