package a8.faces.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.primefaces.util.ComponentUtils;

@FacesValidator("customValidator")
public class CustomValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		System.out.println("CustomValidator.validate()");
		
		
		String tabelaCompetenciasId = ComponentUtils.findComponentClientId("engine");
		final FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Error!");
		FacesContext.getCurrentInstance().addMessage(tabelaCompetenciasId , facesMsg);
		throw new ValidatorException(facesMsg,new RuntimeException());
		/*OK
		String summary = "Fail Custom Validation (summary)";
		String detail = "Fail Custom Validation (detail)";
		
		FacesMessage facesMessage = new FacesMessage(
				FacesMessage.SEVERITY_ERROR, summary,detail);
		throw new ValidatorException(facesMessage,new RuntimeException(detail));
		*/
	}

}
