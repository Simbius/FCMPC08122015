/**
 * 
 */
package caf.war.generaProyectoTasks.actualizarcontenidosoverview;

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

@ManagedBean(name = "ActualizarContenidosOverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ActualizarContenidosOverview/default", beanType = BeanType.PAGE)
public class ActualizarContenidosOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{ActualizarContenidosOverview.taskID}" }, };
	private transient caf.war.generaProyectoTasks.actualizarcontenidosoverview.ActualizarContenidosOverview actualizarContenidosOverview = null;
	private caf.war.generaProyectoTasks.taskclient.ActualizarContenidos actualizarContenidos = null;
	private static final String[][] ACTUALIZARCONTENIDOS_PROPERTY_BINDINGS = new String[][] {
		{"#{ActualizarContenidos.taskID}", "#{ActualizarContenidosOverview.taskID}"},
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

	public caf.war.generaProyectoTasks.actualizarcontenidosoverview.ActualizarContenidosOverview getActualizarContenidosOverview()  {
		if (actualizarContenidosOverview == null) {
		    actualizarContenidosOverview = (caf.war.generaProyectoTasks.actualizarcontenidosoverview.ActualizarContenidosOverview)resolveExpression("#{ActualizarContenidosOverview}");
		}
		return actualizarContenidosOverview;
	}

	public caf.war.generaProyectoTasks.taskclient.ActualizarContenidos getActualizarContenidos()  {
		if (actualizarContenidos == null) {
		    actualizarContenidos = (caf.war.generaProyectoTasks.taskclient.ActualizarContenidos)resolveExpression("#{ActualizarContenidos}");
		}
	
	    resolveDataBinding(ACTUALIZARCONTENIDOS_PROPERTY_BINDINGS, actualizarContenidos, "actualizarContenidos", false, false);
		return actualizarContenidos;
	}

}