
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.at("stylesheets/main.css")),format.raw/*7.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.at("images/carfav.png")),format.raw/*8.96*/("""">
        
        <title>"""),_display_(/*10.17*/title),format.raw/*10.22*/("""</title>
		<meta name="description" content="">
		<meta name="author" content="TakeARide">

		<meta name="viewport" content="width=device-width; initial-scale=1.0">

		<!-- Bootstrap JS -->
		<script src=""""),_display_(/*17.17*/routes/*17.23*/.Assets.at("javascripts/jQuery.js")),format.raw/*17.58*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*18.17*/routes/*18.23*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*18.65*/("""" type="text/javascript"></script>
		
		<!-- CSS -->
		<link href=""""),_display_(/*21.16*/routes/*21.22*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*21.61*/("""" rel="stylesheet">
		<link href=""""),_display_(/*22.16*/routes/*22.22*/.Assets.at("stylesheets/style.css")),format.raw/*22.57*/("""" rel="stylesheet">
		<link href=""""),_display_(/*23.16*/routes/*23.22*/.Assets.at("javascripts/datetimepicker-master/jquery.datetimepicker.css")),format.raw/*23.95*/("""" rel="stylesheet">

    </head>
    <body>
        """),_display_(/*27.10*/content),format.raw/*27.17*/("""
    """),format.raw/*28.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 14 23:03:38 CEST 2015
                  SOURCE: /Users/Erman/Desktop/Webtech/app/views/main.scala.html
                  HASH: 686d7a46bedfcc94e856de0ce7e240da2c6448f2
                  MATRIX: 727->1|845->31|873->33|987->121|1001->127|1055->161|1142->222|1156->228|1207->259|1262->287|1288->292|1521->498|1536->504|1592->539|1670->590|1685->596|1748->638|1843->706|1858->712|1918->751|1980->786|1995->792|2051->827|2113->862|2128->868|2222->941|2302->994|2330->1001|2362->1006
                  LINES: 26->1|29->1|31->3|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|45->17|45->17|45->17|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|55->27|55->27|56->28
                  -- GENERATED --
              */
          