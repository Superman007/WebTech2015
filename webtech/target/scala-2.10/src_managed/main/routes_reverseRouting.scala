// @SOURCE:/Users/philippkoppenhagen/Documents/Webtech/conf/routes
// @HASH:ea1f05c7dee4f12a79fe75ed0522d98e851b2fb4
// @DATE:Thu Apr 23 12:04:10 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

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
case () if true => Call("GET", _prefix + { _defaultPrefix } + "getData")
                                                        
// @LINE:18
case () if true => Call("GET", _prefix + { _defaultPrefix } + "getData")
                                                        
   }
}
                                                
    
}
                          

// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at(file:String): Call = {
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
   Call("POST", _prefix + { _defaultPrefix } + "registrierung")
}
                                                

// @LINE:10
def registrierung(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "registrierung")
}
                                                

// @LINE:12
def suche(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "suche")
}
                                                

// @LINE:13
def fahrtSuchen(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "suche")
}
                                                

// @LINE:7
def impressum(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "impressum")
}
                                                

// @LINE:14
def anlegen(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "anlegen")
}
                                                

// @LINE:17
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:15
def fahrtAnlegen(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "anlegen")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:9
def einloggen(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:8
def login(): Call = {
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
   controllers.Socket.getData(), HandlerDef(this, "controllers.Socket", "getData", Seq(), "GET", """""", _prefix + """getData""")
)
                      
    
}
                          

// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
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
   controllers.Application.registrieren(), HandlerDef(this, "controllers.Application", "registrieren", Seq(), "POST", """""", _prefix + """registrierung""")
)
                      

// @LINE:10
def registrierung(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registrierung(), HandlerDef(this, "controllers.Application", "registrierung", Seq(), "GET", """""", _prefix + """registrierung""")
)
                      

// @LINE:12
def suche(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.suche(), HandlerDef(this, "controllers.Application", "suche", Seq(), "GET", """""", _prefix + """suche""")
)
                      

// @LINE:13
def fahrtSuchen(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.fahrtSuchen(), HandlerDef(this, "controllers.Application", "fahrtSuchen", Seq(), "POST", """""", _prefix + """suche""")
)
                      

// @LINE:7
def impressum(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.impressum(), HandlerDef(this, "controllers.Application", "impressum", Seq(), "GET", """""", _prefix + """impressum""")
)
                      

// @LINE:14
def anlegen(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.anlegen(), HandlerDef(this, "controllers.Application", "anlegen", Seq(), "GET", """""", _prefix + """anlegen""")
)
                      

// @LINE:17
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:15
def fahrtAnlegen(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.fahrtAnlegen(), HandlerDef(this, "controllers.Application", "fahrtAnlegen", Seq(), "POST", """""", _prefix + """anlegen""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def einloggen(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.einloggen(), HandlerDef(this, "controllers.Application", "einloggen", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:8
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    