package _01_excepciones;

//Este ejemplo es una excepcion en tiempo de ejecucion
public class Main0 {
	public static void main(String[] args) {
		int nums[] = new int[4];
		try {
			System.out.println("Antes de que se genere la excepci�n.");
			// generar una excepcion de indice fuera de l�mites
			nums[7] = 10;
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Capturando la excepci�n
			System.out.println("�ndice fuera de los l�mites!");
		}
		System.out.println("Despu�s de que se genere la excepci�n.");
	}

}
