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

		System.out.println("\n1) adicionar cal�ado "
				+"\n2) remover cal�ado "
				+"\n3) atualizar cal�ados em estoque"
				+"\n4) apresentar cal�ados em estoque"
				+"\n5) quantidade de pares em estoque"
				+"\n6) Sair ");
		op = leia.nextInt();
		
		switch (op)
		{
		case 1:
			leia.nextLine();
			System.out.println("\n qual cal�ado deseja?: ");
			String calcado = leia.nextLine();
			estoque.add(calcado);
			quantEstoque++;
			System.out.println("\n o cal�ado "+calcado+" foi adicinado");
			break;
			
		case 2:
			leia.nextLine();
			System.out.println("\n qual cal�ado desejar remover?: ");
			String calcado2 = leia.nextLine();
			if (estoque.contains(calcado2))
			{
				estoque.remove(calcado2);
				System.out.println("\no produto: "+calcado2+" foi removido");
			}
			else
			{
				System.out.println("\n produto n�o identificado");
			}
			break;
		case 3:
		{
			leia.nextLine();
			System.out.println("\nqual cal�ado deseja atualizar? : ");
			String verificar = leia.nextLine();
			System.out.println("\ninforme o nome do novo cal�ado: "+verificar);
			String novo = leia.nextLine();
			if (estoque.contains(verificar))
			{
				estoque.remove(verificar);
				estoque.add(novo);
				System.out.println("o cal�ado: "+verificar+" foi substituido pelo: "+novo);
			}
			else
			{
				System.out.println("\n produto n�o identificado");
			}
		}
		break;
		case 4:
		{
			System.out.println("cal�ados em estoque :");
			System.out.println(estoque);
		}
		break;
		case 5:
		{
			System.out.println(quantEstoque + "cal�ados em estoque");
		}
		
		default:
			System.out.println("op��o inv�lida");
		
		}
	}
		while (op!=6);
	}

}

