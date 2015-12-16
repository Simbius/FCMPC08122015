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
	private java.lang.String desde;
	private java.lang.String hasta;
	private java.lang.String resultado;
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
			this.setResultado("El proyecto ha sido creao con Exito");
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

	public java.lang.String getDesde()  {
		
		return desde;
	}

	public void setDesde(java.lang.String desde)  {
		this.desde = desde;
	}

	public java.lang.String getHasta()  {
		
		return hasta;
	}

	public void setHasta(java.lang.String hasta)  {
		this.hasta = hasta;
	}

	public String actionProcesa() {
	    // TODO: implement java method
	    String desde =this.getDesde();
	    String hasta = this.getHasta();
	    if (desde.compareTo(hasta)>0) this.error("La fecha Inicio Periodo debe ser menor que fin del Periodo");
	    else
	     this.getGeneradorProyecto3().getParameters().getGeneradorProyecto().getGeneradorProyecto().getProyecto().setPeriodo(desde+"-"+hasta);
	    
	    this.getGeneradorProyecto3().refresh();	
	    try{
	    getFacesContext().getExternalContext().redirect("http://172.16.58.129:8585/");
	    }catch (Exception x){}
		return null;
	}

	public java.lang.String getResultado()  {
		
		return resultado;
	}

	public void setResultado(java.lang.String resultado)  {
		this.resultado = resultado;
	}
	
}