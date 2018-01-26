import scala.collection.mutable.ArrayBuffer

object GameMain extends  App {

  var dumbMoves = List()

  def compareStrings(string1:String,string2:String) = {
    (string1.toLowerCase, string2.toLowerCase) match {
      case ("rock", "paper") => "Player 2 Wins"
      case ("rock", "scissors") => "Player 1 Wins"
      case ("rock", "rock") => "DRAW"
      case ("paper", "scissors") => "Player 2 Wins"
      case ("paper", "rock") => "Player 1 Wins"
      case ("paper", "paper") => "DRAW"
      case ("scissors", "rock") => "Player 2 Wins"
      case ("scissors", "paper") => "Player 1 Wins"
      case ("scissors", "scissors") => "DRAW"
      case _ => "Unknown Entry"
    }
  }

  def playerVsComputer(computer: String):String = {
    val playerInput = scala.io.StdIn.readLine("Enter your Choice  ")
    println(s"Player Choice: $playerInput Computer Choice: $computer")
    compareStrings(playerInput.toLowerCase, computer.toLowerCase)
  }

  def ComputerVsComputer ={
    val p1 = AI.Skynet
    val p2 = AI.DumbAi
    println(s"Skynet Choice: $p1 Dumb AI Choice: $p2")
    compareStrings(p1.toLowerCase, p2.toLowerCase)
  }

  for (i <- 1 to 10) {
    println(ComputerVsComputer)
  }
}

