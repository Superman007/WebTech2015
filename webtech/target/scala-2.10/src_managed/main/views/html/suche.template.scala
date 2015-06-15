
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
object suche extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Form[Fahrt],String,List[Fahrt],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String, fahrtForm: Form[Fahrt], status: String, fahrtListe: List[Fahrt]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.84*/("""

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
            <h1>Suche</h1>
            <!-- Suchen Felder -->
            """),_display_(Seq[Any](/*62.14*/helper/*62.20*/.form(action=routes.Application.fahrtSuchen(), 'role -> "form" ,'id -> "suchenForm")/*62.104*/ {_display_(Seq[Any](format.raw/*62.106*/("""

            <div class="form-group">
                """),_display_(Seq[Any](/*65.18*/helper/*65.24*/.inputText(fahrtForm("startAdresse"), 'class -> "form-control", 'id -> "startadresse", '_showConstraints -> false))),format.raw/*65.138*/("""
            </div>

            <div class="form-group">
                """),_display_(Seq[Any](/*69.18*/helper/*69.24*/.inputText(fahrtForm("zielAdresse"), 'class -> "form-control", 'id -> "zieladresse", '_showConstraints -> false))),format.raw/*69.136*/("""
            </div>

            <div class="form-group">
                """),_display_(Seq[Any](/*73.18*/helper/*73.24*/.inputText(fahrtForm("datum"), 'class -> "form-control", 'id -> "datum", '_showConstraints -> false))),format.raw/*73.124*/("""
            </div>
            <!-- DateTimePickerEnd -->
            <input type="submit" id="suchen" class="btn btn-default" value="Suchen">
            """)))})),format.raw/*77.14*/("""
            <div class ="form-group">

            </div>
            <!-- Felder Ende -->
            <!-- Suche Anfang -->
            """),_display_(Seq[Any](/*83.14*/for(fahrt <- fahrtListe) yield /*83.38*/{_display_(Seq[Any](format.raw/*83.39*/("""

            <div class ="form-group">
                <li>
                    Startadresse: """),_display_(Seq[Any](/*87.36*/fahrt/*87.41*/.getStartAdresse())),format.raw/*87.59*/("""<br>
                    Zieladresse: """),_display_(Seq[Any](/*88.35*/fahrt/*88.40*/.getZielAdresse())),format.raw/*88.57*/(""" <br>
                    Über: """),_display_(Seq[Any](/*89.28*/fahrt/*89.33*/.getZweitAdresse())),format.raw/*89.51*/(""" <br>
                    Freie Plätze: """),_display_(Seq[Any](/*90.36*/fahrt/*90.41*/.freiePlätze(fahrt))),format.raw/*90.60*/(""" <br>
                    Datum: """),_display_(Seq[Any](/*91.29*/fahrt/*91.34*/.getDatum())),format.raw/*91.45*/("""
                </li>
            </div>
            <button onclick="buchen("""),_display_(Seq[Any](/*94.38*/fahrt/*94.43*/.getId())),format.raw/*94.51*/(""")" class="btn btn-default">Buchen</button>

            <!-- Suche Ende -->
            """)))})),format.raw/*97.14*/("""
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
<script type="text/javascript" src=""""),_display_(Seq[Any](/*112.38*/routes/*112.44*/.Assets.at("javascripts/datetimepicker-master/jquery.datetimepicker.js"))),format.raw/*112.116*/(""""></script>
<script type="text/javascript">
                $('#datum').datetimepicker("""),format.raw/*114.44*/("""{"""),format.raw/*114.45*/("""
                    mask: '9999/19/39 29:59'
                """),format.raw/*116.17*/("""}"""),format.raw/*116.18*/(""");</script>
<script type="text/javascript">
    var webSocket;
    $(function() """),format.raw/*119.18*/("""{"""),format.raw/*119.19*/("""
        var WS = window["MozWebSocket"] ? MozWebSocket : WebSocket;
        webSocket = new WS(""""),_display_(Seq[Any](/*121.30*/routes/*121.36*/.Socket.getData().webSocketURL(request))),format.raw/*121.75*/("""");
        webSocket.onmessage = receiveEvent;
    """),format.raw/*123.5*/("""}"""),format.raw/*123.6*/(""");
    function buchen(id) """),format.raw/*124.25*/("""{"""),format.raw/*124.26*/("""
        webSocket.send("" + id);
    """),format.raw/*126.5*/("""}"""),format.raw/*126.6*/(""";
    
    function receiveEvent(event) """),format.raw/*128.34*/("""{"""),format.raw/*128.35*/("""
        if (event.data == "reload") """),format.raw/*129.37*/("""{"""),format.raw/*129.38*/("""
            document.getElementById("suchenForm").submit();
        """),format.raw/*131.9*/("""}"""),format.raw/*131.10*/(""" else """),format.raw/*131.16*/("""{"""),format.raw/*131.17*/("""
            window.location = """"),_display_(Seq[Any](/*132.33*/routes/*132.39*/.Application.suche())),format.raw/*132.59*/("""";
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/("""
    """),format.raw/*134.5*/("""}"""),format.raw/*134.6*/(""";
</script>

<script>
    function loadIt() """),format.raw/*138.23*/("""{"""),format.raw/*138.24*/("""
        var daten = """),format.raw/*139.21*/("""{"""),format.raw/*139.22*/("""
            "startAdresse": document.getElementById("startadresse").value,
            "zielAdresse": document.getElementById("zieladresse").value,
            "datum": document.getElementById("datum").value
        """),format.raw/*143.9*/("""}"""),format.raw/*143.10*/(""";


        $.ajax("""),format.raw/*146.16*/("""{"""),format.raw/*146.17*/("""
            url: "/suche",
            type: "POST",
            dataType: "text",
            data: daten,
            success: function(daten) """),format.raw/*151.38*/("""{"""),format.raw/*151.39*/("""
                $("#ausgeben").html(daten);
            """),format.raw/*153.13*/("""}"""),format.raw/*153.14*/("""
        """),format.raw/*154.9*/("""}"""),format.raw/*154.10*/(""");
    """),format.raw/*155.5*/("""}"""),format.raw/*155.6*/("""
</script>


""")))})))}
    }
    
    def render(message:String,fahrtForm:Form[Fahrt],status:String,fahrtListe:List[Fahrt]): play.api.templates.HtmlFormat.Appendable = apply(message,fahrtForm,status,fahrtListe)
    
    def f:((String,Form[Fahrt],String,List[Fahrt]) => play.api.templates.HtmlFormat.Appendable) = (message,fahrtForm,status,fahrtListe) => apply(message,fahrtForm,status,fahrtListe)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Apr 23 12:04:13 CEST 2015
                    SOURCE: /Users/philippkoppenhagen/Documents/Webtech/app/views/suche.scala.html
                    HASH: 2b1aea3601dc88487f9be76e7dcec945f6abc4ef
                    MATRIX: 805->1|997->83|1025->102|1061->104|1089->124|1127->125|1680->642|1695->648|1762->692|2095->989|2128->1013|2167->1014|2281->1096|2340->1119|2373->1143|2412->1144|2530->1230|2912->1576|2945->1600|2984->1601|3114->1699|3180->1729|3213->1753|3252->1754|3380->1850|3446->1880|3479->1904|3518->1905|3663->2018|3974->2293|3989->2299|4083->2383|4124->2385|4216->2441|4231->2447|4368->2561|4479->2636|4494->2642|4629->2754|4740->2829|4755->2835|4878->2935|5067->3092|5242->3231|5282->3255|5321->3256|5453->3352|5467->3357|5507->3375|5582->3414|5596->3419|5635->3436|5704->3469|5718->3474|5758->3492|5835->3533|5849->3538|5890->3557|5960->3591|5974->3596|6007->3607|6122->3686|6136->3691|6166->3699|6287->3788|6634->4098|6650->4104|6746->4176|6862->4263|6892->4264|6983->4326|7013->4327|7122->4407|7152->4408|7287->4506|7303->4512|7365->4551|7445->4603|7474->4604|7530->4631|7560->4632|7626->4670|7655->4671|7724->4711|7754->4712|7820->4749|7850->4750|7947->4819|7977->4820|8012->4826|8042->4827|8112->4860|8128->4866|8171->4886|8210->4897|8240->4898|8273->4903|8302->4904|8375->4948|8405->4949|8455->4970|8485->4971|8730->5188|8760->5189|8808->5208|8838->5209|9013->5355|9043->5356|9129->5413|9159->5414|9196->5423|9226->5424|9261->5431|9290->5432
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|44->16|44->16|44->16|54->26|54->26|54->26|56->28|58->30|58->30|58->30|60->32|67->39|67->39|67->39|69->41|70->42|70->42|70->42|72->44|73->45|73->45|73->45|75->47|90->62|90->62|90->62|90->62|93->65|93->65|93->65|97->69|97->69|97->69|101->73|101->73|101->73|105->77|111->83|111->83|111->83|115->87|115->87|115->87|116->88|116->88|116->88|117->89|117->89|117->89|118->90|118->90|118->90|119->91|119->91|119->91|122->94|122->94|122->94|125->97|140->112|140->112|140->112|142->114|142->114|144->116|144->116|147->119|147->119|149->121|149->121|149->121|151->123|151->123|152->124|152->124|154->126|154->126|156->128|156->128|157->129|157->129|159->131|159->131|159->131|159->131|160->132|160->132|160->132|161->133|161->133|162->134|162->134|166->138|166->138|167->139|167->139|171->143|171->143|174->146|174->146|179->151|179->151|181->153|181->153|182->154|182->154|183->155|183->155
                    -- GENERATED --
                */
            