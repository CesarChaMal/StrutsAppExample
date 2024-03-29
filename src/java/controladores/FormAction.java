package controladores;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class FormAction extends Action
{
  private final static String SUCCESS = "success";

  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
    Form formExample = (Form) form;
    System.out.println(formExample.getName());
    return mapping.findForward(SUCCESS);
  }
}