package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas=new ArrayList<>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico () {}
	
	
	public int cantidadTotalAnimales() {
		int cantidad=0;
		for (int i=0; i<zonas.size(); i++) {
			int cant=zonas.get(i).cantidadAnimales();
			cantidad+=cant;
		}
		return cantidad;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public String toString() {
		return nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}


}