package com.company.Prova2;

public abstract class Troncal extends Assignatura {
    /** extends es subclase de Assignatura **/

    public Troncal(int codi, String assignatura, int credits, String[] alumnes){
        super(codi, assignatura, credits, alumnes);
    }
    @Override
    public double getPreu() {
        return this.getCredits() * 21 + 10;
    }

}
