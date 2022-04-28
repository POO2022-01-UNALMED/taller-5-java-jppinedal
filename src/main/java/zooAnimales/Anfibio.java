
package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	static private ArrayList<Anfibio> listado = new ArrayList<>();
	static public int ranas;
	static public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
		}
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
		}
	
	
	public String getColorPiel() {
		return colorPiel;
		}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
		}
	
	public boolean getVenenoso() { // 1i
		return venenoso;
		}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
		}
	
	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
		}
	public static ArrayList<Anfibio> getListado(){
		return listado;
		}
	
	public String movimiento() {
		return "saltar";
		}
	
	public static int cantidadAnfibios() {
		return ranas + salamandras;
	}
	
	
	public static Anfibio crearRana(String nombre,int edad, String genero) {
		Anfibio rana = new Anfibio();
		rana.setEdad(edad);
		rana.setGenero(genero);
		rana.setNombre(nombre);
		rana.colorPiel ="rojo"; 
		rana.venenoso = true ;
		rana.setHabitat("selva");
		ranas++;
		listado.add(rana);
		return rana;
		}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio();
		salamandra.setEdad(edad);
		salamandra.setGenero(genero);
		salamandra.setNombre(nombre);
		salamandra.colorPiel ="negro y amarillo";
		salamandra.venenoso = false ;
		salamandra.setHabitat("selva");
		salamandras++;
		listado.add(salamandra);
		return salamandra;
		}

}
