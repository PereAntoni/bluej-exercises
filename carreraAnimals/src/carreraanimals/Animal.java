/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraanimals;

/**
 *
 * @author pere
 */
public class Animal {
    private String nom;
    private String forma;
    private int posicio;

    public Animal(String nom) {
        this.nom = nom;
        posicio=0;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setForma(String f) {
        this.forma = f;
    }

    public Animal(String nom, String forma) {
        this.nom = nom;
        this.forma = forma;
    }
    
    public void pinta(){
        int a=0;
        String dibuix="";
        while (a<this.getPosicio()){a++;dibuix=dibuix + "-";}
        dibuix=dibuix+this.getForma();
        System.out.print(dibuix);
    }
    public void setPosicio(int posicio) {
        this.posicio = posicio;
    }
    
    public void camina(int p){
        setPosicio(this.posicio + p);
    }

    public String getNom() {
        return nom;
    }
    
    public String getForma() {
        return forma;
    }

    public int getPosicio() {
        return posicio;
    }
    
    
}
