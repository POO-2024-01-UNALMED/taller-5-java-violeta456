package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
	
	private static List<Ave> lista = new ArrayList<Ave>();
	private static Ave[] listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(){
		totalAnimales++;
		lista.add(this);
		}
	public Ave(String nombre1,int edad1, String habitat1,String genero1, String colorPlumas1){
	  super.setNombre(nombre1);
	  super.setEdad(edad1);
	  super.setHabitat(habitat1);
	  super.setGenero(genero1);
	  this.colorPlumas = colorPlumas1;
	  lista.add(this);
	  totalAnimales++;
	  }
	
	public static int cantidadAves(){
		return lista.size();
		}
	public static Ave crearHalcon(String Nnombre,int Nedad, String Ngenero){
	    halcones++;
	    return new Ave(Nnombre,Nedad,"montanas",Ngenero, "cafe glorioso");
	  }
	 public static Ave crearAguila(String Nnombre,int Nedad, String Ngenero){
	    aguilas++;
	    return new Ave(Nnombre,Nedad,"montanas",Ngenero, "blanco y amarillo");
	  }
	 public String getColorPlumas(){
		 return colorPlumas;
		 }

}
