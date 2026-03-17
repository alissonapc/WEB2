import java.util.Scanner;

public class main {
	
	private static Scanner scanner = new Scanner (System.in);
	private static Manage_people gerente = new Manage_people();
	
	public static int menu() {
		System.out.println("---------------------------------------------------");
		System.out.println("----------- Sistema de Controle de Pessoas --------");
		System.out.println("---------------------------------------------------");
		System.out.println("------------------ MENU DE OPÇÕES -----------------");
		System.out.println(" 1 - Cadastrar ");
		System.out.println(" 2 - Buscar pessoa pelo CPF");
		System.out.println(" 3 - Atualizar");
		System.out.println(" 4 - Remover alguém");
		System.out.println(" 5 - Sair");
		System.out.println("---------------------------------------------------");
		System.out.println("Escolha uma opção: ");
		return scanner.nextInt();
	}
	
	public static Person readData() {
		System.out.println("Diga seu nome: ");
		String name = scanner.nextLine();
		System.out.println("Seu CPF também: ");
		String cpf = scanner.nextLine();
		return new Person(name, cpf);
	}
	
	private static void search() {
		System.out.println("Digite seu CPF: ");
		String cpf = scanner.nextLine();
		Person pessoa = gerente.search(cpf);
		if(pessoa != null) {
			System.out.println("Pessoa encontra, aqui está: ");
			System.out.println(pessoa);
		}else {
			System.out.println("Pessoa não encontrada!");
		}
	}
	private static void update() {
		System.out.println("Digite o CPF: ");
		String cpf = scanner.nextLine();
		System.out.println("Digite o nome: ");
		String name = scanner.nextLine();
		if(gerente.update(cpf, name)) {
			System.out.println("Dados atualizados, confira: ");
		}else {
			System.out.println("Erro ao atualizar dados. ");
		}
	}
	private static void remove() {
		System.out.println("Digite o CPF: ");
		String cpf = scanner.nextLine();
		if(gerente.remove(cpf)) {
			System.out.println("Dados excluidos, confira: ");
		}else {
			System.out.println("Erro ao excluir dados. ");
		}
	}

	public static void main (String[] args) {
		Manage_people gerente = new Manage_people();
		int opcao;
		Person pessoa;
		do {
			opcao = menu();
			scanner.nextLine();
			switch (opcao) {
			case 1: {
				pessoa = readData();
				if(gerente.save(pessoa)) {
					System.out.println("pessoa cadastrada com sucesso!");
				}else {
					System.out.println("Erro ao cadastrar!");
				}
				break;
			}
			case 2:{
				search();
				break;
			}
			case 3:{
				update();
				break;
			}
			case 4:{
				remove();
				break;
			}
			default:
				System.out.println("Opção inválida. Tente de novo!");
			}
			System.out.println("Pressione ENTER para continuar... ");
			scanner.nextLine();
		}while(opcao != 5);

	}

	
}