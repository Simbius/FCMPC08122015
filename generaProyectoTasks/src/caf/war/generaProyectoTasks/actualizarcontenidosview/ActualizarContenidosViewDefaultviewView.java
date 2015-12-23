/**
 * 
 */
package caf.war.generaProyectoTasks.actualizarcontenidosview;

/**
 * @author veztm
 *
 */

import caf.war.generaProyectoTasks.is.document.SFCMPC_docs_marcoLogicoV2.Objetivo;
import caf.war.generaProyectoTasks.is.document.SFCMPC_docs_marcoLogicoV2.ObjetivosEspecificos;
import caf.war.generaProyectoTasks.is.document.SFCMPC_docs_marcoLogicoV2.ObjetivosEspecificos.Especificos;

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

@ManagedBean(name = "ActualizarContenidosViewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ActualizarContenidosView/default", beanType = BeanType.PAGE)
public class ActualizarContenidosViewDefaultviewView extends com.webmethods.caf.faces.bean.task.BaseTaskDetailsPageBean {

 
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
		{"#{TaskDisplayProvider.taskID}", "#{ActualizarContenidosView.taskID}"},
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
			String url = getActualizarContenidosView().getFinishUrl();
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
			if( !getActualizarContenidos().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}

			// do the work
			getActualizarContenidos().completeTask(); 
		
			// then redirect to finish url
			String url = getActualizarContenidosView().getFinishUrl(); 
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
			if( !getActualizarContenidos().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}


			// do the work
			getActualizarContenidos().applyChanges();
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
			TaskContentProvider tp = getActualizarContenidos();

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
	
