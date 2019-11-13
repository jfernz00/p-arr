package es.unileon.prg.tema7;

/**
 * Clase con los ejercicios correspondientes a arrays de tipos basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	@Override
	protected String obtenerPractica(){
		return "P-ARR";
	}

	@Override
	protected String obtenerBloque() {
		return "Arrays de tipos basicos";
	}

	/**
	 * Arrays de tipos basicos - Ejercicio1.
	 *
	 * Completar el metodo para crear y rellenar un vector de cien posiciones
	 * que contenga los primeros cien numeros pares. Una vez creada, se debera
	 * mostrar el contenido del vector por pantalla.
	 */
	public void ejercicio01() {
		cabecera("01", "Generar vector con los 100 primeros numeros pares");

		// Inicio modificacion
	int a=0;
	int i=0;
	int[] arrayEnteros=new int[100];
	int t=0;
	for(i=1 ; i <= 200 ; i++) {
		if(i%2==0){
		arrayEnteros[t]=i;
		t++;
		}
	}
	for(t=0 ; t <= 100 ; t++){
		System.out.print(" "+arrayEnteros[t]+" ");
	}
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio2.
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Explicar en el fichero LEEME.TXT el porque de los resultados
	 * <li> Modificar el codigo a fin de evitar la excepcion producida
	 * </ul>
	 */
	public void ejercicio02() {
		cabecera("02","Mostrar vector por pantalla");

		// Inicio modificacion
		int[] arrayEnteros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(" { ");
		for(int i=0 ; i < arrayEnteros.length ; i++) {
			System.out.print(" "+arrayEnteros[i]+",");
		}
		System.out.println(" } ");
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio3.
	 *
	 * Completar el metodo para crear una matriz que contenga la tabla de
	 * multiplicar del numero 8. Una vez creada, se debera mostrar el
	 * contenido del vector por pantalla.
	 */
	public void ejercicio03() {
		cabecera("03", "Tabla de multiplicar del ocho");

		// Inicio modificacion
		int[] arrayEnteros={8,8,8,8,8,8,8,8,8,8};
		for(int i=0 ; i < arrayEnteros.length ; i++) {
			arrayEnteros[i]=arrayEnteros[i]*(i+1);
			System.out.print(" "+arrayEnteros[i]+" ");
		}
		System.out.print("\n");
		
        // Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio4.
	 *
	 * Se pide completar el metodo para mostrar por pantalla el tablero
	 * indicado en el enunciado de la practica.
	 */
	public void ejercicio04() {
		cabecera("04", "BonoLotoADA");

		// Inicio modificacion
		int[] arrayEnteros=new int[50];
		int i=0;
		int apuesta=1;
		for(apuesta=1; apuesta<=3;apuesta++){
			System.out.println("Apuesta: "+ apuesta);
			for(i=0 ; i < arrayEnteros.length ; i++) {
				arrayEnteros[i]=i;
				System.out.print(" "+arrayEnteros[i]+" ");
			}
			System.out.print("\n\n");
		}
		// Fin modificacion

	}
}
