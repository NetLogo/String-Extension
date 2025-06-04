enablePlugins(org.nlogo.build.NetLogoExtension)

name       := "string"
version    := "1.2.0"
isSnapshot := true

scalaVersion          := "3.7.0"
Compile / scalaSource := baseDirectory.value / "src" / "main"
Test / scalaSource    := baseDirectory.value / "src" / "test"
scalacOptions        ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfatal-warnings", "-Wunused:linted", "-release", "17")


netLogoVersion      := "7.0.0-beta1"
netLogoClassManager := "org.nlogo.extensions.string.StringExtension"
netLogoExtName      := "string"
netLogoTestExtras   += (baseDirectory.value / "test")
