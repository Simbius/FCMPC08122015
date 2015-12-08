package caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd.SFCMPCServicesLeeTablaPlanta_WSDStub.leeTablaPlanta.
 */
@ManagedBean(name = "LeeTablaPlanta")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaPlanta extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 5324482902784928768L;
	
	/**
	 * Constructor
	 */
	public LeeTablaPlanta() {
		super(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd.SFCMPCServicesLeeTablaPlanta_WSDStub.class,  // port type proxy class
			"leeTablaPlanta", // method to invoke
			new String[] { "leeTablaPlanta", } // method parameter names
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

		private static final long serialVersionUID = 8302815727793907712L;
		
		public Parameters() {
		}
	
	  
		private caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd.SFCMPCServicesLeeTablaPlanta_WSDStub.LeeTablaPlantaE leeTablaPlanta  = new  caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd.SFCMPCServicesLeeTablaPlanta_WSDStub.LeeTablaPlantaE() ;

		public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd.SFCMPCServicesLeeTablaPlanta_WSDStub.LeeTablaPlantaE getLeeTablaPlanta() {
			return leeTablaPlanta;
		}

		public void setLeeTablaPlanta(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd.SFCMPCServicesLeeTablaPlanta_WSDStub.LeeTablaPlantaE leeTablaPlanta) {
			this.leeTablaPlanta = leeTablaPlanta;
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
	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd.SFCMPCServicesLeeTablaPlanta_WSDStub.LeeTablaPlantaResponseE getResult() {
		return (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd.SFCMPCServicesLeeTablaPlanta_WSDStub.LeeTablaPlantaResponseE)result;
	}
	
	
}