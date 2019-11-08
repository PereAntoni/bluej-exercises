/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraanimals;

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
        a= new Animal("cranc",">o");
        b= new Animal("peix",">8");
        escena = new Escenari(a,b,distancia);
        
        Random dau = new Random();
        while (a.getPosicio()<distancia){
            try{
                Thread.sleep(1*1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            a.camina(dau.nextInt(6));
            b.camina(dau.nextInt(6));
            escena.pinta();
            
            //System.out.println(a.getPosicio());
        }
        
    }
    
}
