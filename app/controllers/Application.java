package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Alumni;
import views.html.Contact;
import views.html.Facultystaff;
import views.html.Index;
import views.html.Studentsparents;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render());
  }

  /**
   * Returns the Student / Parents page.
   * @return The resulting Student / Parents page.
   */
  public static Result studentsParents() {
    return ok(Studentsparents.render());
  }

  /**
   * Returns the Faculty / Staff page.
   * @return The resulting Faculty / Staff page.
   */
  public static Result facultyStaff() {
    return ok(Facultystaff.render());
  }

  /**
   * Returns the Alumni page.
   * @return The resulting Alumni page.
   */
  public static Result alumni() {
    return ok(Alumni.render());
  }

  /**
   * Returns the Contact page.
   * @return The resulting Contact page.
   */
  public static Result contact() {
    return ok(Contact.render());
  }



}
