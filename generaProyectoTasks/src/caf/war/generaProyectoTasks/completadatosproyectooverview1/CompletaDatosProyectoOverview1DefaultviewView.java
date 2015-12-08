/**
 * 
 */
package caf.war.generaProyectoTasks.completadatosproyectooverview1;

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

@ManagedBean(name = "CompletaDatosProyectoOverview1DefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "CompletaDatosProyectoOverview1/default", beanType = BeanType.PAGE)
public class CompletaDatosProyectoOverview1DefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{CompletaDatosProyectoOverview1.taskID}" }, };
	private transient caf.war.generaProyectoTasks.completadatosproyectooverview1.CompletaDatosProyectoOverview1 completaDatosProyectoOverview1 = null;
	private caf.war.generaProyectoTasks.taskclient.CompletaDatosProyecto2 completaDatosProyecto2 = null;
	private static final String[][] COMPLETADATOSPROYECTO2_PROPERTY_BINDINGS = new String[][] {
		{"#{CompletaDatosProyecto2.taskID}", "#{CompletaDatosProyectoOverview1.taskID}"},
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

	public caf.war.generaProyectoTasks.completadatosproyectooverview1.CompletaDatosProyectoOverview1 getCompletaDatosProyectoOverview1()  {
		if (completaDatosProyectoOverview1 == null) {
		    completaDatosProyectoOverview1 = (caf.war.generaProyectoTasks.completadatosproyectooverview1.CompletaDatosProyectoOverview1)resolveExpression("#{CompletaDatosProyectoOverview1}");
		}
		return completaDatosProyectoOverview1;
	}

	public caf.war.generaProyectoTasks.taskclient.CompletaDatosProyecto2 getCompletaDatosProyecto2()  {
		if (completaDatosProyecto2 == null) {
		    completaDatosProyecto2 = (caf.war.generaProyectoTasks.taskclient.CompletaDatosProyecto2)resolveExpression("#{CompletaDatosProyecto2}");
		}
	
	    resolveDataBinding(COMPLETADATOSPROYECTO2_PROPERTY_BINDINGS, completaDatosProyecto2, "completaDatosProyecto2", false, false);
		return completaDatosProyecto2;
	}

}