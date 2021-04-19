package com.tts;


import java.lang.Math.*;
public class MagicCalculator extends Calculator{
    public double squareRoot(int value)
    {
        return(Math.sqrt(value));
    }

    public double sine(int value)
    {
        double b = Math.toRadians(value);
        return (Math.sin(b));
    }

    public double cosine(int value)
    {
        double b = Math.toRadians(value);
        return (Math.cos(b));
    }
    public double tan(int value)
    {
        double b = Math.toRadians(value);
        return (Math.tan(b));
    }

    public int factorial(int value)
    {
        int answer=1;
        for (int i=1; i<=value;i++)
        {
            answer= answer * i;
        }
        return answer;
    }




}
