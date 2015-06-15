
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
object impressum extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, status: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("TakeARide")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""

"""),format.raw/*7.1*/("""<div class="container">
    <header>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="/">
                    <div class="container""><img src=""""),_display_(/*17.56*/routes/*17.62*/.Assets.at("images/Takearide.png")),format.raw/*17.96*/("""">
                    </div> 
                </a>
            </div>
            <div class="collapse navbar-collapse" id="navbar1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="/">Home</a>
                    </li>
                    """),_display_(/*26.22*/if(status=="eingeloggt")/*26.46*/{_display_(Seq[Any](format.raw/*26.47*/("""<li>
                        <a href="/suche">Suche</a>
                    </li>""")))}),format.raw/*28.27*/("""

                    """),_display_(/*30.22*/if(status=="eingeloggt")/*30.46*/{_display_(Seq[Any](format.raw/*30.47*/("""<li>
                        <a href="/anlegen">Anlegen</a>
                    </li>""")))}),format.raw/*32.27*/("""
                    """),format.raw/*33.21*/("""<li>
                        <a href="/impressum">Impressum</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">User<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            """),_display_(/*39.30*/if(status=="ausgeloggt")/*39.54*/{_display_(Seq[Any](format.raw/*39.55*/("""<li>
                                <a href="/login">Login</a>
                            </li>""")))}),format.raw/*41.35*/("""
                            """),_display_(/*42.30*/if(status=="eingeloggt")/*42.54*/{_display_(Seq[Any](format.raw/*42.55*/("""
                            """),format.raw/*43.29*/("""<li><a href="/logout">Logout</a></li>
                            """)))}),format.raw/*44.30*/("""
                            """),_display_(/*45.30*/if(status=="ausgeloggt")/*45.54*/{_display_(Seq[Any](format.raw/*45.55*/("""<li>
                                <a href="/registrierung">Registrieren</a>
                            </li>""")))}),format.raw/*47.35*/("""
                        """),format.raw/*48.25*/("""</ul>
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
                Philipp Koppenhagen, Simon Lipiec, Erman Melunovic
            </p>
        </div>
    </div>
    <!--Inhalt-Ende-->
</div>
<footer>
    <div class="navbar navbar-inverse navbar-fixed-bottom">
        <div>
            <p id="Copyright">
                &copy Copyright by TakeARide
            </p>
        </div>
    </div>
</footer>

""")))}))}
  }

  def render(message:String,status:String): play.twirl.api.HtmlFormat.Appendable = apply(message,status)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,status) => apply(message,status)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 14 23:03:38 CEST 2015
                  SOURCE: /Users/Erman/Desktop/Webtech/app/views/impressum.scala.html
                  HASH: 6baea2abf02e4dd97d4944803f7d459b11fc49b5
                  MATRIX: 734->1|870->34|898->53|925->55|950->72|988->73|1016->75|1559->591|1574->597|1629->631|1952->927|1985->951|2024->952|2137->1034|2187->1057|2220->1081|2259->1082|2376->1168|2425->1189|2777->1514|2810->1538|2849->1539|2978->1637|3035->1667|3068->1691|3107->1692|3164->1721|3262->1788|3319->1818|3352->1842|3391->1843|3535->1956|3588->1981
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|44->17|44->17|44->17|53->26|53->26|53->26|55->28|57->30|57->30|57->30|59->32|60->33|66->39|66->39|66->39|68->41|69->42|69->42|69->42|70->43|71->44|72->45|72->45|72->45|74->47|75->48
                  -- GENERATED --
              */
          