package arrays;


import java.util.Scanner;



public class Desplazamiento_3_Posiciones {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n_posiciones;
		int ultimo;

		int arreglo [] = new int [10];
		
		for(int i=0; i<10; i++) {
			
			System.out.print(i+ ".- Digita el número: ");
			arreglo[i] = entrada.nextInt();
		}
		
		System.out.print("Digita la cantidad de posiciones a desplazar: ");
		n_posiciones = entrada.nextInt();
		
		
		for(int ii=0; ii<n_posiciones; ii++) {
		
		ultimo = arreglo[9];
		
		for(int i = 9; i>0; i--) {
			
			arreglo[i] = arreglo[i-1];
		}
		
		arreglo [0] = ultimo;
		
		}
		
		for(int i=0; i<10; i++) {
			
			System.out.println(i+ "._ El número es: "+arreglo[i]);
		}
		
	}

}
