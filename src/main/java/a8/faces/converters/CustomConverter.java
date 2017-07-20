package a8.faces.converters;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import a8.faces.model.CustomField;

@FacesConverter("customConverter")
public class CustomConverter implements Converter{
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String stringValue) {
		System.out.println("CustomConverter.getAsObject()");
		
		if(stringValue.isEmpty()) {
			return null;
		}
		
		String[] splited = stringValue.split("::");
		if(splited.length != 2) {
			
			/*
			String CUSTOM_ID = 
					"a8.faces.converters.CUSTOM";
			
			throw new ConverterException(
					MessageFactory.getMessage(
	                 context, CUSTOM_ID, stringValue, "9346",
	                 MessageFactory.getLabel(context, component)), nfe);
			*/
			
			
			//throw new ConverterException("CustomConverter FAIL");
			
			//EROR DE CONVERSION EN EL IntegerConverter
			/*
			String INTEGER_ID =
			         "javax.faces.converter.IntegerConverter.INTEGER";
			 throw new ConverterException(
					 MessageFactory.getMessage(
	                 context, INTEGER_ID, stringValue, "9346",
	                 MessageFactory.getLabel(context, component) ),
					 null);	*/
			
			/*
			FacesMessage fm1 = MessageFactory.getMessage(context,"javax.faces.converter.IntegerConverter.INTEGER");
			System.out.println(fm1);
			
			FacesMessage fm2 = MessageFactory.getMessage(context,"simple.message");
			System.out.println(fm2);
			
			String idMsg = "a8.faces.converters.CustomConverter";
			throw new ConverterException(
					MessageFactory.getMessage(context,idMsg),
					null
					);
			*/
			
			//FacesMessage facesMessage = MessageFactory.getMessage(context,"");
			
			FacesMessage facesMessage = new FacesMessage(
							FacesMessage.SEVERITY_ERROR, "customSummary","customDetail");
			
			throw new ConverterException(facesMessage,null);
			
		}
		
		return CustomField.of(
				Integer.valueOf(splited[0]),
				splited[1] );
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object objectValue) {
		System.out.println("customConverter.getAsString()");
		CustomField custom = (CustomField)objectValue;
		
		return custom.getNumber()+"::"+custom.getTxt();
	}

}
