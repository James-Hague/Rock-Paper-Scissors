import scala.collection.mutable.ArrayBuffer

object AI {
  def Skynet: String = {
      val aiRandom = new scala.util.Random().nextInt(3)
      aiRandom match {
        case 0 => "Rock".toLowerCase
        case 1 => "Scissors".toLowerCase
        case 2 => "Paper".toLowerCase
        case _ => "Error".toLowerCase
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
