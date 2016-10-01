object Timer {
  def oncePerSecond(callback: () => Unit) {
    while (true) { 
      callback()
      Thread sleep 1000 
    }
  }
  def timeFlies() {
    println("El tiempo vuela...")
  }
  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}
/*
It is therefore possible to pass functions as arguments, to store them in variables,
and to return them from other functions. This ability to manipulate functions as
values is one of the cornerstone of a very interesting programming paradigm called
functional programming.
*/

/*
 **** Anonymous Functions *****
The presence of an anonymous function in this example is revealed by the right arrow
‘=>’ which separates the function’s argument list from its body. In this example,
the argument list is empty, as witnessed by the empty pair of parenthesis on the left
of the arrow. The body of the function is the same as the one of timeFlies above.
*/
/*
object TimerAnonymous {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def main(args: Array[String]) {
    oncePerSecond(() =>
      println("time flies like an arrow...")
    )
  }
}
*/
