package a8.faces.customs;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.component.html.HtmlColumn;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;

//ASI ESTA USANDO OTRO xhtml
//@FacesComponent(value = "a8.faces.CustomColumn")
@FacesComponent(
		createTag = true, 
		tagName = "column", 
		namespace = "http://faces.8a/custom",
		//THIS ATTRIBUTE means componentType IN COMPOSITE
		value = "a8.faces.CustomColumn")
public class CustomColumn extends HtmlColumn
// DO NOT SOLVE extends UINamingContainer
// DO NOT SOLVE implements NamingContainer
{

	@Override 
	public void encodeBegin(FacesContext context) throws IOException {
		
		/*AGAIN
		HtmlOutputText outputText = new HtmlOutputText();
		outputText.setParent(this);
		outputText.setValue("(dyn-INNER)");
		
		outputText.encodeBegin(context);
		outputText.encodeEnd(context);

		this.getChildren().add(outputText);
		*/
		
		encodeOutputTextValorOriginal(context);
	}
	
	private void encodeOutputTextValorOriginal(FacesContext context) throws
	 IOException{
	 HtmlOutputText outputText = new HtmlOutputText();
	 outputText.setParent(this);
	 outputText.setRendered(true);//FIXED
	 outputText.setValue("123");//FIXED
	 endEncodingChildComponent(context,outputText);
	 }
	
	private void endEncodingChildComponent(FacesContext context, UIComponentBase component) throws IOException {
		component.encodeBegin(context);
		component.encodeEnd(context);
	}

	/*
	 * @Override public String getFamily() { return HtmlColumn.COMPONENT_FAMILY;
	 * }
	 * 
	 * @Override public void encodeBegin(FacesContext context) throws
	 * IOException { super.encodeBegin(context); }
	 * 
	 * @Override public void encodeEnd(FacesContext context) throws IOException
	 * { super.encodeEnd(context); }
	 */
	/*
	 * THIS IS FOR INPUTs
	 * 
	 * @Override public Object getSubmittedValue() { return (this); }
	 */
}
