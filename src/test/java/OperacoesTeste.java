import org.junit.Assert;
import org.junit.Test;

public class OperacoesTeste {

    Operacoes operacoes = new Operacoes();

    @Test
    public void TestarSomaValores() {
        //--> Configurações
        double valorAtual;
        double valorEsperado = 2;
        double parametro1 = 1;
        double parametro2 = 1;

        //--> Ações
        valorAtual = operacoes.Soma(parametro1, parametro2);

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual, 0);
    }

    @Test
    public void TestarErroParametroSoma() {
        //--> Configurações
        double valorAtual;
        double valorEsperado = 0;
        double par1 = 1;
        double par2 = 0;

        //--> Ações
        valorAtual = operacoes.Soma(par1, par2);

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual, 0);
    }

    @Test
    public void TestarDivisaoZero() {
        //--> Configurações
        double valorAtual;
        double valorEsperado = 0;
        double par1 = 1;
        double par2 = 0;

        //--> Ações
        valorAtual = operacoes.Divisao(par1, par2);

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual, 0);
    }

    @Test
    public void TestarDivisao() {
        //--> Configurações
        double valorAtual;
        double valorEsperado = 5;
        double par1 = 10;
        double par2 = 2;

        //--> Ações
        valorAtual = operacoes.Divisao(par1, par2);

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual, 0);
    }

    @Test
    public void TestaFatorialValorInvalido() {
        //--> Configurações
        int valorAtual;
        int valorEsperado = -1;
        int par = -3;

        //--> Ações
        valorAtual = operacoes.fatorial(par);

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void TestaFatorialValorZero() {
        //--> Configurações
        int valorAtual;
        int valorEsperado = 0;
        int par = 0;

        //--> Ações
        valorAtual = operacoes.fatorial(par);

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void TestaFatorialValorMaiorZero() {
        //--> Configurações
        int valorAtual;
        int valorEsperado = 120;
        int par = 5;

        //--> Ações
        valorAtual = operacoes.fatorial(par);

        //--> Teste
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void TestarNumeroPar() {
        //--> Configurações
        int par = 4;

        //--> Teste
        Assert.assertTrue(operacoes.NumeroPar(par));
    }

    @Test
    public void TestarNumeroImpar() {
        //--> Configurações
        int par = 5;

        //--> Teste
        Assert.assertFalse(operacoes.NumeroPar(par));
    }
}
