/**
 * 
 */
package caf.war.generaProyectoTasks;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */
@ManagedBean(name = "GeneraProyectoTasks")
@ApplicationScoped
@DTManagedBean(displayName = "generaProyectoTasks", beanType = BeanType.APPLICATION)
public class GeneraProyectoTasks extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public GeneraProyectoTasks()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "generaProyectoTasks" );
	}
}