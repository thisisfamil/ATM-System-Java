package atm;

import java.util.Scanner;

public class Operations {

    public static Scanner scanner = new Scanner(System.in);

    private static double BALANCE = 1000;

    public Operations(double BALANCE){
        this.BALANCE = BALANCE;
    }

    public double getBALANCE() {
        return BALANCE;
    }

    public static void withdraw(){
        System.out.print("Enter ammount: ");
        double ammount = scanner.nextDouble();
        BALANCE -= ammount;
        System.out.println("Successful!");
        System.out.println("Balance: " + BALANCE);
    }

    public static void deposit(){
        System.out.print("Enter ammount: ");
        double ammount = scanner.nextDouble();
        BALANCE += ammount;
        System.out.println("Successful!");
        System.out.println("Balance: " + BALANCE);
    }

    public static void balance(){
        System.out.println("Balance: " + BALANCE);
    }

    public static boolean login() {
        int PIN = 1234;

        int pin;

        int x = 3;
        while (x > 0) {
            System.out.print("Enter Pin: ");
            try {
                pin = scanner.nextInt();

                if (pin != PIN) {
                    System.out.println("Wrong Pin!");
                }
                else{
                    return true;
                }
            }
            catch (Exception e) {
                System.out.println("Invalid Pin! Please try again");
                scanner.nextLine();
            }
            x--;
        }
        System.out.println("Your account was blocked!");
        return false;
    }

}
