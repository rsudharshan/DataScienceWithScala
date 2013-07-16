name := """hello-scala"""

version := "1.0"

scalaVersion := "2.10.1"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"

libraryDependencies += "org.spire-math" % "spire_2.10" % "0.5.0"

libraryDependencies += "org.scala-saddle" % "saddle-core_2.10" % "1.3.1"

libraryDependencies += "org.scalanlp" % "nak" % "1.1.3"

libraryDependencies += "org.scalanlp" % "chalk" % "1.2.0"


libraryDependencies  ++= Seq(
  // other dependencies here
  // pick and choose:
  "org.scalanlp" % "breeze-math_2.10" % "0.3",
  "org.scalanlp" % "breeze-learn_2.10" % "0.3",
  "org.scalanlp" % "breeze-process_2.10" % "0.3",
  "org.scalanlp" % "breeze-viz_2.10" % "0.3"
)





// Note: These settings are defaults for activator, and reorganize your source directories.
Seq(
  scalaSource in Compile <<= baseDirectory / "app",
  javaSource in Compile <<= baseDirectory / "app",
  sourceDirectory in Compile <<= baseDirectory / "app",
  scalaSource in Test <<= baseDirectory / "test",
  javaSource in Test <<= baseDirectory / "test",
  sourceDirectory in Test <<= baseDirectory / "test",
  resourceDirectory in Compile <<= baseDirectory / "conf"
)
