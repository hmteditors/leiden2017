https://github.com/hmteditors/leiden2017/
README.md

**This is the working directory of the Leiden sub-group of the Homer Multitext Project.**

# Leiden2017

Repository for HMT editing by Homer's Angels in spring 2017

## Table of contents
* [Leiden HMT project contributors (past and present)](https://github.com/hmteditors/leiden2017#leiden-hmt-project-contributors-past-and-present)
* [What is there on a folio?](https://github.com/hmteditors/leiden2017#what-is-there-on-a-folio)
* [What ought to be done to complete a folio?](https://github.com/hmteditors/leiden2017#what-ought-to-be-done-to-complete-a-folio)
* [Which files ought to be edited?](https://github.com/hmteditors/leiden2017#which-files-ought-to-be-edited)
* [Which lines are there on each folio?](https://github.com/hmteditors/leiden2017#which-lines-are-there-on-each-folio)
* [Progress](https://github.com/hmteditors/leiden2017#progress)
* [Problems?](https://github.com/hmteditors/leiden2017#problems)
* [Useful links for editing](https://github.com/hmteditors/leiden2017#useful-links-for-editing)

## Leiden HMT project contributors (past and present)

* Aniek Vink
* Bart Bijvoets
* Christine Lvov
* Elias Eells
* Ineke Sluiter
* Judith Nijensteen
* Kimia Ghambari
* Kirsten Haijes
* Leonie Henkes
* Lisa Seldenthuis
* Marloes Velthuisen
* Mees Gelein
* Olivia Monster
* Roos Jeninga
* Salma El Emrani
* Suzan Boreel
* Tazuko van Berkel
* Thom van Leuveren
* Willemijn Roozenbeek

## What is there on a folio?

* The main text of the *Iliad*
* Main scholia
* Intermarginal (*im*) scholia (between the main text and the main scholia)
* Interlinear (*il*) scholia (between the lines of the main text)
* Interior (*int*) scholia (in the inner margin of the folio, *i.e.* to the left of the main text on *recto* pages and to the right of the main text on *verso* pages)
* Exterior (*ext*) scholia (in the outer margin of the folio, *i.e.* to the right of the main scholia on *recto* pages and to the left of the main scholia on *verso* pages)
* Special signs, numbers, and abbreviations (these can be ignored for now, because this is done systematically by someone else)

**NB**: not all folios have all types of scholia

## What ought to be done to complete a folio?

* Make a palaeographic sample of every glyph in the first line of the main text (`csv`)
* Make a palaeographic sample of each of the first forty glyphs of the first main scholion (`csv`)
* Index the individual lines of the main text (`csv`)
* Index the individual main, *im*, *il*, *int*, and *ext* scholia (`csv`)
* Transcribe the individual lines of the main text (`xml`)
* Transcribe the individual main, *im*, *il*, *int*, and *ext* scholia (`xml`)

## Which files ought to be edited?

* `collections/paleography/{folio}.csv`
* `collections/paleography/{folio}S.csv`
* `indices/venA-textToImage-Iliad.csv`
* `collections/venA-mainScholia/{folio}.csv`
* `collections/venA-intermarginal/{folio}.csv`
* `collections/venA-interlinear/{folio}.csv`
* `collections/venA-interior/{folio}.csv`
* `collections/venA-exterior/{folio}.csv`
* `editions/iliad/{folio}.xml`
* `editions/scholia/MainScholia/{folio}.xml`
* `editions/scholia/IntermarginalScholia/{folio}.xml`
* `editions/scholia/InterlinearScholia/{folio}.xml`
* `editions/scholia/InteriorScholia/{folio}.xml`
* `editions/scholia/ExteriorScholia/{folio}.xml`

## Which lines are there on each folio?

* **277r**: *Iliad* 21.352-376 <!-- urn:cite:hmt:vaimg.VA277RN-0447 -->
* **277v**: *Iliad* 21.377-401 <!-- urn:cite:hmt:vaimg.VA277VN-0779 -->
* **278r**: *Iliad* 21.402-426 <!-- urn:cite:hmt:vaimg.VA278RN-0448 -->
* **278v**: *Iliad* 21.427-452 <!-- urn:cite:hmt:vaimg.VA278VN-0780 -->
* **279r**: *Iliad* 21.453-477 <!-- urn:cite:hmt:vaimg.VA279RN-0449 -->
* **279v**: *Iliad* 21.478-503 <!-- urn:cite:hmt:vaimg.VA279VN-0781 -->
* **280r**: *Iliad* 21.504-529 <!-- urn:cite:hmt:vaimg.VA280RN-0450 -->
* **280v**: *Iliad* 21.530-554 <!-- urn:cite:hmt:vaimg.VA280VN-0782 -->
* **281r**: *Iliad* 21.555-579 <!-- urn:cite:hmt:vaimg.VA281RN-0451 -->
* **281v**: *Iliad* 21.580-604 <!-- urn:cite:hmt:vaimg.VA281VN-0783 -->
* **282r**: *Iliad* 21.605-611 <!-- urn:cite:hmt:vaimg.VA282RN-0452 -->

## Progress

<table>
  <tr>
    <td> </td> <td> </td>
    <td> 277r</td> <td> 277v</td> <td> 278r</td> <td> 278v</td> <td> 279r</td> <td> 279v</td> <td> 280r</td> <td> 280v</td> <td> 281r</td> <td> 281v</td> <td> 282r</td>
  </tr>
  <tr>
    <td>paleography main text</td> <td>(<b>csv</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>paleography main scholia</td> <td>(<b>csv</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>main text indices</td> <td>(<b>csv</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>main scholia indices</td> <td>(<b>csv</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>intermarginal scholia indices</td> <td>(<b>csv</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>interlinear scholia indices</td> <td>(<b>csv</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>interior scholia indices</td> <td>(<b>csv</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>exterior scholia indices</td> <td>(<b>csv</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td> </td> <td> </td>
    <td> 277r</td> <td> 277v</td> <td> 278r</td> <td> 278v</td> <td> 279r</td> <td> 279v</td> <td> 280r</td> <td> 280v</td> <td> 281r</td> <td> 281v</td> <td> 282r</td>
  </tr>
  <tr>
    <td>main text</td> <td>(<b>xml</b>)</td>
    <td>  Y  </td> <td>  Υ  </td> <td>  Y  </td> <td>  Y   </td> <td>  Υ  </td> <td>  Υ  </td> <td>  Υ  </td> <td>  Y  </td> <td>  Υ  </td> <td>  Υ  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>main scholia</td> <td>(<b>xml</b>)</td>
    <td>  Y  </td> <td>  Υ  </td> <td>  Y  </td> <td>  Y   </td> <td>  Υ  </td> <td>  Υ  </td> <td>  Υ  </td> <td>  Y  </td> <td>  Υ  </td> <td>  Υ  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>intermarginal scholia</td> <td>(<b>xml</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>interlinear scholia</td> <td>(<b>xml</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  ?  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>interior scholia</td> <td>(<b>xml</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
  <tr>
    <td>exterior scholia</td> <td>(<b>xml</b>)</td>
    <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td> <td>  Y  </td>
  </tr>
</table>


* **Y**: yes, finished and checked
* **Y?**: probably finished, has to be checked 
* **?**: status unknown
* **!**: currently being worked on
* **-**: not started

## Problems?

* If you do not understand your virtual machine, ask Tazuko
* If you do not understand git or github, ask Bart
* If you do not understand a scholion, ask Ineke
* If you do not know what to do next, go to the progress table and find your team a new task
* Have a look at the wiki and the editorial guide (below); there are useful links over there
* Try to help each other (you will learn most this way)
* If nobody knows how to solve an editorial problem, report a new issue

## Useful links for editing

* https://github.com/hmteditors/leiden2017/wiki (Leiden University HMT wiki)
* https://homermultitext.github.io/hmt-docs/totaled/ (to look up the HMT project principles)
* https://homermultitext.github.io/hmt-editors-guide/editorial-policies/ (to look up the HMT `xml` editing standards)
* http://www.homermultitext.org/hmt-digital/svcforms (to search for images of a folio; it is recommended to have the Venetus A and the Comparetti open in adjacent tabs, *especially* when working on the exterior scholia)
* https://homermultitext.slack.com (to contact Neel or Stephanie)
* https://el.wikisource.org/wiki/Ιλιάς/Φ (*Iliad* book 21, without critical apparatus)

**NB**: Also have a look at the files in `writing/`

<!-- cat paleography/*.csv > paleography.csv -->
