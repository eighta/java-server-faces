package a8.faces.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("engineValidator")
public class EngineValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		Integer intValue = (Integer) value;
		if(intValue == 1 || intValue == 2 ) {
			
			System.out.println("EngineValidator FAIL!!!");
			throw new ValidatorException(
					new FacesMessage(
						FacesMessage.SEVERITY_ERROR, "ENGINE E","ENGINE E"),
					new RuntimeException("ENGINE E"));
		}
		
		
	}

}
