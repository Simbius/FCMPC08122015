/**
 * 
 */
package caf.war.crearMarcoLogicoTasks.ajustarmarcoproyectov2overview;

/**
 * @author veztm
 *
 */

import com.webmethods.caf.faces.data.task.TaskDisplayProvider;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "AjustarMarcoProyectoV2OverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "AjustarMarcoProyectoV2Overview/default", beanType = BeanType.PAGE)
public class AjustarMarcoProyectoV2OverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{AjustarMarcoProyectoV2Overview.taskID}" }, };
	private transient caf.war.crearMarcoLogicoTasks.ajustarmarcoproyectov2overview.AjustarMarcoProyectoV2Overview ajustarMarcoProyectoV2Overview = null;
	private caf.war.crearMarcoLogicoTasks.taskclient.AjustarMarcoProyectoV2 ajustarMarcoProyectoV2 = null;
	private static final String[][] AJUSTARMARCOPROYECTOV2_PROPERTY_BINDINGS = new String[][] {
		{"#{AjustarMarcoProyectoV2.taskID}", "#{AjustarMarcoProyectoV2Overview.taskID}"},
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

	/*
	 * Get the Task Display Provider for the current taskID
	 */
	public TaskDisplayProvider getTaskDisplayProvider() {
		if (taskDisplayProvider == null) {
			taskDisplayProvider = (TaskDisplayProvider) resolveExpression("#{TaskDisplayProvider}");
		}
		resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS,
				taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	public caf.war.crearMarcoLogicoTasks.ajustarmarcoproyectov2overview.AjustarMarcoProyectoV2Overview getAjustarMarcoProyectoV2Overview()  {
		if (ajustarMarcoProyectoV2Overview == null) {
		    ajustarMarcoProyectoV2Overview = (caf.war.crearMarcoLogicoTasks.ajustarmarcoproyectov2overview.AjustarMarcoProyectoV2Overview)resolveExpression("#{AjustarMarcoProyectoV2Overview}");
		}
		return ajustarMarcoProyectoV2Overview;
	}

	public caf.war.crearMarcoLogicoTasks.taskclient.AjustarMarcoProyectoV2 getAjustarMarcoProyectoV2()  {
		if (ajustarMarcoProyectoV2 == null) {
		    ajustarMarcoProyectoV2 = (caf.war.crearMarcoLogicoTasks.taskclient.AjustarMarcoProyectoV2)resolveExpression("#{AjustarMarcoProyectoV2}");
		}
	
	    resolveDataBinding(AJUSTARMARCOPROYECTOV2_PROPERTY_BINDINGS, ajustarMarcoProyectoV2, "ajustarMarcoProyectoV2", false, false);
		return ajustarMarcoProyectoV2;
	}

}