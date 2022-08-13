import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {

	/*
	 * Programa:MercadoFrutas Classe: CRUD
	 * 
	 * Scanner - Teclado
	 * 
	 * Um programa de Controle de Frutas
	 * 
	 * Switch 
	 * 
	 * 1 - Permite fazer o cadastro de frutas ArrayList + add 
	 *  
	 * 2 - Permite mostrar todas as frutas Cadastradas Mostrar a Variável do tipo
	 * ArrayList no sysout
	 * 
	 * 3 - Permite trocar uma fruta por outra fruta através do id interno Ao digitar
	 * um id, mostrar a fruta atual e Permitir modificar a fruta ArrayList do tipo
	 * SET
	 * 
	 * 4 - Sai do laço de repetição
	 * 
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> fruits = new ArrayList<String>();

		int escolha, escolhaFrutas;
		String novaFruta;
		
		do {
			System.out.println(" ");
			System.out.println("*******Mercadinho HiperGama*******");
			System.out.println("Didgite o número referente a operação desejada");
			System.out.println("1 - Cadastrar nova Fruta");
			System.out.println("2- Listar  Todas as Frutas Cadastradas");
			System.out.println("3- Substituir uma Fruta." );
			System.out.println("4- Sair do Programa");		
			System.out.println("5- Remover uma fruta");		
			System.out.println(" ");
			
			escolha = teclado.nextInt();

			
			switch (escolha) {
			case 1:
				System.out.println("***Cadastrar Nova Fruta***");
				System.out.print("Quantas frutas deseja cadastrar?: ");
				escolhaFrutas = teclado.nextInt();				
				
				for(int i = 0; i < escolhaFrutas; i++){
					System.out.print("Digite o nome da fruta a ser cadastrada:  ");
					novaFruta = teclado.next();
					fruits.add(novaFruta);
				}
				break;
			case 2:
				System.out.println("Listar  Todas as Frutas Cadastradas:");
				for(String f:fruits) {					
					System.out.println(f);
				}		
				break;
			case 3:
				System.out.println("***Substituir uma Fruta***");
				System.out.print("Informe o código da fruta que desja modificar: ");
				escolhaFrutas = teclado.nextInt();
				System.out.println("Você quer modificar " + fruits.get(escolhaFrutas));
				System.out.println("Informe o nome da nova fruta: ");
				novaFruta = teclado.next();
				fruits.set(escolhaFrutas, novaFruta);
				System.out.println("Fruta alterada com sucesso!");
				break;
			case 4:
				System.out.println("Programa Finalizado! Volte Sempre! Fuuui....");
				break;
			case 5: 
				System.out.println("***Remover uma Fruta***");
				System.out.print("Informe o código da fruta que desja modificar: ");
				escolhaFrutas = teclado.nextInt();
				System.out.print("Você quer excluir " + fruits.get(escolhaFrutas) + "? 1- Sim/2- Não: ");
				int del = teclado.nextInt();
				if(del == 1) {
					fruits.remove(escolhaFrutas);
					System.out.println("Fruta deletada com sucesso!");
				}else if(del == 2){
					System.out.println("Exclusão cancelada!");
				}else {
					System.out.println("Informe um valor válido!!!");
				}				
				break;
			default:
				System.out.println("Informe um valor válido!");
				
			}				
			
		}while(escolha != 4);
		
		teclado.close();
	}

}
