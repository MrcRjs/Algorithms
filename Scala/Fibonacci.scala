object Fibonacci {
  class Fibonacci(n: Int) extends Runnable {
    var result = 1
    def run() = {
      if( n == 0 || n == 1 ){
        result = 1;
      }
      else {
        var f1 = new Fibonacci( n-1 )
        var f2 = new Fibonacci( n-2 )
        var t1 = new Thread(f1)
        var t2 = new Thread(f2)
        t1.start()
        t2.start()
        try{
        t1.join()
        t2.join()
        }catch{case e: Exception => println(s"Error: $e")}
        result = f1.getResult() + f2.getResult()
      }
    }
    def getResult() = result
  }
  def main(args: Array[String]): Unit = {
    var f1 = new Fibonacci(Integer.parseInt(args(0)))
    var t1 = new Thread(f1)
    t1.start()
    try{
      t1.join()
    }catch{case e: Exception => println(s"Error: $e") }
    var res = f1.getResult()
    println(s"Answer is $res")
  }
}
