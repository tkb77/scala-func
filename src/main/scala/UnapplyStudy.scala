object UnapplyStudy extends App {

  class User(private val name: String, private val age: Int)

  object User {
    def unapply(user: User): Option[(String, Int)] = Some(user.name, user.age)
  }

  def printPatternMatched(obj: AnyRef): Unit = {
    obj match {
      case User(name, age) => println(s"Name: ${name}, Age: ${age}")
      case _ => println("can't extract")
    }
  }

  printPatternMatched(new User("Taro", 17))
}