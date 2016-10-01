import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._
object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
/*  
Methods taking one argument can be used
with an infix syntax; is just another, slightly less
verbose way of writing the expression
df.format(now) 
*/
  }
}
