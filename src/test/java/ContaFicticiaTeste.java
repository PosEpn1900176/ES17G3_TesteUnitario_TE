import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ContaFicticia.class)
public class ContaFicticiaTeste {

    private double valorDeposito;
    private double valorMaior;
    private double valorNegativo;
    private double valorSacado;

    private ContaFicticia conta = new ContaFicticia();

    @Before
    public void prepareTests(){
        valorDeposito = 10;
        valorMaior = 12;
        valorNegativo = -10.00;
        valorSacado = 7.00;
    }

    //--> Depositar valor maior do que zero.
    @Test
    public void DepositoValorSaldoZero() throws Exception {

        //--> Configurações
        //ContaFicticia conta =  new ContaFicticia();
        final String METHOD="ObterSaldo";

        ContaFicticia spy = PowerMockito.spy(conta);
        PowerMockito.when(spy, METHOD).thenReturn((Double) 5000.00);

        double valorEsperado = 5010;
        double valorAtual = 0;

        //--> Ação
        valorAtual = spy.Depositar(valorDeposito);

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual, 0);
        PowerMockito.verifyPrivate(spy, Mockito.times(1)).invoke("ObterSaldo");
    }

    //--> Sacar valor com saldo maior do que zero
    @Test
    public void SaqueValorSaldoMaiorZero() throws Exception {

        //--> Configurações
        //ContaMock conta =  new ContaMock();

        double valorEsperado = 3.00;
        double valorAtual;

        //--> Ações
        conta.Depositar(valorDeposito);
        conta.Sacar(valorSacado);

        valorAtual = conta.ObterSaldo();

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual, 0);

    }

    //--> Depositar valor maior do que dez.
    @Test
    public void DepositoValorMaiorDez() throws Exception {

        //--> Configurações
        //ContaMock conta =  new ContaMock();
        double valorSegundoDeposito = 12.00;
        double valorEsperado = 3.00;
        double valorAtual;

        //--> Ações
        conta.Depositar(valorDeposito);
        conta.Depositar(valorSegundoDeposito);
        conta.Sacar(valorSacado);

        valorAtual = conta.ObterSaldo();

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual, 0);

    }

    //--> Depositar valor com valor negativo
    @Test
    public void FazerDespositoComValorNegativo() throws Exception {

        //--> Configurações
        //ContaMock conta =  new ContaMock();
        double valorEsperado = 10.00;
        double valorAtual;

        //--> Ações
        conta.Depositar(valorDeposito);
        conta.Depositar(valorNegativo);

        valorAtual = conta.ObterSaldo();

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual, 0);

    }

    //--> Sacar valor com valor negativo
    @Test
    public void FazerSaqueComValorNegativo() throws Exception {

        //--> Configurações
        //ContaMock conta =  new ContaMock();
        double valorEsperado = 10.00;
        double valorAtual;

        //--> Ações
        conta.Depositar(valorDeposito);
        conta.Sacar(valorNegativo);

        valorAtual = conta.ObterSaldo();

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual, 0);

    }

}
