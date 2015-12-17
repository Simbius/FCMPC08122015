package caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub.dummyProyectos.
 */
@ManagedBean(name = "DummyProyectos")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class DummyProyectos extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 3556347384886900736L;
	
	/**
	 * Constructor
	 */
	public DummyProyectos() {
		super(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub.class,  // port type proxy class
			"dummyProyectos", // method to invoke
			new String[] { "dummyProyectos", } // method parameter names
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

		private static final long serialVersionUID = 4852293144364544000L;
		
		public Parameters() {
		}
	
	  
		private caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub.DummyProyectosE dummyProyectos  = new  caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub.DummyProyectosE() ;

		public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub.DummyProyectosE getDummyProyectos() {
			return dummyProyectos;
		}

		public void setDummyProyectos(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub.DummyProyectosE dummyProyectos) {
			this.dummyProyectos = dummyProyectos;
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
	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub.DummyProyectosResponseE getResult() {
		return (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub.DummyProyectosResponseE)result;
	}
	
	
}