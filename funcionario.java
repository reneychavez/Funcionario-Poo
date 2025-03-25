// PROGRAMA QUE LER OS DADOS DO FUNCIONARIO E SUBTRAI O IMPOSTO PARA EFETUAR UM AUMENTO SALARIAL
import java.util.Scanner;

public class Funcionario {

    public static void main(String[] args) {
        // Cria o objeto Scanner para ler os dados
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dados do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor do imposto do funcionário: ");
        double imposto = scanner.nextDouble();

        // Cálculo do salário líquido antes do aumento
        double salarioLiquido = salarioBruto - imposto;

        // Exibição dos dados do funcionário antes do aumento
        System.out.println("\n--- Dados do Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        // Solicita a porcentagem de aumento no salário bruto
        System.out.print("\nDigite a porcentagem de aumento do salário bruto: ");
        double porcentagemAumento = scanner.nextDouble();

        // Calcula o novo salário bruto com o aumento
        salarioBruto += salarioBruto * (porcentagemAumento / 100);

        // Atualiza o salário líquido com o novo valor de salário bruto
        salarioLiquido = salarioBruto - imposto;

        // Exibição dos dados do funcionário após o aumento
        System.out.println("\n--- Dados do Funcionário Após Aumento ---");
        System.out.println("Nome: " + nome);
        System.out.println("Novo salário bruto: R$ " + salarioBruto);
        System.out.println("Novo salário líquido: R$ " + salarioLiquido);

        // Fecha o scanner
        scanner.close();
    }
}