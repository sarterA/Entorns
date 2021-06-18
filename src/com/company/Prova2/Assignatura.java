package com.company.Prova2;

/**poner clase en abstract, sirve para que sus datos sean usados en otras clases, no se crea nada nuevo en ellas. **/
public abstract class Assignatura {

    /**este codigo se tranformara en clases **/
        /*
        public static final int OBLIGATORIA = 0;
        public static final int TRONCAL = 1;
        public static final int OPTATIVA = 2;
        */

        private int codi;
        private String assignatura;
        private int tipus;
        private int credits;
        public double preu;
        private String[] alumnes;

        public Assignatura(int codi, String assignatura, int credits, String[] alumnes) {
            this.codi = codi;
            this.assignatura = assignatura;
            this.credits = credits;
            this.alumnes = alumnes;
        }

        /** getPreu de la clase Precios tambien es abstract **/
        public abstract double getPreu();

        /** Hay que quitar el found = true por return. **/
        public static boolean findAlumne(Assignatura assignatura, String[] alumnes) {
            int i = 0;
            String alumneAux = alumnes[i];
            /*boolean found = false; */

            while (i < alumnes.length /* && !found */) {
                if (alumnes.equals(alumneAux)) {
                    return true; /* found = true;*/
                }
                    i++;
            }
            return false; /* return found */
        }

        public int getTipus() {
            return this.tipus;
        }

    public int getCredits() {
        return credits;
    }

    protected abstract double valor_preu();
}
