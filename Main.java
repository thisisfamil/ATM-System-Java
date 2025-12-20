import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static double BALANCE = 1000;

    static Scanner scanner = new Scanner(System.in);

    public static void withdraw(){
        System.out.print("Enter ammount: ");
        double ammount = scanner.nextDouble();
        System.out.println("Successful!");
        System.out.println("Balance: " + (BALANCE+ammount));
    }

    public static void cash(){
        System.out.print("Enter ammount: ");
        double ammount = scanner.nextDouble();
        System.out.println("Successful!");
        System.out.println("Balance: " + (BALANCE - ammount));
    }

    public static void balance(){
        System.out.println("Balance: " + BALANCE);
    }

    public static void login() {
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
            }
            catch (Exception e) {
                System.out.println("Invalid Pin! Please try again");
                scanner.nextLine();
            }
            x--;
        }
        System.out.println("Your account was blocked!");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to ATM System");

        login();

        System.out.println("Options");

        System.out.println("1-Withdraw");
        System.out.println("2-Cash");
        System.out.println("3-Balance");
        System.out.println("4-Exit");

        int option = scanner.nextInt();

        switch (option){
                        case 1: {
                            withdraw();
                            break;
                        }
                        case 2: {
                            cash();
                            break;
                        }
                        case 3: {
                            balance();
                            break;
                        }
                        case 4: {break;}
                    }

    }

}