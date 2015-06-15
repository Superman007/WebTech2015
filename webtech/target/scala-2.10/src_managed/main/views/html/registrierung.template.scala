
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
object registrierung extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Form[User],String,play.api.templates.HtmlFormat.Appendable] {

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
            <h1>Registrieren</h1>

            <!-- Registrierung Felder -->
            """),_display_(Seq[Any](/*63.14*/helper/*63.20*/.form(action=routes.Application.registrieren(), 'role -> "form")/*63.84*/ {_display_(Seq[Any](format.raw/*63.86*/("""

            <div class="form-group">
                """),_display_(Seq[Any](/*66.18*/helper/*66.24*/.inputText(userForm("username"), 'class -> "form-control", 'id -> "reg_username", '_showConstraints -> true))),format.raw/*66.132*/("""                    
            </div>

            <div class="form-group">
                """),_display_(Seq[Any](/*70.18*/helper/*70.24*/.inputText(userForm("vorname"), 'placeholder -> "Nur Groß- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "reg_vorname"))),format.raw/*70.177*/("""               
            </div>

            <div class="form-group">
                """),_display_(Seq[Any](/*74.18*/helper/*74.24*/.inputText(userForm("nachname"), 'placeholder -> "Nur Groß- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "reg_nachname"))),format.raw/*74.179*/("""                    
            </div>

            <div class="form-group">
                """),_display_(Seq[Any](/*78.18*/helper/*78.24*/.inputText(userForm("ort"), 'placeholder -> "Nur Groß- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "reg_ort"))),format.raw/*78.169*/("""                    
            </div>

            <div class="form-group">
                """),_display_(Seq[Any](/*82.18*/helper/*82.24*/.inputText(userForm("email"), 'placeholder -> "lorem@ipsum.net",'class -> "form-control", 'id -> "reg_email", '_showConstraints -> false))),format.raw/*82.161*/("""                    
            </div>

            <div class="form-group">
                """),_display_(Seq[Any](/*86.18*/helper/*86.24*/.inputPassword(userForm("passwort"), 'class -> "form-control", 'id -> "reg_passwort", '_showConstraints -> true))),format.raw/*86.136*/("""                    
            </div>
            <input type="submit" value="registrieren" class="btn btn-primary">
            """)))})),format.raw/*89.14*/("""

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
                    SOURCE: /Users/philippkoppenhagen/Documents/Webtech/app/views/registrierung.scala.html
                    HASH: 9544c6cde04ac4e79a43c456345e2358698194ef
                    MATRIX: 800->1|965->56|993->75|1029->77|1057->97|1095->98|1648->615|1663->621|1730->665|2083->982|2116->1006|2155->1007|2269->1089|2328->1112|2361->1136|2400->1137|2518->1223|2900->1569|2933->1593|2972->1594|3102->1692|3168->1722|3201->1746|3240->1747|3368->1843|3434->1873|3467->1897|3506->1898|3651->2011|3977->2301|3992->2307|4065->2371|4105->2373|4197->2429|4212->2435|4343->2543|4474->2638|4489->2644|4665->2797|4791->2887|4806->2893|4984->3048|5115->3143|5130->3149|5298->3294|5429->3389|5444->3395|5604->3532|5735->3627|5750->3633|5885->3745|6049->3877
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|44->16|44->16|44->16|54->26|54->26|54->26|56->28|58->30|58->30|58->30|60->32|67->39|67->39|67->39|69->41|70->42|70->42|70->42|72->44|73->45|73->45|73->45|75->47|91->63|91->63|91->63|91->63|94->66|94->66|94->66|98->70|98->70|98->70|102->74|102->74|102->74|106->78|106->78|106->78|110->82|110->82|110->82|114->86|114->86|114->86|117->89
                    -- GENERATED --
                */
            