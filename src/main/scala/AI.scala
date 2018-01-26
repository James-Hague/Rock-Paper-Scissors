import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import Array._

object AI  {

  def testList = GameMain.dumbArrayB



  def Skynet: String = {

    if (testList.isEmpty) {
      val aiRandom = new scala.util.Random().nextInt(3)
      aiRandom match {
        case 0 => "Rock".toLowerCase
        case 1 => "Scissors".toLowerCase
        case 2 => "Paper".toLowerCase
        case _ => "Error".toLowerCase
      }
    } else {
      val result = testList.groupBy(identity).maxBy(_._2.size)._1
      result match {
        case "rock" =>  "Paper"
        case "paper" => "Scissors"
        case "scissors" => "rock"
        case _ => "Error!"
      }
    }

  }

  def DumbAi:String = {
    val aiRandom = new scala.util.Random().nextInt(3)
    aiRandom match {
      case 0 => "Rock".toLowerCase
      case 1 => "Scissors".toLowerCase
      case 2 => "Paper".toLowerCase
      case _ => "Error".toLowerCase
    }

  }

}
