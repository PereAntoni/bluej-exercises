/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraanimals;

import static carreraanimals.CarreraAnimals.cl;
import static carreraanimals.CarreraAnimals.pintaFinal;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pere
 */
public class Escenari {

    int d;
    ArrayList<Animal> participants = new ArrayList<>();

    public Escenari(ArrayList<Animal> l, int d) {
        this.participants = l;
        this.d=d;
    }
    
    public void pinta(){
        System.out.println("CARRERA D'ANIMALS---CARRERA D'ANIMALS---CARRERA D'ANIMALS---CARRERA D'ANIMALS---");
        pintaFinal(-2,d);
        

        //participants.forEach(pinta());
        
        Iterator<Animal> an = participants.iterator();
        while (an.hasNext()){
            Animal actual = an.next();
            actual.pinta();
            pintaFinal(actual.getPosicio(),d);
        }
        pintaFinal(-2,d);
        cl(5);
       /* participants.get(0).pinta();
        
        pintaFinal(-2,d);
        pintaFinal(-2,d);
        participants.get(1).pinta();
        pintaFinal(participants.get(1).getPosicio(),d);
        pintaFinal(-2,d);
        pintaFinal(-2,d);
        pintaFinal(-2,d);*/
    }
    
}
