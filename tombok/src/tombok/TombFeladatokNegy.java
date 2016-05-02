/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombok;

/**
 *
 * @author npallag
 */
public class TombFeladatokNegy {

    /**
     * @param args the command line arguments
     * itt jart Doki
     */
    public static void main(String[] args) {
//Tombot szetvalogat paros es paratlan tombre: // ez egyszeru es lefutott ezert kikommenteztem
//        int[] szamok = {4, 3, 5, 9, 6, 8, 2};
//        int parosdb = 0;
//        int paratlandb = 0;
//        for (int i = 0; i < szamok.length; i++) {
//            if (szamok[i] % 2 == 0) {
//                parosdb = parosdb + 1;
//            } else {
//                paratlandb = paratlandb + 1;
//            }
//        }
//        int[] paros = new int[parosdb];
//        int[] paratlan = new int[paratlandb];
//        int j = 0;
//        int k = 0;
//        for (int i = 0; i < szamok.length; i++) {
//            if (szamok[i] % 2 == 0) {
//                paros[j] = szamok[i];
//                j = j + 1;
//            } else {
//                paratlan[k] = szamok[i];
//                k = k + 1;
//            }
//        }
//
//        System.out.println("Paros tomb: ");
//        for (int i = 0; i < paros.length; i++) {
//            System.out.println(paros[i]);
//        }
//        System.out.println("Paratlan tomb: ");
//        for (int i = 0; i < paratlan.length; i++) {
//            System.out.println(paratlan[i]);
//        }
//////////////////////////////////////////////////////////////////////////////
//        //Ket tomb unioja (ha nem ismetlodhetnek a szamok) ////ez meg szuperul lefut
//        int[] egyiktomb = {4, 8, 3, 9, 5, 1};
//        int[] masiktomb = {7, 2, 8, 5, 6, 4};
//        int kozosdb = 0;
//        for (int i = 0; i < egyiktomb.length; i++) {
//            for (int l = 0; l < masiktomb.length; l++) {
//                if (egyiktomb[i] == masiktomb[l]) {
//                    kozosdb = kozosdb + 1;
//                }
//
//            }
//        }
//        int[] metszet = new int[kozosdb];
//        int m = 0;
//        for (int i = 0; i < egyiktomb.length; i++) {
//            for (int l = 0; l < masiktomb.length; l++) {
//                if (egyiktomb[i] == masiktomb[l]) {
//                    metszet[m] = egyiktomb[i];
//                    m = m + 1;
//                }
//
//            }
//        }
//        System.out.println("Metszet tomb: ");
//        for (int i = 0; i < metszet.length; i++) {
//            System.out.println(metszet[i]);
//        }
//    }
//}
///////////////////////////////////////////////////////////////////////////////
        //Ket tomb unioja (ha ismetlodhetnek a szamok)// na ez nem annyira megy, gondban vagyok a ismetlodes ellenorzesevel...
        // megoldas az else j<0-val van a gond, de egyszerubb ha egy boolean fuggvenyt (igy nem szamit a darabszam)
        int[] egyiktomb = {4, 8, 4, 9, 5, 1};
        int[] masiktomb = {7, 4, 8, 5, 6, 4};
        int kozosdb = 0;

        for (int i = 0; i < egyiktomb.length; i++) { // eloszor csak a metszet tomb meretet hatarozom meg (kozosdb)
            if (i == 0) {                            // a 0 eset azert kell kulon hogy ne keressen egyezest a -1. helyen
                for (int l = 0; l < masiktomb.length; l++) {
                    if (egyiktomb[i] == masiktomb[l]) {
                        kozosdb++;
                        break;
                    }
                }

            } else {                     // most ott tartok hogy az else ag le sem fut 
                for (int j = i - 1; j < 0; j--) {
                    System.out.println(egyiktomb[i] + ", " + egyiktomb[j]);
                    if (egyiktomb[i] != egyiktomb[j]) {
                        for (int l = 0; l < masiktomb.length; l++) {
                            if (egyiktomb[i] == masiktomb[l]) {
                                kozosdb++;
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(kozosdb);
    }
}
// a tovabbi reszt kikommenteztem egyenlore hogy konnyebb legyen megtalalni a hibat a tomb meret meghatarozasnal
//        int[] metszet = new int[kozosdb];
//        int m = 0;
//        for (int i = 0; i < egyiktomb.length; i++) {
//            if (i == 0) {
//                for (int l = 0; l < masiktomb.length; l++) {
//                    if (egyiktomb[i] == masiktomb[l]) {
//                        metszet[m] = egyiktomb[i];
//                        m++;
//
//                    }
//                }
//            } else {
//                for (int j = i - 1 - 1; j < 0; j--) {
//                    if (egyiktomb[i] != egyiktomb[j]) {
//                        for (int l = 0; l < masiktomb.length; l++) {
//                            if (egyiktomb[i] == masiktomb[l]) {
//                                metszet[m] = egyiktomb[i];
//                                m++;
//
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("Metszet tomb: ");
//        for (int i = 0; i < metszet.length; i++) {
//            System.out.println(metszet[i]);
//        }
//    }
//}
