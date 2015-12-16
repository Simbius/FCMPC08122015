/**
 * 
 */
package caf.war.generaProyectoTasks.completadatosproyectoview1;

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

@ManagedBean(name = "CompletaDatosProyectoView1DefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "CompletaDatosProyectoView1/default", beanType = BeanType.PAGE)
public class CompletaDatosProyectoView1DefaultviewView extends com.webmethods.caf.faces.bean.task.BaseTaskDetailsPageBean {

 
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
		{"#{TaskDisplayProvider.taskID}", "#{CompletaDatosProyectoView1.taskID}"},
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
			String url = getCompletaDatosProyectoView1().getFinishUrl();
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
		String seguimiento = "Uno";
		try {
			if( !getCompletaDatosProyecto2().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}
            seguimiento = "Dos";
			// do the work
			getCompletaDatosProyecto2().completeTask(); 
			seguimiento = "Tres";
			// then redirect to finish url
			String url = getCompletaDatosProyectoView1().getFinishUrl(); 
			seguimiento = "Cuatro";
			if (url != null && url.length() > 0) {
				getFacesContext().getExternalContext().redirect(url);
			}
		} catch (Exception e) {
			error(e);
			log(seguimiento +"-Error con Valor = "+e);
		}
		return null;
	}	

	/**
	 * Submit button action handler
	 */
	public String submitTask() {
		try {
			if( !getCompletaDatosProyecto2().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}


			// do the work
			getCompletaDatosProyecto2().applyChanges();
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
			TaskContentProvider tp = getCompletaDatosProyecto2();

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
		{"#{CompletaDatosProyecto2.reset}", null}
	};
	private transient caf.war.generaProyectoTasks.completadatosproyectoview1.CompletaDatosProyectoView1 completaDatosProyectoView1 = null;
	private caf.war.generaProyectoTasks.taskclient.CompletaDatosProyecto2 completaDatosProyecto2 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider = null;
	private static final String[][] SOLUCIONPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider.rowVariable}", "solucion"},
		{"#{solucionProvider.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider.array}", "#{CompletaDatosProyectoView1DefaultviewView.completaDatosProyecto2.leeTablaEncargado.result.leeTablaEncargadoResponse.rtabla.solucion}"},
	};
	private transient caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablacomuna_wsd.LeeTablaComuna leeTablaComuna = null;
	private static final String[][] COMPLETADATOSPROYECTO2_PROPERTY_BINDINGS = new String[][] {
		{"#{completaDatosProyecto2.taskID}", "#{CompletaDatosProyectoView1.taskID}"},
		{"#{completaDatosProyecto2.autoAccept}", "true"},
		{"#{completaDatosProyecto2.adhocRouting}", "false"},
		
	};
	private static final String[][] LEETABLACOMUNA_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaComuna.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaComuna.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaComuna.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider2 = null;
	private static final String[][] SOLUCIONPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider2.rowVariable}", "solucion"},
		{"#{solucionProvider2.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider2.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider2.array}", "#{CompletaDatosProyectoView1DefaultviewView.leeTablaComuna.result.leeTablaComunaResponse.rtabla.solucion}"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider plantaProvider = null;
	private static final String[][] PLANTAPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{PlantaProvider.rowType}", "java.lang.String"},
		{"#{PlantaProvider.rowVariable}", "planta"},
		{"#{PlantaProvider.array}", "#{CompletaDatosProyectoView1DefaultviewView.completaDatosProyecto2.taskData.planProyectoV2.planProyecto.marcoLogicoV2.planta}"},
	};
	private transient caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd.LeeTablaPlanta leeTablaPlanta = null;
	private static final String[][] LEETABLAPLANTA_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaPlanta.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaPlanta.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaPlanta.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider3 = null;
	private static final String[][] SOLUCIONPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider3.rowVariable}", "solucion"},
		{"#{solucionProvider3.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider3.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider3.array}", "#{CompletaDatosProyectoView1DefaultviewView.leeTablaPlanta.result.leeTablaPlantaResponse.rtabla.solucion}"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider establecimientosProvider = null;
	private static final String[][] ESTABLECIMIENTOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{EstablecimientosProvider.rowType}", "caf.war.generaProyectoTasks.is.document.SFCMPC_docs_marcoLogicoV2$Establecimientos"},
		{"#{EstablecimientosProvider.rowVariable}", "establecimiento"},
		{"#{EstablecimientosProvider.array}", "#{CompletaDatosProyectoView1DefaultviewView.completaDatosProyecto2.taskData.planProyectoV2.planProyecto.marcoLogicoV2.establecimientos}"},
	};
	private transient caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.LeeTablaEstablecimiento leeTablaEstablecimiento = null;
	private static final String[][] LEETABLAESTABLECIMIENTO_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaEstablecimiento.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaEstablecimiento.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaEstablecimiento.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider4 = null;
	private static final String[][] SOLUCIONPROVIDER4_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider4.rowVariable}", "solucion"},
		{"#{solucionProvider4.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider4.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider4.array}", "#{CompletaDatosProyectoView1DefaultviewView.leeTablaEstablecimiento.result.leeTablaEstablecimientoResponse.rtabla.solucion}"},
	};
	private transient caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd.LeeTablaProfesional leeTablaProfesional = null;
	private static final String[][] LEETABLAPROFESIONAL_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaProfesional.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaProfesional.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaProfesional.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider5 = null;
	private transient caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado2 leeTablaEncargado2 = null;
	private static final String[][] LEETABLAENCARGADO2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaEncargado2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaEncargado2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaEncargado2.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider6 = null;
	private static final String[][] SOLUCIONPROVIDER6_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider6.rowVariable}", "solucion"},
		{"#{solucionProvider6.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider6.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider6.array}", "#{CompletaDatosProyectoView1DefaultviewView.leeTablaEncargado2.result.leeTablaEncargadoResponse.rtabla.solucion}"},
	};
	private transient com.webmethods.caf.faces.data.object.SelectableListTableContentProvider plantaProvider2 = null;
	private static final String[][] PLANTAPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{PlantaProvider2.rowType}", "java.lang.String"},
		{"#{PlantaProvider2.rowVariable}", "planta"},
		{"#{PlantaProvider2.rowIdBinding}", "#{planta}"},
		{"#{PlantaProvider2.array}", "#{CompletaDatosProyectoView1DefaultviewView.completaDatosProyecto2.taskData.planProyectoV2.planProyecto.marcoLogicoV2.planta}"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider7 = null;
	private static final String[][] SOLUCIONPROVIDER7_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider7.rowVariable}", "solucion"},
		{"#{solucionProvider7.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider7.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider7.array}", "#{CompletaDatosProyectoView1DefaultviewView.leeTablaPlanta.result.leeTablaPlantaResponse.rtabla.solucion}"},
	};
	private transient com.webmethods.caf.faces.data.object.SelectableListTableContentProvider profesionalesProvider = null;
	private static final String[][] PROFESIONALESPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{ProfesionalesProvider.rowType}", "java.lang.String"},
		{"#{ProfesionalesProvider.rowVariable}", "profesionale"},
		{"#{ProfesionalesProvider.rowIdBinding}", "#{profesionale}"},
		{"#{ProfesionalesProvider.array}", "#{establecimiento.profesionales}"},
	};
	private transient caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.DummyEstablecimientos dummyEstablecimientos = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider establecimientosProvider2 = null;
	private static final String[][] ESTABLECIMIENTOSPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{EstablecimientosProvider2.rowType}", "caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.SFCMPCServicesDummyEstablecimientos_WSDStub$Establecimientos"},
		{"#{EstablecimientosProvider2.rowVariable}", "establecimiento"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider establecimientosProvider3 = null;
	private static final String[][] ESTABLECIMIENTOSPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{EstablecimientosProvider3.rowType}", "caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.SFCMPCServicesDummyEstablecimientos_WSDStub$Establecimientos"},
		{"#{EstablecimientosProvider3.rowVariable}", "establecimiento"},
	};
	private static final String[][] DUMMYESTABLECIMIENTOS_PROPERTY_BINDINGS = new String[][] {
		{"#{dummyEstablecimientos.authCredentials.authenticationMethod}", "1"},
		{"#{dummyEstablecimientos.authCredentials.requiresAuth}", "true"},
		{"#{dummyEstablecimientos.autoRefresh}", "false"},
		{"#{dummyEstablecimientos.parameters.dummyEstablecimientos.dummyEstablecimientos.entrada.establecimientos}", "#{CompletaDatosProyectoView1DefaultviewView.establecimientosProvider3.array}"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider profesionalesProvider2 = null;
	private static final String[][] PROFESIONALESPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{ProfesionalesProvider2.rowType}", "java.lang.String"},
		{"#{ProfesionalesProvider2.rowVariable}", "profesionale"},
	};
	private static final String[][] SOLUCIONPROVIDER5_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider5.rowVariable}", "solucion"},
		{"#{solucionProvider5.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider5.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider5.array}", "#{CompletaDatosProyectoView1DefaultviewView.leeTablaProfesional.result.leeTablaProfesionalResponse.rtabla.solucion}"},
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
	
	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
		
	}


	public caf.war.generaProyectoTasks.completadatosproyectoview1.CompletaDatosProyectoView1 getCompletaDatosProyectoView1()  {
		if (completaDatosProyectoView1 == null) {
		    completaDatosProyectoView1 = (caf.war.generaProyectoTasks.completadatosproyectoview1.CompletaDatosProyectoView1)resolveExpression("#{CompletaDatosProyectoView1}");
		}
		return completaDatosProyectoView1;
	}


	public caf.war.generaProyectoTasks.taskclient.CompletaDatosProyecto2 getCompletaDatosProyecto2()  {
		if (completaDatosProyecto2 == null) {
		    completaDatosProyecto2 = (caf.war.generaProyectoTasks.taskclient.CompletaDatosProyecto2)resolveExpression("#{CompletaDatosProyecto2}");
		}
	
	    resolveDataBinding(COMPLETADATOSPROYECTO2_PROPERTY_BINDINGS, completaDatosProyecto2, "completaDatosProyecto2", false, false);
		return completaDatosProyecto2;
	}


	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider()  {
		if (solucionProvider == null) {
		    solucionProvider = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER_PROPERTY_BINDINGS, solucionProvider, "solucionProvider", false, false);
		return solucionProvider;
	}


	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablacomuna_wsd.LeeTablaComuna getLeeTablaComuna()  {
		if (leeTablaComuna == null) {
		    leeTablaComuna = (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablacomuna_wsd.LeeTablaComuna)resolveExpression("#{LeeTablaComuna}");
		}
	
	    resolveDataBinding(LEETABLACOMUNA_PROPERTY_BINDINGS, leeTablaComuna, "leeTablaComuna", false, false);
		return leeTablaComuna;
	}


	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider2()  {
		if (solucionProvider2 == null) {
		    solucionProvider2 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider2}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER2_PROPERTY_BINDINGS, solucionProvider2, "solucionProvider2", false, false);
		return solucionProvider2;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getPlantaProvider()  {
		if (plantaProvider == null) {
		    plantaProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{PlantaProvider}");
		}
	
	    resolveDataBinding(PLANTAPROVIDER_PROPERTY_BINDINGS, plantaProvider, "plantaProvider", false, false);
		return plantaProvider;
	}


	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd.LeeTablaPlanta getLeeTablaPlanta()  {
		if (leeTablaPlanta == null) {
		    leeTablaPlanta = (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaplanta_wsd.LeeTablaPlanta)resolveExpression("#{LeeTablaPlanta}");
		}
	
	    resolveDataBinding(LEETABLAPLANTA_PROPERTY_BINDINGS, leeTablaPlanta, "leeTablaPlanta", false, false);
		return leeTablaPlanta;
	}


	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider3()  {
		if (solucionProvider3 == null) {
		    solucionProvider3 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider3}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER3_PROPERTY_BINDINGS, solucionProvider3, "solucionProvider3", false, false);
		return solucionProvider3;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstablecimientosProvider()  {
		if (establecimientosProvider == null) {
		    establecimientosProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstablecimientosProvider}");
		}
	
	    resolveDataBinding(ESTABLECIMIENTOSPROVIDER_PROPERTY_BINDINGS, establecimientosProvider, "establecimientosProvider", false, false);
		return establecimientosProvider;
	}


	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.LeeTablaEstablecimiento getLeeTablaEstablecimiento()  {
		if (leeTablaEstablecimiento == null) {
		    leeTablaEstablecimiento = (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.LeeTablaEstablecimiento)resolveExpression("#{LeeTablaEstablecimiento}");
		}
	
	    resolveDataBinding(LEETABLAESTABLECIMIENTO_PROPERTY_BINDINGS, leeTablaEstablecimiento, "leeTablaEstablecimiento", false, false);
		return leeTablaEstablecimiento;
	}


	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider4()  {
		if (solucionProvider4 == null) {
		    solucionProvider4 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider4}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER4_PROPERTY_BINDINGS, solucionProvider4, "solucionProvider4", false, false);
		return solucionProvider4;
	}


	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd.LeeTablaProfesional getLeeTablaProfesional()  {
		if (leeTablaProfesional == null) {
		    leeTablaProfesional = (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaprofesional_wsd.LeeTablaProfesional)resolveExpression("#{LeeTablaProfesional}");
		}
	
	    resolveDataBinding(LEETABLAPROFESIONAL_PROPERTY_BINDINGS, leeTablaProfesional, "leeTablaProfesional", false, false);
		return leeTablaProfesional;
	}


	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider5()  {
		if (solucionProvider5 == null) {
		    solucionProvider5 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider5}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER5_PROPERTY_BINDINGS, solucionProvider5, "solucionProvider5", false, false);
		return solucionProvider5;
	}


	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado2 getLeeTablaEncargado2()  {
		if (leeTablaEncargado2 == null) {
		    leeTablaEncargado2 = (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado2)resolveExpression("#{LeeTablaEncargado2}");
		}
	
	    resolveDataBinding(LEETABLAENCARGADO2_PROPERTY_BINDINGS, leeTablaEncargado2, "leeTablaEncargado2", false, false);
		return leeTablaEncargado2;
	}


	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider6()  {
		if (solucionProvider6 == null) {
		    solucionProvider6 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider6}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER6_PROPERTY_BINDINGS, solucionProvider6, "solucionProvider6", false, false);
		return solucionProvider6;
	}


	public com.webmethods.caf.faces.data.object.SelectableListTableContentProvider getPlantaProvider2()  {
		if (plantaProvider2 == null) {
		    plantaProvider2 = (com.webmethods.caf.faces.data.object.SelectableListTableContentProvider)resolveExpression("#{PlantaProvider2}");
		}
	
	    resolveDataBinding(PLANTAPROVIDER2_PROPERTY_BINDINGS, plantaProvider2, "plantaProvider2", false, false);
		return plantaProvider2;
	}


	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider7()  {
		if (solucionProvider7 == null) {
		    solucionProvider7 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider7}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER7_PROPERTY_BINDINGS, solucionProvider7, "solucionProvider7", false, false);
		return solucionProvider7;
	}


	public com.webmethods.caf.faces.data.object.SelectableListTableContentProvider getProfesionalesProvider()  {
		if (profesionalesProvider == null) {
		    profesionalesProvider = (com.webmethods.caf.faces.data.object.SelectableListTableContentProvider)resolveExpression("#{ProfesionalesProvider}");
		}
	
	    resolveDataBinding(PROFESIONALESPROVIDER_PROPERTY_BINDINGS, profesionalesProvider, "profesionalesProvider", false, false);
		return profesionalesProvider;
	}


	public caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.DummyEstablecimientos getDummyEstablecimientos()  {
		if (dummyEstablecimientos == null) {
		    dummyEstablecimientos = (caf.war.generaProyectoTasks.wsclient.sfcmpc.services.dummyestablecimientos_wsd.DummyEstablecimientos)resolveExpression("#{DummyEstablecimientos}");
		}
	
	    resolveDataBinding(DUMMYESTABLECIMIENTOS_PROPERTY_BINDINGS, dummyEstablecimientos, "dummyEstablecimientos", false, false);
		return dummyEstablecimientos;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstablecimientosProvider2()  {
		if (establecimientosProvider2 == null) {
		    establecimientosProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstablecimientosProvider2}");
		}
	
	    resolveDataBinding(ESTABLECIMIENTOSPROVIDER2_PROPERTY_BINDINGS, establecimientosProvider2, "establecimientosProvider2", false, false);
		return establecimientosProvider2;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstablecimientosProvider3()  {
		if (establecimientosProvider3 == null) {
		    establecimientosProvider3 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstablecimientosProvider3}");
		}
	
	    resolveDataBinding(ESTABLECIMIENTOSPROVIDER3_PROPERTY_BINDINGS, establecimientosProvider3, "establecimientosProvider3", false, false);
		return establecimientosProvider3;
	}


	public com.webmethods.caf.faces.data.object.ListTableContentProvider getProfesionalesProvider2()  {
		if (profesionalesProvider2 == null) {
		    profesionalesProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ProfesionalesProvider2}");
		}
	
	    resolveDataBinding(PROFESIONALESPROVIDER2_PROPERTY_BINDINGS, profesionalesProvider2, "profesionalesProvider2", false, false);
		return profesionalesProvider2;
	}
	
	
	
}