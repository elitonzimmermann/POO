import java.util.Scanner;
public class Corrida {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //entrada do scanner
		int NumeroVoltas,total=0,media,MelhorTempo=0,MelhorVolta=0; 
		
		System.out.print("Digite o número de voltas: "); //print pedindo o numero de voltas
		NumeroVoltas = entrada.nextInt(); // entrada do numero de voltas
		int[] tempos = new int[NumeroVoltas];
		
		for(int x=0;x<NumeroVoltas;x++){
			System.out.print("Digite o tempo da "+(x+1)+"ª volta (em segundos): ");//informe do tempo da volta realizada
			tempos[x] = entrada.nextInt();
			total+=tempos[x];
			if(tempos[x]<MelhorTempo||x==0){
				MelhorTempo = tempos[x];
				MelhorVolta = x+1;
			}
		}
		media = total/NumeroVoltas;//calculo de
		System.out.println("i.   O melhor tempo foi: "+MelhorTempo+" segundos."); //mostra o melhor tempo em segundos
		System.out.println("ii.  Melhor volta foi a "+MelhorVolta+"ª."); //mostra a melhor volta
		System.out.println("iii. A média de tempo foi: "+media);//mostra a media de tempo de todas as voltas feitas


	}
}
