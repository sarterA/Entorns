package com.company.Prova3;
import java.awt.event.MouseEvent;
public class VaixellsUsuari {

static class VaixellUvariables{

    //coordenades de la casella a partir de la qual es vol posar un vaixell:
        private static int x, y;
        //per saber si s'han colocat cada un dels vaixells:
        private static boolean colocat2 = false;
        private static boolean colocat1 = false;
        public static boolean vaixellsColocats = false; //per quan s'han col·locat tots els vaixells

        //número de vaixells que es posen de cada tipus
        private static int vaixell2 = 3;
        private static int vaixell1 = 4;
}

        /**
         * posarDefinitiu. Mètode per posar tots els vaixell al tauler de manera
         * definitiva
         *
         * @param tUsuari
         */
        public void posarDefinitiu(Tauler tUsuari) {
            posarVaixell2(tUsuari, 1);

            if (VaixellUvariables.colocat2) {
                posarVaixell1(tUsuari, 0);
            }
            if (VaixellUvariables.colocat2 && VaixellUvariables.colocat1) {
                VaixellUvariables.vaixellsColocats = true;
            }
        }

        private void posarVaixell2(Tauler tUsuari, int mida) {
            obtenirCasella(tUsuari);
            if (tUsuari.casellaDisponible(VaixellUvariables.y, VaixellUvariables.x)) {
                if (esPotPosarVU(tUsuari, mida) && VaixellUvariables.vaixell2 > 0) {
                    colocar(tUsuari, mida);
                    VaixellUvariables.vaixell2--;
                    System.out.println(" Col·loca els teus vaixells  |  Següent vaixell: de 2 posicions"
                            + "  |  Restants : " + VaixellUvariables.vaixell2);
                }
            }
            if (VaixellUvariables.vaixell2 == 0) {
                VaixellUvariables.colocat2 = true;
            }
        }

        private void posarVaixell1(Tauler tUsuari, int mida) {
            obtenirCasella(tUsuari);
            if (tUsuari.casellaDisponible(VaixellUvariables.y, VaixellUvariables.x)) {
                if (esPotPosarVU(tUsuari, mida) && VaixellUvariables.vaixell1 > 0) {
                    colocar(tUsuari, mida);
                    VaixellUvariables.vaixell1--;
                    System.out.println(" Col·loca els teus vaixells  |  Següent vaixell: d'1 posició"
                            + "  |  Restants : " + VaixellUvariables.vaixell1);
                }
            }
            if (VaixellUvariables.vaixell1 == 0) {
                VaixellUvariables.colocat1 = true;
            }
        }

        /**
         * espaiDisponible. S'encarrega, una vegada tenim la casella inicial i
         * l'orientació d'un vaixell, de mirar no xocaria ni tocaria cap altre
         * vaixell en ser col·locat.
         *
         * @param tUsuari Tauler on es posa el vaicell
         * @param mida Número de caselles que ocupa el vaixell
         * @return espaiDisponible
         */
        //refactorizar
        private boolean espaiDisponible(Tauler tUsuari, int mida) {
            boolean espaiDisponible = true;

            if (clickEsquerre()) {
                for (int i = VaixellUvariables.x; i <= VaixellUvariables.x + mida; i++) {
                    if (!tUsuari.casellaDisponible(VaixellUvariables.y, i)) {
                        espaiDisponible = false;
                    }
                }
            }
            if (clickEsquerre()) {
                for (int i = VaixellUvariables.y; i <= VaixellUvariables.y + mida; i++) {
                    if (!tUsuari.casellaDisponible(i, VaixellUvariables.x)) {
                        espaiDisponible = false;
                    }
                }
            }
            return espaiDisponible;
        }

        /**
         * hiCab. Mètode que mira si un vaixell té lloc suficient per a ser
         * col·locat sense sortir del tauler.
         *
         * @param mida Número de caselles que ocupa el vaixell
         * @return hiCab
         */

        private boolean hiCab(int mida) {
            boolean hiCab = false;

            if (clickEsquerre()) {
                hiCab = 9 - VaixellUvariables.x >= mida;
            }
            if (clickEsquerre()) {
                hiCab = 9 - VaixellUvariables.y >= mida;
            }
            return hiCab;
        }

        /**
         * esPotPosar. Retorna si un vaixell té lloc suficient dins el tauler (no
         * sortiria per defora) i si tocaria o es xocaria amb un altre vaixell.
         *
         * @param tUsuari Tauler on es posa el vaicell
         * @param mida Número de caselles que ocupa el vaixell
         * @return
         */
        //refactorizar
        //cambie el nombre pq hay otro en vaixellsCPU con el mismo nombre.
        private boolean esPotPosarVU(Tauler tUsuari, int mida) {
            return hiCab(mida) && espaiDisponible(tUsuari, mida);
        }

        /**
         * obtenirCasella. Mètode obtenir la casella on s'ha clickat l'usuari i amb quin botó. Assigna
         * un valor a les variables 'x' i 'y' d'aquesta classe.
         *
         * @param tUsuari Tauler on clickam
         */
        public void obtenirCasella(Tauler tUsuari) {
            // codi suprimit per l'exercici
        }

        /**
         * colocar. Mètode per posar el vaixell al tauler. Segons el boolean
         * 'orientacio' es posa en horitzontal o en vertical.
         *
         * @param tUsuari Tauler al qual es posa el vaixell
         * @param mida Número de caselles que ocupa el vaixell
         */
        private void colocar(Tauler tUsuari, int mida) {
            // codi suprimit per l'exercici
        }

        /**
         * disponibilitat. Aquest mètode s'encarrega de posar 'disponible=false' a
         * les caselles que envolten un vaixell. Així, a l'hora de posar un nou
         * vaixell, no es tocarà amb els altres
         *
         * @param tUsuari Tauler al qual es posen les peces
         * @param xi Coordenada 'x' inicial del vaixell
         * @param yi Coordenada 'y' inicial del vaixell
         * @param xf Coordenada 'x' final del vaixell
         * @param yf Coordenada 'y' final del vaixell
         */
        private void disponibilitat(Tauler tUsuari, int xi, int yi, int xf, int yf) {
            // codi suprimit per l'exercici
        }

        /**
         * Retorna vertader si l'usuari ha fet click amb el botó esquerre.
         * @return
         */
        public boolean clickEsquerre() {
            // codi suprimit per l'exercici
            return true;
        }

        public static void setVaixellsColocats(boolean vaixellsColocats) {
            VaixellUvariables.vaixellsColocats = vaixellsColocats;
        }

        public void setColocat2(boolean colocat2) {
            VaixellUvariables.colocat2 = colocat2;
        }

        public void setColocat1(boolean colocat1) {
            VaixellUvariables.colocat1 = colocat1;
        }

        public void setVaixell2(int vaixell2) {
            VaixellUvariables.vaixell2 = vaixell2;
        }

        public void setVaixell1(int vaixell1) {
            VaixellUvariables.vaixell1 = vaixell1;
        }

    }

