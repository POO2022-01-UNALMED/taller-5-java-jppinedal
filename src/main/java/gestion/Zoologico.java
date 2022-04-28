package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {  
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void agregarZonas(Zona zonas) { 
		this.zonas.add(zonas);
	}
	public void setZona(ArrayList<Zona> zona) {
		this.zonas = zona;
		}
	
	public ArrayList<Zona> getZona(){
		return zonas;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	} 
	
	public int cantidadTotalAnimales() {
		int retAnimal = 0;
		for (int i = 0; i < zonas.size(); i++) {
			int animal = zonas.get(i).cantidadAnimales();
			retAnimal = retAnimal + animal;
		}
		return retAnimal;
	}
	
	

}
