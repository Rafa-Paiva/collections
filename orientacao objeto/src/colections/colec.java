package colections;

import java.util.ArrayList;
import java.util.Scanner;

public class colec {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int op, resposta, quantEstoque = 0;
		String nome = null;
		ArrayList<String> estoque = new ArrayList();
		
		do
		{

		System.out.println("\n1) adicionar calçado "
				+"\n2) remover calçado "
				+"\n3) atualizar calçados em estoque"
				+"\n4) apresentar calçados em estoque"
				+"\n5) quantidade de pares em estoque"
				+"\n6) Sair ");
		op = leia.nextInt();
		
		switch (op)
		{
		case 1:
			leia.nextLine();
			System.out.println("\n qual calçado deseja?: ");
			String calcado = leia.nextLine();
			estoque.add(calcado);
			quantEstoque++;
			System.out.println("\n o calçado "+calcado+" foi adicinado");
			break;
			
		case 2:
			leia.nextLine();
			System.out.println("\n qual calçado desejar remover?: ");
			String calcado2 = leia.nextLine();
			if (estoque.contains(calcado2))
			{
				estoque.remove(calcado2);
				System.out.println("\no produto: "+calcado2+" foi removido");
			}
			else
			{
				System.out.println("\n produto não identificado");
			}
			break;
		case 3:
		{
			leia.nextLine();
			System.out.println("\nqual calçado deseja atualizar? : ");
			String verificar = leia.nextLine();
			System.out.println("\ninforme o nome do novo calçado: "+verificar);
			String novo = leia.nextLine();
			if (estoque.contains(verificar))
			{
				estoque.remove(verificar);
				estoque.add(novo);
				System.out.println("o calçado: "+verificar+" foi substituido pelo: "+novo);
			}
			else
			{
				System.out.println("\n produto não identificado");
			}
		}
		break;
		case 4:
		{
			System.out.println("calçados em estoque :");
			System.out.println(estoque);
		}
		break;
		case 5:
		{
			System.out.println(quantEstoque + "calçados em estoque");
		}
		
		default:
			System.out.println("opção inválida");
		
		}
	}
		while (op!=6);
	}

}

