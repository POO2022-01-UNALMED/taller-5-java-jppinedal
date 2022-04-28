package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	static private ArrayList<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	public Reptil() {
		listado.add(this);
		}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
		}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
		}
	public String getColorEscamas() {
		return colorEscamas;
		}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;}
	public int getLargoCola() {
		return largoCola;
		}
	
	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
		}
	public static ArrayList<Reptil> getListado(){
		return listado;
		}
	
	public static int cantidadReptiles(){
		return serpientes + iguanas;
		}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil();
		iguana.setEdad(edad);
		iguana.setGenero(genero);
		iguana.setNombre(nombre);
		iguana.colorEscamas ="blanco";
		iguana.largoCola = 1 ;
		iguana.setHabitat("jungla");
		iguanas++;
		listado.add(iguana);
		return iguana;
		}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil();
		serpiente.setEdad(edad);
		serpiente.setGenero(genero);
		serpiente.setNombre(nombre);
		serpiente.colorEscamas ="verde";
		serpiente.largoCola = 3 ;
		serpiente.setHabitat("humedal");
		serpientes++;
		listado.add(serpiente);
		return serpiente;
		}
}