	private transient caf.war.generaProyectoTasks.actualizarcontenidosview.ActualizarContenidosView actualizarContenidosView = null;
	private caf.war.generaProyectoTasks.taskclient.ActualizarContenidos actualizarContenidos = null;
	private static final String[][] ACTUALIZARCONTENIDOS_PROPERTY_BINDINGS = new String[][] {
		{"#{ActualizarContenidos.taskID}", "#{ActualizarContenidosView.taskID}"},
		{"#{ActualizarContenidos.autoAccept}", "true"},
		{"#{ActualizarContenidos.adhocRouting}", "false"},
	};
	private java.lang.String indicador;
	private transient caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.DummyProyectos dummyProyectos = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider osupuestosProvider = null;
	private static final String[][] OSUPUESTOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{OsupuestosProvider.rowType}", "java.lang.String"},
		{"#{OsupuestosProvider.rowVariable}", "osupuesto"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivosEspecificosProvider = null;
	private static final String[][] OBJETIVOSESPECIFICOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivosEspecificosProvider.rowType}", "caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub$ObjetivosEspecificos"},
		{"#{ObjetivosEspecificosProvider.rowVariable}", "objetivosEspecifico"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider especificosProvider = null;
	private static final String[][] ESPECIFICOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{EspecificosProvider.rowType}", "caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub$Especificos"},
		{"#{EspecificosProvider.rowVariable}", "especifico"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider rsupuestosProvider = null;
	private static final String[][] RSUPUESTOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{RsupuestosProvider.rowType}", "java.lang.String"},
		{"#{RsupuestosProvider.rowVariable}", "rsupuesto"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider estrategiaProvider = null;
	private static final String[][] ESTRATEGIAPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{EstrategiaProvider.rowType}", "caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub$Estrategia"},
		{"#{EstrategiaProvider.rowVariable}", "estrategia"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider tipoParticipanteProvider = null;
	private static final String[][] TIPOPARTICIPANTEPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{TipoParticipanteProvider.rowType}", "java.lang.String"},
		{"#{TipoParticipanteProvider.rowVariable}", "tipoParticipante"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider cicloProvider = null;
	private static final String[][] CICLOPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{CicloProvider.rowType}", "caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub$Ciclo"},
		{"#{CicloProvider.rowVariable}", "ciclo"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivosXactividadProvider = null;
	private static final String[][] OBJETIVOSXACTIVIDADPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivosXactividadProvider.rowType}", "java.lang.String"},
		{"#{ObjetivosXactividadProvider.rowVariable}", "objetivosXactividad"},
	};
	private static final String[][] DUMMYPROYECTOS_PROPERTY_BINDINGS = new String[][] {
		{"#{dummyProyectos.authCredentials.authenticationMethod}", "1"},
		{"#{dummyProyectos.authCredentials.requiresAuth}", "true"},
		{"#{dummyProyectos.autoRefresh}", "false"},		
	};
	private transient caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd.LeeTablaKpis leeTablaKpis = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider8 = null;
	private static final String[][] LEETABLAKPIS_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaKpis.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaKpis.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaKpis.autoRefresh}", "true"},
	};
	private static final String[][] SOLUCIONPROVIDER8_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider8.rowVariable}", "solucion"},
		{"#{solucionProvider8.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider8.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider8.array}", "#{ActualizarContenidosViewDefaultviewView.leeTablaKpis.result.leeTablaKpisResponse.rtabla.solucion}"},
	};
	private transient caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV leeTablaMV = null;
	private static final String[][] LEETABLAMV_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaMV.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaMV.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaMV.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider9 = null;
	private static final String[][] SOLUCIONPROVIDER9_PROPERTY_BINDINGS = new String[][] {
		{"#{SolucionProvider9.rowVariable}", "solucion"},
		{"#{SolucionProvider9.valueBinding}", "#{solucion.campo}"},
		{"#{SolucionProvider9.labelBinding}", "#{solucion.campo}"},
		{"#{SolucionProvider9.array}", "#{ActualizarContenidosViewDefaultviewView.leeTablaMV.result.leeTablaMVResponse.rtabla.solucion}"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivoProvider = null;
	private static final String[][] OBJETIVOPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivoProvider.rowType}", "caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub$Objetivo"},
		{"#{ObjetivoProvider.rowVariable}", "objetivo"},
	};
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{ActualizarContenidosViewDefaultviewView.dummyProyectos.parameters.dummyProyectos.dummyProyectos.entrada.marcoLogicoV2}", "#{ActualizarContenidosViewDefaultviewView.actualizarContenidos.taskData.planProyectoV2.planProyecto.marcoLogicoV2}"},
		{"#{ActualizarContenidosViewDefaultviewView.dummyProyectos.refresh}", null},
	};
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
			this.setIndicador("0");
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		   
		   Objetivo[] obj = this.getActualizarContenidos().getTaskData().getPlanProyectoV2().getPlanProyecto().getMarcoLogicoV2().getObjetivo();
		    ObjetivosEspecificos[] objs = this.getActualizarContenidos().getTaskData().getPlanProyectoV2().getPlanProyecto().getMarcoLogicoV2().getObjetivosEspecificos();
		   
		   String al = String.valueOf(obj.length);
		 //  error(al);
		   int y =obj.length;
		   caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub.Objetivo 
	        indicadores[] = new caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub.Objetivo[y];// [obj.length];
		  
	        for (int rt = 0 ; rt<y;rt++)
		    {
	        	indicadores[rt] = new caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.SFCMPCServicesDummyProyectos_WSDStub.Objetivo();
		    	indicadores[rt].setOano1(obj[rt].getOano1());
		    	indicadores[rt].setOano2(obj[rt].getOano2());
		    	indicadores[rt].setOindicador(obj[rt].getOindicador());
		    	indicadores[rt].setOlineaBase(obj[rt].getOlineaBase());
		    	indicadores[rt].setOmv(obj[rt].getOmv());
		    	indicadores[rt].setOset(obj[rt].getOset());
		    	indicadores[rt].setOsupuestos(obj[rt].getOsupuestos());
		    	indicadores[rt].setOvalor(obj[rt].getOvalor());
		        this.getOsupuestosProvider().setArray(obj[rt].getOsupuestos());
		    	
		    }
			 this.getObjetivoProvider().setArray(obj);
			 this.getObjetivosEspecificosProvider().setArray(objs);
			 for(int y1=0;y1<objs.length;y1++)
			 {
				 Especificos[] espe = this.getActualizarContenidos().getTaskData().getPlanProyectoV2().getPlanProyecto().getMarcoLogicoV2().getObjetivosEspecificos()[y1].getEspecificos();
				 this.getEspecificosProvider().setArray(espe);
				 for (int t=0;t<espe.length;t++)
				 {
					 String [] sup = this.getActualizarContenidos().getTaskData().getPlanProyectoV2().getPlanProyecto().getMarcoLogicoV2().getObjetivosEspecificos()[y1].getEspecificos()[t].getRsupuestos();
			         this.getRsupuestosProvider().setArray(sup);
				 }
			 }
			 
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


	public caf.war.generaProyectoTasks.actualizarcontenidosview.ActualizarContenidosView getActualizarContenidosView()  {
		if (actualizarContenidosView == null) {
		    actualizarContenidosView = (caf.war.generaProyectoTasks.actualizarcontenidosview.ActualizarContenidosView)resolveExpression("#{ActualizarContenidosView}");
		}
		return actualizarContenidosView;
	}


	public caf.war.generaProyectoTasks.taskclient.ActualizarContenidos getActualizarContenidos()  {
		if (actualizarContenidos == null) {
		    actualizarContenidos = (caf.war.generaProyectoTasks.taskclient.ActualizarContenidos)resolveExpression("#{ActualizarContenidos}");
		}
	
	    resolveDataBinding(ACTUALIZARCONTENIDOS_PROPERTY_BINDINGS, actualizarContenidos, "actualizarContenidos", false, false);
		return actualizarContenidos;
	}


	public java.lang.String getIndicador()  {
		
		return indicador;
	}


	public void setIndicador(java.lang.String indicador)  {
		this.indicador = indicador;
	}


	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.DummyProyectos getDummyProyectos()  {
		if (dummyProyectos == null) {
		    dummyProyectos = (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyproyectos_wsd.DummyProyectos)resolveExpression("#{DummyProyectos}");
		}
	
	    resolveDataBinding(DUMMYPROYECTOS_PROPERTY_BINDINGS, dummyProyectos, "dummyProyectos", false, false);
		return dummyProyectos;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getOsupuestosProvider()  {
		if (osupuestosProvider == null) {
		    osupuestosProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{OsupuestosProvider}");
		}
	
	    resolveDataBinding(OSUPUESTOSPROVIDER_PROPERTY_BINDINGS, osupuestosProvider, "osupuestosProvider", false, false);
		return osupuestosProvider;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivosEspecificosProvider()  {
		if (objetivosEspecificosProvider == null) {
		    objetivosEspecificosProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivosEspecificosProvider}");
		}
	
	    resolveDataBinding(OBJETIVOSESPECIFICOSPROVIDER_PROPERTY_BINDINGS, objetivosEspecificosProvider, "objetivosEspecificosProvider", false, false);
		return objetivosEspecificosProvider;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEspecificosProvider()  {
		if (especificosProvider == null) {
		    especificosProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EspecificosProvider}");
		}
	
	    resolveDataBinding(ESPECIFICOSPROVIDER_PROPERTY_BINDINGS, especificosProvider, "especificosProvider", false, false);
		return especificosProvider;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getRsupuestosProvider()  {
		if (rsupuestosProvider == null) {
		    rsupuestosProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{RsupuestosProvider}");
		}
	
	    resolveDataBinding(RSUPUESTOSPROVIDER_PROPERTY_BINDINGS, rsupuestosProvider, "rsupuestosProvider", false, false);
		return rsupuestosProvider;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstrategiaProvider()  {
		if (estrategiaProvider == null) {
		    estrategiaProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstrategiaProvider}");
		}
	
	    resolveDataBinding(ESTRATEGIAPROVIDER_PROPERTY_BINDINGS, estrategiaProvider, "estrategiaProvider", false, false);
		return estrategiaProvider;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getTipoParticipanteProvider()  {
		if (tipoParticipanteProvider == null) {
		    tipoParticipanteProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{TipoParticipanteProvider}");
		}
	
	    resolveDataBinding(TIPOPARTICIPANTEPROVIDER_PROPERTY_BINDINGS, tipoParticipanteProvider, "tipoParticipanteProvider", false, false);
		return tipoParticipanteProvider;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getCicloProvider()  {
		if (cicloProvider == null) {
		    cicloProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{CicloProvider}");
		}
	
	    resolveDataBinding(CICLOPROVIDER_PROPERTY_BINDINGS, cicloProvider, "cicloProvider", false, false);
		return cicloProvider;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivosXactividadProvider()  {
		if (objetivosXactividadProvider == null) {
		    objetivosXactividadProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivosXactividadProvider}");
		}
	
	    resolveDataBinding(OBJETIVOSXACTIVIDADPROVIDER_PROPERTY_BINDINGS, objetivosXactividadProvider, "objetivosXactividadProvider", false, false);
		return objetivosXactividadProvider;
	}


	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd.LeeTablaKpis getLeeTablaKpis()  {
		if (leeTablaKpis == null) {
		    leeTablaKpis = (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablakpis_wsd.LeeTablaKpis)resolveExpression("#{LeeTablaKpis}");
		}
	
	    resolveDataBinding(LEETABLAKPIS_PROPERTY_BINDINGS, leeTablaKpis, "leeTablaKpis", false, false);
		return leeTablaKpis;
	}


	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider8()  {
		if (solucionProvider8 == null) {
		    solucionProvider8 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider8}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER8_PROPERTY_BINDINGS, solucionProvider8, "solucionProvider8", false, false);
		return solucionProvider8;
	}


	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV getLeeTablaMV()  {
		if (leeTablaMV == null) {
		    leeTablaMV = (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV)resolveExpression("#{LeeTablaMV}");
		}
	
	    resolveDataBinding(LEETABLAMV_PROPERTY_BINDINGS, leeTablaMV, "leeTablaMV", false, false);
		return leeTablaMV;
	}


	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider9()  {
		if (solucionProvider9 == null) {
		    solucionProvider9 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider9}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER9_PROPERTY_BINDINGS, solucionProvider9, "solucionProvider9", false, false);
		return solucionProvider9;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivoProvider()  {
		if (objetivoProvider == null) {
		    objetivoProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivoProvider}");
		}
	
	    resolveDataBinding(OBJETIVOPROVIDER_PROPERTY_BINDINGS, objetivoProvider, "objetivoProvider", false, false);
		return objetivoProvider;
	}
	
	
	
}