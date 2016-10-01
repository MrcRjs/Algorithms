object thread {
  def main(args: Array[String]): Unit = {
   // scala thread example
    for (i <- 1 to 10) {
      new Thread(new MyThread).start
      println("Iteración: " + i);
      }
    }
  }
class MyThread extends Runnable {
  def run {
    val threadId = Thread.currentThread().getId();
    println("Running Thread: " + (threadId-7))
  }
}
