package org.nlogo.extensions.string

import org.nlogo.api.Argument
import org.nlogo.api.Context
import org.nlogo.api.Reporter
import org.nlogo.api.ExtensionException
import org.nlogo.api.LogoException
import org.nlogo.core.Syntax
import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import FromFile._

object FromFile {
  @throws(classOf[IOException])
  private def readFileAsString(filePath: String):String = {
    var outFileData = ""
    val fileData = new StringBuffer(10000)
    val reader = new BufferedReader(new FileReader(filePath))
    val buf: Array[Char] = Array.ofDim[Char](1024)

    var numRead: Int = 0
    numRead = reader.read(buf)
    while (numRead != -1){
      fileData.append(buf, 0, numRead)
      numRead = reader.read(buf)
    }
    reader.close()
    fileData.toString
  }
}

class FromFile extends Reporter {
  def getSyntax(): Syntax =
    Syntax.reporterSyntax(
      right = List (Syntax.StringType),
      ret   = Syntax.StringType)

  @throws(classOf[ExtensionException])
  @throws(classOf[LogoException])
  def report(args: Array[Argument], context: Context): AnyRef = {
    val filename: String = args(0).getString
    var result: String = ""
    try {
      result = readFileAsString(filename)
    } catch {
      case ex: IOException => throw new ExtensionException(ex)
    }
    result
  }

}
