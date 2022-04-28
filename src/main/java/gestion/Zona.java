	package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;


public class Zona {
	private String nombre;
	private Zoologico zoologico;
	private ArrayList<Animal> animales = new ArrayList<>();
	
	public Zona() {
		
	}
	
	public Zona(String nombre, Zoologico zoologico) {
		this.nombre = nombre;
		this.zoologico = zoologico;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoologico() {
		return zoologico;
	}
	public void setZoologico(Zoologico zoologico) {
		this.zoologico = zoologico;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	public int cantidadAnimales() {
		return animales.size();
	}

}
