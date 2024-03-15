package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	private static ArrayList<Ave>listado=new ArrayList<>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre,int edad,String habitat,String genero,Zona zona, String colorPlumas) {
		super(nombre,edad,habitat,genero,zona);
		this.colorPlumas=colorPlumas;
		listado.add(this);
	}
	public Ave() {}
	
	public String movimiento() {
		return "volar";
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	public int crearHalcon(String nombre,int edad,String genero, Zona zona) {
		new Ave(nombre,edad,"montanas",genero,zona,"cafe glorioso");
		return halcones++;
	}
	public int crearAguila(String nombre,int edad,String genero, Zona zona) {
		new Ave(nombre,edad,"montanas",genero,zona,"blanco y amarillo");
		return aguilas++;
	}
	
	
}
