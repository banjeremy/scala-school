class Foo {}

object FooMaker {
  def apply() = new Foo
}

val newFoo = FooMaker()

class Bar {
  def apply() = 0
}

val bar = new Bar
bar()

object Timer {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }
}

Timer.currentCount()

class Bar2(foo: String)

object Bar2 {
  def apply(foo: String) = new Bar2(foo)
}

val bar2 = Bar2("asdf")

val times = 1

times match {
  case 1 => "one"
  case 2 => "two"
  case _ => "some other number"
}

times match {
  case i if i == 1 => "one"
  case i if i == 2 => "two"
  case _ => "some other number"
}

def bigger(o: Any): Any = {
  o match {
    case i: Int if (i < 0) => i - 1
    case i: Int => i + 1
    case d: Double if (d < 0.0) => d - 0.1
    case d: Double => d + 0.1
    case text: String => text + "s"
  }
}

bigger(0.0)
bigger("bar")
bigger(-5)

class Calculator(val brand: String, val model: String) {}

def calcType(calc: Calculator) = calc match {
  case _ if calc.brand == "HP" && calc.model == "20B" => "financial"
  case _ if calc.brand == "HP" && calc.model == "48G" => "scientific"
  case _ if calc.brand == "HP" && calc.model == "30B" => "business"
  case _ => "unknown"
}

val calc = new Calculator("HP", "48G")

calcType(calc)

case class Calculator2(val brand: String, val model: String)

def calcType2(calc: Calculator2) = calc match {
  case Calculator2("HP", "20B") => "financial"
  case Calculator2("HP", "48G") => "scientific"
  case Calculator2("HP", "30B") => "business"
  case Calculator2(_, _) => "unknown type"
}

val calc2 = Calculator2("HP", "30B")

calcType2(calc2)

try {
  val error = 5 / 0
} catch {
  case e: java.lang.ArithmeticException => {
    println("that's an error")
    0
  }
}