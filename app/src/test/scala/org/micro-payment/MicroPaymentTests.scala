package org.micro-payment

import org.scalatra.test.scalatest._

class MicroPaymentTests extends ScalatraFunSuite {

  addServlet(classOf[MicroPayment], "/*")

  test("GET / on MicroPayment should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
