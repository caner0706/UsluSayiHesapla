package uslusayihesapla;

import java.util.Scanner;

public class UsluSayiHesapla {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Üslü Sayı Hesaplama Programına Hoşgeldiniz...");
        
        System.out.print("Lütfen Hesaplamak İstediğiniz Sayıyı Girin : ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Lütfen Hesaplamak İstediğiniz Üssü Girin : ");
        double sayi2 = scanner.nextDouble();
        
        double sonuc = 1;
        
        for(int i = 1;i<= sayi2;i++){
            sonuc *= sayi1;
        }
        
        System.out.println(sayi1 + "^" + sayi2 + " : " + sonuc);
        
    }
    
}
