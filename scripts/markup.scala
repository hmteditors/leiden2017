object Markup {
  //Load the person CSV data into here
  val persFile = Source.fromURL("https://raw.githubusercontent.com/homermultitext/hmt-authlists/master/data/hmtnames.csv").getLines().mkString("\n")
  //Load the place CSV data into here
  val placeFile = Source.fromURL("https://raw.githubusercontent.com/homermultitext/hmt-authlists/master/data/hmtplaces.csv").getLines().mkString("\n")

  /**
  Find a person by their URN
  **/
  def findPerson(urn:String):String = {
      val persLines = persFile.split("\n")
      for(pers <- persLines){
          if(pers.contains(urn)) return pers
      }
      return "No Match (Invalid URN)"
  }

  /**
  Find a place by their URN
  **/
  def findPlace(urn:String):String = {
      val placeLines = placeFile.split("\n")
      for(place <- placeLines){
        if(place.contains(urn)) return place
      }
      return "No Match"
  }

  def validateXML(inputFile:String, reportFile:String){
    //Load the xml file into a Scala XML object
    val xmlFile = XML.loadFile("editions/" + inputFile);
    //Create the builder that will hold the report
    val report = StringBuilder.newBuilder
    report.append("# Validation of XML Markup of Iliad\n\n")
    
    //Find every possible category
    val persMatches = xmlFile  \\ "persName"
    val placeMatches = xmlFile \\ "placeName"
    val rsMatches = xmlFile \\ "rs"
    
    //Enumerate every person
    startNewTable("Persons", report)
    for(person <- persMatches){
        var urn = person \ "@n"
        var lookup = findPerson(urn.text)
        report.append("|" + person.text + " | " + (person \ "@n") + "|" + getName(lookup) + "|" + getDesc(lookup) + "\n")      
    }

    //Enumerate every place
    startNewTable("Places", report)
    for(place <- placeMatches){
      var urn = place \ "@n"
      var lookup = findPlace(urn.text)
      report.append("|" + place.text + " | " + (place \ "@n") + "|" + getName(lookup) +  "|" + getDesc(lookup) + "\n")
    }

    //Enumerate every rs
    startNewTable("RS (Ethnic)", report)
    for(rs <- rsMatches){
      var urn = rs \ "@n"
      var lookup = findPlace(urn.text)
      report.append("|" + rs.text + " | " + (rs \ "@n") + "|" + getName(lookup) +  "|" + getDesc(lookup) + "\n")
    }

    //Finally write the report to disk
    val markupReport = new File("./reports/" + reportFile);
    new PrintWriter(markupReport) { write(report.toString); close }
    println("Markup report is in reports/" + reportFile)
  }

  /***Splits the comma separated stuff and returns the second value*/
  def getName(line:String):String = {
    var parts = line.split(",")
    if(parts.size > 1) return (line.split(",")(1))
    else return line
  }

  def getDesc(line:String):String = {
    var parts = line.split(",")
    if(parts.size > 2) return (line.split(",")(2
  ))
    else return line
  }

  /**Shorthand method for creating a new table*/
  def startNewTable(tableName:String, report:StringBuilder) {
    report.append("\n## " + tableName + " \n\n")
    report.append("| Reading | Urn     | Resolved     | Description    |\n")
    report.append("| :------------- | :------------- | :------------- |\n")
  }

  /**
  Checks the markup for the iliad
  **/
  def iliad(folioName:String){
    validateXML("Iliad/" + folioName + ".xml", "markup-iliad-" + folioName + ".md");
  }

  /**
  Checks the markup for the main scholia
  **/
  def mainScholia(folioName:String){
    validateXML("scholia/MainScholia/" + folioName + ".xml", "markup-scholia-main-" + folioName + ".md")
  }

  /**
  Checks the markup for the interior scholia
  **/
  def interiorScholia(folioName:String){
    validateXML("scholia/InteriorScholia/" + folioName + ".xml", "markup-scholia-interior-" + folioName + ".md")
  }

  /**
  Checks the markup for the interlinear scholia
  **/
  def interlinearScholia(folioName:String){
    validateXML("scholia/InterlinearScholia/" + folioName + ".xml", "markup-scholia-interlinear-" + folioName + ".md")
  }

  /**
  Checks the markup for the intermarginal scholia
  **/
  def intermarginalScholia(folioName:String){
    validateXML("scholia/IntermarginalScholia/" + folioName + ".xml", "markup-scholia-intermarginal-" + folioName + ".md")
  }
  
  /**
  Checks the markup for the exterior scholia
  **/
  def exteriorScholia(folioName:String){
    validateXML("scholia/ExteriorScholia/" + folioName + ".xml", "markup-scholia-exterior-" + folioName + ".md")
  }
}

/**
THE OLD CLASS BY NEEL
import edu.holycross.shot.scm._
import edu.holycross.shot.ohco2._
import edu.holycross.shot.cite._
import org.homermultitext.edmodel._
import java.io.PrintWriter
import java.io.File


object Markup {

  def texts = {
    val repoDirectory: String = "./"

    val propertiesFile = repoDirectory + "editions/xmlrepository.properties"
    val textRepository = LocalFileConverter.textRepoFromPropertiesFile(propertiesFile)

    val tokens = TeiReader.fromCorpus(textRepository.corpus)

    val failures = tokens.filter(_.analysis.errors.nonEmpty)
    val report =  StringBuilder.newBuilder
    report.append("#Verification of XML markup\n\n")
    if (failures.isEmpty) {
      println("\n\nNo errors in text edition.  εὖγε  !")
    } else {

      report.append(s"\n\nFound ${failures.size} errors.\n\n")

      for (f <- failures) {
        report.append("-   " + f.analysis.errorReport(", ") + "\n\n")
      }

      val markupReport = new File(repoDirectory + "reports/xml-editing.md")
      new PrintWriter(markupReport) { write(report.toString); close }
      println("Markup report is in reports/xml-editing.md")
    }
  }
}
**/