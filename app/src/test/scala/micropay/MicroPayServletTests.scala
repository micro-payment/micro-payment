package micropay

import org.scalatra.test.scalatest._

class MicroPayServletTests extends ScalatraFunSuite {

  addServlet(classOf[MicroPayServlet], "/*")

  test("GET / on MicroPayServlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
