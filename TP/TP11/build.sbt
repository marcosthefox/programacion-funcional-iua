name := """Practico11"""

version := "3.23.11"

scalaVersion := "3.3.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % "test"
libraryDependencies += "org.scalatestplus" %% "scalacheck-1-17" % "3.2.17.0" % "test"
run/fork := true
Test/logBuffered := false
autoAPIMappings := true
scalacOptions ++= Seq(
  "-source:future",
  "-feature",
  "-deprecation",
  "-explain",
  "-explain-types"
)
Compile/doc/scalacOptions ++= Seq(
  "-doc-root-content", 
  baseDirectory.value+"/root-doc.txt"
)
