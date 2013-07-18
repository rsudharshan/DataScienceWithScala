package algorithms.classification

import scala.collection.mutable.HashMap
import scala.collection.mutable.HashSet

/**
 * User: Sudharshan
 * Date: 16/7/13
 * Time: 12:52 PM
 */
class MultinomialNaiveBayes {
  var trainingSet = HashMap[String, String]()
  var testSet = HashMap[String, String]()
  var priors = HashMap[String, Double]()
  var vocabulary=HashSet[String]()
  var uniqueFeatureCount =HashMap[String,Int]()


  def addTrainingDoc(l: List[(String, String)]) {
    trainingSet.++=(l)
  }

  def addTestDoc(l: List[(String, String)]) {
    testSet.++=(l)
  }

  def calculatePriors()
  {
      val count=trainingSet.size
      priors.++=(trainingSet.values.groupBy(identity).mapValues(_.size.toDouble / count))
  }

  def createVocabulary()
  {
      trainingSet.keys.foreach(data => data.split(" ").foreach(token => vocabulary.+=(token)))
  }

  def calculateFeatureCounts()
  {

  }

}

object MultinomialNaiveBayes extends MultinomialNaiveBayes{

  def main(x: Array[String]) {
    println("Multinomial naive bayes")
    val mb = new MultinomialNaiveBayes
    mb.addTrainingDoc(List(("Chinese Beijing Chinese", "c"), ("Chinese Chinese Shanghai", "c"), ("Chinese Macao", "c"), ("Tokyo Japan Chinese", "j")))

    //mb.trainingSet.foreach(k => { println(k._1 +" ------- "+k._2) })
    mb.addTestDoc(List(("Chinese Chinese Chinese Tokyo Japan", "")))
    //mb.testSet.foreach(k => { println(k._1 +" ------- "+k._2) })
    mb.calculatePriors()
    println(mb.priors)
  }
}
