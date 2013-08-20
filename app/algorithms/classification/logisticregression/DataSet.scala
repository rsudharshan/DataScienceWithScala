package algorithms.classification.logisticregression

import scala.io.Source
import scala.collection.immutable.IndexedSeq

/**
 * User: Sudharshan
 * Date: 8/19/13
 * Time: 3:39 PM
 */
class DataSet {

}

object DataSet {
  def readDataSet(): List[Instance] = {

    val lines = Source.fromFile("app/algorithms/classification/datasets/regression_dataset.txt").getLines.toList

    val listOfInstances = lines.map(line => {
      val Fvector = line.split("\\s+").map(_.toInt)
      val datavector = Fvector.slice(1, Fvector.size - 1)
      val label = Fvector(Fvector.size - 1)
      new Instance(label, datavector)
    })

    listOfInstances
  }
}
