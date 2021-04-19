package com.tts;

public class Phone {

    private String phoneName;
    private int phoneReleaseYear;
    private String phoneCarrier;
    private boolean phoneType;


    public Phone()
    {
        phoneName ="";
        phoneReleaseYear=0;
        phoneCarrier="";
        phoneType=false;

    }


    public Phone(String phoneName, int phoneReleaseYear, String phoneCarrier, boolean phoneType)
    {
        this.phoneName = phoneName;
        this.phoneReleaseYear = phoneReleaseYear;
        this.phoneCarrier= phoneCarrier;
        this.phoneType=phoneType;
    }

    public Phone(String phoneName, int phoneReleaseYear, String phoneCarrier)
    {
        this.phoneName = phoneName;
        this.phoneReleaseYear = phoneReleaseYear;
        this.phoneCarrier= phoneCarrier;

    }

    public Phone(String phoneName, int phoneReleaseYear)
    {
        this.phoneName= phoneName;
        this.phoneReleaseYear= phoneReleaseYear;

    }


    public String getPhoneName()
    {
        return phoneName;
    }

    public void setPhoneName(String phoneName)
    {
        this.phoneName = phoneName;
    }


    public int getPhoneReleaseYear()
    {
        return phoneReleaseYear;
    }

    public void setPhoneReleaseYear(int phoneReleaseYear)
    {
        this.phoneReleaseYear= phoneReleaseYear;
    }

    public String getPhoneCarrier()
    {
        return phoneCarrier;
    }

    public void setPhoneCarrier(String phoneCarrier)
    {
        this.phoneCarrier = phoneCarrier;
    }


    public boolean getPhoneType()
    {
        return phoneType;
    }

    public void setPhoneType(boolean phoneType)
    {
        this.phoneType = phoneType;
    }
}
