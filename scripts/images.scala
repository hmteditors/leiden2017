object Index {

  def listFiles(dir: String): Vector[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      val realFiles =  d.listFiles.filter(_.isFile).toVector
      realFiles.filter(_.getName.matches(".+cex"))
    } else {
        Vector[File]()
    }
  }

  def mainScholia(folioName:String){
    scholia(folioName, "mainScholia")
  }
  def interiorScholia(folioName:String){
    scholia(folioName, "interior")
  }
  def interlinearScholia(folioName:String){
    scholia(folioName, "interlinear")
  }
  def intermarginalScholia(folioName:String){
    scholia(folioName, "intermarginal")
  }
  def exteriorScholia(folioName:String){
    scholia(folioName, "exterior")
  }

  def allScholia(folioName:String){
    mainScholia(folioName)
    interiorScholia(folioName)
    exteriorScholia(folioName)
    interlinearScholia(folioName)
    intermarginalScholia(folioName)
  }

  def scholia(folioName:String, scholiaType:String){
    val urlBase = s"${imgService}&w=${imageSize}&urn="
    val report =  StringBuilder.newBuilder
    report.append("#Verification of indexing of scholia\n\n")
    val urlParams =  StringBuilder.newBuilder

    //The file we want to validate
    val f = repoDirectory + "dse-models/venA-" + scholiaType + "/" + folioName + ".cex";

    val lines = Source.fromFile(f).getLines.toVector.drop(1)
    if (lines.size > 0) {
      val cols = lines(0).split("#")
      val txt : Try[String] = Try(CtsUrn(cols(0)).work)
      if (txt.isSuccess) {
        report.append(s"\n\n## Scholia group: ${txt.get} ")

        report.append("\n\n| Scholion     | Image     |\n| :------------- | :------------- |\n")
        for (entry <- lines) {
          val columns = entry.split("#")
          val txt : Try[String] = Try(CtsUrn(columns(0)).passageComponent)
          val img : Try[Cite2Urn] = Try(Cite2Urn(columns(1)))
          val folio : Try[Cite2Urn] = Try(Cite2Urn(columns(2)))

          val idDisplay = if (txt.isSuccess && folio.isSuccess) {
            txt.get + ", folio " + folio.get
          } else {txt + " " + folio}

            val imgLink = if (img.isSuccess ) {
            urlParams.append(s"urn=${img.get}&")
            val splits = img.get.objectComponent.split("@")
            val binaryImage =  s"${imgUrlBase}${splits(0)}.tif&RGN=${img.get.objectExtension}&WID=${imageSize}&CVT=JPEG"


            s"![${txt.get}](${binaryImage})"

            } else {img}
            report.append (s"| ${idDisplay} | ${imgLink} | \n")
        }
      } else {}
    } else {
      //skip
    }
    report.append("\n\nUse the image citation tool to check completeness.\n")
    report.append(s"[Here](http://www.homermultitext.org/ict2/?${urlParams.toString.dropRight(1)})")


    val reportFile = new File(repoDirectory + "reports/indexing-scholia-" + scholiaType + "-" + folioName + ".md")
    new PrintWriter(reportFile) { write(report.toString); close }
    println("Scholia indexing report is in reports/indexing-scholia-" + scholiaType + "-" + folioName + ".md")
  }

  def iliad(folioName: String){
    val urlBase = s"${imgService}&w=${imageSize}&urn="
    val report =  StringBuilder.newBuilder
    report.append("# Verification of index for *Iliad* text\n\n")
    report .append("| Text     | Image     |\n| :------------- | :------------- |\n")


    val iliadDataFile = repoDirectory + "relations/venA-textToImage-Iliad/" + folioName + ".cex"
    // read file, dropping header
    val iliadLines = Source.fromFile(iliadDataFile).getLines.toVector.drop(1)

    //urn, text, image

///VA012RN-0013.tif&RGN=0.172,0.0998,0.058,0.0218&WID=9000&CVT=JPEG
    for (entry <- iliadLines) {
      val columns = entry.split("#")
      val txt : Try[String] = Try(CtsUrn(columns(0)).passageComponent)
      val img : Try[Cite2Urn] = Try(Cite2Urn(columns(2)))



      val idDisplay = if (txt.isSuccess) {txt.get} else {txt}
      val imgLink = if (img.isSuccess ) {
        val splits = img.get.objectComponent.split("@")
        val binaryImage =              s"${imgUrlBase}${splits(0)}.tif&RGN=${img.get.objectExtension}&WID=${imageSize}&CVT=JPEG"
        s"![${txt.get}](${binaryImage})"

       } else {img}

      report.append (s"| ${idDisplay} | ${imgLink} | \n")
    }
    report.append("\n\n")
    val iliadReportFile = new File(repoDirectory + "reports/indexing-iliad-" + folioName + ".md")
    new PrintWriter(iliadReportFile) { write(report.toString); close }
    println("Iliad report is in reports/indexing-iliad-" + folioName + ".md")

  }


}
