package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	
	public Animal() {
		totalAnimales = totalAnimales+1;
	}
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public String movimiento() {
		return "desplazarse";
		}
	
	
	public String toString() {
		if (this.zona == null) {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
			}
				
		return "Mi nombre es " + nombre + ", tengo una edad de " + edad+", habito en " + habitat + " y mi genero es " + genero +
				", la zona en la que me ubico es " + zona + ", en el " + zona.getZoologico();
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + (Mamifero.getListado().size() + "\n"+
				"Aves: " + (Ave.getListado().size()) + "\n" +
				"Reptiles: " + (Reptil.getListado().size()) + "\n"+
				"Peces: " + (Pez.getListado().size()) + "\n" +
				"Anfibios: " + Anfibio.getListado().size());	
	}	
}