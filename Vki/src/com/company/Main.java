package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
     double boy,kilo, vki;
        System.out.print("Lütfen Boyunuzu Giriniz(Metre cinsinden): ");
        boy=input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo=input.nextDouble();
        vki = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz :"+ vki);
    }
}
