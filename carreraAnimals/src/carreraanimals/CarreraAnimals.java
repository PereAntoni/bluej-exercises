/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraanimals;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author pere
 */
public class CarreraAnimals {
    public static void cl (int l){
        for (int i=0;i<l;i++){
            System.out.println();
        }
    }
    
    public static void pintaFinal (int i,int f){
        String carrer="";
        for (int j=i;j<=f;j++){
            carrer= carrer + " ";
        }
        carrer = carrer + "|" +"  (Posició inici:" + i + ", posició final " + f + ")";
        System.out.println(carrer);
    }
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //he fet canvis a baix
        //desde dalt també ;)
        Animal a;
        Animal b;
        int distancia=100;
        Escenari escena;
        
        ArrayList<Animal> participants = new ArrayList<>();
        
        
        
        
        a= new Animal("cranc",">o");
        b= new Animal("peix",">8");
        Animal c= new Animal("cocodril","^=");
        Animal d= new Animal("mandril","oo");
        
        participants.add(b);
        participants.add(a);
        participants.add(c);
        participants.add(d);
        
        escena = new Escenari(participants,distancia);
        
        Random dau = new Random();
        while (participants.get(0).getPosicio()<distancia){
            try{
                Thread.sleep(1*1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            participants.get(0).camina(dau.nextInt(6));
            participants.get(1).camina(dau.nextInt(6));
            participants.get(2).camina(dau.nextInt(6));
            participants.get(3).camina(dau.nextInt(6));
            
            //b.camina(dau.nextInt(6));
            escena.pinta();
            
            //System.out.println(a.getPosicio());
        }
        
    }
    
}
