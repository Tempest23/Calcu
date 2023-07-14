import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Firstproject {

    public static void main(String[] args) {

        System.out.println("Hai \n Good to have you here \n ");


        int myFirstNumber = (20 + 49) + (2 * 10);

        int mySecondNumber = 35;

        int myThirdNumber = myFirstNumber * 3;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastNumber = 1000 + myTotal;
        System.out.println(myLastNumber);


        promptEnterKey();
    }
    public static void promptEnterKey() {
        System.out.println("Press the enter key to continue");
        Scanner scanner = new Scanner((System.in));
        scanner.nextLine();
    }
    public static void longRunningProcess(long time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}

