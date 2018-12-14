object IntepretedMain {
  def main(args: Array[String]): Unit = {
    val x1 = 42
    println(x1)
    println()

    lazy val x2 = println("Hello")
    x2
    x2
    println()

    def x3 = 42
    println(x3)
    println()

    var x4: Int = 42
    x4 = 43
    println(x4)
    println()

    if(x1 == 42)
      println("if")
    else
      println("else")
    println()

    var x5 = 5
    while(x5 > 0){
      println(x5)
      x5 = x5 - 1
    }
    println()

    def meth() = 42
    println(meth())
    println()

    def methP(i: Int) = i
    println(methP(55))

    println(Precompiled)
    println(Precompiled.staticMeth)
    println(Precompiled.staticVal)
    println(Precompiled.staticMeth1())
    println(Precompiled.staticMeth2(58))
    println(Precompiled.staticMeth3(new Object))
    println(Precompiled.staticMeth4(new Bar))
    println(Precompiled.staticMeth5(new Bar, 61))
    println(Precompiled.staticMeth4(new InterpretedBar))
    println(Precompiled.staticMeth5(new InterpretedBar, 61))
  }
}

class InterpretedBar extends IFace {
  def meth(): Int = 70
  def methA(x: Int): Int = x + 1
}
