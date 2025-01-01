ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.6.2"

lazy val root = (project in file("."))
  .settings(
    name := "scala-desktop",
    Compile / mainClass := Some("in.oss.desktop.MyApp")
  )

assemblyMergeStrategy := {
  case PathList("META-INF", "MANIFEST.MF")                               => MergeStrategy.discard
  case PathList("META-INF", _*)                                          => MergeStrategy.discard
  case "module-info.class"                                               => MergeStrategy.discard
  case "META-INF/substrate/config/reflectionconfig.json"                 => MergeStrategy.concat
  case "META-INF/substrate/config/resourcebundles"                       => MergeStrategy.concat
  case "META-INF/substrate/config/jniconfig-aarch64-android.json"        => MergeStrategy.concat
  case "META-INF/substrate/config/jniconfig-aarch64-darwin.json"         => MergeStrategy.concat
  case "META-INF/substrate/config/jniconfig-arm64-ios.json"              => MergeStrategy.concat
  case "META-INF/substrate/config/reflectionconfig-aarch64-android.json" => MergeStrategy.concat
  case "META-INF/substrate/config/reflectionconfig-arm64-ios.json"       => MergeStrategy.concat
  case "META-INF/substrate/config/reflectionconfig-x86_64-ios.json"      => MergeStrategy.concat
  case "META-INF/substrate/config/jniconfig-x86_64-linux.json"           => MergeStrategy.concat
  case "META-INF/substrate/config/jniconfig-x86_64-darwin.json"          => MergeStrategy.concat
  case "META-INF/substrate/config/reflectionconfig-x86_64-linux.json"    => MergeStrategy.concat
  case "META-INF/substrate/config/reflectionconfig-x86_64-darwin.json"   => MergeStrategy.concat
  case _                                                                 => MergeStrategy.first
}

libraryDependencies += "org.scalafx" %% "scalafx" % "23.0.1-R34"
