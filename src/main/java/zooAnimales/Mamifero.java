package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado =new ArrayList<>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre,int edad,String habitat,String genero,Zona zona,boolean pelaje,int patas) {
		super(nombre,edad,habitat,genero,zona);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
	}
	public Mamifero() {}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public int crearCaballo(String nombre,int edad,String genero, Zona zona) {
		new Mamifero(nombre,edad,"pradera",genero,zona,true,4);
		return caballos++;
	}
	public int crearLeon(String nombre,int edad,String genero, Zona zona) {
		new Mamifero(nombre,edad,"selva",genero,zona,true,4);
		return leones++;
	}

}



