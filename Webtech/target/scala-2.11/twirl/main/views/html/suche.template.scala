
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
object suche extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Form[Fahrt],String,List[Fahrt],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, fahrtForm: Form[Fahrt], status: String, fahrtListe: List[Fahrt]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.84*/("""

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
            <h1>Suche</h1>
            <!-- Suchen Felder -->
            """),_display_(/*62.14*/helper/*62.20*/.form(action=routes.Application.fahrtSuchen(), 'role -> "form" ,'id -> "suchenForm")/*62.104*/ {_display_(Seq[Any](format.raw/*62.106*/("""

            """),format.raw/*64.13*/("""<div class="form-group">
                """),_display_(/*65.18*/helper/*65.24*/.inputText(fahrtForm("startAdresse"), 'class -> "form-control", 'id -> "startadresse", '_showConstraints -> false)),format.raw/*65.138*/("""
            """),format.raw/*66.13*/("""</div>

            <div class="form-group">
                """),_display_(/*69.18*/helper/*69.24*/.inputText(fahrtForm("zielAdresse"), 'class -> "form-control", 'id -> "zieladresse", '_showConstraints -> false)),format.raw/*69.136*/("""
            """),format.raw/*70.13*/("""</div>

            <div class="form-group">
                """),_display_(/*73.18*/helper/*73.24*/.inputText(fahrtForm("datum"), 'class -> "form-control", 'id -> "datum", '_showConstraints -> false)),format.raw/*73.124*/("""
            """),format.raw/*74.13*/("""</div>
            <!-- DateTimePickerEnd -->
            <input type="submit" id="suchen" class="btn btn-default" value="Suchen">
            """)))}),format.raw/*77.14*/("""
            """),format.raw/*78.13*/("""<div class ="form-group">

            </div>
            <!-- Felder Ende -->
            <!-- Suche Anfang -->
            """),_display_(/*83.14*/for(fahrt <- fahrtListe) yield /*83.38*/{_display_(Seq[Any](format.raw/*83.39*/("""

            """),format.raw/*85.13*/("""<div class ="form-group">
                <li>
                    Startadresse: """),_display_(/*87.36*/fahrt/*87.41*/.getStartAdresse()),format.raw/*87.59*/("""<br>
                    Zieladresse: """),_display_(/*88.35*/fahrt/*88.40*/.getZielAdresse()),format.raw/*88.57*/(""" """),format.raw/*88.58*/("""<br>
                    Ueber: """),_display_(/*89.29*/fahrt/*89.34*/.getZweitAdresse()),format.raw/*89.52*/(""" """),format.raw/*89.53*/("""<br>
                    Freie Plaetze: """),_display_(/*90.37*/fahrt/*90.42*/.freiePlaetze(fahrt)),format.raw/*90.62*/(""" """),format.raw/*90.63*/("""<br>
                    Datum: """),_display_(/*91.29*/fahrt/*91.34*/.getDatum()),format.raw/*91.45*/("""
                """),format.raw/*92.17*/("""</li>
            </div>
            <button onclick="buchen("""),_display_(/*94.38*/fahrt/*94.43*/.getId()),format.raw/*94.51*/(""")" class="btn btn-default">Buchen</button>

            <!-- Suche Ende -->
            """)))}),format.raw/*97.14*/("""
        """),format.raw/*98.9*/("""</div>
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
<script type="text/javascript" src=""""),_display_(/*112.38*/routes/*112.44*/.Assets.at("javascripts/datetimepicker-master/jquery.datetimepicker.js")),format.raw/*112.116*/(""""></script>
<script type="text/javascript">
                $('#datum').datetimepicker("""),format.raw/*114.44*/("""{"""),format.raw/*114.45*/("""
                    """),format.raw/*115.21*/("""mask: '9999/19/39 29:59'
                """),format.raw/*116.17*/("""}"""),format.raw/*116.18*/(""");</script>
<script type="text/javascript">
    var webSocket;
    $(function() """),format.raw/*119.18*/("""{"""),format.raw/*119.19*/("""
        """),format.raw/*120.9*/("""var WS = window["MozWebSocket"] ? MozWebSocket : WebSocket;
        webSocket = new WS(""""),_display_(/*121.30*/routes/*121.36*/.Socket.getData().webSocketURL(request)),format.raw/*121.75*/("""");
        webSocket.onmessage = receiveEvent;
    """),format.raw/*123.5*/("""}"""),format.raw/*123.6*/(""");
    function buchen(id) """),format.raw/*124.25*/("""{"""),format.raw/*124.26*/("""
        """),format.raw/*125.9*/("""webSocket.send("" + id);
    """),format.raw/*126.5*/("""}"""),format.raw/*126.6*/(""";
    
    function receiveEvent(event) """),format.raw/*128.34*/("""{"""),format.raw/*128.35*/("""
        """),format.raw/*129.9*/("""if (event.data == "reload") """),format.raw/*129.37*/("""{"""),format.raw/*129.38*/("""
            """),format.raw/*130.13*/("""document.getElementById("suchenForm").submit();
        """),format.raw/*131.9*/("""}"""),format.raw/*131.10*/(""" """),format.raw/*131.11*/("""else """),format.raw/*131.16*/("""{"""),format.raw/*131.17*/("""
            """),format.raw/*132.13*/("""window.location = """"),_display_(/*132.33*/routes/*132.39*/.Application.suche()),format.raw/*132.59*/("""";
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/("""
    """),format.raw/*134.5*/("""}"""),format.raw/*134.6*/(""";
</script>
<script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDkNEdEbvin0IJRl2si8FQmqd2uYJt-y3w">
    </script>
    <script type="text/javascript">
      function initialize() """),format.raw/*140.29*/("""{"""),format.raw/*140.30*/("""
        """),format.raw/*141.9*/("""var mapOptions = """),format.raw/*141.26*/("""{"""),format.raw/*141.27*/("""
          """),format.raw/*142.11*/("""center: """),format.raw/*142.19*/("""{"""),format.raw/*142.20*/(""" """),format.raw/*142.21*/("""lat: -34.397, lng: 150.644"""),format.raw/*142.47*/("""}"""),format.raw/*142.48*/(""",
          zoom: 8
        """),format.raw/*144.9*/("""}"""),format.raw/*144.10*/(""";
        var map = new google.maps.Map(document.getElementById('map-canvas'),
            mapOptions);
      """),format.raw/*147.7*/("""}"""),format.raw/*147.8*/("""
      """),format.raw/*148.7*/("""google.maps.event.addDomListener(window, 'load', initialize);
    </script>

<script>
    function loadIt() """),format.raw/*152.23*/("""{"""),format.raw/*152.24*/("""
        """),format.raw/*153.9*/("""var daten = """),format.raw/*153.21*/("""{"""),format.raw/*153.22*/("""
            """),format.raw/*154.13*/(""""startAdresse": document.getElementById("startadresse").value,
            "zielAdresse": document.getElementById("zieladresse").value,
            "datum": document.getElementById("datum").value
        """),format.raw/*157.9*/("""}"""),format.raw/*157.10*/(""";


        $.ajax("""),format.raw/*160.16*/("""{"""),format.raw/*160.17*/("""
            """),format.raw/*161.13*/("""url: "/suche",
            type: "POST",
            dataType: "text",
            data: daten,
            success: function(daten) """),format.raw/*165.38*/("""{"""),format.raw/*165.39*/("""
                """),format.raw/*166.17*/("""$("#ausgeben").html(daten);
            """),format.raw/*167.13*/("""}"""),format.raw/*167.14*/("""
        """),format.raw/*168.9*/("""}"""),format.raw/*168.10*/(""");
    """),format.raw/*169.5*/("""}"""),format.raw/*169.6*/("""
"""),format.raw/*170.1*/("""</script>


""")))}))}
  }

  def render(message:String,fahrtForm:Form[Fahrt],status:String,fahrtListe:List[Fahrt]): play.twirl.api.HtmlFormat.Appendable = apply(message,fahrtForm,status,fahrtListe)

  def f:((String,Form[Fahrt],String,List[Fahrt]) => play.twirl.api.HtmlFormat.Appendable) = (message,fahrtForm,status,fahrtListe) => apply(message,fahrtForm,status,fahrtListe)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 15 16:35:10 CEST 2015
                  SOURCE: /Users/philippkoppenhagen/Documents/Webtech/app/views/suche.scala.html
                  HASH: e668ee15f32d96c1ca00614dd2b8e6b11f8b31de
                  MATRIX: 754->1|939->83|967->102|994->104|1019->121|1057->122|1084->123|1627->639|1642->645|1697->679|2021->976|2054->1000|2093->1001|2206->1083|2256->1106|2289->1130|2328->1131|2445->1217|2494->1238|2846->1563|2879->1587|2918->1588|3047->1686|3104->1716|3137->1740|3176->1741|3233->1770|3331->1837|3388->1867|3421->1891|3460->1892|3604->2005|3657->2030|3934->2280|3949->2286|4043->2370|4084->2372|4126->2386|4195->2428|4210->2434|4346->2548|4387->2561|4476->2623|4491->2629|4625->2741|4666->2754|4755->2816|4770->2822|4892->2922|4933->2935|5108->3079|5149->3092|5302->3218|5342->3242|5381->3243|5423->3257|5532->3339|5546->3344|5585->3362|5651->3401|5665->3406|5703->3423|5732->3424|5792->3457|5806->3462|5845->3480|5874->3481|5942->3522|5956->3527|5997->3547|6026->3548|6086->3581|6100->3586|6132->3597|6177->3614|6266->3676|6280->3681|6309->3689|6429->3778|6465->3787|6791->4085|6807->4091|6902->4163|7018->4250|7048->4251|7098->4272|7168->4313|7198->4314|7307->4394|7337->4395|7374->4404|7491->4493|7507->4499|7568->4538|7648->4590|7677->4591|7733->4618|7763->4619|7800->4628|7857->4657|7886->4658|7955->4698|7985->4699|8022->4708|8079->4736|8109->4737|8151->4750|8235->4806|8265->4807|8295->4808|8329->4813|8359->4814|8401->4827|8449->4847|8465->4853|8507->4873|8546->4884|8576->4885|8609->4890|8638->4891|8885->5109|8915->5110|8952->5119|8998->5136|9028->5137|9068->5148|9105->5156|9135->5157|9165->5158|9220->5184|9250->5185|9306->5213|9336->5214|9474->5324|9503->5325|9538->5332|9675->5440|9705->5441|9742->5450|9783->5462|9813->5463|9855->5476|10087->5680|10117->5681|10165->5700|10195->5701|10237->5714|10399->5847|10429->5848|10475->5865|10544->5905|10574->5906|10611->5915|10641->5916|10676->5923|10705->5924|10734->5925
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|33->6|43->16|43->16|43->16|53->26|53->26|53->26|55->28|57->30|57->30|57->30|59->32|60->33|66->39|66->39|66->39|68->41|69->42|69->42|69->42|70->43|71->44|72->45|72->45|72->45|74->47|75->48|89->62|89->62|89->62|89->62|91->64|92->65|92->65|92->65|93->66|96->69|96->69|96->69|97->70|100->73|100->73|100->73|101->74|104->77|105->78|110->83|110->83|110->83|112->85|114->87|114->87|114->87|115->88|115->88|115->88|115->88|116->89|116->89|116->89|116->89|117->90|117->90|117->90|117->90|118->91|118->91|118->91|119->92|121->94|121->94|121->94|124->97|125->98|139->112|139->112|139->112|141->114|141->114|142->115|143->116|143->116|146->119|146->119|147->120|148->121|148->121|148->121|150->123|150->123|151->124|151->124|152->125|153->126|153->126|155->128|155->128|156->129|156->129|156->129|157->130|158->131|158->131|158->131|158->131|158->131|159->132|159->132|159->132|159->132|160->133|160->133|161->134|161->134|167->140|167->140|168->141|168->141|168->141|169->142|169->142|169->142|169->142|169->142|169->142|171->144|171->144|174->147|174->147|175->148|179->152|179->152|180->153|180->153|180->153|181->154|184->157|184->157|187->160|187->160|188->161|192->165|192->165|193->166|194->167|194->167|195->168|195->168|196->169|196->169|197->170
                  -- GENERATED --
              */
          