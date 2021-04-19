package com.tts;

public class Pet {

    private int age;
    private String location;
    private boolean type;
    private String name;

    public Pet()
    {
        name ="";
        age=0;
        location="";
        type=false;
    }


    public Pet(String name1, int age1, String location1, boolean type1)
    {
        this.name = name1;
        this.age = age1;
        this.location= location1;
        this.type=type1;
    }

    public Pet(String name1, int age1, String location1)
    {
        this.name = name1;
        this.age = age1;
        this.location= location1;

    }

    public Pet(String name1, int age1)
    {
        this.name = name1;
        this.age = age1;

    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }


    public boolean getType()
    {
        return type;
    }

    public void setType(boolean type)
    {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "age=" + age +
                ", location='" + location + '\'' +
                ", type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
}
