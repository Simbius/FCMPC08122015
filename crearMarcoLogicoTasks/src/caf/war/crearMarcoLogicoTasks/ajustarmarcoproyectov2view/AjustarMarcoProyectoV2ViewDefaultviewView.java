/**
 * 
 */
package caf.war.crearMarcoLogicoTasks.ajustarmarcoproyectov2view;

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

@ManagedBean(name = "AjustarMarcoProyectoV2ViewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "AjustarMarcoProyectoV2View/default", beanType = BeanType.PAGE)
public class AjustarMarcoProyectoV2ViewDefaultviewView extends com.webmethods.caf.faces.bean.task.BaseTaskDetailsPageBean {

 
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
		{"#{TaskDisplayProvider.taskID}", "#{AjustarMarcoProyectoV2View.taskID}"},
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
			String url = getAjustarMarcoProyectoV2View().getFinishUrl();
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
			if( !getAjustarMarcoProyectoV2().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}

			// do the work
			getAjustarMarcoProyectoV2().completeTask(); 
		
			// then redirect to finish url
			String url = getAjustarMarcoProyectoV2View().getFinishUrl(); 
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
			if( !getAjustarMarcoProyectoV2().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}


			// do the work
			getAjustarMarcoProyectoV2().applyChanges();
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
			TaskContentProvider tp = getAjustarMarcoProyectoV2();

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
	
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{AjustarMarcoProyectoV2.reset}", null}
	};
	private transient caf.war.crearMarcoLogicoTasks.ajustarmarcoproyectov2view.AjustarMarcoProyectoV2View ajustarMarcoProyectoV2View = null;
	private caf.war.crearMarcoLogicoTasks.taskclient.AjustarMarcoProyectoV2 ajustarMarcoProyectoV2 = null;
	private static final String[][] AJUSTARMARCOPROYECTOV2_PROPERTY_BINDINGS = new String[][] {
		{"#{AjustarMarcoProyectoV2.taskID}", "#{AjustarMarcoProyectoV2View.taskID}"},
		{"#{AjustarMarcoProyectoV2.autoAccept}", "false"},
		{"#{AjustarMarcoProyectoV2.adhocRouting}", "false"},
	};

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		  this.getAjustarMarcoProyectoV2().acceptTask();
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


	public caf.war.crearMarcoLogicoTasks.ajustarmarcoproyectov2view.AjustarMarcoProyectoV2View getAjustarMarcoProyectoV2View()  {
		if (ajustarMarcoProyectoV2View == null) {
		    ajustarMarcoProyectoV2View = (caf.war.crearMarcoLogicoTasks.ajustarmarcoproyectov2view.AjustarMarcoProyectoV2View)resolveExpression("#{AjustarMarcoProyectoV2View}");
		}
		return ajustarMarcoProyectoV2View;
	}


	public caf.war.crearMarcoLogicoTasks.taskclient.AjustarMarcoProyectoV2 getAjustarMarcoProyectoV2()  {
		if (ajustarMarcoProyectoV2 == null) {
		    ajustarMarcoProyectoV2 = (caf.war.crearMarcoLogicoTasks.taskclient.AjustarMarcoProyectoV2)resolveExpression("#{AjustarMarcoProyectoV2}");
		}
	
	    resolveDataBinding(AJUSTARMARCOPROYECTOV2_PROPERTY_BINDINGS, ajustarMarcoProyectoV2, "ajustarMarcoProyectoV2", false, false);
		return ajustarMarcoProyectoV2;
	}
	
	
	
}