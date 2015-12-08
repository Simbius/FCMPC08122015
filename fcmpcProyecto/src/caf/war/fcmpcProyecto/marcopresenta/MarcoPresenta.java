/**
 * 
 */
package caf.war.fcmpcProyecto.marcopresenta;

/**
 * @author veztm
 *
 */

import javax.portlet.PortletPreferences;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "MarcoPresenta")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "marcoPresenta", beanType = BeanType.PORTLET)
public class MarcoPresenta  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private transient caf.war.fcmpcProyecto.FcmpcProyecto fcmpcProyecto = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public MarcoPresenta() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public caf.war.fcmpcProyecto.FcmpcProyecto getFcmpcProyecto()  {
		if (fcmpcProyecto == null) {
		    fcmpcProyecto = (caf.war.fcmpcProyecto.FcmpcProyecto)resolveExpression("#{FcmpcProyecto}");
		}
		return fcmpcProyecto;
	}
}