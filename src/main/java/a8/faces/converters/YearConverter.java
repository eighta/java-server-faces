package a8.faces.converters;

import java.time.Year;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.convert.IntegerConverter;

@FacesConverter("yearConverter")
public class YearConverter implements Converter{

	IntegerConverter a;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String stringValue) {
		System.out.println("YearConverter.getAsObject()");
		
		if(stringValue.isEmpty()) {
			return null;
		}
		
		return Year.of(Integer.valueOf(stringValue));
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object objectValue) {
		System.out.println("YearConverter.getAsString()");
		Year year = (Year)objectValue;
		return year.toString();
	}

}
