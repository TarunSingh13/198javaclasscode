package Encapsulation;
import java.util.Scanner;
class EmployeeEncap {
    private int Acc_balance;
    private int pin = 266730;
    public  void setBalance (int balance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Upi pin : ");
        int upi_pin = sc.nextInt();
        if (upi_pin == this.pin) {
            Acc_balance += balance;
            System.out.println(balance + " is credited into your Acc");
        } else {
            System.out.println("Wrong pin");
        }
    }
    public void CheckBalance () {
        System.out.print("To check balance enter your pin : ");
        Scanner sc = new Scanner(System.in);
        int upi_pin = sc.nextInt();
        if (upi_pin == pin) {
            System.out.println(this.Acc_balance  + " is in your bank account");
        } else {
            System.out.println("!! Wrong Pin !! Unable to fetch the balance");
        }
    }
}
