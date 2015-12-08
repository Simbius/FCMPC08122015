package caf.war.fcmpcPortales.wsclient.sfcmpc.services.completadortarea_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcPortales.wsclient.sfcmpc.services.completadortarea_wsd.SFCMPCServicesCompletadorTarea_WSDStub.completadorTarea.
 */
@ManagedBean(name = "CompletadorTarea")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class CompletadorTarea extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 3807726642123927552L;
	
	/**
	 * Constructor
	 */
	public CompletadorTarea() {
		super(caf.war.fcmpcPortales.wsclient.sfcmpc.services.completadortarea_wsd.SFCMPCServicesCompletadorTarea_WSDStub.class,  // port type proxy class
			"completadorTarea", // method to invoke
			new String[] { "completadorTarea", } // method parameter names
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

		private static final long serialVersionUID = 8371184511495420928L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcPortales.wsclient.sfcmpc.services.completadortarea_wsd.SFCMPCServicesCompletadorTarea_WSDStub.CompletadorTareaE completadorTarea  = new  caf.war.fcmpcPortales.wsclient.sfcmpc.services.completadortarea_wsd.SFCMPCServicesCompletadorTarea_WSDStub.CompletadorTareaE() ;

		public caf.war.fcmpcPortales.wsclient.sfcmpc.services.completadortarea_wsd.SFCMPCServicesCompletadorTarea_WSDStub.CompletadorTareaE getCompletadorTarea() {
			return completadorTarea;
		}

		public void setCompletadorTarea(caf.war.fcmpcPortales.wsclient.sfcmpc.services.completadortarea_wsd.SFCMPCServicesCompletadorTarea_WSDStub.CompletadorTareaE completadorTarea) {
			this.completadorTarea = completadorTarea;
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
	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.completadortarea_wsd.SFCMPCServicesCompletadorTarea_WSDStub.CompletadorTareaResponseE getResult() {
		return (caf.war.fcmpcPortales.wsclient.sfcmpc.services.completadortarea_wsd.SFCMPCServicesCompletadorTarea_WSDStub.CompletadorTareaResponseE)result;
	}
	
	
}