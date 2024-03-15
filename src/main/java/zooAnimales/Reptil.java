package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado=new ArrayList<>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre,int edad,String habitat,String genero,Zona zona,String colorEscamas,int largoCola) {
		super(nombre,edad,habitat,genero,zona);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		listado.add(this);
	}
	public Reptil() {}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	public int crearIguana(String nombre,int edad,String genero, Zona zona) {
		new Reptil(nombre,edad,"humedal",genero,zona,"verde",3);
		return iguanas++;
	}
	public int crearSerpiente(String nombre,int edad,String genero, Zona zona) {
		new Reptil(nombre,edad,"jungla",genero,zona,"veblanco",1);
		return serpientes++;
	}
	
	

}


