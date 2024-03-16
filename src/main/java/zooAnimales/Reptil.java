package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal{
	
	private static List<Reptil> lista = new ArrayList<Reptil>();
	private static Reptil[] listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(){
		totalAnimales++;
		lista.add(this);
		}
	public Reptil(String nombre1,int edad1, String habitat1,String genero1,String colorEscamas1,int largoCola1){
	  super.setNombre(nombre1);
	  super.setEdad(edad1);
	  super.setHabitat(habitat1);
	  super.setGenero(genero1);
	  this.colorEscamas=colorEscamas1;
	  this.largoCola=largoCola1;
	  lista.add(this);
	  totalAnimales++;
	  }
	
	public static int cantidadReptiles(){
		return lista.size();
		}
	
	public static Reptil crearIguana(String Nnombre,int Nedad, String Ngenero){
	    iguanas++;
	    return new Reptil(Nnombre,Nedad,"humedal",Ngenero, "verde",3);
	  }
	 public static Reptil crearSerpiente(String Nnombre,int Nedad, String Ngenero){
	    serpientes++;
	    return new Reptil(Nnombre,Nedad,"jungla",Ngenero, "blanco",1);
	  }
	 public String getColorEscamas(){
		 return colorEscamas;
		 }
	 public int getLargoCola(){
		 return largoCola;
		 }
}
