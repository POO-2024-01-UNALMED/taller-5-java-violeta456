package gestion;

import java.util.ArrayList;
import java.util.List;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales = new ArrayList<Animal>();;
	private Animal[] animal;
	
	public Zona() {
	}
	
	public Zona (String nombre1, Zoologico zoo1) {
        this.nombre = nombre1;
        this.zoo = zoo1;
	}
	
	public void agregarAnimales(Animal NuevoAnimal) {
        animales.add(NuevoAnimal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public List<Animal> getAnimales() {
		return animales;
		}
	  public String getNombre(){
		  return nombre;
		  }
	  public Zoologico getZoo(){
		  return zoo;
		  } 
}
