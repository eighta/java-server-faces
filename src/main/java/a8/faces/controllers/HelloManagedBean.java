package a8.faces.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "helloManagedBean", eager = true)
public class HelloManagedBean {

	public String getMessage() {
		
		System.out.println("->" + HelloManagedBean.class.getPackage().getSpecificationTitle());
		
		System.out.println(FacesContext.getCurrentInstance() );
		
		Package p = FacesContext.class.getPackage();
		System.out.println(p.getSpecificationTitle() + " " + p.getSpecificationVersion());
		System.out.println(p.getImplementationTitle() + " " + p.getImplementationVersion());
		
		System.out.println(p.getImplementationVendor());
		System.out.println(p.getSpecificationVendor());
	
		//returns the major version (2.1)
		System.out.println(FacesContext.class.getPackage().getImplementationVersion());

		//returns the specification version (2.1)
		System.out.println(Package.getPackage("com.sun.faces").getSpecificationVersion());

		//returns the minor implementation version (2.1.x)
		System.out.println(Package.getPackage("com.sun.faces").getImplementationVersion());
		
		
		
	      return "Hello From ManagedBean! " + FacesContext.class.getPackage().getImplementationVersion();
	   }
	
}
