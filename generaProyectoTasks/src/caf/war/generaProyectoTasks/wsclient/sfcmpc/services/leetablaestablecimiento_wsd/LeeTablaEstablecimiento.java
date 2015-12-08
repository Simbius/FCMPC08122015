package caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.SFCMPCServicesLeeTablaEstablecimiento_WSDStub.leeTablaEstablecimiento.
 */
@ManagedBean(name = "LeeTablaEstablecimiento")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaEstablecimiento extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 4809370295710366720L;
	
	/**
	 * Constructor
	 */
	public LeeTablaEstablecimiento() {
		super(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.SFCMPCServicesLeeTablaEstablecimiento_WSDStub.class,  // port type proxy class
			"leeTablaEstablecimiento", // method to invoke
			new String[] { "leeTablaEstablecimiento", } // method parameter names
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

		private static final long serialVersionUID = 6319651324028717056L;
		
		public Parameters() {
		}
	
	  
		private caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.SFCMPCServicesLeeTablaEstablecimiento_WSDStub.LeeTablaEstablecimientoE leeTablaEstablecimiento  = new  caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.SFCMPCServicesLeeTablaEstablecimiento_WSDStub.LeeTablaEstablecimientoE() ;

		public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.SFCMPCServicesLeeTablaEstablecimiento_WSDStub.LeeTablaEstablecimientoE getLeeTablaEstablecimiento() {
			return leeTablaEstablecimiento;
		}

		public void setLeeTablaEstablecimiento(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.SFCMPCServicesLeeTablaEstablecimiento_WSDStub.LeeTablaEstablecimientoE leeTablaEstablecimiento) {
			this.leeTablaEstablecimiento = leeTablaEstablecimiento;
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
	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.SFCMPCServicesLeeTablaEstablecimiento_WSDStub.LeeTablaEstablecimientoResponseE getResult() {
		return (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.SFCMPCServicesLeeTablaEstablecimiento_WSDStub.LeeTablaEstablecimientoResponseE)result;
	}
	
	
}