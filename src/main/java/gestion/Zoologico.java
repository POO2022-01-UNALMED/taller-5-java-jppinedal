package gestion;
import java.util.ArrayList;


public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	
	public int cantidadTotalAnimales() {
		int cantidad = 0;
		for(int cant = 0; cant < this.zonas.size(); cant++) {
			cantidad += this.zonas.get(cant).cantidadAnimales();
		}
		
		return cantidad;
	}

	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);			
	}
   
	
	public Zoologico() {
		this(null, null);
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
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
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	
}