package tree;

public class RunTree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tree tree = new Tree();

        boolean flag = true;
        while (flag) {
            System.out.println("Selecione uma opção:");
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir na árvore binária");
            System.out.println("2 - Remover da árvore binária");
            System.out.println("3 - Listar em Pré-Ordem");
            System.out.println("4 - Listar em Ordem");
            System.out.println("5 - Listar em Pós-Ordem");
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
                    tree.push(node);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Informe o valor: ");
                    int value = input.nextInt();
                    boolean result = tree.pop(value);
                    if (result) {
                        System.out.println("Nó " + value + " removido da Árvore Binária.");
                    } else {
                        System.out.println("Não removido da Árvore Binária.");
                    }
                    break;
                case 3:
                    System.out.println();
                    tree.listPreOrder();
                    break;
                case 4:
                    System.out.println();
                    tree.listOrder();
                    break;
                case 5:
                    System.out.println();
                    tree.listPosOrder();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }
    }
}
