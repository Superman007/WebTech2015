// @SOURCE:/Users/Erman/Desktop/Webtech/conf/routes
// @HASH:64f9d520c95c7bc834f7e98a316cdc544849e3ca
// @DATE:Sun Jun 14 23:03:36 CEST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_impressum1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("impressum"))))
private[this] lazy val controllers_Application_impressum1_invoker = createInvoker(
controllers.Application.impressum(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "impressum", Nil,"GET", """""", Routes.prefix + """impressum"""))
        

// @LINE:8
private[this] lazy val controllers_Application_login2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login2_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:9
private[this] lazy val controllers_Application_einloggen3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_einloggen3_invoker = createInvoker(
controllers.Application.einloggen(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "einloggen", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:10
private[this] lazy val controllers_Application_registrierung4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registrierung"))))
private[this] lazy val controllers_Application_registrierung4_invoker = createInvoker(
controllers.Application.registrierung(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "registrierung", Nil,"GET", """""", Routes.prefix + """registrierung"""))
        

// @LINE:11
private[this] lazy val controllers_Application_registrieren5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registrierung"))))
private[this] lazy val controllers_Application_registrieren5_invoker = createInvoker(
controllers.Application.registrieren(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "registrieren", Nil,"POST", """""", Routes.prefix + """registrierung"""))
        

// @LINE:12
private[this] lazy val controllers_Application_suche6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suche"))))
private[this] lazy val controllers_Application_suche6_invoker = createInvoker(
controllers.Application.suche(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "suche", Nil,"GET", """""", Routes.prefix + """suche"""))
        

// @LINE:13
private[this] lazy val controllers_Application_fahrtSuchen7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suche"))))
private[this] lazy val controllers_Application_fahrtSuchen7_invoker = createInvoker(
controllers.Application.fahrtSuchen(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "fahrtSuchen", Nil,"POST", """""", Routes.prefix + """suche"""))
        

// @LINE:14
private[this] lazy val controllers_Application_anlegen8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anlegen"))))
private[this] lazy val controllers_Application_anlegen8_invoker = createInvoker(
controllers.Application.anlegen(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "anlegen", Nil,"GET", """""", Routes.prefix + """anlegen"""))
        

// @LINE:15
private[this] lazy val controllers_Application_fahrtAnlegen9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anlegen"))))
private[this] lazy val controllers_Application_fahrtAnlegen9_invoker = createInvoker(
controllers.Application.fahrtAnlegen(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "fahrtAnlegen", Nil,"POST", """""", Routes.prefix + """anlegen"""))
        

// @LINE:16
private[this] lazy val controllers_Socket_getData10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getData"))))
private[this] lazy val controllers_Socket_getData10_invoker = createInvoker(
controllers.Socket.getData(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Socket", "getData", Nil,"GET", """""", Routes.prefix + """getData"""))
        

// @LINE:17
private[this] lazy val controllers_Application_logout11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout11_invoker = createInvoker(
controllers.Application.logout(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:18
private[this] lazy val controllers_Socket_getData12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getData"))))
private[this] lazy val controllers_Socket_getData12_invoker = createInvoker(
controllers.Socket.getData(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Socket", "getData", Nil,"GET", """""", Routes.prefix + """getData"""))
        

// @LINE:23
private[this] lazy val controllers_Assets_at13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at13_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """impressum""","""controllers.Application.impressum()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.einloggen()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registrierung""","""controllers.Application.registrierung()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registrierung""","""controllers.Application.registrieren()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suche""","""controllers.Application.suche()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suche""","""controllers.Application.fahrtSuchen()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anlegen""","""controllers.Application.anlegen()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anlegen""","""controllers.Application.fahrtAnlegen()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getData""","""controllers.Socket.getData()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getData""","""controllers.Socket.getData()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_impressum1_route(params) => {
   call { 
        controllers_Application_impressum1_invoker.call(controllers.Application.impressum())
   }
}
        

// @LINE:8
case controllers_Application_login2_route(params) => {
   call { 
        controllers_Application_login2_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:9
case controllers_Application_einloggen3_route(params) => {
   call { 
        controllers_Application_einloggen3_invoker.call(controllers.Application.einloggen())
   }
}
        

// @LINE:10
case controllers_Application_registrierung4_route(params) => {
   call { 
        controllers_Application_registrierung4_invoker.call(controllers.Application.registrierung())
   }
}
        

// @LINE:11
case controllers_Application_registrieren5_route(params) => {
   call { 
        controllers_Application_registrieren5_invoker.call(controllers.Application.registrieren())
   }
}
        

// @LINE:12
case controllers_Application_suche6_route(params) => {
   call { 
        controllers_Application_suche6_invoker.call(controllers.Application.suche())
   }
}
        

// @LINE:13
case controllers_Application_fahrtSuchen7_route(params) => {
   call { 
        controllers_Application_fahrtSuchen7_invoker.call(controllers.Application.fahrtSuchen())
   }
}
        

// @LINE:14
case controllers_Application_anlegen8_route(params) => {
   call { 
        controllers_Application_anlegen8_invoker.call(controllers.Application.anlegen())
   }
}
        

// @LINE:15
case controllers_Application_fahrtAnlegen9_route(params) => {
   call { 
        controllers_Application_fahrtAnlegen9_invoker.call(controllers.Application.fahrtAnlegen())
   }
}
        

// @LINE:16
case controllers_Socket_getData10_route(params) => {
   call { 
        controllers_Socket_getData10_invoker.call(controllers.Socket.getData())
   }
}
        

// @LINE:17
case controllers_Application_logout11_route(params) => {
   call { 
        controllers_Application_logout11_invoker.call(controllers.Application.logout())
   }
}
        

// @LINE:18
case controllers_Socket_getData12_route(params) => {
   call { 
        controllers_Socket_getData12_invoker.call(controllers.Socket.getData())
   }
}
        

// @LINE:23
case controllers_Assets_at13_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at13_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     