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
	
	

	public String getNombre() {
		return nombre;
		}
	public void setNombre(String nombre) {
		this.nombre=nombre;
		}
	
	
	public ArrayList<Zona> getZona(){
		return zonas;
		}
	public void setZona(ArrayList<Zona> zona) {
		this.zonas=zona;
		}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
		}
	
	
	public int cantidadTotalAnimales() {
		int totAnim = 0;
		for(int i = 0;i<zonas.size();i++) {
			int anim=zonas.get(i).cantidadAnimales();
			totAnim = anim + anim;}
		return totAnim;
		}

}