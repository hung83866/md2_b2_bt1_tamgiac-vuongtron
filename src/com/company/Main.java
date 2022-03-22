package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        byte i,j,k;
        System.out.println("lựa chọn đi nào!");
        System.out.println("1, Hình vuông");
        System.out.println("2, Hình chữ nhật");
        System.out.println("3, Hình tam giác");
        System.out.println("4, Hình tam giác ngược");
        System.out.println("5, Hình tròn ");
        System.out.println("6, Hình trái tim");
        System.out.println("7, Hình nui phú sĩ");
        System.out.println("8, Hình quả địa cầu");
        System.out.println("9, Hình trái tim");
        System.out.println("0, Exit");
        System.out.println("Số = ");
        byte a = scanner.nextByte();
        switch (a){
            case 1:
                System.out.println("HÌNH VUÔNG ");
                for (i=1;i<5;i++){
                    System.out.println("");
                    for (j=1;j<5;j++){
                        System.out.print(" * ");
                    }
                }
                break;
            case 2:
                System.out.println("HÌNH CHỮ NHẬT ");
                for (i=1;i<5;i++){
                    System.out.println("");
                    for (j=1;j<7;j++){
                        System.out.print(" * ");
                    }
                }
                break;
            case 3:
                System.out.println("HÌNH TAM GIÁC ");
                for (i=1;i<5;i++){
                    System.out.println("");
                    for (j=1;j<=i;j++){
                        System.out.print(" * ");
                    }
                }
                break;
            case 4:
                System.out.println("TAM GIÁC NGƯỢC");
                for (i=4;i>0;i--){
                    System.out.println("");
                    for (j = 4 ;j>i;j--){
                        System.out.print("   ");
                    }
                    for (k=1;k<=i;k++){
                        System.out.print(" * ");
                    }
                }break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
            default:
                System.out.println("lollllll");
                break;
        }

    }
}
