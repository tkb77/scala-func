object Fold {
  def reverse[T](list: List[T]): List[T] =  {
    list.foldLeft(Nil: List[T]) { (x, y) =>
      y :: x
    }
  }

  def filter[T](list: List[T])(f: T => Boolean): List[T] = {
    list.foldLeft(Nil: List[T]) { (x, y) =>
      if (f(y)) (y :: x).reverse else x.reverse
    }
  }

}

