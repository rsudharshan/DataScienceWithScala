package algorithms.classification.logisticregression

/**
 * User: Sudharshan
 * Date: 8/19/13
 * Time: 4:32 PM
 */
object LogRegTest extends App {

  val logistic = LogisticRegression(5)

  val listOfInstances=DataSet.readDataSet()
  logistic.train(listOfInstances)

  val x:Array[Int] = Array(2, 1, 1, 0, 1)
  println("prob(1|x) = " + logistic.classify(x))
  val x2:Array[Int] = Array(1, 0, 1, 0, 0)
  println("prob(1|x2) = " + logistic.classify(x2))

}
