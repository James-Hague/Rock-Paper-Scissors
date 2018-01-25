import java.util.Scanner

import Player.theinput
import AI.Skynet

object GameMain extends  App {


  val playerInput = scala.io.StdIn.readLine("Enter your Choice  ")


  println(theinput("PLAYER" + playerInput))
  val playerRec = playerInput
  print("Player" + playerRec)
  val a = AI.Skynet
  println("AI" + a)
//hhhh

  def WhoWins(player1: String, player2: String) = {
    var result: String = ""
    (player1, player2) match {
      case ("Rock", "Paper") => result = "YOU LOSE"
      case ("Rock", "Scissors") => result = "YOU WIN"
      case ("Rock", "Rock") => result = "DRAW"
      case ("Paper", "Scissors") => result = "YOU LOSE"
      case ("Paper", "Rock") => result = "YOU WIN"
      case ("Paper", "Paper") => result = "DRAW"
      case ("Scissors", "Rock") => result = "YOU LOSE"
      case ("Scissors", "Paper") => result = "YOU WIN"
      case ("Scissors", "Scissors") => result = "DRAW"
    }
    print(result)
  }

  WhoWins(playerInput, a)
}

