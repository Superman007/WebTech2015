
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
object anlegen extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Form[Fahrt],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String, fahrtForm: Form[Fahrt], status: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.59*/("""

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
                    """),_display_(Seq[Any](/*25.22*/if(status=="eingeloggt")/*25.46*/{_display_(Seq[Any](format.raw/*25.47*/("""<li>
                        <a href="/suche">Suche</a>
                    </li>""")))})),format.raw/*27.27*/("""

                    """),_display_(Seq[Any](/*29.22*/if(status=="eingeloggt")/*29.46*/{_display_(Seq[Any](format.raw/*29.47*/("""<li>
                        <a href="/anlegen">Anlegen</a>
                    </li>""")))})),format.raw/*31.27*/("""
                    <li>
                        <a href="/impressum">Impressum</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">User<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            """),_display_(Seq[Any](/*38.30*/if(status=="ausgeloggt")/*38.54*/{_display_(Seq[Any](format.raw/*38.55*/("""<li>
                                <a href="/login">Login</a>
                            </li>""")))})),format.raw/*40.35*/("""
                            """),_display_(Seq[Any](/*41.30*/if(status=="eingeloggt")/*41.54*/{_display_(Seq[Any](format.raw/*41.55*/("""
                            <li><a href="/logout">Logout</a></li>
                            """)))})),format.raw/*43.30*/("""
                            """),_display_(Seq[Any](/*44.30*/if(status=="ausgeloggt")/*44.54*/{_display_(Seq[Any](format.raw/*44.55*/("""<li>
                                <a href="/registrierung">Registrieren</a>
                            </li>""")))})),format.raw/*46.35*/("""
                        </ul>
                    </li>

                </ul>

            </div>
        </div>
    </header>

    <!--Inhalt-->
    <div class="container">
        <div id="box1">
            <h1>Anlegen</h1>

            <!-- Anlegen Felder -->
            """),_display_(Seq[Any](/*62.14*/helper/*62.20*/.form(action=routes.Application.fahrtAnlegen(), 'role -> "form")/*62.84*/ {_display_(Seq[Any](format.raw/*62.86*/("""

            <div class="form-group">
                """),_display_(Seq[Any](/*65.18*/helper/*65.24*/.inputText(fahrtForm("startAdresse"), 'placeholder -> "Nur Groß- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "startadresse", '_showConstraints -> false))),format.raw/*65.212*/("""
            </div>

            <div class="form-group">
                """),_display_(Seq[Any](/*69.18*/helper/*69.24*/.inputText(fahrtForm("zielAdresse"), 'placeholder -> "Nur Groß- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "zieladresse", '_showConstraints -> false))),format.raw/*69.210*/("""
            </div>

            <div class="form-group">
                """),_display_(Seq[Any](/*73.18*/helper/*73.24*/.inputText(fahrtForm("zweitAdresse"), 'placeholder -> "Nur Groß- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "zweitadresse", '_showConstraints -> false))),format.raw/*73.212*/("""
            </div>

            <div class="form-group">
                """),_display_(Seq[Any](/*77.18*/helper/*77.24*/.inputText(fahrtForm("mitfahrer"), 'pattern -> "[0-9]+", 'class -> "form-control", 'id -> "mitfahrer", '_showConstraints -> false))),format.raw/*77.154*/("""
            </div>

            <div class="form-group">
                """),_display_(Seq[Any](/*81.18*/helper/*81.24*/.inputText(fahrtForm("datum"), 'class -> "form-control", 'id -> "datum", '_showConstraints -> false))),format.raw/*81.124*/("""
            </div>

            <input type="submit" value="Anlegen" class="btn btn-default">
            """)))})),format.raw/*85.14*/("""
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
</body>
<script type="text/javascript" src=""""),_display_(Seq[Any](/*101.38*/routes/*101.44*/.Assets.at("javascripts/datetimepicker-master/jquery.datetimepicker.js"))),format.raw/*101.116*/(""""></script>
<script type="text/javascript">
    $('#datum').datetimepicker("""),format.raw/*103.32*/("""{"""),format.raw/*103.33*/("""
        mask: '9999/19/39 29:59'
    """),format.raw/*105.5*/("""}"""),format.raw/*105.6*/(""");
</script>
""")))})))}
    }
    
    def render(message:String,fahrtForm:Form[Fahrt],status:String): play.api.templates.HtmlFormat.Appendable = apply(message,fahrtForm,status)
    
    def f:((String,Form[Fahrt],String) => play.api.templates.HtmlFormat.Appendable) = (message,fahrtForm,status) => apply(message,fahrtForm,status)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 23 12:04:12 CEST 2015
                    SOURCE: /Users/philippkoppenhagen/Documents/Webtech/app/views/anlegen.scala.html
                    HASH: 72a498facbb9051fe1067db39ea0d0d102b17cf4
                    MATRIX: 795->1|962->58|990->77|1026->79|1054->99|1092->100|1645->617|1660->623|1727->667|2059->963|2092->987|2131->988|2245->1070|2304->1093|2337->1117|2376->1118|2494->1204|2876->1550|2909->1574|2948->1575|3078->1673|3144->1703|3177->1727|3216->1728|3344->1824|3410->1854|3443->1878|3482->1879|3627->1992|3942->2271|3957->2277|4030->2341|4070->2343|4162->2399|4177->2405|4388->2593|4499->2668|4514->2674|4723->2860|4834->2935|4849->2941|5060->3129|5171->3204|5186->3210|5339->3340|5450->3415|5465->3421|5588->3521|5728->3629|6115->3979|6131->3985|6227->4057|6331->4132|6361->4133|6427->4171|6456->4172
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|44->16|44->16|44->16|53->25|53->25|53->25|55->27|57->29|57->29|57->29|59->31|66->38|66->38|66->38|68->40|69->41|69->41|69->41|71->43|72->44|72->44|72->44|74->46|90->62|90->62|90->62|90->62|93->65|93->65|93->65|97->69|97->69|97->69|101->73|101->73|101->73|105->77|105->77|105->77|109->81|109->81|109->81|113->85|129->101|129->101|129->101|131->103|131->103|133->105|133->105
                    -- GENERATED --
                */
            