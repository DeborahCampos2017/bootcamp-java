import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor digite o nome do cliente!");
        String nome = sc.next();
        System.out.println("por favor digite o numero da agência!");
        String agencia = sc.next();
        System.out.println("por favor digite o numero da conta!");
        int numero = sc.nextInt();
        System.out.println("por favor digite o saldo da conta!");
        double saldo = sc.nextDouble();
        System.out.println("óla " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é  " + agencia
                + " conta " + numero + " e seu saldo " + saldo + " ja esta disponível para saque");
    }
}
