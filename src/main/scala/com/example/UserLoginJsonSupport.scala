package com.example

import spray.httpx.SprayJsonSupport
import spray.json.DefaultJsonProtocol

object UserLoginJsonSupport extends DefaultJsonProtocol with SprayJsonSupport {
  implicit val PortofolioFormats = jsonFormat2(UserLogin)
}
