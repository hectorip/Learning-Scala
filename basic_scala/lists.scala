
val l = List(100.1, 200.2, 300.3, 400.4)

l foreach println  // basic internal iterator

val l_aug = 500 :: l

l_aug.foreach{p => println(p)}