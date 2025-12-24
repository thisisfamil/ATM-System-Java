package atm;

import java.util.Scanner;

public class Operations {

    static double BALANCE = 1000;

    public static Scanner scanner = new Scanner(System.in);

    public static void withdraw(){
        System.out.print("Enter ammount: ");
        double ammount = scanner.nextDouble();
        System.out.println("Successful!");
        System.out.println("Balance: " + (BALANCE+ammount));
    }

    public static void deposit(){
        System.out.print("Enter ammount: ");
        double ammount = scanner.nextDouble();
        System.out.println("Successful!");
        System.out.println("Balance: " + (BALANCE - ammount));
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

