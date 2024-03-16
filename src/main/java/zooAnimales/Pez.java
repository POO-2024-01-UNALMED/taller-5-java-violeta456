package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
	
	private static List<Pez> lista = new ArrayList<Pez>();
	private static Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(){
	totalAnimales++;
	lista.add(this);
	}
	public Pez(String nombre1,int edad1, String habitat1,String genero1,String colorEscamas1,int cantidadAletas1){
	  super.setNombre(nombre1);
	  super.setEdad(edad1);
	  super.setHabitat(habitat1);
	  super.setGenero(genero1);
	  this.colorEscamas=colorEscamas1;
	  this.cantidadAletas=cantidadAletas1;
	  lista.add(this);
	  totalAnimales++;
	  }
	
	public static int cantidadPeces(){
		return lista.size();
		}
	public static Pez crearSalmon(String Nnombre,int Nedad, String Ngenero){
	    salmones++;
	    return new Pez(Nnombre,Nedad,"oceano",Ngenero, "rojo",6);
	  }
	public static Pez crearBacalao(String Nnombre,int Nedad, String Ngenero){
	    bacalaos++;
	    return new Pez(Nnombre,Nedad,"oceano",Ngenero, "gris",6);
	  }
	public String getColorEscamas(){
		return colorEscamas;
		}
	public int getCantidadAletas(){
		return cantidadAletas;
		}

}
