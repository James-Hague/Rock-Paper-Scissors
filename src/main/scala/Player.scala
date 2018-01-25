import GameMain.playerInput

object Player  {
  def theinput (string: String):Unit = {
    val scissors = "Scissors"
    val rock = "Rock"
    val paper = "Paper"

    if (playerInput.equalsIgnoreCase("Scissors")) {println(scissors)}
    if ( playerInput.equalsIgnoreCase("rock")) {println(rock)}
    if (playerInput.equalsIgnoreCase("Paper")) {println(paper)}
  }

}



