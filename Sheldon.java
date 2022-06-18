package arrays;
import java.util.Scanner;
import java.util.Random;


public class Sheldon {
	static Scanner console = new Scanner(System.in);
	static double[][]rodadas = {{0,0}};
	static int[] pontuacao= {0,0};
	static int rdd=0;
	
	static int resultado(double[][]rodadas)
	{
	int res=0;
	for(int i=0;i<1;i++)
	{
		if(rodadas[rdd][0]==1)
		{
	if((((rodadas[rdd][0]==1)&&(rodadas[rdd][1]==3))||((rodadas[rdd][0]==1)&&(rodadas[rdd][1]==4))))
	{
		res=0;
	}
	else if(rodadas[rdd][0]==rodadas[rdd][1])
	{
		res=2;
	}
	else
	{
		res=1;
	}
		}
	    else if(rodadas[rdd][0]==2)
		{
	if((((rodadas[rdd][0]==2)&&(rodadas[rdd][1]==3))||((rodadas[rdd][0]==2)&&(rodadas[rdd][1]==5))))
	{
		res=0;
	}
	else if(rodadas[rdd][0]== rodadas[rdd][1])
	{
		res=2;
	}
	else
	{
		res=1;
	}
		}
	    else if(rodadas[rdd][0]==3)
	    {
	if((((rodadas[rdd][0]==3)&&(rodadas[rdd][1]==1))||((rodadas[rdd][0]==3)&&(rodadas[rdd][1]==4))))
	{
		res=0;
	}
	else if(rodadas[rdd][0]==rodadas[rdd][1])
	{
		res=2;
	}
	else
	{
		res=1;
	}
	    }
	    else if(rodadas[rdd][0]==4)
	    {
	if((((rodadas[rdd][0]==4)&&(rodadas[rdd][1]==5))||((rodadas[rdd][0]==4)&&(rodadas[rdd][1]==2))))
	{
		res=0;
	}
	else if(rodadas[rdd][0]==rodadas[rdd][1])
	{
		res=2;
	}
	else
	{
		res=1;
	}
	    }
	    else if(rodadas[rdd][i]==5)
	    {
	if(((rodadas[rdd][0]==5)&&(rodadas[rdd][1]==1))||((rodadas[rdd][0]==5)&&(rodadas[rdd][1]==3)))
	{
		res=0;
	}
	else if(rodadas[rdd][0]==rodadas[rdd][1])
	{
		res=2;
	}
	else
	{
		res=1;
	}	
	    }
	}
	int resf=res;
	return resf;
	}
	static void rodada(int escolha){
		int i=0;
			while(i<rodadas[rdd].length)
			{
					rodadas[rdd][0]=escolha;
				 rodadas[rdd][1]=new Random().nextInt(1, 5);	
				if(resultado(rodadas)==0)
				{
					System.out.println("Voce perdeu essa rodada");
					System.out.println("o computador escolheu o numero"+rodadas[rdd][1]);
					System.out.println("Voce escolheu o numero"+rodadas[rdd][0]);
					pontuacao[1]++;
				}
				else if(resultado(rodadas)==1)
				{
					System.out.println("Voce ganhou essa rodada");
					System.out.println("o computador escolheu o numero"+rodadas[rdd][1]);
					System.out.println("Voce escolheu o numero"+rodadas[rdd][0]);
					pontuacao[0]++;
				}
				else if(resultado(rodadas)==2)
				{
					System.out.println("Voces empataram");
					System.out.println("o computador escolheu o numero"+rodadas[rdd][1]);
					System.out.println("Voce escolheu o numero"+rodadas[rdd][0]);
					pontuacao[0]++;
					pontuacao[1]++;
				}
                i++;
                i++;
			}
			menu();
		
	}
	static void Placar()
	{
		if(pontuacao[0]>pontuacao[1])
		{
			System.out.println("Parabens voce ganhou");
		System.out.println("O placar ficou jogador:"+pontuacao[0]+" e computador:"+pontuacao[1]+"");
		}
		else if(pontuacao[0]==pontuacao[1])
		{
			System.out.println("Voces empataram");
			System.out.println("O placar ficou jogador:"+pontuacao[0]+" e computador:"+pontuacao[1]+"");
		}
		else
		{
			System.out.println("Que pena voce perdeu");
			System.out.println("O placar ficou jogador:"+pontuacao[0]+" e computador:"+pontuacao[1]+"");
		}
	}
	
	static void menu()
	{

			    System.out.println("\n\n");
			    System.out.println("\t\tMENU");
			    System.out.println();
			    
			    System.out.println("[1] Pedra");
			    System.out.println("[2] Papel");
			    System.out.println("[3] Tesoura");
			    System.out.println("[4] Spock");
			    System.out.println("[5] Lagarto");
			    System.out.println("[6] Placar");
			    System.out.println("[0] SAIR");

			    System.out.print("\nDigite uma opcao:  ");
			    byte opcao = console.nextByte();


			    switch(opcao) {

			      case 0:
			        System.exit(0);
			        break;
			      
			      case 1:
			       rodada(opcao);
			        break;
			      
			      case 2:
			    	  rodada(opcao);
			        break;

			      case 3:
			    	  rodada(opcao);
			        break;

			      case 4:
			    	  rodada(opcao);
			        break;
			        
			      case 5:
			    	  rodada(opcao);
			    	  break;
			    	  
			      case 6:
			    	  Placar();
			    	  break;

			      default:
			    	 System.err.println("Opcao invalida");
			        menu();
			        break;

	  }
	}
	public static void main(String[] args) {
		menu();

	}

}
