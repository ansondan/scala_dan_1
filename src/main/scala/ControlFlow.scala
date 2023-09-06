object ControlFlow {
  def main(args: Array[String]): Unit = {
    val x = 5
    if (x < 0)
      println("negative")
    else if (x == 0)
      println("zero")
    else
      println("positive")
  }
}
