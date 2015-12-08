/**
 * 
 */
package caf.war.crearMarcoLogicoTasks.aprobarmarcodelproyectov2view;

/**
 * @author veztm
 *
 */

import com.webmethods.caf.faces.data.dir.PrincipalModel;
import com.webmethods.caf.faces.data.dir.PrincipalModelList;
import com.webmethods.caf.faces.data.task.impl.TaskContentProvider;


import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "AprobarMarcodelProyectoV2ViewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "AprobarMarcodelProyectoV2View/default", beanType = BeanType.PAGE)
public class AprobarMarcodelProyectoV2ViewDefaultviewView extends com.webmethods.caf.faces.bean.task.BaseTaskDetailsPageBean {

 
	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private com.webmethods.caf.faces.data.task.TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{TaskDisplayProvider.taskID}", "#{AprobarMarcodelProyectoV2View.taskID}"},
	};
	
	
    
	public com.webmethods.caf.faces.data.task.TaskDisplayProvider getTaskDisplayProvider()  {
		if (taskDisplayProvider == null) {
		    taskDisplayProvider = (com.webmethods.caf.faces.data.task.TaskDisplayProvider)resolveExpression("#{TaskDisplayProvider}");
		}
	    resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS, taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

    
	/**
	 * Cancel button action handler
	 */
	public String cancelView() {
		try {
			// just redirect to return (finish) url
			String url = getAprobarMarcodelProyectoV2View().getFinishUrl();
			if (url != null && url.length() > 0) {
				getFacesContext().getExternalContext().redirect(url);
			}
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}
	
	/**
	 * Complete button action handler
	 */
	public String completeTask() {
		try {
			if( !getAprobarMarcodelProyectoV2().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}

			// do the work
			getAprobarMarcodelProyectoV2().completeTask(); 
		
			// then redirect to finish url
			String url = getAprobarMarcodelProyectoV2View().getFinishUrl(); 
			if (url != null && url.length() > 0) {
				getFacesContext().getExternalContext().redirect(url);
			}
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}	

	/**
	 * Submit button action handler
	 */
	public String submitTask() {
		try {
			if( !getAprobarMarcodelProyectoV2().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}


			// do the work
			getAprobarMarcodelProyectoV2().applyChanges();
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}

	private PrincipalModelList selectedPrincipalList;

	public PrincipalModelList getPrincipalList() {
		return selectedPrincipalList;
	}
	
	public void setPrincipalList(PrincipalModelList value) {
		this.selectedPrincipalList = value;
	}
	
	/**
	 * Action Event Handler for the control with id='dialogPrincipalAssignTo'
	 */
	public String assignToPrincipals() {
		try {

			// get the current assigned principals for this task
			TaskContentProvider tp = getAprobarMarcodelProyectoV2();

			List<String> currentPrincipalList = new ArrayList<String>();
			String[] currentPrincipalIDs = tp.getTaskInfo().getAssignedToList();
			if (currentPrincipalIDs != null && currentPrincipalIDs.length > 0) {
				for (int ix = 0; ix < currentPrincipalIDs.length; ix++) {
					String principalID = currentPrincipalIDs[ix];
					currentPrincipalList.add( principalID );
				}
			}
			
			// get the selected principals from the picker
			if (selectedPrincipalList != null && selectedPrincipalList.size() > 0) {
				// loop and add the selected principals to the existing list
				for (int ix = 0; ix < selectedPrincipalList.size(); ix++) {
					PrincipalModel principalModel = (PrincipalModel) selectedPrincipalList.get(ix);
					String principalID = principalModel.getPrincipalID(); 
					if( !currentPrincipalList.contains( principalID)) {
						currentPrincipalList.add( principalID );
					}
				}
			}
				
			currentPrincipalIDs = currentPrincipalList.toArray( currentPrincipalIDs);
			tp.getTaskInfo().setAssignedToList(currentPrincipalIDs);
			tp.applyChangesNoAccept();
				
			// then redirect to finish url
			//String url = getRonTask36TaskView().getFinishUrl(); 
			//if (url != null && url.length() > 0) {
			//	getFacesContext().getExternalContext().redirect(url);
			//}				
		} catch (Exception e) {
			error(e);
			log(e);
		}		
		return null;
	}
	
	private transient caf.war.crearMarcoLogicoTasks.aprobarmarcodelproyectov2view.AprobarMarcodelProyectoV2View aprobarMarcodelProyectoV2View = null;
	private caf.war.crearMarcoLogicoTasks.taskclient.AprobarMarcodelProyectoV2 aprobarMarcodelProyectoV2 = null;
	private static final String[][] APROBARMARCODELPROYECTOV2_PROPERTY_BINDINGS = new String[][] {
		{"#{AprobarMarcodelProyectoV2.taskID}", "#{AprobarMarcodelProyectoV2View.taskID}"},
		{"#{AprobarMarcodelProyectoV2.autoAccept}", "true"},
		{"#{AprobarMarcodelProyectoV2.adhocRouting}", "false"},
	};
	private transient caf.war.crearMarcoLogicoTasks.wsclient.sfcmpc.services.getmlogico_wsd.GetMLogico getMLogico = null;
	private static final String[][] GETMLOGICO_PROPERTY_BINDINGS = new String[][] {
		{"#{GetMLogico.authCredentials.authenticationMethod}", "1"},
		{"#{GetMLogico.authCredentials.requiresAuth}", "true"},
		{"#{GetMLogico.autoRefresh}", "false"},
	};
	private static final String[][] ACTIONLEEDATOS_PROPERTY_BINDINGS = new String[][] {
		{"#{AprobarMarcodelProyectoV2ViewDefaultviewView.getMLogico.parameters.getMLogico.getMLogico.entrada.tipoDocumento}", "#{AprobarMarcodelProyectoV2ViewDefaultviewView.aprobarMarcodelProyectoV2.taskData.publicaMarcoV1.marcoLogicoV1.nombrePro}"},
		{"#{AprobarMarcodelProyectoV2ViewDefaultviewView.getMLogico.refresh}", null},
		{"#{AprobarMarcodelProyectoV2ViewDefaultviewView.aprobarMarcodelProyectoV2.taskData.publicaMarcoV1.marcoLogicoV1}", "#{AprobarMarcodelProyectoV2ViewDefaultviewView.getMLogico.result.getMLogicoResponse.marcoLogicoV1}"},
	};
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{AprobarMarcodelProyectoV2.reset}", null},
		{"#{AprobarMarcodelProyectoV2ViewDefaultviewView.actionLeeDatos}", null},
	};
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}
	
	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
		
	}


	public caf.war.crearMarcoLogicoTasks.aprobarmarcodelproyectov2view.AprobarMarcodelProyectoV2View getAprobarMarcodelProyectoV2View()  {
		if (aprobarMarcodelProyectoV2View == null) {
		    aprobarMarcodelProyectoV2View = (caf.war.crearMarcoLogicoTasks.aprobarmarcodelproyectov2view.AprobarMarcodelProyectoV2View)resolveExpression("#{AprobarMarcodelProyectoV2View}");
		}
		return aprobarMarcodelProyectoV2View;
	}


	public caf.war.crearMarcoLogicoTasks.taskclient.AprobarMarcodelProyectoV2 getAprobarMarcodelProyectoV2()  {
		if (aprobarMarcodelProyectoV2 == null) {
		    aprobarMarcodelProyectoV2 = (caf.war.crearMarcoLogicoTasks.taskclient.AprobarMarcodelProyectoV2)resolveExpression("#{AprobarMarcodelProyectoV2}");
		}
	
	    resolveDataBinding(APROBARMARCODELPROYECTOV2_PROPERTY_BINDINGS, aprobarMarcodelProyectoV2, "aprobarMarcodelProyectoV2", false, false);
		return aprobarMarcodelProyectoV2;
	}


	public String actionAprobar() {
	    // TODO: implement java method
		
	    this.getAprobarMarcodelProyectoV2().getTaskData().getPublicaMarcoV1().getMarcoLogicoV1().setAprobadoML("si");
	    this.completeTask();
		return null;
	}


	public String actionReprobar() {
	    // TODO: implement java method
		this.getAprobarMarcodelProyectoV2().getTaskData().getPublicaMarcoV1().getMarcoLogicoV1().setAprobadoML("no");
		this.completeTask();
	    
		return null;
	}


	public caf.war.crearMarcoLogicoTasks.wsclient.sfcmpc.services.getmlogico_wsd.GetMLogico getGetMLogico()  {
		if (getMLogico == null) {
		    getMLogico = (caf.war.crearMarcoLogicoTasks.wsclient.sfcmpc.services.getmlogico_wsd.GetMLogico)resolveExpression("#{GetMLogico}");
		}
	
	    resolveDataBinding(GETMLOGICO_PROPERTY_BINDINGS, getMLogico, "getMLogico", false, false);
		return getMLogico;
	}


	public String actionLeeDatos() {
	    resolveDataBinding(ACTIONLEEDATOS_PROPERTY_BINDINGS, this, "actionLeeDatos.this", true, false);
		return null;
	}
	
	
	
}