import sbt._
import sbt.Keys._
import sbtassembly.Plugin._
import AssemblyKeys._

object ProjectBuild extends Build {

  lazy val root = Project(
    id = "root",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Automation-Pro",
      organization := "code.hawk",
      version := "1.0",
      scalaVersion := "2.10.2",

      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
      resolvers += "restlet" at "http://maven.restlet.org",
      libraryDependencies ++= Seq(
      libraryDependencies += "org.scala-lang" % "scala-library" % "2.10.2",
      "org.scalacheck" %% "scalacheck" % "1.11.4" % "test",
      "org.scalatest" % "scalatest_2.10" % "2.2.0" % "test",
      "com.typesafe.slick" % "slick_2.10" % "1.0.1",
      "com.github.tototoshi" %% "slick-joda-mapper" % "0.4.1",
      "com.h2database" % "h2" % "1.3.170",
      "org.ini4j" % "ini4j" % "0.5.1",
      "org.slf4j" % "slf4j-api" % "1.7.5"
				 )
					     )

		    	  )
}
