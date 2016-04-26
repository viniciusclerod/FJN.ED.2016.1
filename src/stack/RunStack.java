package stack;

import java.util.Scanner;

/**
 * Created by vinicius on 20/04/16.
 */
public class RunStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();
        Node node;

        boolean flag = true;
        while(flag) {
            System.out.println("Selecione uma opção:");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir na pilha");
            System.out.println("2 - Buscar na pilha");
            System.out.println("3 - Remover da pilha");
            System.out.println("4 - Listar a pilha");
            System.out.println("5 - Limpar a pilha");
            System.out.print(":> ");
            switch (input.nextInt()) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println();
                    System.out.print("Informe o valor: ");
                    node = new Node();
                    node.setValue(input.nextInt());
                    stack.insert(node);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Informe o valor: ");
                    Node aux = stack.find(input.nextInt());
                    if(aux!=null) {
                        System.out.println("Encontrado o valor "+ aux.getValue());
                    } else {
                        System.out.println("Valor não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println();
                    if(stack.remove()) {
                        System.out.println("Nó removido.");
                    } else {
                        System.out.println("Pilha vazia.");
                    }
                    break;
                case 4:
                    System.out.println();
                    stack.list();
                    break;
                case 5:
                    System.out.println();
                    stack.clear();
                    System.out.println("Pilha limpa.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();
        }
    }
}
