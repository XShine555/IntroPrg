public class UtilTaula {
    public static String taulaToString(boolean[][] taula, char caracterTrue, char caracterFalse) {
        String resultat = "";
        for (int i=0; i<taula.length; i++) {
            for (int j=0; j<taula[i].length; j++) {
                char value = taula[i][j] ? caracterTrue : caracterFalse;
                resultat += value;
            }
            resultat += "\n";
        }
        return resultat;
    }

    public static void inicialitzaPrimeraDiagonalPrimerPle(boolean[][] taula) {
        clearTable(taula);

        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                taula[i][j] = true;
            }
        }
    }

    public static void inicialitzaPrimeraDiagonalSegonPle(boolean[][] taula) {
        clearTable(taula);

        for (int i = 0; i < taula.length; i++) {
            for (int j = i; j < taula.length; j++) {
                taula[i][j] = true;
            }
        }
    }

    public static void inicialitzaSegonaDiagonalPrimerPle(boolean[][] taula) {
        clearTable(taula);

        for (int i = taula.length; i >= 0; i--) {
            for (int j = 0; j < taula.length - i; j++) {
                taula[i][j] = true;
            }
        }
    }

    public static void inicialitzaSegonaDiagonalSegonPle(boolean[][] taula) {
        clearTable(taula);

        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                taula[i][taula[i].length - j - 1] = true;
            }
        }
    }

    public static void inicialitzaVerticalMigPrimerPle(boolean[][] taula) {
        clearTable(taula);

        for (int i = 0; i < taula.length; i++) {
            int plus = taula[i].length % 2 == 0 ? 0 : 1;

            for (int j = 0; j < taula[i].length / 2 + plus; j++) {
                taula[i][j] = true;
            }
        }
    }

    public static void inicialitzaVerticalMigSegonPle(boolean[][] taula) {
        clearTable(taula);

        for (int i = 0; i < taula.length; i++) {
            for (int j = taula[i].length / 2; j < taula[i].length; j++) {
                taula[i][j] = true;
            }
        }
    }

    public static void inicialitzaHoritzontalMigPrimerPle(boolean[][] taula) {
        clearTable(taula);

        int plus = taula.length % 2 == 0 ? 0 : 1;
        for (int i = 0; i < taula.length / 2 + plus; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taula[i][j] = true;
            }
        }
    }

    public static void inicialitzaHoritzontalMigSegonPle(boolean[][] taula) {
        clearTable(taula);

        for (int i = taula.length / 2; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taula[i][j] = true;
            }
        }
    }

    public static void inicialitzaQuartsNOPle(boolean[][] taula) {
        clearTable(taula);

        int mid = taula.length / 2;

        for (int i = 0; i < taula.length; i++) {
            if (i < mid) {
                int plus = taula[i].length % 2 == 0 ? 0 : 1;

                for (int j = 0; j < taula[i].length / 2 + plus; j++) {
                    taula[i][j] = true;
                }
            }
            else if (i > mid) {
                taula[i][taula[i].length / 2] = true;
            }
            else {
                for (int j = 0; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
        }
    }

    public static void inicialitzaQuartsSOPle(boolean[][] taula) {
        clearTable(taula);

        int mid = taula.length / 2;

        for (int i = 0; i < taula.length; i++) {
            if (i < mid) {
                taula[i][taula[i].length / 2] = true;
            }
            else if (i > mid) {
                int plus = taula[i].length % 2 == 0 ? 0 : 1;

                for (int j = 0; j < taula[i].length / 2 + plus; j++) {
                    taula[i][j] = true;
                }
            }
            else {
                for (int j = 0; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
        }
    }

    public static void inicialitzaQuartsNEPle(boolean[][] taula) {
        clearTable(taula);

        int mid = taula.length / 2;

        for (int i = 0; i < taula.length; i++) {
            if (i < mid) {
                for (int j = taula[i].length / 2; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
            else if (i > mid) {
                taula[i][taula[i].length / 2] = true;
            }
            else {
                for (int j = 0; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
        }
    }

    public static void inicialitzaQuartsSEPle(boolean[][] taula) {
        clearTable(taula);

        int mid = taula.length / 2;

        for (int i = 0; i < taula.length; i++) {
            if (i < mid) {
                taula[i][taula[i].length / 2] = true;
            }
            else if (i > mid) {
                for (int j = taula[i].length / 2; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
            else {
                for (int j = 0; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
        }
    }

    public static void inicialitzaQuartsNOSEPlens(boolean[][] taula) {
        clearTable(taula);

        int mid = taula.length / 2;

        for (int i = 0; i < taula.length; i++) {
            if (i < mid) {
                int plus = taula[i].length % 2 == 0 ? 0 : 1;

                for (int j = 0; j < taula[i].length / 2 + plus; j++) {
                    taula[i][j] = true;
                }
            }
            else if (i > mid) {
                for (int j = taula[i].length / 2; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
            else {
                for (int j = 0; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
        }
    }

    public static void inicialitzaQuartsSONEPlens(boolean[][] taula) {
        clearTable(taula);
        int mid = taula.length / 2 - 1;
        
        for (int i = 0; i < taula.length; i++) {
            if (i > mid) {
                int plus = taula[i].length % 2 == 0 ? 0 : 1;
                for (int j = 0; j < taula[i].length / 2 + plus; j++) {
                    taula[i][j] = true;
                }
                }
            else if (i < mid) {
                for (int j = taula[i].length / 2; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
            else {
                //System.out.println("mid");
                for (int j = 0; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
        }

        /*int mid_i = taula.length / 2;

        for (int i = 0; i < taula.length; i++) {
            if (i < mid_i) {
                for (int j = taula[i].length / 2; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
            else if (i > mid_i) {
                int plus = taula[i].length % 2 == 0 ? 0 : 1;
                
                for (int j = 0; j < taula[i].length / 2 + plus; j++) {
                    taula[i][j] = true;
                }
            }
            else {
                for (int j = 0; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
        }*/
    }

    public static void inicialitzaCreuNPle(boolean[][] taula) {
        clearTable(taula);

        boolean isDescending = false;

        int toCheck = taula.length > taula[0].length ? taula[0].length : taula.length;

        for (int i = 0; i < toCheck; i++) {
            int oppositeIndex = taula[i].length - i - 1;

            taula[i][i] = true;
            taula[i][oppositeIndex] = true;

            if (i == oppositeIndex || i + 1 == oppositeIndex || oppositeIndex == 0) {
                isDescending = true;
            }

            if (!isDescending) {
                for (int j = i; j < oppositeIndex; j++) {
                    taula[i][j] = true;
                }
            }
        }
    }

    public static void inicialitzaCreuOPle(boolean[][] taula) {
        clearTable(taula);

        boolean isDescending = false;

        int toCheck = taula.length > taula[0].length ? taula[0].length : taula.length;

        for (int i = 0; i < toCheck; i++) {
            int oppositeIndex = taula[i].length - i - 1;

            taula[i][i] = true;
            taula[i][oppositeIndex] = true;

            if (i == oppositeIndex || i + 1 == oppositeIndex || oppositeIndex == 0) {
                isDescending = true;
            }

            if (!isDescending) {
                for (int j = 0; j < i; j++) {
                    taula[i][j] = true;
                }
            } else {
                for (int j = 0; j < oppositeIndex; j++) {
                    taula[i][j] = true;
                }
            }
        }
    }

    public static void inicialitzaCreuSPle(boolean[][] taula) {
        clearTable(taula);

        boolean isDescending = false;

        int toCheck = taula.length > taula[0].length ? taula[0].length : taula.length;

        for (int i = 0; i < toCheck; i++) {
            taula[i][i] = true;
            taula[i][taula[i].length - i - 1] = true;

            int oppositeIndex = taula[i].length - i - 1;
            if (i == oppositeIndex || i + 1 == oppositeIndex || oppositeIndex == 0) {
                isDescending = true;
            }

            if (isDescending) {
                for (int j = taula[i].length - i - 1; j < i; j++) {
                    taula[i][j] = true;
                }
            }
        }
    }

    public static void inicialitzaCreuEPle(boolean[][] taula) {
        clearTable(taula);

        boolean isDescending = false;

        int toCheck = taula.length > taula[0].length ? taula[0].length : taula.length;

        for (int i = 0; i < toCheck; i++) {
            int oppositeIndex = taula[i].length - i - 1;

            taula[i][i] = true;
            taula[i][oppositeIndex] = true;

            if (i == oppositeIndex || i + 1 == oppositeIndex || oppositeIndex == 0) {
                isDescending = true;
            }

            if (!isDescending) {
                for (int j = oppositeIndex; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            } else {
                for (int j = i; j < taula[i].length; j++) {
                    taula[i][j] = true;
                }
            }
        }
    }

    public static void inicialitzaCreuNSPlens(boolean[][] taula) {
        clearTable(taula);

        boolean isDescending = false;

        int toCheck = taula.length > taula[0].length ? taula[0].length : taula.length;

        for (int i = 0; i < toCheck; i++) {
            taula[i][i] = true;
            taula[i][taula[i].length - i - 1] = true;

            int oppositeIndex = taula[i].length - i - 1;
            if (i == oppositeIndex || i + 1 == oppositeIndex || oppositeIndex == 0) {
                isDescending = true;
            }

            if (isDescending) {
                for (int j = taula[i].length - i - 1; j < i; j++) {
                    taula[i][j] = true;
                }
            } else {
                for (int j = i; j < taula[i].length - i - 1; j++) {
                    taula[i][j] = true;
                }
            }
        }
    }

    public static void inicialitzaCreuOEPlens(boolean[][] taula) {
        clearTable(taula);

        for (int i = 0; i < taula.length; i++) {
            boolean isMid = i * 2 >= taula[i].length - 2;
            int dif = isMid ? taula[i].length - i: i + 1;
            
            for (int j = 0; j < dif; j++) {
                taula[i][j] = true;
                taula[i][taula[i].length - j - 1] = true;
            }
        }
    }

    public static void clearTable(boolean[][] taula) {
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                taula[i][j] = false;
            }
        }
    }
}
