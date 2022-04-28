package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	public Zoologico() {
		
	}
	public Zoologico(String nombre,String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		}
	
	public ArrayList<Zona> getZona(){
		return zonas;
		}
	public void setZona(ArrayList<Zona> zona) {
		this.zonas = zona;
		}

	public String getNombre() {
		return nombre;
		}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona); }
	
	public int cantidadTotalAnimales() {
		int retAnimal = 0;
		for(int i = 0; i < zonas.size(); i++) {
			int canimal = zonas.get(i).cantidadAnimales();
			retAnimal = retAnimal+canimal;
			}
		return retAnimal;
		}

}