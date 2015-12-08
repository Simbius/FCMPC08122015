/**
 * 
 */
package caf.war.fcmpcProyecto.crearproyecto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "CrearProyectoDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "CrearProyecto/default", beanType = BeanType.PAGE)
public class CrearProyectoDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private transient caf.war.fcmpcProyecto.crearproyecto.CrearProyecto crearProyecto = null;
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.GeneradorProyecto3 generadorProyecto3 = null;
	private static final String[][] GENERADORPROYECTO3_PROPERTY_BINDINGS = new String[][] {
		{"#{GeneradorProyecto3.authCredentials.authenticationMethod}", "1"},
		{"#{GeneradorProyecto3.authCredentials.requiresAuth}", "true"},
		{"#{GeneradorProyecto3.autoRefresh}", "false"},
	};
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	public caf.war.fcmpcProyecto.crearproyecto.CrearProyecto getCrearProyecto()  {
		if (crearProyecto == null) {
		    crearProyecto = (caf.war.fcmpcProyecto.crearproyecto.CrearProyecto)resolveExpression("#{CrearProyecto}");
		}
		return crearProyecto;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.GeneradorProyecto3 getGeneradorProyecto3()  {
		if (generadorProyecto3 == null) {
		    generadorProyecto3 = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.GeneradorProyecto3)resolveExpression("#{GeneradorProyecto3}");
		}
	
	    resolveDataBinding(GENERADORPROYECTO3_PROPERTY_BINDINGS, generadorProyecto3, "generadorProyecto3", false, false);
		return generadorProyecto3;
	}
	
}