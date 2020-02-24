public class ContaFicticia {

    private double saldoConta;

    public ContaFicticia() {
        LimparSaldo();
    }

    private void LimparSaldo() {
        saldoConta = 0;
    }

    public double Depositar(double valor) {
        if (valor > 0) {
            if (valor <= 10) {
                AtualizarSaldo(ObterSaldo() + valor);
            } else {
                System.out.println("O valor deve ser menor ou igual a dez.");
            }
        }
        return ObterTotal();
    }

    public double Sacar(double valor) {
        if (valor > 0) {
            AtualizarSaldo(ObterSaldo() - valor);
        }
        return ObterSaldo();
    }

    private void AtualizarSaldo(double saldo) {
        saldoConta = saldo;
    }

    public double ObterSaldo() {
        return saldoConta;
    }

    public double ObterTotal() {
        return  saldoConta;
    }
}
