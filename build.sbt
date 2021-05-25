enablePlugins(org.nlogo.build.NetLogoExtension)

resolvers      += "netlogo" at "https://dl.cloudsmith.io/public/netlogo/netlogo/maven/"
netLogoVersion := "6.2.0-d27b502"

netLogoClassManager := "org.nlogo.extensions.string.StringExtension"

scalaVersion := "2.12.12"

name := "string"

netLogoExtName := "string"

netLogoZipSources := false

scalaSource in Compile := baseDirectory.value / "src" / "main"

scalaSource in Test := baseDirectory.value / "src" / "test"

netLogoTarget :=
  org.nlogo.build.NetLogoExtension.directoryTarget(baseDirectory.value)

lazy val demoFiles = demoNames.map(n => demoDir(_ / n))

lazy val demoDir = baseDirectory(_ / "demos")

lazy val demoNames = List("Flying.nlogo")

libraryDependencies ++= Seq(
  "com.typesafe"       % "config"        % "1.3.1"  % "test",
  "org.scalatest"      %% "scalatest"    % "3.0.0"  % "test",
  "org.picocontainer"  % "picocontainer" % "2.13.6" % "test",
  "org.ow2.asm"        % "asm-all"       % "5.0.3"  % "test")

val extDirectory = settingKey[File]("directory that extension is moved to for testing")
extDirectory := {
  baseDirectory.value / "extensions" / netLogoExtName.value
}

val moveToExtDir = taskKey[Unit]("add all resources to extension directory")
moveToExtDir := {
  (packageBin in Compile).value
  val testTarget = NetLogoExtension.directoryTarget(extDirectory.value)
  testTarget.create(NetLogoExtension.netLogoPackagedFiles.value)
  val testResources = ((baseDirectory.value / "test").allPaths).filter(_.isFile)
  for (file <- testResources.get)
    IO.copyFile(file, extDirectory.value / IO.relativize(baseDirectory.value / "test", file).get)
}

test in Test := {
  IO.createDirectory(extDirectory.value)
  moveToExtDir.value
  (test in Test).value
  IO.delete(extDirectory.value)
}
