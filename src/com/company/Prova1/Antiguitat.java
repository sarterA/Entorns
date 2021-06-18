package Prova1;


//- Extracció de variable.
//- Extracció de mètode.
//- Split temporary variable.
//- Remove parameter assignment.
//- Replace method with method object.

public class Antiguitat {

        private int anys;
        private int tipus;

        public static final int QUADRE = 0;
        public static final int MOBLE = 1;
        public static final int ESCULTURA = 2;


    public Antiguitat(int anys, int tipus) {
            this.anys = anys;
            this.tipus = tipus;
        }
    public int estimacioValor(int valorInicial, int valorIni1, int valorIni2, int valorIni3) {
        valorIni1 = valorInicial += 1;
        valorIni2 = valorInicial += 2;
        valorIni3 = valorInicial += 3;

        if (this.anys >= 1800 && this.anys < 1900) {
            return valorIni1;
        } else if (this.anys >= 1700 && this.anys < 1800) {
            return valorIni2;
        } else {
            return valorIni3;
        }


        }

        public int getTipus() {
            return this.tipus;

        }


    }

