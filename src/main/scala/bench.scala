object bench {
  def benchmark(f: => Unit) = {
    val begin = System.currentTimeMillis()
    f
    val end = System.currentTimeMillis()
    val formatter = java.text.NumberFormat.getNumberInstance()
    println(s"time: ${formatter.format(end - begin)} ミリ秒")
  }


}
