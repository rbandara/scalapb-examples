name := "scalapb-examples"

version := "1.0"

scalaVersion := "2.11.8"

import com.trueaccord.scalapb.{ScalaPbPlugin => PB}

PB.protobufSettings
scalaSource in PB.protobufConfig := sourceManaged.value

libraryDependencies ++= Seq(
                        "org.apache.spark" % "spark-mllib_2.11" % "2.0.0",
                        "org.scala-lang" % "scala-xml" % "2.11.0-M4")


