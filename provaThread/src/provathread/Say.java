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
class Say extends Thread{
    String parola;

    public Say(String parola) {
        this.parola = parola;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(parola);
        }
    }    
}
