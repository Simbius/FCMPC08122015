package caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd;


import java.io.Serializable;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub.generadorProyecto.
 */
public class GeneradorProyecto2 extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 4237197684876804096L;
	
	/**
	 * Constructor
	 */
	public GeneradorProyecto2() {
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

		private static final long serialVersionUID = 8660252977782502400L;
		
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