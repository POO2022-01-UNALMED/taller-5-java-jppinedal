package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	static private ArrayList<Mamifero> listado = new ArrayList<>();
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	
	
	public Mamifero() {
		listado.add(this);
		}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
		}
	
	public  void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
		}
	public static ArrayList<Mamifero> getListado(){
		return listado;
		}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;}
	public boolean isPelaje() { //i2
		return pelaje;
		}
	
	public void setPatas(int patas) {
		this.patas = patas;
		}
	public int getPatas() {
		return patas;
		}
	
	
	
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero();
		caballo.setNombre(nombre);
		caballo.setEdad(edad);
		caballo.setGenero(genero);
		Mamifero.caballos++;
		caballo.pelaje = true;
		caballo.patas = 4; //i3
		caballo.setHabitat("pradera");
		listado.add(caballo);
		return caballo;
		}
		
	public static  Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon=new Mamifero();
		leon.setNombre(nombre);
		leon.setEdad(edad);
		leon.setGenero(genero);
		Mamifero.leones++;
		leon.patas=4;
		leon.pelaje=true;
		leon.setHabitat("selva");
		listado.add(leon);
		return leon;
		}
	
	public static int cantidadMamiferos() {
		return Mamifero.caballos + Mamifero.leones;
		}
}