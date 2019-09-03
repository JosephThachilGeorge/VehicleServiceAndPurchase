package Model;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public enum Type implements Service{

    CAR,VAN,MOTORBIKE;


    @Override
    public Void carcalculatecost() {

        int mancost = 25;
        int hours = 2;
        int tax = 2;
        int total = (mancost * hours) * (tax);

        System.out.println("The Cost for Car Service is: " + total + " Euro");

        return null;
    }

    @Override
    public Void cardisplay() {
        System.out.println("Car will be delivered with in two days!");
        return null;
    }

    @Override
    public Void carexpecteddeliverydate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        Date tomorrow = calendar.getTime();
        System.out.println("Expected Delivery Date and Time is:" + tomorrow);
        return null;
    }

    @Override
    public Void cardiscount() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Is it your first service: Type YES or NO: \n ");
        String b = myObj.next();

        if (b.equalsIgnoreCase("yes")) {

            System.out.println("CONGRATULATION ! YOU HAVE 30 PERCENTAGE DISCOUNT FROM TOTAL BILL !");
            System.out.println("After Discount the AMOUNT is: 60 Euro");


        } else if (b.equalsIgnoreCase("no")) {

            System.out.println("NO DISCOUNT!");
        }
        return null;
    }

    @Override
    public Void motorbikecalculatecost() {
        int mancost =20;
        int hours=2;
        int tax=10;
        int total=(mancost*hours)+(tax);

        System.out.println("The Cost for MotorBike Service is: "+ total+" Euro");
        return null;
    }

    @Override
    public Void motorbikedisplay() {
        System.out.println("Your MotorBike will be delivered with in one day!");
        return null;
    }

    @Override
    public Void motorbikeexpecteddeliverydate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        System.out.println("Expected Delivery Date and Time is:"+ tomorrow);
        return null;
    }

    @Override
    public Void motorbikediscount() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Is it your first service: Type YES or NO: \n ");
        String b = myObj.next();

        if (b.equalsIgnoreCase("yes")) {

            System.out.println("CONGRATULATION ! YOU HAVE 50 PERCENTAGE DISCOUNT FROM TOTAL BILL !");
            System.out.println("After Discount the AMOUNT is: 25 Euro");


        } else if (b.equalsIgnoreCase("no")) {

            System.out.println("NO DISCOUNT!");}
        return null;
    }

    @Override
    public Void vancalculatecost() {
        int mancost =40;
        int hours=4;
        int tax=40;
        int total=(mancost*hours)+(tax);

        System.out.println("The Cost for Van Service is: "+ total+" Euro");
        return null;
    }

    @Override
    public Void vandisplay() {
        System.out.println("Your Van will be delivered with in two days!"); //Overide interface method
        return null;
    }

    @Override
    public Void vanexpecteddeliverydate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        Date tomorrow = calendar.getTime();
        System.out.println("Expected Delivery Date and Time is:"+ tomorrow);
        return null;
    }

    @Override
    public Void vandiscount() {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Is it your first service: Type YES or NO: \n ");
        String b = myObj.next();

        if (b.equalsIgnoreCase("yes")) {

            System.out.println("CONGRATULATION ! YOU HAVE 20 PERCENTAGE DISCOUNT FROM TOTAL BILL !");
            System.out.println("After Discount the AMOUNT is: 160 Euro");


        } else if (b.equalsIgnoreCase("no")) {

            System.out.println("NO DISCOUNT!");}


        return null;
    }
}
