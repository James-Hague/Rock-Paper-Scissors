import scala.collection.mutable.ListBuffer

val temp = ListBuffer[String]()

temp += "rock"
temp += "rock"
temp += "Scissors"
temp += "Scissors"
temp += "Scissors"


temp.count(_.equals("rock"))
