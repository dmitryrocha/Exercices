package hackerRank30Days;

public class Dia16 {

    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();
        int ans = 0;
        try {
            ans = calc.potencia(2, 4);
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            ans = calc.potencia(10, 0);
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            ans = calc.potencia(2, -4);
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            ans = calc.potencia(-2, -4);
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NumeroErradoException extends Exception {
    public NumeroErradoException(String mensagemDeErro) {
        super(mensagemDeErro);
    }
}

class Calculadora {
    public int potencia(int n, int p) throws NumeroErradoException {
        int multi = n;
        if(n < 0 || p < 0) {
            throw new NumeroErradoException("n and p should be non-negative");
        } else {
            if(p == 0) {
                return 1;
            } else {
                for (int i = 1; i < p; i++) {
                    multi = multi * n;
                }
            }
        }
        return multi;
    }
}
