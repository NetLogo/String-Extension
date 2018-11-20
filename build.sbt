enablePlugins(org.nlogo.build.NetLogoExtension, org.nlogo.build.ExtensionDocumentationPlugin)

netLogoVersion := "6.0.3"

netLogoClassManager := "org.nlogo.extensions.string.StringExtension"

scalaVersion := "2.12.0"

netLogoExtName := "string"

netLogoZipSources := false

netLogoTarget := org.nlogo.build.NetLogoExtension.directoryTarget(baseDirectory.value / "string")

//netLogoTarget :=
//  org.nlogo.build.NetLogoExtension.directoryTarget(baseDirectory.value)

lazy val demoFiles = demoNames.map(n => demoDir(_ / n))

lazy val demoDir = baseDirectory(_ / "demos")

lazy val demoNames = List("Flying.nlogo")

javaSource in Compile := baseDirectory.value / "src"

javacOptions ++= Seq("-g", "-deprecation", "-Xlint:all", "-Xlint:-serial", "-Xlint:-path",
  "-encoding", "us-ascii")

netLogoPackageExtras += (baseDirectory(_ / "tests.txt").value, "tests.txt")

//netLogoPackageExtras ++= demoNames.map(n => (demoDir.value / n, s"demos/$n"))
