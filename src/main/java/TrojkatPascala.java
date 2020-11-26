public class TrojkatPascala {
    private int[][] tab;

    public TrojkatPascala(int n) throws TrojkatPascalaException {
        if (n < 0) throw new TrojkatPascalaException(n + " - nieprawidłowy rozmiar trójkąta");
        this.tab = new int[n][];
        trojkatPascala(n);
    }

    private void trojkatPascala(int n) {
        for (int i = 0; i < n; i++) {
            tab[i] = new int[i + 1];
            tab[i][0] = 1;
            tab[i][i] = 1;
            for (int j = 1; j < i; j++) {
                tab[i][j] = tab[i - 1][j - 1] + tab[i - 1][j];
            }
        }
    }

    public int wspolczynnik(int k, int m) throws TrojkatPascalaException {
        if (k > tab.length || k < 1) {
            throw new TrojkatPascalaException(k + " po " + m + " - pierwszy argument spoza zakresu");
        }
        if (m > tab[k].length) {
            throw new TrojkatPascalaException(k + " po " + m + " - drugi argument spoza zakresu");
        }
        return tab[k][m];
    }

    public void wypiszLiczby() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
