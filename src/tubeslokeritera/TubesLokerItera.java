/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeslokeritera;
import java.util.Scanner;

/**
 *
 * @author mahasiswa
 */
public class TubesLokerItera {

    int id;
    String pass;
    
    public static void main(String[] args) {
    
       TubesLokerItera x =  new TubesLokerItera();
      
        Scanner scan = new Scanner(System.in);
        x.id=1;
        for(int i=0; i<5; i++)
        x.pass=scan.next();
        
        System.out.println("id: "+x.id + "\npass :" + x.pass);
        x.id++;
        
    }
    
}
