package caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.getMLogico.
 */
@ManagedBean(name = "GetMLogico2")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class GetMLogico2 extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 4985650919857526784L;
	
	/**
	 * Constructor
	 */
	public GetMLogico2() {
		super(caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.class,  // port type proxy class
			"getMLogico", // method to invoke
			new String[] { "getMLogico", } // method parameter names
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

		private static final long serialVersionUID = 5129845706032570368L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoE getMLogico  = new  caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoE() ;

		public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoE getGetMLogico() {
			return getMLogico;
		}

		public void setGetMLogico(caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoE getMLogico) {
			this.getMLogico = getMLogico;
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
	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoResponseE getResult() {
		return (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoResponseE)result;
	}
	
	
}