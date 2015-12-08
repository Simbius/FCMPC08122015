package caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.SFCMPCServicesLeeTablaEncargado_WSDStub.leeTablaEncargado.
 */
@ManagedBean(name = "LeeTablaEncargado")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaEncargado extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 2562384871308380160L;
	
	/**
	 * Constructor
	 */
	public LeeTablaEncargado() {
		super(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.SFCMPCServicesLeeTablaEncargado_WSDStub.class,  // port type proxy class
			"leeTablaEncargado", // method to invoke
			new String[] { "leeTablaEncargado", } // method parameter names
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

		private static final long serialVersionUID = 3252882827548189696L;
		
		public Parameters() {
		}
	
	  
		private caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.SFCMPCServicesLeeTablaEncargado_WSDStub.LeeTablaEncargadoE leeTablaEncargado  = new  caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.SFCMPCServicesLeeTablaEncargado_WSDStub.LeeTablaEncargadoE() ;

		public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.SFCMPCServicesLeeTablaEncargado_WSDStub.LeeTablaEncargadoE getLeeTablaEncargado() {
			return leeTablaEncargado;
		}

		public void setLeeTablaEncargado(caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.SFCMPCServicesLeeTablaEncargado_WSDStub.LeeTablaEncargadoE leeTablaEncargado) {
			this.leeTablaEncargado = leeTablaEncargado;
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
	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.SFCMPCServicesLeeTablaEncargado_WSDStub.LeeTablaEncargadoResponseE getResult() {
		return (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.SFCMPCServicesLeeTablaEncargado_WSDStub.LeeTablaEncargadoResponseE)result;
	}
	
	
}