import GameMain.playerInput

object AI {



  def Skynet:String = {


    val aiRandom = new scala.util.Random
    val randomnum = aiRandom.nextInt(3)


    var aiChoice = ""

    if (randomnum == 0 ) {aiChoice = "Rock"}
    if (randomnum == 1 ) {aiChoice = "Scissors"}
    if (randomnum == 2 ) {aiChoice = "Paper"}

    return aiChoice

  }



}
