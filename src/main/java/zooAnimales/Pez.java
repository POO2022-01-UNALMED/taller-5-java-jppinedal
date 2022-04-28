package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas ) {
		super(nombre, edad, habitat,genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public String getColorEscamas() {  
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public static int cantidadPeces() {
		return salmones + bacalaos;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static ArrayList<Pez> getListado(){
		return listado;
	}
	
	public void setListado(ArrayList<Pez> listado) {
		this.listado=listado;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez();
		bacalao.colorEscamas = "gris";
		bacalao.cantidadAletas= 6;
		bacalao.setHabitat("oceano");
		bacalaos++;
		listado.add(bacalao);
		return bacalao;
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez();
		salmon.setNombre(nombre);
		salmon.setEdad(edad);
		salmon.setGenero(genero);
		salmon.colorEscamas = "Rojo";
		salmon.cantidadAletas = 6; 
		salmon.setHabitat("oceano");
		salmones++;
		listado.add(salmon);
		return salmon;
	}

}
