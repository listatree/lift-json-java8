scalaVersion := "2.11.2"

resolvers ++= Seq(
  "Java.net Maven2 Repository"      at "http://download.java.net/maven/2/",
  "Sonatype scala-tools repo"       at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Sonatype staging"                at "https://oss.sonatype.org/content/repositories/staging",
  "Sonatype releases"               at "https://oss.sonatype.org/content/repositories/releases",
  "Sonatype snapshots"              at "https://oss.sonatype.org/content/repositories/snapshots",
  "SnowPlow Repo"                   at "http://maven.snplow.com/releases/",
  "Typesafe repository releases"    at "http://repo.typesafe.com/typesafe/releases/",
  "Twitter Maven Repo"              at "http://maven.twttr.com/"
)

scalacOptions ++= Seq("-optimize", "-g:vars", "-deprecation", "-unchecked", "-feature", "-encoding", "utf8")

libraryDependencies ++= Seq(
  "net.liftweb"             %% "lift-json"                % "2.6-RC1"                 % "compile"
)

packageArchetype.java_application
