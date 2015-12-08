package caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.SFCMPCServicesDummyEstablecimientos_WSDStub.dummyEstablecimientos.
 */
@ManagedBean(name = "DummyEstablecimientos")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class DummyEstablecimientos extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 1418499622530048000L;
	
	/**
	 * Constructor
	 */
	public DummyEstablecimientos() {
		super(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.SFCMPCServicesDummyEstablecimientos_WSDStub.class,  // port type proxy class
			"dummyEstablecimientos", // method to invoke
			new String[] { "dummyEstablecimientos", } // method parameter names
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

		private static final long serialVersionUID = 6012071573377624064L;
		
		public Parameters() {
		}
	
	  
		private caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.SFCMPCServicesDummyEstablecimientos_WSDStub.DummyEstablecimientosE dummyEstablecimientos  = new  caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.SFCMPCServicesDummyEstablecimientos_WSDStub.DummyEstablecimientosE() ;

		public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.SFCMPCServicesDummyEstablecimientos_WSDStub.DummyEstablecimientosE getDummyEstablecimientos() {
			return dummyEstablecimientos;
		}

		public void setDummyEstablecimientos(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.SFCMPCServicesDummyEstablecimientos_WSDStub.DummyEstablecimientosE dummyEstablecimientos) {
			this.dummyEstablecimientos = dummyEstablecimientos;
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
	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.SFCMPCServicesDummyEstablecimientos_WSDStub.DummyEstablecimientosResponseE getResult() {
		return (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.SFCMPCServicesDummyEstablecimientos_WSDStub.DummyEstablecimientosResponseE)result;
	}
	
	
}