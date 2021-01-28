package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }
//Menu:
    static void menu(){
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\n||======================||");
            System.out.println("||        BT Them       ||");
            System.out.println("||----------------------||");
            System.out.println("|| 1. Bai 1             ||");
            System.out.println("|| 2. Bai 2             ||");
            System.out.println("|| 3. Ket thuc          ||");
            System.out.println("||======================||");
            System.out.print("Chuc nang muon thuc hien: ");
            chon = sc.nextInt();
            switch (chon){
                case 1:{
                    bai1();
                    break;
                }
                case 2:{
                    bai2();
                    break;
                }
                case 3:{
                    return;
                }
                default:
                    System.out.println("Chuc nang ban chon khong co");
                    System.out.println("Vui long chon lai");
                    break;
            }
        }while(true);

    }
//Bai 1: Dem so lan xuat hien cua chuoi w trong chuoi s
    static void bai1(){
        Scanner sc = new Scanner(System.in);
        String s,w;
        int i,j,count =0;
        boolean check =true;
        System.out.print("Nhap 1 chuoi bat ky: ");
        s = sc.nextLine();
        System.out.print("Nhap tu muon tim trong chuoi: ");
        w = sc.nextLine();
        //Tao mang char chua cac ky tu cua chuoi s
        char[] s1 = new char[s.length()];
        for (i=0;i<s.length();i++){
            s1[i] = s.charAt(i);
        }
        //Vong lap dem co bao nhieu chuoi w trong chuoi s
        while (check){
            int countchar=0;
            for (i=0;i<w.length();i++){
                for (j=0;j<s.length(); j++){
                    if (w.charAt(i)==s1[j]){
                        s1[j]=0;
                        countchar++;
                        break;
                    }
                }
            }
            if (countchar == w.length()){
                count++;
            }
            else check = false;
        }
        System.out.println("Voi s = "+s+", w = "+w+", KQ la: "+count);
    }
//Bai 2: Tim chieu rong va chieu dai cua dien tich da cho
    static void bai2(){
        Scanner sc = new Scanner(System.in);
        int S,L,W;
        int min,i;
        int[] daiRong ={0,0};
        System.out.print("Nhap vao dien tich ngoi nha: ");
        S = sc.nextInt();
        min= S-1;
        for (i=0; i<S;i++){
            L=S-i;
            W=S/L;
            if (min>L-W && L>=W && L*W ==S){
                daiRong[0]=L;
                daiRong[1]=W;
            }
        }
        System.out.println("Voi S = "+S+", KQ la: L= "+daiRong[0]+", W= "+daiRong[1]);
    }

}
