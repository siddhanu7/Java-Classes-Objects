package com.tts;


// class definition
public class Car
{
    public String Color;
    public int NumberOfDoors;


    public Car()
    {
        Color = "White";
        NumberOfDoors = 2;
    }
    public void start()
    {
        System.out.println("Car starting");
    }

    public void stop()
    {
        System.out.println("Car stopping");
    }

    public void drive()
    {
        System.out.println("Car driving");
    }


    // instantiating and using a car object

}