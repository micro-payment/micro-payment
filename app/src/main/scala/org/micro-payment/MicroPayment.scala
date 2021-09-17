package org.micro-payment

import org.scalatra._

class MicroPayment extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
