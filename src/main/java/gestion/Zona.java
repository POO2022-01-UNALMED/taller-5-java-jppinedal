package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	private String nombre;
	private Zoologico zoo;
	
	public Zona() {
		this(null, null);
	}

	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return this.animales.size();
	}
	
	
	
}