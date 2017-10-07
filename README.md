# Leiden 2017

* 13: folios 164 recto - 169 recto (2014--2016)
* 21: folios 277 recto - 282 recto (Spring 2017)
* currently: folios 208 verso - 223 recto (*Iliad* 16.126-867)

## Contributors

* Bart Bijvoets
* Ineke Sluiter
* Kirsten Haijes
* Leonie Henkes
* Lisa Seldenthuis
* Marloes Velthuisen
* Mees Gelein
* Olivia Monster
* Suzan Boreel
* Tazuko van Berkel

## Which files ought to be edited?

* `paleography/paleography-iliad/{folio}.cex`
* `paleography/paleography-scholia/{folio}.cex`
* `relations/venA-textToImage-Iliad/{folio}.cex`
* `dse-models/venA-mainScholia/{folio}.cex`
* `dse-models/venA-intermarginal/{folio}.cex`
* `dse-models/venA-interlinear/{folio}.cex`
* `dse-models/venA-interior/{folio}.cex`
* `dse-models/venA-exterior/{folio}.cex`
* `editions/Iliad/{folio}.xml`
* `editions/scholia/MainScholia/{folio}.xml`
* `editions/scholia/IntermarginalScholia/{folio}.xml`
* `editions/scholia/InterlinearScholia/{folio}.xml`
* `editions/scholia/InteriorScholia/{folio}.xml`
* `editions/scholia/ExteriorScholia/{folio}.xml`

## Which lines are there on each folio?

* **208v**: *Iliad* 16.126-150
* **209r**: *Iliad* 16.151-175
* **209v**: *Iliad* 16.176-200
* **210r**: *Iliad* 16.201-225
* **210v**: *Iliad* 16.226-250
* **211r**: *Iliad* 16.251-275
* **211v**: *Iliad* 16.276-300
* **212r**: *Iliad* 16.301-325
* **212v**: *Iliad* 16.326-350
* **213r**: *Iliad* 16.351-375
* **213v**: *Iliad* 16.376-401
* **214r**: *Iliad* 16.402-426
* **214v**: *Iliad* 16.427-451
* **215r**: *Iliad* 16.452-476
* **215v**: *Iliad* 16.477-501
* **216r**: *Iliad* 16.502-526
* **216v**: *Iliad* 16.527-551
* **217r**: *Iliad* 16.552-576
* **217v**: *Iliad* 16.577-601
* **218r**: *Iliad* 16.602-628
* **218v**: *Iliad* 16.629-653
* **219r**: *Iliad* 16.654-678
* **219v**: *Iliad* 16.679-705
* **220r**: *Iliad* 16.706-730
* **220v**: *Iliad* 16.731-755
* **221r**: *Iliad* 16.756-780
* **221v**: *Iliad* 16.781-805
* **222r**: *Iliad* 16.806-830
* **222v**: *Iliad* 16.831-857
* **223r**: *Iliad* 16.858-867

## cex examples 

Een welgevormde cex-regel voor de Paleography ziet er zo uit:
urn:cite2:op:208v**:1#urn:cts:greekLit:tlg0012.tlg001.msA.hmt2017a:16.76@ε#urn:cite2:hmt:vaimg.2017a:VA261VN_0763@0.4845,0.2289,0.01732,0.01342#

Dus:
* kolommen gescheiden door hekjes (#)
* eerste kolom: de naam van je folio: de nummering van je observatie. 
* tweede kolom: de "plaats": dus Homerus (tlg0012), Ilias (tlg001), het manuscript (msA), de editie (hmt2017), de plaats (16.76), je observatie (@ε), evt. gevolgd door hoeveelste het is tussen vierkanten haken ([2])
* derde kolom: de image citation (de "coordinaten" van je letter op de folio)

Een welgevormde cex-regel voor de Line Indexing ziet er zo uit:
urn:cts:greekLit:tlg0012.tlg001.msA2017a:20.76#urn:cite2:dse:verbs.v1:illustratedBy#urn:cite2:hmt:vaimg.2017a:VA261VN_0763@0.4803,0.2159,0.3626,0.02642

Dus:
* 3 kolommen gescheiden door hekjes (#)
* eerste kolom: de plaats van je regel (dus waar in het voorbeeld 20 staat moet bij ons steeds 16 staan, gevolgd door de regelnummer)
* tweede kolom: niks aan doen!
* derde kolom: de image citation

## Useful links for editing

* https://homermultitext.github.io/hmt-docs/totaled/ (to look up the HMT project principles)
* https://homermultitext.github.io/hmt-editors-guide/editorial-policies/ (to look up the HMT `xml` editing standards)
* http://www.homermultitext.org/hmt-digital/svcforms (to search for images of a folio; it is recommended to have the Venetus A and the Comparetti open in adjacent tabs, *especially* when working on the exterior scholia)
* https://homermultitext.slack.com (to contact Neel or Stephanie)

**NB**: Also have a look at the files in `writing/`

<!-- cat paleography/*.csv > paleography.csv -->
