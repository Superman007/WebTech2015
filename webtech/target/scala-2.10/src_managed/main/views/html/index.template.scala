
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.HtmlFormat.Appendable] {

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
                    
                    """),_display_(Seq[Any](/*27.22*/if(status=="eingeloggt")/*27.46*/{_display_(Seq[Any](format.raw/*27.47*/("""<li>
                        <a href="/suche">Suche</a>
                    </li>""")))})),format.raw/*29.27*/("""

                    """),_display_(Seq[Any](/*31.22*/if(status=="eingeloggt")/*31.46*/{_display_(Seq[Any](format.raw/*31.47*/("""<li>
                        <a href="/anlegen">Anlegen</a>
                    </li>""")))})),format.raw/*33.27*/("""
                    <li>
                        <a href="/impressum">Impressum</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">User<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            """),_display_(Seq[Any](/*40.30*/if(status=="ausgeloggt")/*40.54*/{_display_(Seq[Any](format.raw/*40.55*/("""<li>
                                <a href="/login">Login</a>
                            </li>""")))})),format.raw/*42.35*/("""
                            """),_display_(Seq[Any](/*43.30*/if(status=="eingeloggt")/*43.54*/{_display_(Seq[Any](format.raw/*43.55*/("""
                            <li><a href="/logout">Logout</a></li>
                            """)))})),format.raw/*45.30*/("""
                            """),_display_(Seq[Any](/*46.30*/if(status=="ausgeloggt")/*46.54*/{_display_(Seq[Any](format.raw/*46.55*/("""<li>
                                <a href="/registrierung">Registrieren</a>
                            </li>""")))})),format.raw/*48.35*/("""
                        </ul>
                    </li>

                </ul>

            </div>
        </div>
    </header>


    <!--Inhalt-->
    <div class="container">
        <div id="box1">
            <h1>Herzlich Willkommen</h1>
            <p class="lead">
                Um eine Fahrt suchen oder anlegen zu können, müssen Sie sich registrieren.
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
""")))})),format.raw/*79.2*/("""
"""))}
    }
    
    def render(message:String,status:String): play.api.templates.HtmlFormat.Appendable = apply(message,status)
    
    def f:((String,String) => play.api.templates.HtmlFormat.Appendable) = (message,status) => apply(message,status)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 23 12:04:12 CEST 2015
                    SOURCE: /Users/philippkoppenhagen/Documents/Webtech/app/views/index.scala.html
                    HASH: 4218671613a2cef5fdc7c0066f14ee7a1d74f5e0
                    MATRIX: 781->1|924->34|952->53|988->55|1016->75|1054->76|1608->594|1623->600|1690->644|2043->961|2076->985|2115->986|2229->1068|2288->1091|2321->1115|2360->1116|2478->1202|2860->1548|2893->1572|2932->1573|3062->1671|3128->1701|3161->1725|3200->1726|3328->1822|3394->1852|3427->1876|3466->1877|3611->1990|4293->2641
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|45->17|45->17|45->17|55->27|55->27|55->27|57->29|59->31|59->31|59->31|61->33|68->40|68->40|68->40|70->42|71->43|71->43|71->43|73->45|74->46|74->46|74->46|76->48|107->79
                    -- GENERATED --
                */
            