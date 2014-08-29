/*c est quoi cette bordel de merdel,bordel controller */

package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {


  def index = Action {
    Ok(views.html.index("superbe journee"))
  }

}