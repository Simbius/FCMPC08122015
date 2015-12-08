package caf.war.generaProyectoTasks.taskclient;


import com.webmethods.caf.faces.data.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Task Client bean for 'Completa Datos Proyecto' task.
 */
@ManagedBean(name = "CompletaDatosProyecto2")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class CompletaDatosProyecto2 extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 3848044570568691712L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "D2A97B2B-2EAC-A106-3AC0-AF0EB756D42F";

	private transient caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado leeTablaEncargado = null;

	/**
	 * Default constructor
	 */
	public CompletaDatosProyecto2() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 1955358175638013952L;
		
		public static String[][] FIELD_NAMES = new String[][] {{"planProyectoV2", "planProyectoV2"},
		};

		private caf.war.generaProyectoTasks.is.document.SFCMPC_docs_planProyectoV2 planProyectoV2 = null;

		public static final String[] INPUTS = new String[] {"planProyectoV2", };

		public static final String[] OUTPUTS = new String[] {"planProyectoV2", };

		public TaskData() {
		}

		public caf.war.generaProyectoTasks.is.document.SFCMPC_docs_planProyectoV2 getPlanProyectoV2()  {
			if (planProyectoV2 == null) {
				planProyectoV2 = new caf.war.generaProyectoTasks.is.document.SFCMPC_docs_planProyectoV2();
			}
			return planProyectoV2;
		}

		public void setPlanProyectoV2(caf.war.generaProyectoTasks.is.document.SFCMPC_docs_planProyectoV2 planProyectoV2)  {
			this.planProyectoV2 = planProyectoV2;
		}
		
	}
	
	/**
	 * Return current task data object
	 * @return current task data
	 */
	public TaskData getTaskData() {
		return (TaskData)getValue(PROPERTY_KEY_TASKDATA);
	}

	/**
	 * Creates new task data object
	 * @return newly created task data object
	 */	
	protected ITaskData newTaskData() throws ContentProviderException {
		return new TaskData();
	}

	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado getLeeTablaEncargado()  {
		if (leeTablaEncargado == null) {
		//    leeTablaEncargado = (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado)resolveExpression("#{LeeTablaEncargado}");
		}
		return leeTablaEncargado;
	}

}