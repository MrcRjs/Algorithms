/*
Classes in Scala are declared using a syntax which is close to Java’s
syntax. One important difference is that classes in Scala can have parameters. This
is illustrated in the following definition of complex numbers.
*/
class Complex(real: Double, imaginary: Double) {
  def re() = real
  def im() = imaginary
  // Defined as methods without arguments
  /*
  def re = real
  def im = imaginary
  */
}
object ComplexNumbers {
  def main(args: Array[String]) {
    val c = new Complex(1.2, 3.4)
    println("imaginary part: " + c.im())
  }
}

/*
This complex class takes two arguments, which are the real and imaginary part
of the complex. These arguments must be passed when creating an instance of
class Complex, as follows: new Complex(1.5, 2.3). The class contains two methods,
called re and im, which give access to these two parts.
*/
