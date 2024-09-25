package toko;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class product {
        private int number,quantity;
        private String nama;
        private double price;

        public product() {
            number = 2;
            quantity = 12;
            nama = "Reborn";    
            price = 20000.00;
        }
        public product(int a, int b, String c, double d) {                                          
            number = a;
            quantity = b;
            nama = c;
            price = d;
        }

        public void print() {
            System.out.println("Number\t : " + number);
            System.out.println("Quantity\t : " + quantity);
            System.out.println("Nama\t : " + nama);
            System.out.println("Price\t : " + price);
        }

        public int getNumber() {    
            return this.number;
        }
        public int getQuantity() {
            return this.quantity;   
        }
        public String getNama() {
            return this.nama;
        }
        public double getPrice() {
            return this.price;
        }  
        public void setNumber(int a) {
            this.number = a;
        }
        public void setQuantity(int b) {
            this.quantity = b;
        }
        public void setNama(String c) {
            this.nama = c;
        }
        public void setPrice(double d) {
            this.price = d;
        }

    }    


