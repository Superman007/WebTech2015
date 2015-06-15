
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
object anlegen extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Form[Fahrt],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, fahrtForm: Form[Fahrt], status: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.59*/("""

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
                    """),_display_(/*25.22*/if(status=="eingeloggt")/*25.46*/{_display_(Seq[Any](format.raw/*25.47*/("""<li>
                        <a href="/suche">Suche</a>
                    </li>""")))}),format.raw/*27.27*/("""

                    """),_display_(/*29.22*/if(status=="eingeloggt")/*29.46*/{_display_(Seq[Any](format.raw/*29.47*/("""<li>
                        <a href="/anlegen">Anlegen</a>
                    </li>""")))}),format.raw/*31.27*/("""
                    """),format.raw/*32.21*/("""<li>
                        <a href="/impressum">Impressum</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">User<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            """),_display_(/*38.30*/if(status=="ausgeloggt")/*38.54*/{_display_(Seq[Any](format.raw/*38.55*/("""<li>
                                <a href="/login">Login</a>
                            </li>""")))}),format.raw/*40.35*/("""
                            """),_display_(/*41.30*/if(status=="eingeloggt")/*41.54*/{_display_(Seq[Any](format.raw/*41.55*/("""
                            """),format.raw/*42.29*/("""<li><a href="/logout">Logout</a></li>
                            """)))}),format.raw/*43.30*/("""
                            """),_display_(/*44.30*/if(status=="ausgeloggt")/*44.54*/{_display_(Seq[Any](format.raw/*44.55*/("""<li>
                                <a href="/registrierung">Registrieren</a>
                            </li>""")))}),format.raw/*46.35*/("""
                        """),format.raw/*47.25*/("""</ul>
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
            """),_display_(/*62.14*/helper/*62.20*/.form(action=routes.Application.fahrtAnlegen(), 'role -> "form")/*62.84*/ {_display_(Seq[Any](format.raw/*62.86*/("""

            """),format.raw/*64.13*/("""<div class="form-group">
                """),_display_(/*65.18*/helper/*65.24*/.inputText(fahrtForm("Startadresse"), 'placeholder -> "Nur Gross- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "startadresse", '_showConstraints -> false)),format.raw/*65.213*/("""
            """),format.raw/*66.13*/("""</div>

            <div class="form-group">
                """),_display_(/*69.18*/helper/*69.24*/.inputText(fahrtForm("Zieladresse"), 'placeholder -> "Nur Gross- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "zieladresse", '_showConstraints -> false)),format.raw/*69.211*/("""
            """),format.raw/*70.13*/("""</div>

            <div class="form-group">
                """),_display_(/*73.18*/helper/*73.24*/.inputText(fahrtForm("Zweitadresse"), 'placeholder -> "Nur Gross- und Kleinbuchstaben", 'pattern -> "[a-zA-Z]+", 'class -> "form-control", 'id -> "zweitadresse", '_showConstraints -> false)),format.raw/*73.213*/("""
            """),format.raw/*74.13*/("""</div>

            <div class="form-group">
                """),_display_(/*77.18*/helper/*77.24*/.inputText(fahrtForm("Mitfahrer"), 'pattern -> "[0-9]+", 'class -> "form-control", 'id -> "mitfahrer", '_showConstraints -> false)),format.raw/*77.154*/("""
            """),format.raw/*78.13*/("""</div>

            <div class="form-group">
                """),_display_(/*81.18*/helper/*81.24*/.inputText(fahrtForm("Datum"), 'class -> "form-control", 'id -> "datum", '_showConstraints -> false)),format.raw/*81.124*/("""
            """),format.raw/*82.13*/("""</div>

            <input type="submit" value="Anlegen" class="btn btn-default">
            """)))}),format.raw/*85.14*/("""
            """),format.raw/*86.13*/("""<!-- Felder Ende -->
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
</body>
<script type="text/javascript" src=""""),_display_(/*101.38*/routes/*101.44*/.Assets.at("javascripts/datetimepicker-master/jquery.datetimepicker.js")),format.raw/*101.116*/(""""></script>
<script type="text/javascript">
    $('#datum').datetimepicker("""),format.raw/*103.32*/("""{"""),format.raw/*103.33*/("""
        """),format.raw/*104.9*/("""mask: '9999/19/39 29:59'
    """),format.raw/*105.5*/("""}"""),format.raw/*105.6*/(""");
</script>
""")))}))}
  }

  def render(message:String,fahrtForm:Form[Fahrt],status:String): play.twirl.api.HtmlFormat.Appendable = apply(message,fahrtForm,status)

  def f:((String,Form[Fahrt],String) => play.twirl.api.HtmlFormat.Appendable) = (message,fahrtForm,status) => apply(message,fahrtForm,status)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 14 23:16:04 CEST 2015
                  SOURCE: /Users/Erman/Desktop/Webtech/app/views/anlegen.scala.html
                  HASH: b00972a22cd38614da10fa367af7be412d0483eb
                  MATRIX: 744->1|904->58|932->77|959->79|984->96|1022->97|1049->98|1592->614|1607->620|1662->654|1985->950|2018->974|2057->975|2170->1057|2220->1080|2253->1104|2292->1105|2409->1191|2458->1212|2810->1537|2843->1561|2882->1562|3011->1660|3068->1690|3101->1714|3140->1715|3197->1744|3295->1811|3352->1841|3385->1865|3424->1866|3568->1979|3621->2004|3902->2258|3917->2264|3990->2328|4030->2330|4072->2344|4141->2386|4156->2392|4367->2581|4408->2594|4497->2656|4512->2662|4721->2849|4762->2862|4851->2924|4866->2930|5077->3119|5118->3132|5207->3194|5222->3200|5374->3330|5415->3343|5504->3405|5519->3411|5641->3511|5682->3524|5808->3619|5849->3632|6211->3966|6227->3972|6322->4044|6426->4119|6456->4120|6493->4129|6550->4158|6579->4159
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|33->6|43->16|43->16|43->16|52->25|52->25|52->25|54->27|56->29|56->29|56->29|58->31|59->32|65->38|65->38|65->38|67->40|68->41|68->41|68->41|69->42|70->43|71->44|71->44|71->44|73->46|74->47|89->62|89->62|89->62|89->62|91->64|92->65|92->65|92->65|93->66|96->69|96->69|96->69|97->70|100->73|100->73|100->73|101->74|104->77|104->77|104->77|105->78|108->81|108->81|108->81|109->82|112->85|113->86|128->101|128->101|128->101|130->103|130->103|131->104|132->105|132->105
                  -- GENERATED --
              */
          