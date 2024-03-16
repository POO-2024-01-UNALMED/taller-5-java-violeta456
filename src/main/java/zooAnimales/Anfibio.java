package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
	
	private static List<Anfibio> lista = new ArrayList<Anfibio>();
	private static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(){
		totalAnimales++;
		lista.add(this);
		}
	public Anfibio(String nombre1,int edad1, String habitat1,String genero1, String colorPiel1,boolean venenoso1){
	  super.setNombre(nombre1);
	  super.setEdad(edad1);
	  super.setHabitat(habitat1);
	  super.setGenero(genero1);
	  this.colorPiel=colorPiel1;
	  this.venenoso=venenoso1;
	  lista.add(this);
	  totalAnimales++;
	  }
	
	public static int cantidadAnfibios(){
		return lista.size();
		}
	
	public static Anfibio crearRana(String Nnombre,int Nedad, String Ngenero){
	    ranas++;
	    return new Anfibio(Nnombre,Nedad,"selva",Ngenero, "rojo",true);
	  }
	  public static Anfibio crearSalamandra(String Nnombre,int Nedad, String Ngenero){
	    salamandras++;
	    return new Anfibio(Nnombre,Nedad,"selva",Ngenero, "negro y amarillo",false);
	  }
	  public String getColorPiel(){
		  return colorPiel;
		  }
	  public boolean isVenenoso(){
		  return venenoso;
		  }
	}
