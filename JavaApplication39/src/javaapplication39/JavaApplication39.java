/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication39 {
    public static int ebobBulma(int x,int y){
        int ebob=1;
      for(int i =1;i<=x && i<=y;i++){
          if (x%i==0 && y%i==0){
              ebob =i;
          }
      }
        return  ebob;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int birinciSayi =scanner.nextInt();
        
         System.out.println("İkinci sayıyı giriniz: ");
        int ikinciSayi =scanner.nextInt();
        
        System.out.println("Bu sayıların ebobu : " + ebobBulma(birinciSayi,ikinciSayi));
    }
    
}
