import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i=0 ;i<4;i++){
        Scanner sc = new Scanner(System.in);
               System.out.println("Qual operação você quer:");

        System.out.println("1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação\n");
        int operacao = sc.nextInt();

        System.out.println("Insira um número:");
        int numero1 = sc.nextInt();

        System.out.println("Insira outro número:");
        int numero2 = sc.nextInt();


        if (operacao == 1) {
            int soma = numero1 + numero2;
            System.out.println("Resultado: " + soma);
        } else if (operacao == 2) {
            int subtracao = numero1 - numero2;
            System.out.println("Resultado: " + subtracao);
            } else if (operacao == 3) {
            int divisao = numero1 / numero2;
            System.out.println("Resultado: " + divisao);
        } else if (operacao == 4) {
            int multiplicacao = numero1 * numero2;
            System.out.println("Resultado: " + multiplicacao);
        } else {
            System.out.println("Número de operação inválido");
        }
            System.out.println("Deseja continuar? 1 - Sim / 2 - Não");
            int numero = sc.nextInt();
            if (numero == 2) {
                System.out.println("Programa encerrado");
                break;
        }
    }
}}