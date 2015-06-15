
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/main.css"))),format.raw/*7.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png"))),format.raw/*8.97*/("""">
        
        <title>"""),_display_(Seq[Any](/*10.17*/title)),format.raw/*10.22*/("""</title>
		<meta name="description" content="">
		<meta name="author" content="Alban Veliu">

		<meta name="viewport" content="width=device-width; initial-scale=1.0">

		<!-- Bootstrap JS -->
		<script src=""""),_display_(Seq[Any](/*17.17*/routes/*17.23*/.Assets.at("javascripts/jQuery.js"))),format.raw/*17.58*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*18.17*/routes/*18.23*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*18.65*/("""" type="text/javascript"></script>
		
		<!-- CSS -->
		<link href=""""),_display_(Seq[Any](/*21.16*/routes/*21.22*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*21.61*/("""" rel="stylesheet">
		<link href=""""),_display_(Seq[Any](/*22.16*/routes/*22.22*/.Assets.at("stylesheets/style.css"))),format.raw/*22.57*/("""" rel="stylesheet">
		<link href=""""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/datetimepicker-master/jquery.datetimepicker.css"))),format.raw/*23.95*/("""" rel="stylesheet">

    </head>
    <body>
        """),_display_(Seq[Any](/*27.10*/content)),format.raw/*27.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 23 12:04:13 CEST 2015
                    SOURCE: /Users/philippkoppenhagen/Documents/Webtech/app/views/main.scala.html
                    HASH: 635eb0e5a3c36ff33ec52e1d6e9b6832032f69b8
                    MATRIX: 778->1|902->31|1027->121|1041->127|1096->161|1192->222|1206->228|1259->260|1323->288|1350->293|1594->501|1609->507|1666->542|1753->593|1768->599|1832->641|1936->709|1951->715|2012->754|2083->789|2098->795|2155->830|2226->865|2241->871|2336->944|2425->997|2454->1004
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|45->17|45->17|45->17|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|55->27|55->27
                    -- GENERATED --
                */
            