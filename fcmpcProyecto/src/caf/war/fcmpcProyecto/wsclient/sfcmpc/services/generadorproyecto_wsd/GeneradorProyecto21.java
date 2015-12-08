package caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub.generadorProyecto.
 */
@ManagedBean(name = "GeneradorProyecto2")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class GeneradorProyecto21 extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 3217502970024608768L;
	
	/**
	 * Constructor
	 */
	public GeneradorProyecto21() {
		super(caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub.class,  // port type proxy class
			"generadorProyecto", // method to invoke
			new String[] { "generadorProyecto", } // method parameter names
		);
		
		// init wsclient
		initParams();
		
		
		// parameters bean
		parameters = new Parameters();
			
		// initial result
		result = null;
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters implements Serializable {

		private static final long serialVersionUID = 2151794787518951424L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub.GeneradorProyectoE generadorProyecto  = new  caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub.GeneradorProyectoE() ;

		public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub.GeneradorProyectoE getGeneradorProyecto() {
			return generadorProyecto;
		}

		public void setGeneradorProyecto(caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub.GeneradorProyectoE generadorProyecto) {
			this.generadorProyecto = generadorProyecto;
		}
		
	}
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	
	/**
	 * Return method invocation result bean
	 */
	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub.GeneradorProyectoResponseE getResult() {
		return (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub.GeneradorProyectoResponseE)result;
	}
	
	
}