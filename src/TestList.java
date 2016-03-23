import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;


public class TestList {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List list = new List();
		Node node;
		boolean flag = true;
		while (flag) {
			System.out.println("Selecione uma opção: ");
			System.out.println(" 0 - Sair");
			System.out.println(" 1 - Exibir a lista");
			System.out.println(" 2 - Limpar lista");
			System.out.println(" 3 - Inserir no início da lista");
			System.out.println(" 4 - Inserir no final da lista");
			System.out.println(" 5 - Inserir ordenadamente");
			System.out.println(" 6 - Verificar existência");
			switch (input.nextInt()) {
			case 0:
				flag = false;
				break;
			case 1:
				list.showList();
				break;
			case 2:
				list.clearList();
//				list.showList();
				break;
			case 3:
				System.out.print("Qual valor deseja inserir no inicio? ");
				node = new Node();
				node.setValue(input.nextInt());
				list.insertBegin(node);
//				list.showList();
				break;
			case 4:
				System.out.print("Qual valor deseja inserir do fim? ");
				node = new Node();
				node.setValue(input.nextInt());
				list.insertEnd(node);
//				list.showList();
				break;
			case 5:
				System.out.print("Qual valor deseja inserir ordenadamente? ");
				node = new Node();
				node.setValue(input.nextInt());
				list.insertOrdered(node);
//					list.showList();
				break;
			case 6:
				System.out.print("Qual valor deseja verificar? ");
				int value = input.nextInt();
				if (list.valueExists(value)) {
					System.out.println("O valor " + value + " existe na lista.");
				} else {
					System.out.println("O valor não existe na lista.");
				}
//					list.showList();
				break;
			default:
				System.out.print("Opção inválida");
				break;
			}
		}
	}
}
