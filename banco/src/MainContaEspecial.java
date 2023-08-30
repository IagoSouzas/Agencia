import com.java.main.banco.ContaEspecial;
import com.java.main.banco.Titular;

public class MainContaEspecial {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial();
        conta1.setTitular(new Titular("Iago","12341312300"));
        conta1.setAgencia(0000);
        conta1.setNumero(44444);
        conta1.setTarifaMensal(90);
        conta1.setLimiteChequeEspecial(1000);

        conta1.imprimirDemostrativo();
        conta1.depositar(100);
        conta1.imprimirDemostrativo();

        conta1.sacar(200);
        conta1.debitarTarifaMensal();
        conta1.imprimirDemostrativo();
    }
}
