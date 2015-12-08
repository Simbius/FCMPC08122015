/**
 * 
 */
package caf.war.crearMarcoLogicoTasks;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */
@ManagedBean(name = "CrearMarcoLogicoTasks")
@ApplicationScoped
@DTManagedBean(displayName = "crearMarcoLogicoTasks", beanType = BeanType.APPLICATION)
public class CrearMarcoLogicoTasks extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public CrearMarcoLogicoTasks()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "crearMarcoLogicoTasks" );
	}
}