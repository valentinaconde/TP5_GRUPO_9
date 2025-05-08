package Dominio;

public class Pelicula implements Comparable<Pelicula>{ 
    private int id;
    private String nombre;
    private Categoria categoria; 

    public int getId() {
        return id;
    }

    public Pelicula(int id, String nombre, Categoria categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
	}

	public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

	@Override
	public String toString() {
		return nombre + "  " + categoria.getNombre();
	}

	@Override
	public int compareTo(Pelicula obj) {
		// TODO Auto-generated method stub
		return this.nombre.compareToIgnoreCase(obj.nombre);
	}
    
}
