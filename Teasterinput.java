package toko;

import java.util.Scanner;

public class Teasterinput {  

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("CD/DVD?");
            String pilihan = input.nextLine();

            System.out.println("Name: ");
            String name = input.nextLine();
            System.out.println("Number");
            int number = input.nextInt();
            System.out.println("Quantity: ");
            int quantity = input.nextInt();
            System.out.println("Price: ");
            double price = input.nextDouble();
            input.nextLine();
            if (pilihan.equalsIgnoreCase("CD")) {
                System.out.println("Artist: ");
                String artist = input.nextLine();
                System.out.println("Label: ");
                String label = input.nextLine();
                System.out.println("Total Song");
                int muSong = input.nextInt();
                CD c1 = new CD(number, name, quantity, price, artist, label, muSong);
                c1.print();

        } else if (pilihan.equalsIgnoreCase("DVD")) {
    }
}
}
