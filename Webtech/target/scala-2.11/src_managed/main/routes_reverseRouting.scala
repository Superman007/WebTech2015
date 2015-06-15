// @SOURCE:/Users/Erman/Desktop/Webtech/conf/routes
// @HASH:64f9d520c95c7bc834f7e98a316cdc544849e3ca
// @DATE:Sun Jun 14 23:03:36 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:23
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:18
// @LINE:16
class ReverseSocket {


// @LINE:18
// @LINE:16
def getData(): Call = {
   () match {
// @LINE:16
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "getData")
                                         
   }
}
                                                

}
                          

// @LINE:23
class ReverseAssets {


// @LINE:23
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def registrieren(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "registrierung")
}
                        

// @LINE:10
def registrierung(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "registrierung")
}
                        

// @LINE:12
def suche(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "suche")
}
                        

// @LINE:13
def fahrtSuchen(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "suche")
}
                        

// @LINE:7
def impressum(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "impressum")
}
                        

// @LINE:14
def anlegen(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "anlegen")
}
                        

// @LINE:17
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:15
def fahrtAnlegen(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "anlegen")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:9
def einloggen(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:8
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:23
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:18
// @LINE:16
class ReverseSocket {


// @LINE:18
// @LINE:16
def getData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Socket.getData",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getData"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getData"})
      }
      }
   """
)
                        

}
              

// @LINE:23
class ReverseAssets {


// @LINE:23
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def registrieren : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registrieren",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registrierung"})
      }
   """
)
                        

// @LINE:10
def registrierung : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registrierung",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registrierung"})
      }
   """
)
                        

// @LINE:12
def suche : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.suche",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suche"})
      }
   """
)
                        

// @LINE:13
def fahrtSuchen : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.fahrtSuchen",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suche"})
      }
   """
)
                        

// @LINE:7
def impressum : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.impressum",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "impressum"})
      }
   """
)
                        

// @LINE:14
def anlegen : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.anlegen",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "anlegen"})
      }
   """
)
                        

// @LINE:17
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:15
def fahrtAnlegen : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.fahrtAnlegen",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "anlegen"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def einloggen : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.einloggen",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:8
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:23
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:18
// @LINE:16
class ReverseSocket {


// @LINE:16
def getData(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Socket.getData(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Socket", "getData", Seq(), "GET", """""", _prefix + """getData""")
)
                      

}
                          

// @LINE:23
class ReverseAssets {


// @LINE:23
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def registrieren(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registrieren(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "registrieren", Seq(), "POST", """""", _prefix + """registrierung""")
)
                      

// @LINE:10
def registrierung(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registrierung(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "registrierung", Seq(), "GET", """""", _prefix + """registrierung""")
)
                      

// @LINE:12
def suche(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.suche(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "suche", Seq(), "GET", """""", _prefix + """suche""")
)
                      

// @LINE:13
def fahrtSuchen(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.fahrtSuchen(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "fahrtSuchen", Seq(), "POST", """""", _prefix + """suche""")
)
                      

// @LINE:7
def impressum(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.impressum(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "impressum", Seq(), "GET", """""", _prefix + """impressum""")
)
                      

// @LINE:14
def anlegen(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.anlegen(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "anlegen", Seq(), "GET", """""", _prefix + """anlegen""")
)
                      

// @LINE:17
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:15
def fahrtAnlegen(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.fahrtAnlegen(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "fahrtAnlegen", Seq(), "POST", """""", _prefix + """anlegen""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def einloggen(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.einloggen(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "einloggen", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:8
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          
}
        
    