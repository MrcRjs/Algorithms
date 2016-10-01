object ParallelSearch{

  class parallelSearch(x: Int, arreglo: Array[Int], hilos: Int ) {
    val qty = arreglo.length/hilos
    for(i <- 0 to hilos){
      val inicio = qty * i
      val fin = inicio + qty
      val arregloSliced = arreglo.slice(inicio, fin)
      new Thread(new seqSearch(arregloSliced, x, inicio)).start
    }
  }

  class seqSearch(arr: Array[Int], x: Int, dif : Int) extends Runnable {
    def run() = {
      for(j <-0 to arr.length-1){
        if(arr(j) == x){
          val indice = j + dif
          var thread = Thread.currentThread().getId()
          println(s"Thread: $thread: $x encontrado en [$indice]")
        }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(2,2,1,2,3,1,6,2,7,2,6,2)
    val Busqueda = new parallelSearch(2, nums, 3)
  }
}
