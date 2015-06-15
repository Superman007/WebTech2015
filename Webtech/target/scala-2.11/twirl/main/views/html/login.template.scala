
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Form[User],String,play.twirl.api.HtmlFormat.Appendable] {

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
            <h1>Login</h1>
            <!-- Login Felder -->
            """),_display_(/*62.14*/helper/*62.20*/.form(action=routes.Application.einloggen(), 'role -> "form")/*62.81*/ {_display_(Seq[Any](format.raw/*62.83*/("""
            
            """),format.raw/*64.13*/("""<div class="form-group">
                """),_display_(/*65.18*/helper/*65.24*/.inputText(userForm("Username"), 'class -> "form-control", 'id -> "log_username", '_showConstraints -> false)),format.raw/*65.133*/("""
            """),format.raw/*66.13*/("""</div>
            
            <div class="form-group">
                """),_display_(/*69.18*/helper/*69.24*/.inputPassword(userForm("Passwort"), 'class -> "form-control", 'id -> "log_passwort", '_showConstraints -> false)),format.raw/*69.137*/("""
            """),format.raw/*70.13*/("""</div>

            <div>
                <p>Noch nicht angemeldet? <a href="/registrierung">Registrieren!</a></p>
            </div>

            <input type="submit" value="einloggen" class="btn btn-primary">
            """)))}),format.raw/*77.14*/("""
            """),format.raw/*78.13*/("""<!-- Felder Ende -->
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
                  DATE: Sun Jun 14 23:16:04 CEST 2015
                  SOURCE: /Users/Erman/Desktop/Webtech/app/views/login.scala.html
                  HASH: 683180a1f1dfc8f75d9bec5947568cb36f80e38d
                  MATRIX: 741->1|899->56|927->75|954->77|979->94|1017->95|1044->96|1587->612|1602->618|1657->652|2001->969|2034->993|2073->994|2186->1076|2236->1099|2269->1123|2308->1124|2425->1210|2474->1231|2826->1556|2859->1580|2898->1581|3027->1679|3084->1709|3117->1733|3156->1734|3213->1763|3311->1830|3368->1860|3401->1884|3440->1885|3584->1998|3637->2023|3913->2272|3928->2278|3998->2339|4038->2341|4092->2367|4161->2409|4176->2415|4307->2524|4348->2537|4449->2611|4464->2617|4599->2730|4640->2743|4895->2967|4936->2980
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|33->6|43->16|43->16|43->16|53->26|53->26|53->26|55->28|57->30|57->30|57->30|59->32|60->33|66->39|66->39|66->39|68->41|69->42|69->42|69->42|70->43|71->44|72->45|72->45|72->45|74->47|75->48|89->62|89->62|89->62|89->62|91->64|92->65|92->65|92->65|93->66|96->69|96->69|96->69|97->70|104->77|105->78
                  -- GENERATED --
              */
          