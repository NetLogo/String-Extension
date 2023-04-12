enablePlugins(org.nlogo.build.NetLogoExtension)

name       := "string"
version    := "1.1.1"
isSnapshot := true

scalaVersion          := "2.12.12"
Compile / scalaSource := baseDirectory.value / "src" / "main"
Test / scalaSource    := baseDirectory.value / "src" / "test"
scalacOptions        ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfatal-warnings", "-Xlint", "-release", "11")

netLogoVersion      := "6.3.0"
netLogoClassManager := "org.nlogo.extensions.string.StringExtension"
netLogoExtName      := "string"
netLogoTestExtras   += (baseDirectory.value / "test")
