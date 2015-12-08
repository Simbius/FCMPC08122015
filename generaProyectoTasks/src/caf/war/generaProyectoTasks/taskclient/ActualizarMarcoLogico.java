package caf.war.generaProyectoTasks.taskclient;


import com.webmethods.caf.faces.data.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Task Client bean for 'Actualizar Marco Logico' task.
 */
@ManagedBean(name = "ActualizarMarcoLogico")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class ActualizarMarcoLogico extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 7615713378597161984L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "11284663-3DB6-AC9F-C688-2AF02BA67F89";

	/**
	 * Default constructor
	 */
	public ActualizarMarcoLogico() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 2989323946152747008L;
		
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

}