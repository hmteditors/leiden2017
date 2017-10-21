import edu.holycross.shot.scm._
import edu.holycross.shot.ohco2._
import edu.holycross.shot.cite._
import java.io.PrintWriter
import java.io.File
import scala.util.Try
import scala.io.Source
import scala.xml.XML
import org.homermultitext.edmodel._

// Settings
/** Size of image in paleography displays.*/
val imageSize = 800
/** Binary image service*/
val imgService = "http://www.homermultitext.org/hmt-digital/images?request=GetBinaryImage"

val repoDirectory: String = "./"

val imgUrlBase = "http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/"


//Finally import the scripts
:load scripts/images.scala
:load scripts/paleography.scala
:load scripts/markup.scala