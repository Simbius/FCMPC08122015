/**
 * 
 */
package caf.war.fcmpcProyecto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */
@ManagedBean(name = "FcmpcProyecto")
@ApplicationScoped
@DTManagedBean(displayName = "fcmpcProyecto", beanType = BeanType.APPLICATION)
public class FcmpcProyecto extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public FcmpcProyecto()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "fcmpcProyecto" );
	}
}