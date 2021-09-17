package micropay

import org.scalatra._

class MicroPayServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
