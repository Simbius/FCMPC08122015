/**
 * 
 */
package caf.war.fcmpcProyecto.marcopresenta;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "MarcoPresentaDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "MarcoPresenta/default", beanType = BeanType.PAGE)
public class MarcoPresentaDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient caf.war.fcmpcProyecto.marcopresenta.MarcoPresenta marcoPresenta = null;
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.GeneradorProyecto2 generadorProyecto2 = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider plantaProvider3 = null;
	private static final String[][] PLANTAPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{PlantaProvider3.rowType}", "java.lang.String"},
		{"#{PlantaProvider3.rowVariable}", "planta"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider establecimientosProvider3 = null;
	private static final String[][] ESTABLECIMIENTOSPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{EstablecimientosProvider3.rowType}", "caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub$Establecimientos"},
		{"#{EstablecimientosProvider3.rowVariable}", "establecimiento"},
	};
	private static final String[][] GENERADORPROYECTO2_PROPERTY_BINDINGS = new String[][] {
		{"#{generadorProyecto2.authCredentials.authenticationMethod}", "1"},
		{"#{generadorProyecto2.authCredentials.requiresAuth}", "true"},
		{"#{generadorProyecto2.autoRefresh}", "false"},
		{"#{generadorProyecto2.parameters.generadorProyecto.generadorProyecto.proyecto.planta}", "#{MarcoPresentaDefaultviewView.plantaProvider3.array}"},
		{"#{generadorProyecto2.parameters.generadorProyecto.generadorProyecto.proyecto.establecimientos}", "#{MarcoPresentaDefaultviewView.establecimientosProvider3.array}"},
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

	public caf.war.fcmpcProyecto.marcopresenta.MarcoPresenta getMarcoPresenta()  {
		if (marcoPresenta == null) {
		    marcoPresenta = (caf.war.fcmpcProyecto.marcopresenta.MarcoPresenta)resolveExpression("#{MarcoPresenta}");
		}
		return marcoPresenta;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.GeneradorProyecto2 getGeneradorProyecto2()  {
		if (generadorProyecto2 == null) {
		    generadorProyecto2 = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.GeneradorProyecto2)resolveExpression("#{GeneradorProyecto2}");
		}
	
	    resolveDataBinding(GENERADORPROYECTO2_PROPERTY_BINDINGS, generadorProyecto2, "generadorProyecto2", false, false);
		return generadorProyecto2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getPlantaProvider3()  {
		if (plantaProvider3 == null) {
		    plantaProvider3 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{PlantaProvider3}");
		}
	
	    resolveDataBinding(PLANTAPROVIDER3_PROPERTY_BINDINGS, plantaProvider3, "plantaProvider3", false, false);
		return plantaProvider3;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstablecimientosProvider3()  {
		if (establecimientosProvider3 == null) {
		    establecimientosProvider3 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstablecimientosProvider3}");
		}
	
	    resolveDataBinding(ESTABLECIMIENTOSPROVIDER3_PROPERTY_BINDINGS, establecimientosProvider3, "establecimientosProvider3", false, false);
		return establecimientosProvider3;
	}
	
}