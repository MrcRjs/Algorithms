public class Objeto3d 
{

	private int[] elementos;
	private int id;
	private String nombre;

    public Objeto3d(String nombre,int id, int []a) {
        this.nombre=nombre;
        this.id=id;
        elementos=a;
    }
    
    public int[] getObjetoRender() {
        return elementos;
    }
    
    public int getID() {
    	return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setElemento(int valor, int i) {
        elementos[i]=valor;
    }
    
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

}