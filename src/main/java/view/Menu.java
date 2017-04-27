package view;

import java.util.Scanner;

public class Menu {
    public static int showMenu() {

        int selection = 0;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        while (selection != 4) {
            System.out.println("Choose from these choices");
            System.out.println("-------------------------\n");
            System.out.println("1 - Register Customer");
            System.out.println("2 - Remove Customer");
            System.out.println("3 - Find Customer");
            System.out.println("4 - Quit");

            selection = input.nextInt();
        }
        return selection;
    }


}
