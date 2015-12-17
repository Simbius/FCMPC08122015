package caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.leeTablaKpis.
 */
@ManagedBean(name = "LeeTablaKpis")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaKpis extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 2355193607633736704L;
	
	/**
	 * Constructor
	 */
	public LeeTablaKpis() {
		super(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.class,  // port type proxy class
			"leeTablaKpis", // method to invoke
			new String[] { "leeTablaKpis", } // method parameter names
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

		private static final long serialVersionUID = 5175589181840545792L;
		
		public Parameters() {
		}
	
	  
		private caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisE leeTablaKpis  = new  caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisE() ;

		public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisE getLeeTablaKpis() {
			return leeTablaKpis;
		}

		public void setLeeTablaKpis(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisE leeTablaKpis) {
			this.leeTablaKpis = leeTablaKpis;
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
	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisResponseE getResult() {
		return (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisResponseE)result;
	}
	
	
}