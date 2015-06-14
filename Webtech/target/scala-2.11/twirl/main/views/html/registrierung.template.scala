
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
object registrierung extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Form[User],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, userForm: Form[User], status: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("TakeARide")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""
"""),format.raw/*6.1*/("""<div class="container">
    <header>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="/">
                    <div class="container""><img src=""""),_display_(/*16.56*/routes/*16.62*/.Assets.at("images/Takearide.png")),format.raw/*16.96*/("""">
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
            <h1>Registrieren</h1>

            <!-- Registrierung Felder -->
            """),_display_(/*63.14*/helper/*63.20*/.form(action=routes.Application.registrieren(), 'role -> "form")/*63.84*/ {_display_(Seq[Any](format.raw/*63.86*/("""

            """),format.raw/*65.13*/("""<div class="form-group">
                """),_display_(/*66.18*/helper/*66.24*/.inputText(userForm("Username"), 'class -> "form-control", 'id -> "reg_username", '_showConstraints -> true)),format.raw/*66.132*/("""                    
            """),format.raw/*67.13*/("""</div>

            <div class="form-group">
                """),_display_(/*70.18*/helper/*70.24*/.inputText(userForm("Vorname"), 'placeholder -> "Nur Gross- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "reg_vorname")),format.raw/*70.178*/("""               
            """),format.raw/*71.13*/("""</div>

            <div class="form-group">
                """),_display_(/*74.18*/helper/*74.24*/.inputText(userForm("Nachname"), 'placeholder -> "Nur Gross- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "reg_nachname")),format.raw/*74.180*/("""                    
            """),format.raw/*75.13*/("""</div>

            <div class="form-group">
                """),_display_(/*78.18*/helper/*78.24*/.inputText(userForm("Ort"), 'placeholder -> "Nur Gross- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "reg_ort")),format.raw/*78.170*/("""                    
            """),format.raw/*79.13*/("""</div>

            <div class="form-group">
                """),_display_(/*82.18*/helper/*82.24*/.inputText(userForm("Email"), 'placeholder -> "lorem@ipsum.net",'class -> "form-control", 'id -> "reg_email", '_showConstraints -> false)),format.raw/*82.161*/("""                    
            """),format.raw/*83.13*/("""</div>

            <div class="form-group">
                """),_display_(/*86.18*/helper/*86.24*/.inputPassword(userForm("Passwort"), 'class -> "form-control", 'id -> "reg_passwort", '_showConstraints -> true)),format.raw/*86.136*/("""                    
            """),format.raw/*87.13*/("""</div>
            <input type="submit" value="registrieren" class="btn btn-primary">
            """)))}),format.raw/*89.14*/("""

            """),format.raw/*91.13*/("""<!-- Felder Ende -->
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

  def render(message:String,userForm:Form[User],status:String): play.twirl.api.HtmlFormat.Appendable = apply(message,userForm,status)

  def f:((String,Form[User],String) => play.twirl.api.HtmlFormat.Appendable) = (message,userForm,status) => apply(message,userForm,status)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 14 23:27:18 CEST 2015
                  SOURCE: /Users/Erman/Desktop/Webtech/app/views/registrierung.scala.html
                  HASH: 318e7146ebef50bd381a97736ad89c273686eeba
                  MATRIX: 749->1|907->56|935->75|962->77|987->94|1025->95|1052->96|1595->612|1610->618|1665->652|2009->969|2042->993|2081->994|2194->1076|2244->1099|2277->1123|2316->1124|2433->1210|2482->1231|2834->1556|2867->1580|2906->1581|3035->1679|3092->1709|3125->1733|3164->1734|3221->1763|3319->1830|3376->1860|3409->1884|3448->1885|3592->1998|3645->2023|3937->2288|3952->2294|4025->2358|4065->2360|4107->2374|4176->2416|4191->2422|4321->2530|4382->2563|4471->2625|4486->2631|4662->2785|4718->2813|4807->2875|4822->2881|5000->3037|5061->3070|5150->3132|5165->3138|5333->3284|5394->3317|5483->3379|5498->3385|5657->3522|5718->3555|5807->3617|5822->3623|5956->3735|6017->3768|6147->3867|6189->3881
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|33->6|43->16|43->16|43->16|53->26|53->26|53->26|55->28|57->30|57->30|57->30|59->32|60->33|66->39|66->39|66->39|68->41|69->42|69->42|69->42|70->43|71->44|72->45|72->45|72->45|74->47|75->48|90->63|90->63|90->63|90->63|92->65|93->66|93->66|93->66|94->67|97->70|97->70|97->70|98->71|101->74|101->74|101->74|102->75|105->78|105->78|105->78|106->79|109->82|109->82|109->82|110->83|113->86|113->86|113->86|114->87|116->89|118->91
                  -- GENERATED --
              */
          