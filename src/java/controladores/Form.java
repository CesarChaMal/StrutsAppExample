package controladores;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

public class Form extends ActionForm
{
  private String name=null;

  public void setName(String name){
    this.name=name;
  }

  public String getName(){
    return this.name;
  }

  public void reset(ActionMapping mapping, HttpServletRequest request) {
    this.name=null;
  }

  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
      ActionErrors errors = new ActionErrors();

      if( getName() == null || getName().length() < 1 ) {
        errors.add("name",new ActionMessage("error.name.required"));
      }

      return errors;
  }
}