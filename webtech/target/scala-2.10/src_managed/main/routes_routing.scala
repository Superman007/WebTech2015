// @SOURCE:/Users/philippkoppenhagen/Documents/Webtech/conf/routes
// @HASH:ea1f05c7dee4f12a79fe75ed0522d98e851b2fb4
// @DATE:Thu Apr 23 12:04:10 CEST 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_impressum1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("impressum"))))
        

// @LINE:8
private[this] lazy val controllers_Application_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:9
private[this] lazy val controllers_Application_einloggen3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_registrierung4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registrierung"))))
        

// @LINE:11
private[this] lazy val controllers_Application_registrieren5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registrierung"))))
        

// @LINE:12
private[this] lazy val controllers_Application_suche6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suche"))))
        

// @LINE:13
private[this] lazy val controllers_Application_fahrtSuchen7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suche"))))
        

// @LINE:14
private[this] lazy val controllers_Application_anlegen8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anlegen"))))
        

// @LINE:15
private[this] lazy val controllers_Application_fahrtAnlegen9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anlegen"))))
        

// @LINE:16
private[this] lazy val controllers_Socket_getData10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getData"))))
        

// @LINE:17
private[this] lazy val controllers_Application_logout11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:18
private[this] lazy val controllers_Socket_getData12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getData"))))
        

// @LINE:23
private[this] lazy val controllers_Assets_at13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """impressum""","""controllers.Application.impressum()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.einloggen()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registrierung""","""controllers.Application.registrierung()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registrierung""","""controllers.Application.registrieren()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suche""","""controllers.Application.suche()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suche""","""controllers.Application.fahrtSuchen()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anlegen""","""controllers.Application.anlegen()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anlegen""","""controllers.Application.fahrtAnlegen()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getData""","""controllers.Socket.getData()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getData""","""controllers.Socket.getData()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_impressum1(params) => {
   call { 
        invokeHandler(controllers.Application.impressum(), HandlerDef(this, "controllers.Application", "impressum", Nil,"GET", """""", Routes.prefix + """impressum"""))
   }
}
        

// @LINE:8
case controllers_Application_login2(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:9
case controllers_Application_einloggen3(params) => {
   call { 
        invokeHandler(controllers.Application.einloggen(), HandlerDef(this, "controllers.Application", "einloggen", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_registrierung4(params) => {
   call { 
        invokeHandler(controllers.Application.registrierung(), HandlerDef(this, "controllers.Application", "registrierung", Nil,"GET", """""", Routes.prefix + """registrierung"""))
   }
}
        

// @LINE:11
case controllers_Application_registrieren5(params) => {
   call { 
        invokeHandler(controllers.Application.registrieren(), HandlerDef(this, "controllers.Application", "registrieren", Nil,"POST", """""", Routes.prefix + """registrierung"""))
   }
}
        

// @LINE:12
case controllers_Application_suche6(params) => {
   call { 
        invokeHandler(controllers.Application.suche(), HandlerDef(this, "controllers.Application", "suche", Nil,"GET", """""", Routes.prefix + """suche"""))
   }
}
        

// @LINE:13
case controllers_Application_fahrtSuchen7(params) => {
   call { 
        invokeHandler(controllers.Application.fahrtSuchen(), HandlerDef(this, "controllers.Application", "fahrtSuchen", Nil,"POST", """""", Routes.prefix + """suche"""))
   }
}
        

// @LINE:14
case controllers_Application_anlegen8(params) => {
   call { 
        invokeHandler(controllers.Application.anlegen(), HandlerDef(this, "controllers.Application", "anlegen", Nil,"GET", """""", Routes.prefix + """anlegen"""))
   }
}
        

// @LINE:15
case controllers_Application_fahrtAnlegen9(params) => {
   call { 
        invokeHandler(controllers.Application.fahrtAnlegen(), HandlerDef(this, "controllers.Application", "fahrtAnlegen", Nil,"POST", """""", Routes.prefix + """anlegen"""))
   }
}
        

// @LINE:16
case controllers_Socket_getData10(params) => {
   call { 
        invokeHandler(controllers.Socket.getData(), HandlerDef(this, "controllers.Socket", "getData", Nil,"GET", """""", Routes.prefix + """getData"""))
   }
}
        

// @LINE:17
case controllers_Application_logout11(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:18
case controllers_Socket_getData12(params) => {
   call { 
        invokeHandler(controllers.Socket.getData(), HandlerDef(this, "controllers.Socket", "getData", Nil,"GET", """""", Routes.prefix + """getData"""))
   }
}
        

// @LINE:23
case controllers_Assets_at13(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     