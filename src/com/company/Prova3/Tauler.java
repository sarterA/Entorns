package com.company.Prova3;

public class Tauler {


        //ATRIBUTS
        private static final int DIMENSIO = 10; //número de columnes i files
        private static final int MAXIM = 371; //píxels de l'altura del tauler
        private Casella t[][];

        private VaixellsUsuari vu = new VaixellsUsuari();

        public Tauler() {
            t = new Casella[DIMENSIO][DIMENSIO];

            for (int i = 0; i < DIMENSIO; i++) {
                for (int j = 0; j < DIMENSIO; j++) {
                    t[i][j] = new Casella();
                }
            }
        }

        //mètodes per obtenir informacio sobre caselles concretes...
        public boolean casellaDisponible(int x, int y) {
            return !t[x][y].getOcupada() && t[x][y].getDisponible();
        }

        public boolean casellaOcupada(int x, int y) {
            return t[y][x].getOcupada();
        }

        public boolean casellaDisparada(int x, int y) {
            return t[y][x].getDisparat();
        }

        public void setDisparada(int x, int y, boolean disparada) {
            t[x][y].setDisparat(disparada);
        }

        void disponible(int x, int y) {
            t[x][y].setDisponible(Boolean.FALSE);
        }

        public void reiniciar(Tauler tauler) {
            int dimensio = 10;
            //netejar tauler...
            for (int i = 0; i < dimensio; i++) {
                for (int j = 0; j < dimensio; j++) {
                    t[j][i].setDisparat(false);
                    t[j][i].setOcupada(false);
                    t[j][i].setDisponible(true);

                    t[j][i] = new Casella();
                }
            }
            //per tornar a posar els vaixells...
            vu.setColocat1(false);
            vu.setColocat2(false);
            VaixellsUsuari.setVaixellsColocats(false);
            vu.setVaixell1(4);
            vu.setVaixell2(3);
        }
    }

