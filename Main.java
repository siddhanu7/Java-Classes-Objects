package com.tts;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    	// write your code here
        public static void main(String[] args)
        {
            /*ArrayList<String> arrList = new ArrayList<>();
            LinkedList<String> llList = new LinkedList<>();
            // Use the list
            System.out.println("Hello World!");


            // create an empty list of strings.  The <> syntax will be clarified later
            ArrayList<String> theList = new ArrayList<>();
            theList.add("First");   // add an element to the list
            theList.add("Second");  // add another element to the list
            theList.size();         // returns the value 2
            String val = theList.get(1);  // returns the 2nd element "Second"

            Car c1= new Car();
            c1.Color="Red";
            c1. NumberOfDoors=4;
            c1.start();

            Car c2=new Car();*/

            Pet dog= new Pet();
            dog.setName("Scooby");
            dog.setAge(3);
            dog.setLocation("Charlotte");
            dog.setType(true);
            String dogName= dog.getName();
            int dogAge=dog.getAge();
            String dogLocation=dog.getLocation();
            boolean dogType=dog.getType();

            System.out.println("Dog name is "+dogName);
            System.out.println("Dog age is "+dogAge);
            System.out.println("Dog location is "+dogLocation);
            System.out.println("Dog Type is "+dogType);

            Phone phone1= new Phone();
            phone1.setPhoneName("Apple SR8");
            phone1.setPhoneCarrier("Verizon Wireless");
            phone1.setPhoneType(true);

            System.out.println("Phone name is "+phone1.getPhoneName());
            System.out.println("Phone was released in "+phone1.getPhoneReleaseYear());
            System.out.println("PhoneCarrier is "+phone1.getPhoneCarrier());
            System.out.println("The phone has internet access "+phone1.getPhoneType());


            MagicCalculator operation= new MagicCalculator();
            int val1=12;
            int val2=24;
            int addvalue=operation.addition(val1,val2);
            System.out.println("Addition of "+val1+" and "+ val2 +" is " +addvalue);
            System.out.println("Subtraction of "+val2+" from "+ val1 +" is " +operation.subtraction(val1, val2));
            System.out.println("Multiplication of "+val1 +" and "+ val2 +" is " +operation.multiply(val1, val2));
            System.out.println("Division of "+val2+" from "+ val1 +" is " +operation.division(val1, val2));
            System.out.println("Square of "+val2+" is " +operation.square(val2));

            System.out.println("Square root of "+val2+" is " +operation.squareRoot(val2));

            int val3=30;
            System.out.println("Sine of "+val3+" is " +operation.sine(val3));
            System.out.println("Cosine of "+val3+" is " +operation.cosine(val3));
            System.out.println("Tan of "+val3+" is " +operation.tan(val3));

            int val4 =5;
            System.out.println("Factorial of "+val4+" is " +operation.factorial(val4));


            Calculator c1=new Calculator();
            int a=4;
            int b=5;
            int var1=c1.addition(a,b);

            System.out.println("ADDITION IS "+ var1);
            System.out.println("Subtraction IS "+c1.subtraction(a,b) );
            System.out.println("Multiplication IS "+c1.multiply(a,b) );







        }
    }

