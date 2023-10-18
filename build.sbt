ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "CodeRetreat"
  )
libraryDependencies += "org.specs2" %% "specs2-core"  % "4.20.2" % "test"
libraryDependencies += "org.specs2" %% "specs2-junit" % "4.20.2" % "test"
