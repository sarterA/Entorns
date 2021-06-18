package com.company.Prova2;

public abstract class Obligatoria extends Assignatura {
    /** extends es subclase de Assignatura **/

    public Obligatoria(int codi, String assignatura, int credits, String[] alumnes) {
        super(codi, assignatura, credits, alumnes);
    }
    /** Organizar y diminuir els IF's **/
    public double valor_preu(int credits, int preu) {
        if (credits == 3) {
            preu = credits * 21;
        }
        if (credits == 6) {
            preu = credits * 10;
        }
        if (credits > 6) {
            preu = credits * 5;
        }
        return preu;
    }

    @Override
    public double getPreu() {
        return this.valor_preu();
    }
}
