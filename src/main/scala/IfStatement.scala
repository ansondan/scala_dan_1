object IfStatement {
  def main(args: Array[String]): Unit = {

      if (args.length == 0)
        println("Hello, you")
      else
        println("Hello, " + args(0))
  }
}
