import scala.annotation.tailrec

object Main {
  case class Pair[T1,T2](var a: T1, var b: T2)

  @tailrec
  def series(n: Int, acc:Int): Int = {
    if (n == 0) {
      acc
    } else {
      series(n - 1, acc + n)
    }
  }

  @tailrec
  def fact(n: Int, acc: Int): Int = if (n <= 1) acc else fact(n - 1, acc * n)

  case class Switch( var isOn: Boolean)

  def toggle(switch: Switch): Switch = {
    if (switch.isOn) Switch(false) else Switch(true)
  }

  def twice(f: Int => Int): Int => Int = f.compose(f)

  def search[A](seq: Seq[A])(f: A => Boolean): Boolean = {
    def searchRec(i: Int): Boolean = {
      if(seq.length == i) false
      else if (f(seq(i))) true
      else searchRec(i + 1)
    }
    searchRec(0)
  }

  class Container[+T](n: T) {
    def put[E >: T](a: E): Container[E] = new Container[E](a)
    def get(): T = n
  }


}
