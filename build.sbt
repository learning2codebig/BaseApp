name := "User Login"

organization := "Knoldus"

version := "0.1"

scalaVersion := "2.10.0"

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Scala-tools" at "https://oss.sonatype.org/content/groups/scala-tools"

resolvers += "Sonatype Snapshot" at "http://oss.sonatype.org/content/repositories/snapshots"



{
    val liftVersion = "2.5-RC2"
    val dispatchVersion = "0.8.9"
    libraryDependencies ++= Seq(
    		"com.typesafe.akka" % "akka-actor_2.10" % "2.1.2",
			"com.typesafe.akka" % "akka-remote_2.10" % "2.1.2",
			"com.typesafe.akka" % "akka-testkit_2.10" % "2.1.2",
			"com.typesafe.akka" % "akka-kernel_2.10" % "2.1.2",
            "net.liftweb" % "lift-mongodb-record_2.10" % liftVersion,
            "net.liftweb" % "lift-mapper_2.10" % liftVersion,
            "net.liftmodules" % "widgets_2.10" % (liftVersion+"-1.2") % "compile->default",
            "net.liftmodules" % "mongoauth_2.10" % (liftVersion+"-0.4"),
            "org.mongodb" % "casbah_2.10" % "2.5.1",
            "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
            "junit" % "junit" % "4.7" % "test",
            "org.mortbay.jetty" % "jetty" % "6.1.22" % "test",
            "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container" artifacts (Artifact("javax.servlet", "jar", "jar")),
            "org.eclipse.jetty" % "jetty-webapp" % "8.1.10.v20130312" % "container",
            "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
            "net.databinder" % "dispatch-http_2.10" % dispatchVersion,
            "net.databinder" % "dispatch-http-json_2.10" % dispatchVersion,
            "org.scribe" % "scribe" % "1.1.2",
            "org.apache.solr" % "solr-solrj" % "3.3.0",
            "org.apache.solr" % "solr-core" % "3.3.0",
            "org.openid4java" % "openid4java" % "0.9.5",
            "junit" % "junit" % "4.7" % "test",
            "net.liftmodules" % "lift-jquery-module_2.10" % (liftVersion + "-2.2"),
            "net.liftmodules" % "textile_2.5_2.10" % "1.3" % "compile->default",
            "org.specs2" % "specs2_2.10" % "1.14" % "test",
            "com.github.romix.akka" % "akka-kryo-serialization_2.10" % "0.3.0",
        	"com.esotericsoftware.kryo" % "kryo" % "2.20"     )
}

scalacOptions += "-deprecation"

seq(webSettings :_*)

port in container.Configuration := 8080
