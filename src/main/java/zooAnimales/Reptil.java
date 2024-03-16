package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado=new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		Reptil.listado.add(this);
	}
	public Reptil() {}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static int cantidadReptiles() {
		return Reptil.listado.size();
	}
	public static Reptil crearIguana(String nombre,int edad,String genero) {
		iguanas++;
		return new Reptil(nombre,edad,"humedal",genero,"verde",3);
		
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero) {
		serpientes++;
		return new Reptil(nombre,edad,"jungla",genero,"veblanco",1);
		
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola=largoCola;
	}
	public static ArrayList<Reptil> getListado(){
		return listado;
	}
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado=listado;
	}
	
	

}


