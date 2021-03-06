name := """di-urania"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "com.softwaremill.macwire" %% "macros" % "2.1.0",
  "org.springframework" % "spring-context" % "4.2.4.RELEASE",
  "org.springframework" % "spring-beans" % "4.2.4.RELEASE"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

