package algorithms.classification.logisticregression

/**
 * User: Sudharshan
 * Date: 8/19/13
 * Time: 4:32 PM
 */
object LogRegTest extends App {

  val l = LogisticRegression(5)
  println(l.sigmoid(1.0))

  val listOfInstances=DataSet.readDataSet()
  l.train(listOfInstances)
}
