package micropay

import org.scalatra._

import scala.xml._

class MicroPayServlet extends ScalatraServlet {

  private def displayPage(title:String, content:Seq[Node]): Elem = {
    <html lang="en">
      <head>
        <title>{ title }</title>
        <meta charset="utf-8" />
      </head>

      <body>
        {content}
      </body>

    </html>
  }


  get("/") {
    views.html.hello()
    "Hello Micropayment\nFor more info see: https://micro-payment.github.io/micro-payment/"
    displayPage("Scalatra: Form Post Example",
      <pre> Register as new user</pre>
      <form action={url("/post")} method='POST'>
        email: <input name="email" type='text'/>
        <p></p>
        password: <input name="pwd" type='password'/>
        <p></p>
        <input type='submit'/>
      </form>
        <pre>Read our mission statement at </pre> <a href={fullUrl("https://micro-payment.github.io/micro-payment/")}>MicroPayment</a>
    )
  }

  post("/post") {
    displayPage("Scalatra: Form Post Example",
      <p>Welcome: {params("email")}</p>
    )
  }

}
