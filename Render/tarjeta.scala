object Tarjeta{
  class Tarjeta extends Thread (nombre: String, objeto: Objeto3d, timestamp: Long){
    def getNombre() = nombre
    def setNombre(nombre:String) = {
      this.nombre = nombre
    }
    def getTimestamp() = timestamp
    def setTimestamp(timestamp:Long) = {
      this.timestamp = timestamp
    }
    private def esperarNsegundos(segundos: Int) {
      try {
        Thread.sleep(segundos * 1000)
      } catch {
        case ex: InterruptedException => Thread.currentThread().interrupt()
      }
    }
    def run() = {
      println(s"""Tarjeta: $this.nombre
                  COMIENZA A PROCESAR AL OBJETO: ${obj.getObjetoRender()}
                  TIEMPO: ${(System.currentTimeMillis() - timeStamp) / 1000} seg""")
      
      for (i <- 0 until obj.getObjetoRender.length) {
        this.esperarNsegundos(obj.getObjetoRender()(i))
        println(s"""Objeto ${(i + 1)} PROCESADO 
                  Tiempo: ${(System.currentTimeMillis() - timeStamp) / 1000} segundos""")
      }
      println(s"""$this.nombre: HA COMPLETADO EL PROCESAMIENTO de $obj.getNombre EN TIEMPO: ${(System.currentTimeMillis() - timeStamp) / 1000} segundos""")
    }
    def main(args: Array[String]): Unit = {

      Objeto3d Objeto3d1 = new Objeto3d("Objeto3d 1", new int[] { 10, 20, 5, 5, 2, 3 })
      Objeto3d Objeto3d2 = new Objeto3d("Objeto3d 2", new int[] { 12, 3, 5, 17, 1 })

      // Tiempo inicial de referencia
      long timeStamp = System.currentTimeMillis()
      Tarjeta Tarjeta1 = new Tarjeta("Tarjeta 1", Objeto3d1, timeStamp)
      Tarjeta Tarjeta2 = new Tarjeta("Tarjeta 2", Objeto3d2, timeStamp)

      Tarjeta1.start()
      Tarjeta2.start()
    }
  }
}
