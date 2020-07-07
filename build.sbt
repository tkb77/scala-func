name := "scala-fp"

version := "0.1"

scalaVersion := "2.13.3"

scalastyleSources in Compile := (unmanagedSourceDirectories in Compile).value

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

libraryDependencies += "org.mockito" % "mockito-core" % "2.21.0" % "test"

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

scalacOptions ++= Seq("-encoding", "UTF-8")