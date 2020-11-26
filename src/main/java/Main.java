public class Main {
    public static void main(String[] args) throws TrojkatPascalaException {
        try {
            TrojkatPascala trojkatPascala = new TrojkatPascala(Integer.parseInt(args[0]));
            for (int i = 1; i < args.length; i += 2) {
                try {
                    int k = Integer.parseInt(args[i]);
                    int m = Integer.parseInt(args[i + 1]);
                    System.out.println(args[i] + " po " + args[i + 1] + " - " + trojkatPascala.wspolczynnik(k, m));
                } catch (NumberFormatException e) {
                    System.out.println(args[i] + " po " + args[i + 1] + " - nieprawidłowe dane");
                } catch (TrojkatPascalaException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(args.length - 1 + "- za mało danych");
        } catch (TrojkatPascalaException e) {
            System.out.println(e.getMessage());
        }
    }
}
