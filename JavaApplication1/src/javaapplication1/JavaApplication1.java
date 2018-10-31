/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Erdem Özer
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int deger = scan.nextInt();
        int n = deger;
        int kalan = 0;
        int yenideger = 0;
        int length = String.valueOf(deger).length();
        
        for(int i=1;i<=length;i++){
            kalan = deger%10;
            yenideger = yenideger + (int)Math.pow(kalan,length);
            deger = deger/10;
        }
        
        if(yenideger == n){
            System.out.println("Sayi Armstrong Sayidir : " + n + " = " + yenideger);
        }else{
            System.out.println("Sayi Armstrong Sayi Degildir");
        }
        
    }
    
}
