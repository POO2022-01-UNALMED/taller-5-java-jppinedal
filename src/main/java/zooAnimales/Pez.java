package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	static private ArrayList<Pez> listado = new ArrayList<>();
	public static int bacalaos;
	public static int salmones;
	private String colorEscamas;
	private int cantidadAletas;
	
	public String movimiento() {
		return "nadar";
		}
	
	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
		}
	public static ArrayList<Pez> getListado(){
		return listado;
		}
	
	public Pez() {
		listado.add(this);
		}

	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
		}
	
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
		}
	public String getColorEscamas() {
		return colorEscamas;
		}
	
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
		}
	public int getCantidadAletas() {
		return cantidadAletas;
		}
	
	public static int cantidadAves() { //i4
		return salmones + bacalaos;
		}
	
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez();
		salmon.setEdad(edad);
		salmon.setGenero(genero);
		salmon.setNombre(nombre);
		salmon.colorEscamas ="rojo"; 
		salmon.cantidadAletas = 6 ;
		salmon.setHabitat("oceano");
		salmones++;
		listado.add(salmon);
		return salmon;
		}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez();
		bacalao.setEdad(edad);
		bacalao.setGenero(genero);
		bacalao.setNombre(nombre);
		bacalao.colorEscamas ="gris"; 
		bacalao.cantidadAletas = 6 ;
		bacalao.setHabitat("oceano");
		bacalaos++;
		listado.add(bacalao);
		return bacalao;
		}
}