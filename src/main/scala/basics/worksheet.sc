1 + 1

val two = 1 + 1
var name = "stevie"
name = "marius"

def addOne(m: Int): Int = m + 1
val three = addOne(2)
def threeFn() = 1 + 2
threeFn

val addOneFn = (x: Int) => x + 1
addOneFn(1)

def timesTwo(i: Int): Int = {
  println("hello world")
  i * 2
}

{ i: Int =>
  println("hello world")
  i * 2
}

def adder(m: Int, n: Int) = m + n
val add2 = adder(2, _:Int)
add2(3)

def multiply(m: Int)(n: Int): Int = m * n

val multiplyFour = multiply(4) _
multiplyFour(6)

val curriedAdd = (adder _).curried
val addTwo = curriedAdd(2)
addTwo(4)

def capitalizeAll(args: String*) = {
  args.map { arg =>
    arg.capitalize
  }
}

capitalizeAll("one", "two", "three")

class Calculator {
  val brand: String = "HP"
  def add(m: Int, n: Int): Int = m + n
}

val calc = new Calculator
calc.brand
calc.add(2, 3)

class Calculator2(brand: String) {
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }

  def add(m: Int, n: Int): Int = m + n
}

val calc2 = new Calculator2("HP")
calc2.color

class ScientificCalculator(brand: String) extends Calculator(brand) {
  def log(m: Double, base: Double) = math.log(m) / math.log(base)
}

