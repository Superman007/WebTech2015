
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
object impressum extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String, status: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("NimmMichMit!")/*5.22*/{_display_(Seq[Any](format.raw/*5.23*/("""

<div class="container">
    <header>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="/">
                    <div class="container""><img src=""""),_display_(Seq[Any](/*17.56*/routes/*17.62*/.Assets.at("images/Logo_NimmMichMit_02.png"))),format.raw/*17.106*/("""">
                    </div> 
                </a>
            </div>
            <div class="collapse navbar-collapse" id="navbar1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="/">Home</a>
                    </li>
                    """),_display_(Seq[Any](/*26.22*/if(status=="eingeloggt")/*26.46*/{_display_(Seq[Any](format.raw/*26.47*/("""<li>
                        <a href="/suche">Suche</a>
                    </li>""")))})),format.raw/*28.27*/("""

                    """),_display_(Seq[Any](/*30.22*/if(status=="eingeloggt")/*30.46*/{_display_(Seq[Any](format.raw/*30.47*/("""<li>
                        <a href="/anlegen">Anlegen</a>
                    </li>""")))})),format.raw/*32.27*/("""
                    <li>
                        <a href="/impressum">Impressum</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">User<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            """),_display_(Seq[Any](/*39.30*/if(status=="ausgeloggt")/*39.54*/{_display_(Seq[Any](format.raw/*39.55*/("""<li>
                                <a href="/login">Login</a>
                            </li>""")))})),format.raw/*41.35*/("""
                            """),_display_(Seq[Any](/*42.30*/if(status=="eingeloggt")/*42.54*/{_display_(Seq[Any](format.raw/*42.55*/("""
                            <li><a href="/logout">Logout</a></li>
                            """)))})),format.raw/*44.30*/("""
                            """),_display_(Seq[Any](/*45.30*/if(status=="ausgeloggt")/*45.54*/{_display_(Seq[Any](format.raw/*45.55*/("""<li>
                                <a href="/registrierung">Registrieren</a>
                            </li>""")))})),format.raw/*47.35*/("""
                        </ul>
                    </li>

                </ul>

            </div>
        </div>
    </header>


    <!--Inhalt-->
    <div class="container">
        <div id="box1">
            <h1>Impressum</h1>
            <p class="lead">
                Beschreibung von drei wunderbaren Menschen. Herrlich.
            </p>
        </div>
    </div>
    <!--Inhalt-Ende-->
</div>
<footer>
    <div class="navbar navbar-inverse navbar-fixed-bottom">
        <div>
            <p id="Copyright">
                &copy Copyright by NimmMichMit!
            </p>
        </div>
    </div>
</footer>

""")))})))}
    }
    
    def render(message:String,status:String): play.api.templates.HtmlFormat.Appendable = apply(message,status)
    
    def f:((String,String) => play.api.templates.HtmlFormat.Appendable) = (message,status) => apply(message,status)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 23 12:04:12 CEST 2015
                    SOURCE: /Users/philippkoppenhagen/Documents/Webtech/app/views/impressum.scala.html
                    HASH: 7fd6dc18476cf8588d63554932824919b9ee35fc
                    MATRIX: 785->1|928->34|956->53|992->55|1020->75|1058->76|1612->594|1627->600|1694->644|2026->940|2059->964|2098->965|2212->1047|2271->1070|2304->1094|2343->1095|2461->1181|2843->1527|2876->1551|2915->1552|3045->1650|3111->1680|3144->1704|3183->1705|3311->1801|3377->1831|3410->1855|3449->1856|3594->1969
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|45->17|45->17|45->17|54->26|54->26|54->26|56->28|58->30|58->30|58->30|60->32|67->39|67->39|67->39|69->41|70->42|70->42|70->42|72->44|73->45|73->45|73->45|75->47
                    -- GENERATED --
                */
            