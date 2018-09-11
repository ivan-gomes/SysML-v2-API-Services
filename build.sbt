name := """SysML-v2-API-Services"""
organization := "org.omg"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

libraryDependencies += guice
libraryDependencies += "com.google.code.gson" % "gson" % "2.8.5"
libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "3.3.0"
libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-extras" % "3.3.0"
