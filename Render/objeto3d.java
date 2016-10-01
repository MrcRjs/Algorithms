public class objeto3d 
{
  private int[] elementos;
  private String nombre;

        public objeto3d(String nombre, int[] elementos){
            this.nombre = nombre;
            this.elementos = elementos;
        }
        public String getNombre(){
            return nombre;
        }
        public int [] getObjetoRender(){
            return  elementos;
        }
}