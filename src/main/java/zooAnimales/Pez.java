package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal {
	private static ArrayList<Pez>listado=new ArrayList<>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre,int edad,String habitat,String genero,Zona zona,String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero,zona);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
	}
	public Pez() {}
	
	public String movimiento() {
		return "nadar";
	}
	public static int cantidadPeces() {
		return listado.size();
	}
	public int crearSalmon(String nombre,int edad,String genero, Zona zona) {
		new Pez(nombre,edad,"oceano",genero,zona,"rojo",6);
		return salmones++;
	}
	public int crearBacalao(String nombre,int edad,String genero, Zona zona) {
		new Pez(nombre,edad,"oceano",genero,zona,"gris",6);
		return bacalaos++;
	}
	

}