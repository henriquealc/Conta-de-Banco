import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
        
        System.out.print("Informe o nome: ");
        String nome = scanner.next();

        System.out.print("Informe o seu numero: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Numero da Agencia: ");
        String agencia = scanner.next();

        System.out.print("Informe o saldo: ");
        Double saldo = scanner.nextDouble();

  
        System.out.println("Ola "+ nome + ", obrigado por criar uma conta em nosso banco, a sua agencia e " + agencia + ", conta número " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque." );
    
    
    
    }
}