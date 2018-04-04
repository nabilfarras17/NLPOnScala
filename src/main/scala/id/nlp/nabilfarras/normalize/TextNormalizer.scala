package id.nlp.nabilfarras.normalize

/**
  * Created by nabilfarras on 04/04/18.
  */
object TextNormalizer {

  def removeRegex(text : String) : Option[String] = {
    if(!text.contains("\"(\\\\(|\\\\)|'|/\""))
      Some(text)
    else
      None
  }

  def normalizeText(tokenizeString : List[String]) = {
    tokenizeString.foreach{
      item =>
        if(removeRegex(item).nonEmpty){

        }
    }
  }

}
