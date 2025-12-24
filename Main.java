package atm;
import java.util.Scanner;
import atm.Operations;

public class Main {

//    static double BALANCE = 1000;
//
//    static Scanner scanner = new Scanner(System.in);
//
//    public static void withdraw(){
//        System.out.print("Enter ammount: ");
//        double ammount = scanner.nextDouble();
//        System.out.println("Successful!");
//        System.out.println("Balance: " + (BALANCE+ammount));
//    }
//
//    public static void cash(){
//        System.out.print("Enter ammount: ");
//        double ammount = scanner.nextDouble();
//        System.out.println("Successful!");
//        System.out.println("Balance: " + (BALANCE - ammount));
//    }
//
//    public static void balance(){
//        System.out.println("Balance: " + BALANCE);
//    }
    public static Scanner scanner = Operations.scanner;

    public static void main(String[] args) {

        System.out.println("Welcome to ATM System");

        if (!Operations.login()){
            return;
        }

        System.out.println("Options");

        System.out.println("1-Withdraw");
        System.out.println("2-Cash");
        System.out.println("3-Balance");
        System.out.println("4-Exit");

        int option = scanner.nextInt();

        switch (option){
                        case 1: {
                            Operations.withdraw();
                            break;
                        }
                        case 2: {
                            Operations.cash();
                            break;
                        }
                        case 3: {
                            Operations.balance();
                            break;
                        }
                        case 4: {break;}
                    }

    }

}