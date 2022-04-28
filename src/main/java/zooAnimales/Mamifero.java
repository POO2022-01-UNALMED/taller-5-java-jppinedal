package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<>();
	public static  int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
		}
	
	public static ArrayList<Mamifero> getListado(){
		return listado;
	}
	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}

	public boolean getPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public static int cantidadMamiferos() {
		return Mamifero.caballos + Mamifero.leones;
	}
	
	
		
	public static  Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero();
		leon.setNombre(nombre); 
		leon.setEdad(edad); 
		leon.setGenero(genero);
		Mamifero.leones++;
		leon.pelaje = true;
		leon.patas = 4;
		leon.setHabitat("selva");
		listado.add(leon);
		return leon;
		}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero();
		caballo.setNombre(nombre); 
		caballo.setEdad(edad);
		caballo.setGenero(genero);
		Mamifero.caballos++;
		caballo.pelaje=true;
		caballo.patas=4;
		caballo.setHabitat("pradera");
		listado.add(caballo);
		return caballo;
		}

}
