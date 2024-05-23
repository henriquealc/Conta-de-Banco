import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
       
        // Cria um objeto scanner para ler a entrada do usuario
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
        
        // Solicita ao usuário que informe seu nome
        System.out.print("Informe o nome: ");
        String nome = scanner.next(); // lê o nome do usuário


        // Solicita ao usuário que informe seu numero da conta
        System.out.print("Informe o seu numero: ");
        int numeroConta = scanner.nextInt(); // lê o numero da conta


        // Solicita ao usuário que informe seu numero da agencia
        System.out.print("Numero da Agencia: ");
        String agencia = scanner.next(); // lê o numero da agencia

        // Solicita ao usuário que informe seu saldo
        System.out.print("Informe o saldo: ");
        Double saldo = scanner.nextDouble(); // lê o saldo do usuario


        // Imprimi uma mensagem de boas vindas e os dados fornecidos pelo usuario
        System.out.println("Ola "+ nome + ", obrigado por criar uma conta em nosso banco, a sua agencia e " + agencia + ", conta número " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque." );
    
    
    
    }
}