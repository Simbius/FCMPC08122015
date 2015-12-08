/**
 * 
 */
package caf.war.crearMarcoLogicoTasks.aprobarmarcodelproyectov2overview;

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

@ManagedBean(name = "AprobarMarcodelProyectoV2OverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "AprobarMarcodelProyectoV2Overview/default", beanType = BeanType.PAGE)
public class AprobarMarcodelProyectoV2OverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{AprobarMarcodelProyectoV2Overview.taskID}" }, };
	private transient caf.war.crearMarcoLogicoTasks.aprobarmarcodelproyectov2overview.AprobarMarcodelProyectoV2Overview aprobarMarcodelProyectoV2Overview = null;
	private caf.war.crearMarcoLogicoTasks.taskclient.AprobarMarcodelProyectoV2 aprobarMarcodelProyectoV2 = null;
	private static final String[][] APROBARMARCODELPROYECTOV2_PROPERTY_BINDINGS = new String[][] {
		{"#{AprobarMarcodelProyectoV2.taskID}", "#{AprobarMarcodelProyectoV2Overview.taskID}"},
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

	public caf.war.crearMarcoLogicoTasks.aprobarmarcodelproyectov2overview.AprobarMarcodelProyectoV2Overview getAprobarMarcodelProyectoV2Overview()  {
		if (aprobarMarcodelProyectoV2Overview == null) {
		    aprobarMarcodelProyectoV2Overview = (caf.war.crearMarcoLogicoTasks.aprobarmarcodelproyectov2overview.AprobarMarcodelProyectoV2Overview)resolveExpression("#{AprobarMarcodelProyectoV2Overview}");
		}
		return aprobarMarcodelProyectoV2Overview;
	}

	public caf.war.crearMarcoLogicoTasks.taskclient.AprobarMarcodelProyectoV2 getAprobarMarcodelProyectoV2()  {
		if (aprobarMarcodelProyectoV2 == null) {
		    aprobarMarcodelProyectoV2 = (caf.war.crearMarcoLogicoTasks.taskclient.AprobarMarcodelProyectoV2)resolveExpression("#{AprobarMarcodelProyectoV2}");
		}
	
	    resolveDataBinding(APROBARMARCODELPROYECTOV2_PROPERTY_BINDINGS, aprobarMarcodelProyectoV2, "aprobarMarcodelProyectoV2", false, false);
		return aprobarMarcodelProyectoV2;
	}

}