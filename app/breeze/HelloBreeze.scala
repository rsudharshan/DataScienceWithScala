package breeze

/**
 * User: Sudharshan
 * Date: 7/16/13
 * Time: 2:07 PM
 */

import breeze.linalg._
import breeze.numerics._

class HelloBreeze {
  def fn(x: Int) = x + 1
}

object HelloBreeze extends App {

  val c = DenseMatrix.zeros[Double](2, 2)
  println("Zeroedmatrix \n" + c)

  val dv = DenseVector.zeros[Double](2)
  println("ZeroedVector \n" + dv)

  val onesVector = DenseVector.ones[Double](2)
  println("onesVector \n" + onesVector)

  val filledVector = DenseVector.fill(10) {
    5.0
  }
  println("filledVector \n" + filledVector)


  println("\n Identity Matrix \n " + DenseMatrix.eye[Double](3))
  println("\n Diagonal Matrix \n " + diag(DenseVector(1.0,2.0,3.0,4.0)))

  val a = DenseMatrix((1.0,2.0), (3.0,4.0),(5.0,6.0),(7.0,8.0))
  println("\n " + a +" \n")

  val rowVector=DenseVector(1,2,3,4)
  val colVector=DenseVector(1,2,3,4).t
  println("Row Vector = "+ rowVector +" \n ColumnVector = "+colVector)

  println("Vector manipulation and Matrix manipulation")

}
