package caf.war.fcmpcPortales.wsclient.sfcmpc.services.completatarea_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcPortales.wsclient.sfcmpc.services.completatarea_wsd.SFCMPCServicesCompletaTarea_WSDStub.completaTarea.
 */
@ManagedBean(name = "CompletaTarea")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class CompletaTarea extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 8347293373148529664L;
	
	/**
	 * Constructor
	 */
	public CompletaTarea() {
		super(caf.war.fcmpcPortales.wsclient.sfcmpc.services.completatarea_wsd.SFCMPCServicesCompletaTarea_WSDStub.class,  // port type proxy class
			"completaTarea", // method to invoke
			new String[] { "completaTarea", } // method parameter names
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

		private static final long serialVersionUID = 2401045420489192448L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcPortales.wsclient.sfcmpc.services.completatarea_wsd.SFCMPCServicesCompletaTarea_WSDStub.CompletaTareaE completaTarea  = new  caf.war.fcmpcPortales.wsclient.sfcmpc.services.completatarea_wsd.SFCMPCServicesCompletaTarea_WSDStub.CompletaTareaE() ;

		public caf.war.fcmpcPortales.wsclient.sfcmpc.services.completatarea_wsd.SFCMPCServicesCompletaTarea_WSDStub.CompletaTareaE getCompletaTarea() {
			return completaTarea;
		}

		public void setCompletaTarea(caf.war.fcmpcPortales.wsclient.sfcmpc.services.completatarea_wsd.SFCMPCServicesCompletaTarea_WSDStub.CompletaTareaE completaTarea) {
			this.completaTarea = completaTarea;
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
	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.completatarea_wsd.SFCMPCServicesCompletaTarea_WSDStub.CompletaTareaResponseE getResult() {
		return (caf.war.fcmpcPortales.wsclient.sfcmpc.services.completatarea_wsd.SFCMPCServicesCompletaTarea_WSDStub.CompletaTareaResponseE)result;
	}
	
	
}