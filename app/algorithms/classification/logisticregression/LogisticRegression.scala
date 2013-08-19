package algorithms.classification.logisticregression

/**
 * User: Sudharshan
 * Date: 8/19/13
 * Time: 3:14 PM
 */

class LogisticRegression(n: Int) {
  var weights = new Array[Double](n)
  var rate: Double = 0.001
  var ITERATIONS: Int = 3000

  def sigmoid(z: Double) = {
    1 / (1 + Math.exp(-z))
  }

  def train(instances: List[Instance]) = {
    for (i <- 0 until ITERATIONS) {
      var lik = 0.0;
      for (i <- 0 until instances.length) {
        val x: Array[Int] = instances(i).x;
        var predicted = classify(x);
        val label = instances(i).label;

        for (j <- 0 until weights.length) {
          weights(j) = weights(j) + rate * (label - predicted) * x(j);
        }
        // not necessary for learning
        lik += label * Math.log(classify(x)) + (1 - label) * Math.log(1 - classify(x));
      }
      println("iteration: " + n + " " + Arrays.toString(weights) + " mle: " + lik);
    }
  }


}

object LogisticRegression {
  def apply(n: Int) = {
    new LogisticRegression(n)
  }

}

