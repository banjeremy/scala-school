val numbers = Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

val l = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
val s = Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
val t1 = ("localhost", 80)
val t2 = "localhost" -> 80

t1 == t2

t1 match {
  case ("localhost", 80) => "..."
  case (host, port) => "??? %s:%s".format(host, port)
}