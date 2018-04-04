package id.nlp.nabilfarras

import id.nlp.nabilfarras.stopword.Stopword

/**
  * Created by nabilfarras on 04/04/18.
  */
object Main {
  def main(args: Array[String]) : Unit = {
    val test = List("Balon", "saya", "ada", "lima")
    val result = Stopword.removeStopWord(test)
    println(s"RESULT ${result}")
  }
}
