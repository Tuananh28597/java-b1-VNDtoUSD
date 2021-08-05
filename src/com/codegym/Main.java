package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 double vnd,usd;
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd=scanner.nextDouble();
        double quydoi=usd*23000;
        System.out.println("Giá trị VND : " + quydoi);
    }
}
