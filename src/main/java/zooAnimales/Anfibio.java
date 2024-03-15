
package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado=new ArrayList<>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre,int edad,String habitat,String genero,Zona zona,String colorPiel, boolean venenoso) {
		super(nombre,edad,habitat,genero,zona);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
		
	}
	public Anfibio(){}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	public int crearRana(String nombre,int edad,String genero, Zona zona) {
		new Anfibio(nombre,edad,"selva",genero,zona,"rojo",true);
		return ranas++;
	}
	public int crearSalamandra(String nombre,int edad,String genero, Zona zona) {
		new Anfibio(nombre,edad,"selva",genero,zona,"negro y amarillo",false);
		return salamandras++;
	}

}


