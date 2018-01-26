import scala.collection.mutable.{ListBuffer}
import Array._



object GameMain extends App {
  var dumbArrayB = ListBuffer[String]()

  var dumbWin = 0
  var skynetWin = 0
  var draw = 0


    def compareStrings(string1: String, string2: String) = {
      (string1.toLowerCase, string2.toLowerCase) match {
        case ("rock", "paper") => "/////////////Player 2 Wins\\\\\\\\\\"
        case ("rock", "scissors") => "**********Player 1 Wins************"
        case ("rock", "rock") => "DRAW"
        case ("paper", "scissors") => "/////////////Player 2 Wins\\\\\\\\\\"
        case ("paper", "rock") => "**********Player 1 Wins************"
        case ("paper", "paper") => "DRAW"
        case ("scissors", "rock") => "/////////////Player 2 Wins\\\\\\\\\\"
        case ("scissors", "paper") => "**********Player 1 Wins************"
        case ("scissors", "scissors") => "DRAW"
        case _ => "Unknown Entry"
      }
    }

    def playerVsComputer(computer: String): String = {
      val playerInput = scala.io.StdIn.readLine("Enter your Choice  ")
      println(s"Player Choice: $playerInput Computer Choice: $computer")
      compareStrings(playerInput.toLowerCase, computer.toLowerCase)
    }

    def ComputerVsComputer = {
      val p1 = AI.Skynet
      val p2 = AI.DumbAi

      println(s"**********Skynet Choice***********: $p1 /////////Dumb AI Choice////////: $p2")
      dumbArrayB += p2

      val results = compareStrings(p1.toLowerCase, p2.toLowerCase)
      println(results)
      results match {
        case "**********Player 1 Wins************" => skynetWin += 1
        case "/////////////Player 2 Wins\\\\\\\\\\" => dumbWin += 1
        case "DRAW" => draw += 1
      }
      println("SKYNET SCORE  " + skynetWin,"  DUMB AI SCORE "  + dumbWin,  "  DRAW " + draw)/////////////

    }

  for (i <- 1 to 10000) {
      println(ComputerVsComputer)

     // println("ARRAYTEST" + dumbArrayB)
    }


}

