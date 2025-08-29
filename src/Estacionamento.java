import java.util.Scanner;

//Classe princial
public class Estacionamento {
    //metodo principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //aqui eu estou criando um obejto Scanner que vai ler o que o usuario digitar, e depois ele vai armazenar isso na vaariavel SC

        System.out.print("Digite a placa do veiculo: "); //print simples
        String placa = sc.nextLine(); //aqui ele vai ler o que o usuario digitou e armazenar como uma String na variavel placa, mesmo sendo numeros, a placa ainda é uma string, não realiza operação

        System.out.print("Quantas horas ficou estacionado: ");//print simples
        int horas = sc.nextInt(); //aqui ele armazena as horas como int mas pode ser float tambem para horas quebradas, um dos dois, pois aqui serão realizadas operações

        new Veiculo(placa, horas).mostrarInfo();
        // **PARTE MEIO AVANÇADA:** Esta linha faz duas coisas de uma vez só:
        // 1. 'new Veiculo(placa, horas)' -> Cria um novo objeto 'Veiculo' em memória.
        // 2. '.mostrarInfo()' -> Imediatamente chama o método 'mostrarInfo()' desse objeto recém-criado.
        // A diferença aqui é que o objeto não é guardado em uma variável (como 'Veiculo v1 = ...').
        // Ele é criado, usado uma única vez para chamar o método, e depois "descartado". É um atalho útil.

        sc.close(); //aqui ele fecha o Scanner pra liberar o sistema, é só boa pratica, ainda roda sem isso
    }
}