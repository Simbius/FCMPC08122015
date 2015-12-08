/**
 * 
 */
package caf.war.generaProyectoTasks.visarmarcologicoyactividadesoverview;

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

@ManagedBean(name = "VisarMarcoLogicoyActividadesOverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "VisarMarcoLogicoyActividadesOverview/default", beanType = BeanType.PAGE)
public class VisarMarcoLogicoyActividadesOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{VisarMarcoLogicoyActividadesOverview.taskID}" }, };
	private transient caf.war.generaProyectoTasks.visarmarcologicoyactividadesoverview.VisarMarcoLogicoyActividadesOverview visarMarcoLogicoyActividadesOverview = null;
	private caf.war.generaProyectoTasks.taskclient.VisarMarcoLogicoyActividades visarMarcoLogicoyActividades = null;
	private static final String[][] VISARMARCOLOGICOYACTIVIDADES_PROPERTY_BINDINGS = new String[][] {
		{"#{VisarMarcoLogicoyActividades.taskID}", "#{VisarMarcoLogicoyActividadesOverview.taskID}"},
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

	public caf.war.generaProyectoTasks.visarmarcologicoyactividadesoverview.VisarMarcoLogicoyActividadesOverview getVisarMarcoLogicoyActividadesOverview()  {
		if (visarMarcoLogicoyActividadesOverview == null) {
		    visarMarcoLogicoyActividadesOverview = (caf.war.generaProyectoTasks.visarmarcologicoyactividadesoverview.VisarMarcoLogicoyActividadesOverview)resolveExpression("#{VisarMarcoLogicoyActividadesOverview}");
		}
		return visarMarcoLogicoyActividadesOverview;
	}

	public caf.war.generaProyectoTasks.taskclient.VisarMarcoLogicoyActividades getVisarMarcoLogicoyActividades()  {
		if (visarMarcoLogicoyActividades == null) {
		    visarMarcoLogicoyActividades = (caf.war.generaProyectoTasks.taskclient.VisarMarcoLogicoyActividades)resolveExpression("#{VisarMarcoLogicoyActividades}");
		}
	
	    resolveDataBinding(VISARMARCOLOGICOYACTIVIDADES_PROPERTY_BINDINGS, visarMarcoLogicoyActividades, "visarMarcoLogicoyActividades", false, false);
		return visarMarcoLogicoyActividades;
	}

}