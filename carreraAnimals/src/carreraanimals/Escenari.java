/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraanimals;

import static carreraanimals.CarreraAnimals.pintaFinal;

/**
 *
 * @author pere
 */
public class Escenari {

    Animal x;
    Animal y;
    int d;

    public Escenari(Animal x, Animal y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }
    
    public void pinta(){
        System.out.println("CARRERA D'ANIMALS---CARRERA D'ANIMALS---CARRERA D'ANIMALS---CARRERA D'ANIMALS---");
        pintaFinal(-2,d);
        
        pintaFinal(-2,d);
        pintaFinal(-2,d);
        y.pinta();
        pintaFinal(y.getPosicio(),d);
        pintaFinal(-2,d);
        pintaFinal(-2,d);
        x.pinta();
        pintaFinal(x.getPosicio(),d);
        pintaFinal(-2,d);
        pintaFinal(-2,d);
        pintaFinal(-2,d);
    }
    
}
