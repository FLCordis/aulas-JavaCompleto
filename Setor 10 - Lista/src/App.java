import java.util.Scanner;

public class App {

    static int lista[] = new int[5];

    public static void inserirFinal(int valor) {
        for (int i=0; i<lista.length; i++) {
            if (lista[i]==0) {
                lista[i] = valor;
                i=5;
            }
        }
    }

    public static void imprimir() {
        for (int i=0; i<lista.length; i++) {
            System.out.println("Valor da lista na posição "+i+" é: "+lista[i]);
        }
    }

    public static void inserirLocal(int valor, int indice) {
        lista[indice] = valor;
        System.out.println("Valor "+valor+" inserido na posição "+indice);
    }

    public static int quantidadeElementos() {
        int contador = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]!=0) {
                contador++;
            }            
        }
        return contador;
    }

    public static void verificarValor(int valor) {
        int cont = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==valor) {
                cont++;
            }
        }
        if (cont>0) {
            System.out.println("O número informado existe na lista!");
        } else {
            System.out.println("O número informado não existe na lista!");
        }
    }

    public static void remover(int valor) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==valor) {
                lista[i] = 0;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int menu = -1;
        int valor;

        while (menu!=0) {
            System.out.println("=============== Menu ===============");
            System.out.println("0 - Encerrar o Programa");
            System.out.println("1 - Inserir um valor no final da lista");
            System.out.println("2 - Imprimir os valores da lista");
            System.out.println("3 - Inserir um valor numa posição específica da lista");
            System.out.println("4 - Quantidade de valores na lista");
            System.out.println("5 - Verificar valor na lista");
            System.out.println("6 - Remover valor da lista");
            System.out.println("====================================");
            System.out.print("Escolha uma opção: ");
            menu = ler.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                
                case 1:
                    System.out.print("Informe um valor para ser inserido: ");
                    valor = ler.nextInt();
                    inserirFinal(valor);
                    break;
                
                case 2:
                    System.out.print("Imprimindo valores da lista: ");
                    imprimir();
                    break;

                case 3:
                    System.out.print("Informe um valor para ser inserido: ");
                    valor = ler.nextInt();
                    System.out.print("Informe a posição na lista: ");
                    int indice = ler.nextInt();
                    inserirLocal(valor, indice);                    
                    break;

                case 4:
                    System.out.print("Quantidade de elementos na lista: "+ quantidadeElementos());
                    break;

                case 5:
                    System.out.print("Informe um valor para ser verificado: ");
                    valor = ler.nextInt();
                    verificarValor(valor);
                    break;

                case 6:
                    System.out.print("Informe o valor que deseja remover: ");
                    valor = ler.nextInt();
                    remover(valor);
                    break;

                default:
                    System.out.println("Não existe essa opção!");
                    break;
            }
            
        }
    }
}
