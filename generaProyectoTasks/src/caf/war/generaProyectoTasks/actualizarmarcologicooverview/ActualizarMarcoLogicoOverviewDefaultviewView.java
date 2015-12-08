/**
 * 
 */
package caf.war.generaProyectoTasks.actualizarmarcologicooverview;

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

@ManagedBean(name = "ActualizarMarcoLogicoOverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ActualizarMarcoLogicoOverview/default", beanType = BeanType.PAGE)
public class ActualizarMarcoLogicoOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{ActualizarMarcoLogicoOverview.taskID}" }, };
	private transient caf.war.generaProyectoTasks.actualizarmarcologicooverview.ActualizarMarcoLogicoOverview actualizarMarcoLogicoOverview = null;
	private caf.war.generaProyectoTasks.taskclient.ActualizarMarcoLogico actualizarMarcoLogico = null;
	private static final String[][] ACTUALIZARMARCOLOGICO_PROPERTY_BINDINGS = new String[][] {
		{"#{ActualizarMarcoLogico.taskID}", "#{ActualizarMarcoLogicoOverview.taskID}"},
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

	public caf.war.generaProyectoTasks.actualizarmarcologicooverview.ActualizarMarcoLogicoOverview getActualizarMarcoLogicoOverview()  {
		if (actualizarMarcoLogicoOverview == null) {
		    actualizarMarcoLogicoOverview = (caf.war.generaProyectoTasks.actualizarmarcologicooverview.ActualizarMarcoLogicoOverview)resolveExpression("#{ActualizarMarcoLogicoOverview}");
		}
		return actualizarMarcoLogicoOverview;
	}

	public caf.war.generaProyectoTasks.taskclient.ActualizarMarcoLogico getActualizarMarcoLogico()  {
		if (actualizarMarcoLogico == null) {
		    actualizarMarcoLogico = (caf.war.generaProyectoTasks.taskclient.ActualizarMarcoLogico)resolveExpression("#{ActualizarMarcoLogico}");
		}
	
	    resolveDataBinding(ACTUALIZARMARCOLOGICO_PROPERTY_BINDINGS, actualizarMarcoLogico, "actualizarMarcoLogico", false, false);
		return actualizarMarcoLogico;
	}

}