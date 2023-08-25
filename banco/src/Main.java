import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Iago","12341312300"));
        conta1.setAgencia(0000);
        conta1.setNumero(44444);
        conta1.setLimiteChequeEspecial(100);
        conta1.setTarifaMensal(30);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

    }
}