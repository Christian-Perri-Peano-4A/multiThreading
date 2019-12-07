/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesay;

/**
 *
 * @author perri.christian
 */
public class ClasseSay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Say parola1=new Say("ciao");
       Say parola2=new Say("Hi");
       Say parola3=new Say("hello");
       parola1.start();
       parola2.start();
       parola3.start();
    }
    
}
