package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	static private ArrayList<Ave> listado = new ArrayList<>();
	static public int halcones;
	static public int aguilas;
	private String colorPlumas;
	
	
	public Ave() {
		listado.add(this);}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
		}
	
	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
		}
	public  static ArrayList<Ave>  getListado(){
		return listado;
		}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;}
	public String getColorPlumas() {
		return colorPlumas;
		}
	public static int cantidadAves() {
		return halcones+aguilas;}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave();
		halcon.setEdad(edad);
		halcon.setGenero(genero);
		halcon.setNombre(nombre);
		halcon.colorPlumas = "cafe glorioso";
		halcon.setHabitat("montanas");
		halcon.halcones++;
		listado.add(halcon);
		return halcon;
		}
	
	public static  Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila=new Ave();
		aguila.setEdad(edad);
		aguila.setGenero(genero);
		aguila.setNombre(nombre);
		aguila.colorPlumas="blanco y amarillo";
		aguila.setHabitat("montanas");
		aguilas++;
		listado.add(aguila);
		return aguila;
		}
}