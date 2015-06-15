
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

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
                    
                    """),_display_(/*27.22*/if(status=="eingeloggt")/*27.46*/{_display_(Seq[Any](format.raw/*27.47*/("""<li>
                        <a href="/suche">Suche</a>
                    </li>""")))}),format.raw/*29.27*/("""

                    """),_display_(/*31.22*/if(status=="eingeloggt")/*31.46*/{_display_(Seq[Any](format.raw/*31.47*/("""<li>
                        <a href="/anlegen">Anlegen</a>
                    </li>""")))}),format.raw/*33.27*/("""
                    """),format.raw/*34.21*/("""<li>
                        <a href="/impressum">Impressum</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">User<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            """),_display_(/*40.30*/if(status=="ausgeloggt")/*40.54*/{_display_(Seq[Any](format.raw/*40.55*/("""<li>
                                <a href="/login">Login</a>
                            </li>""")))}),format.raw/*42.35*/("""
                            """),_display_(/*43.30*/if(status=="eingeloggt")/*43.54*/{_display_(Seq[Any](format.raw/*43.55*/("""
                            """),format.raw/*44.29*/("""<li><a href="/logout">Logout</a></li>
                            """)))}),format.raw/*45.30*/("""
                            """),_display_(/*46.30*/if(status=="ausgeloggt")/*46.54*/{_display_(Seq[Any](format.raw/*46.55*/("""<li>
                                <a href="/registrierung">Registrieren</a>
                            </li>""")))}),format.raw/*48.35*/("""
                        """),format.raw/*49.25*/("""</ul>
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
                Um eine Fahrt suchen oder anlegen zu koennen, muessen Sie sich registrieren.
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
""")))}),format.raw/*79.2*/("""
"""))}
  }

  def render(message:String,status:String): play.twirl.api.HtmlFormat.Appendable = apply(message,status)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,status) => apply(message,status)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu May 21 17:07:53 CEST 2015
                  SOURCE: /Users/philippkoppenhagen/Documents/Webtech/app/views/index.scala.html
                  HASH: c80480956067eff93695f5eb26e5de61561b27cc
                  MATRIX: 730->1|866->34|894->53|921->55|946->72|984->73|1012->75|1555->591|1570->597|1625->631|1969->948|2002->972|2041->973|2154->1055|2204->1078|2237->1102|2276->1103|2393->1189|2442->1210|2794->1535|2827->1559|2866->1560|2995->1658|3052->1688|3085->1712|3124->1713|3181->1742|3279->1809|3336->1839|3369->1863|3408->1864|3552->1977|3605->2002|4260->2627
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|44->17|44->17|44->17|54->27|54->27|54->27|56->29|58->31|58->31|58->31|60->33|61->34|67->40|67->40|67->40|69->42|70->43|70->43|70->43|71->44|72->45|73->46|73->46|73->46|75->48|76->49|106->79
                  -- GENERATED --
              */
          