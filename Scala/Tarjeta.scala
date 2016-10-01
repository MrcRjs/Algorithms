import PracticaTarjetas._
object Tarjeta{
  class Tarjeta(nombre: String, objeto: Objeto3d, timestamp: Long) extends Runnable{
    def getNombre() = nombre
    def getTimestamp() = timestamp
    private def esperarNsegundos(segundos: Int) {
      try {
        Thread.sleep(segundos * 1000)
      } catch {
        case ex: InterruptedException => Thread.currentThread().interrupt()
      }
    }
    def run() = {
      println(s"""Tarjeta: $this.nombre
                  COMIENZA A PROCESAR AL OBJETO: ${objeto.getObjetoRender()}
                  TIEMPO: ${(System.currentTimeMillis() - timestamp) / 1000} seg""")
      
      for (i <- 0 until objeto.getObjetoRender.length) {
        this.esperarNsegundos(objeto.getObjetoRender()(i))
        println(s"""Objeto ${(i + 1)} PROCESADO 
                  Tiempo: ${(System.currentTimeMillis() - timestamp) / 1000} segundos""")
      }
      println(s"""$this.nombre: HA COMPLETADO EL PROCESAMIENTO de $objeto.getNombre EN TIEMPO: ${(System.currentTimeMillis() - timestamp) / 1000} segundos""")
    }
    def main(args: Array[String]): Unit = {

      var Objeto3d1 = new Objeto3d("Objeto3d 1", Array( 10, 20, 5, 5, 2, 3 ))
      var Objeto3d2 = new Objeto3d("Objeto3d 2", Array( 12, 3, 5, 17, 1 ))

      // Tiempo inicial de referencia
      var time = System.currentTimeMillis()
      var Tarjeta1 = new Thread(new Tarjeta("Tarjeta 1", Objeto3d1, time))
      var Tarjeta2 = new Thread(new Tarjeta("Tarjeta 2", Objeto3d2, time))

      Tarjeta1.start()
      Tarjeta2.start()
    }
  }
}
