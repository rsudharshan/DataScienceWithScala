/**
 * User: Sudharshan
 * Date: 7/16/13
 * Time: 3:17 PM
 */

 import breeze.linalg.DenseVector
 val x=DenseVector.zeros[Double](5)
 println(x)
 x(0)
 val x=DenseVector.fill[Double](10)(1.0)

 x(3 to 4) := .5

 x

 x.slice(0,x.length)

println(x)

val a=DenseVector.fill[Int](3)(1)
val b=DenseVector.fill[Int](3)(2)
val c=a+b
val s=a:*b
a.dot(b)
a.sum  + b.sum
a.max
a.argmax

x(0 to 1) := DenseVector(.1,.2)










