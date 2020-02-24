public class Operacoes {

    public double Soma(double par1, double par2) {
        if (par1 > 0 && par2 > 0) {
            return par1 + par2;
        } else {
            return  0;
        }
    }

    public double Divisao(double dividendo, double divisor) {
        if (divisor == 0) {
            return 0;
        } else {
            return  dividendo / divisor;
        }
    }

    public int fatorial(int valor) {
        if (valor == 0) {
            return 0;
        } else {
            if (valor < 0) {
                return -1;
            } else {
                int fat = 1;
                for (int i = 1; i <= valor; i++) {
                    fat *= i;
                }
                return fat;
            }
        }
    }

    public boolean NumeroPar(int numero) {
        double resto = numero % 2;
        if (resto > 0) {
            return false;
        } else {
            return true;
        }
    }
}
