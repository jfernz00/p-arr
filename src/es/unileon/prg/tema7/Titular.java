package es.unileon.prg.tema7;

/**
 * Clase que representa un titular de una cuenta bancaria
 *
 * @author PRG
 * @version 3.0
 */
public class Titular{
    /**
     * Nif del titular
     */
    private String nif;
    /**
     * Nombre del titular
     */
    private String nombre;
    /**
     * Edad del titular
     */
    private int edad;
    /**
     * Cantidad que le permite el banco tener al descubierto
     */
    private int credito;

    /**
     * Constructor que recibe todos los datos necesarios de una persona
     * @param nif Nif del titular
     * @param nombre Nombre del titular
     * @param edad Edad del titular
     * @param credito Cantidad que le permite el banco tener al descubierto
     */
    public Titular (String nif, String nombre, int edad, int credito){
		// Inicio modificacion
		this.nif=nif;
		this.nombre=nombre;
		this.edad=edad;
		this.credito=credito;
		// Fin modificacion
    }
	public Titular (){
		// Inicio modificacion
		this.nif="0";
		this.nombre="0";
		this.edad=0;
		this.credito=0;
		// Fin modificacion
    }
    /**
     * Devuelve el nif del titular
     *
     * @return el nif del titular
     */
    public String obtenerNif (){
		// Inicio modificacion
		// Fin modificacion
    	return nif;
    }

    /**
     * Devuelve el nombre del titular
     *
     * @return el nombre del titular
     */
    public String obtenerNombre (){
		// Inicio modificacion
		// Fin modificacion
    	return nombre;
    }

    /**
     * Devuelve la edad del titular
     *
     * @return la edad del titular
     */
    public int obtenerEdad (){
		// Inicio modificacion
		// Fin modificacion
    	return edad;
    }

    /**
     * Devuelve la credito del titular
     *
     * @return la credito del titular
     */
    public int obtenerCredito (){
		// Inicio modificacion
		// Fin modificacion
    	return credito;
    }

    /**
     * Comprueba si el titular es mayor de edad
     * @return verdadero si el titular es mayor de edad y falso en
     * caso contrario
     */
    public boolean esMayorEdad(){
		// Inicio modificacion
		boolean mayoriaEdad=false;
		if(this.edad >= 18){
			mayoriaEdad=true;
		}
		// Fin modificacion
    	return mayoriaEdad;
    }

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
    @Override
	public String toString(){
		// Inicio modificacion
		// Fin modificacion
    	return null;
    }
}
