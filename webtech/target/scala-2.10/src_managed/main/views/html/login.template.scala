
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Form[User],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String, userForm: Form[User], status: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.57*/("""

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
                    <div class="container""><img src=""""),_display_(Seq[Any](/*16.56*/routes/*16.62*/.Assets.at("images/Logo_NimmMichMit_02.png"))),format.raw/*16.106*/("""">
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
            <h1>Login</h1>
            <!-- Login Felder -->
            """),_display_(Seq[Any](/*62.14*/helper/*62.20*/.form(action=routes.Application.einloggen(), 'role -> "form")/*62.81*/ {_display_(Seq[Any](format.raw/*62.83*/("""
            
            <div class="form-group">
                """),_display_(Seq[Any](/*65.18*/helper/*65.24*/.inputText(userForm("username"), 'class -> "form-control", 'id -> "log_username", '_showConstraints -> false))),format.raw/*65.133*/("""
            </div>
            
            <div class="form-group">
                """),_display_(Seq[Any](/*69.18*/helper/*69.24*/.inputPassword(userForm("passwort"), 'class -> "form-control", 'id -> "log_passwort", '_showConstraints -> false))),format.raw/*69.137*/("""
            </div>

            <div>
                <p>Noch nicht angemeldet? <a href="/registrierung">Registrieren!</a></p>
            </div>

            <input type="submit" value="einloggen" class="btn btn-primary">
            """)))})),format.raw/*77.14*/("""
            <!-- Felder Ende -->
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
    
    def render(message:String,userForm:Form[User],status:String): play.api.templates.HtmlFormat.Appendable = apply(message,userForm,status)
    
    def f:((String,Form[User],String) => play.api.templates.HtmlFormat.Appendable) = (message,userForm,status) => apply(message,userForm,status)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 23 12:04:13 CEST 2015
                    SOURCE: /Users/philippkoppenhagen/Documents/Webtech/app/views/login.scala.html
                    HASH: 46ae28798cfeba5b34e59af1dfcc867af2eea0dd
                    MATRIX: 792->1|957->56|985->75|1021->77|1049->97|1087->98|1640->615|1655->621|1722->665|2075->982|2108->1006|2147->1007|2261->1089|2320->1112|2353->1136|2392->1137|2510->1223|2892->1569|2925->1593|2964->1594|3094->1692|3160->1722|3193->1746|3232->1747|3360->1843|3426->1873|3459->1897|3498->1898|3643->2011|3953->2285|3968->2291|4038->2352|4078->2354|4182->2422|4197->2428|4329->2537|4452->2624|4467->2630|4603->2743|4872->2980
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|44->16|44->16|44->16|54->26|54->26|54->26|56->28|58->30|58->30|58->30|60->32|67->39|67->39|67->39|69->41|70->42|70->42|70->42|72->44|73->45|73->45|73->45|75->47|90->62|90->62|90->62|90->62|93->65|93->65|93->65|97->69|97->69|97->69|105->77
                    -- GENERATED --
                */
            