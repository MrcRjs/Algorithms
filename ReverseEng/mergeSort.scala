object mergeSort {
 
  def mergeSort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[Int], ys: List[Int]): List[Int] =
          (xs, ys) match {
          case(Nil, ys) => ys
          case(xs, Nil) => xs
          case(x :: xs1, y :: ys1) =>
            if (x < y) x::merge(xs1, ys)
            else y :: merge(xs, ys1)
      }
      val (left, right) = xs splitAt(n)
      merge(mergeSort(left), mergeSort(right))
    }
  }
  def main(args: Array[String]): Unit = {
    var generator = new Random()
    var data = List[Int](7)
    for(i<-0 i to data.size()){
      data(i) = 10 + generator.nextInt(90);
    }
  }
}
