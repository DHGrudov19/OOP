import java.util.Scanner;

public class Compound {

    public static void main(String[] args) {
        double startAmount, rate, compoundInterest;
        int time;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting amount");
        startAmount = scan.nextDouble();
        System.out.println("Enter interest rate");
        rate = scan.nextDouble();
        System.out.println("Enter time");
        time = scan.nextInt();


        System.out.println("The startAmount is " + startAmount + ". The interest rate is "+ rate + ", the time period is " + time);
        compoundInterest = startAmount * (Math.pow((1 + rate/100), time)) - startAmount;
        System.out.println("The Compound Interest after "+time+" years time period is " + compoundInterest);


    }



}