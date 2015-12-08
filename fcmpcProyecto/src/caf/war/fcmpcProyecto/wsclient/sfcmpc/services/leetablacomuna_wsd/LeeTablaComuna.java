package caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd.SFCMPCServicesLeeTablaComuna_WSDStub.leeTablaComuna.
 */
@ManagedBean(name = "LeeTablaComuna")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaComuna extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 9119200001403185152L;
	
	/**
	 * Constructor
	 */
	public LeeTablaComuna() {
		super(caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd.SFCMPCServicesLeeTablaComuna_WSDStub.class,  // port type proxy class
			"leeTablaComuna", // method to invoke
			new String[] { "leeTablaComuna", } // method parameter names
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

		private static final long serialVersionUID = 7587032087337936896L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd.SFCMPCServicesLeeTablaComuna_WSDStub.LeeTablaComunaE leeTablaComuna  = new  caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd.SFCMPCServicesLeeTablaComuna_WSDStub.LeeTablaComunaE() ;

		public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd.SFCMPCServicesLeeTablaComuna_WSDStub.LeeTablaComunaE getLeeTablaComuna() {
			return leeTablaComuna;
		}

		public void setLeeTablaComuna(caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd.SFCMPCServicesLeeTablaComuna_WSDStub.LeeTablaComunaE leeTablaComuna) {
			this.leeTablaComuna = leeTablaComuna;
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
	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd.SFCMPCServicesLeeTablaComuna_WSDStub.LeeTablaComunaResponseE getResult() {
		return (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd.SFCMPCServicesLeeTablaComuna_WSDStub.LeeTablaComunaResponseE)result;
	}
	
	
}