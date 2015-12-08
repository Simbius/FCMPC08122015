/**
 * 
 */
package caf.war.fcmpcProyecto.generarproyecto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "GenerarProyectoDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "GenerarProyecto/default", beanType = BeanType.PAGE)
public class GenerarProyectoDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private transient caf.war.fcmpcProyecto.generarproyecto.GenerarProyecto generarProyecto = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider plantaProvider2 = null;
	private static final String[][] PLANTAPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{PlantaProvider2.rowType}", "java.lang.String"},
		{"#{PlantaProvider2.rowVariable}", "planta"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider establecimientosProvider2 = null;
	private static final String[][] ESTABLECIMIENTOSPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{EstablecimientosProvider2.rowType}", "caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub$Establecimientos"},
		{"#{EstablecimientosProvider2.rowVariable}", "establecimiento"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider profesionalesProvider2 = null;
	private static final String[][] PROFESIONALESPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{ProfesionalesProvider2.rowType}", "java.lang.String"},
		{"#{ProfesionalesProvider2.rowVariable}", "profesionale"},
	};
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd.LeeTablaComuna leeTablaComuna = null;
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado leeTablaEncargado = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider2 = null;
	private static final String[][] LEETABLACOMUNA_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaComuna.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaComuna.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaComuna.autoRefresh}", "true"},
	};
	private static final String[][] LEETABLAENCARGADO_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaEncargado.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaEncargado.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaEncargado.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider3 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider4 = null;
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaplanta_wsd.LeeTablaPlanta leeTablaPlanta = null;
	private static final String[][] LEETABLAPLANTA_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaPlanta.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaPlanta.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaPlanta.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider5 = null;
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado2 leeTablaEncargado2 = null;
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.LeeTablaEstablecimiento leeTablaEstablecimiento = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider6 = null;
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaplanta_wsd.LeeTablaPlanta2 leeTablaPlanta2 = null;
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaprofesional_wsd.LeeTablaProfesional leeTablaProfesional = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider7 = null;
	private static final String[][] LEETABLAPROFESIONAL_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaProfesional.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaProfesional.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaProfesional.autoRefresh}", "true"},
	};
	private static final String[][] LEETABLAPLANTA2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaPlanta2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaPlanta2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaPlanta2.autoRefresh}", "true"},
	};
	private static final String[][] LEETABLAESTABLECIMIENTO_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaEstablecimiento.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaEstablecimiento.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaEstablecimiento.autoRefresh}", "true"},
	};
	private static final String[][] LEETABLAENCARGADO2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaEncargado2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaEncargado2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaEncargado2.autoRefresh}", "true"},
	};
	private static final String[][] SOLUCIONPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider2.rowVariable}", "solucion"},
		{"#{solucionProvider2.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider2.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider2.array}", "#{GenerarProyectoDefaultviewView.leeTablaComuna.result.leeTablaComunaResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider3.rowVariable}", "solucion"},
		{"#{solucionProvider3.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider3.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider3.array}", "#{GenerarProyectoDefaultviewView.leeTablaComuna.result.leeTablaComunaResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER5_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider5.rowVariable}", "solucion"},
		{"#{solucionProvider5.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider5.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider5.array}", "#{GenerarProyectoDefaultviewView.leeTablaPlanta.result.leeTablaPlantaResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER6_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider6.rowVariable}", "solucion"},
		{"#{solucionProvider6.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider6.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider6.array}", "#{GenerarProyectoDefaultviewView.leeTablaEstablecimiento.result.leeTablaEstablecimientoResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER7_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider7.rowVariable}", "solucion"},
		{"#{solucionProvider7.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider7.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider7.array}", "#{GenerarProyectoDefaultviewView.leeTablaProfesional.result.leeTablaProfesionalResponse.rtabla.solucion}"},
	};
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.GeneradorProyecto21 generadorProyecto2 = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider plantaProvider4 = null;
	private static final String[][] PLANTAPROVIDER4_PROPERTY_BINDINGS = new String[][] {
		{"#{PlantaProvider4.rowType}", "java.lang.String"},
		{"#{PlantaProvider4.rowVariable}", "planta"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider establecimientosProvider4 = null;
	private static final String[][] ESTABLECIMIENTOSPROVIDER4_PROPERTY_BINDINGS = new String[][] {
		{"#{EstablecimientosProvider4.rowType}", "caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.SFCMPCServicesGeneradorProyecto_WSDStub$Establecimientos"},
		{"#{EstablecimientosProvider4.rowVariable}", "establecimiento"},
	};
	private static final String[][] GENERADORPROYECTO2_PROPERTY_BINDINGS = new String[][] {
		{"#{generadorProyecto2.authCredentials.authenticationMethod}", "1"},
		{"#{generadorProyecto2.authCredentials.requiresAuth}", "true"},
		{"#{generadorProyecto2.autoRefresh}", "false"},
		{"#{generadorProyecto2.parameters.generadorProyecto.generadorProyecto.proyecto.planta}", "#{GenerarProyectoDefaultviewView.plantaProvider4.array}"},
		{"#{generadorProyecto2.parameters.generadorProyecto.generadorProyecto.proyecto.establecimientos}", "#{GenerarProyectoDefaultviewView.establecimientosProvider4.array}"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider plantaProvider4Provider = null;
	private static final String[][] PLANTAPROVIDER4PROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{PlantaProvider4Provider.rowVariable}", "planta"},
		{"#{PlantaProvider4Provider.valueBinding}", "#{planta.expireWithPageFlow}"},
		{"#{PlantaProvider4Provider.labelBinding}", "#{planta.expireWithPageFlow}"},
		{"#{PlantaProvider4Provider.table}", "#{GenerarProyectoDefaultviewView.plantaProvider4}"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider8 = null;
	private static final String[][] SOLUCIONPROVIDER8_PROPERTY_BINDINGS = new String[][] {
		{"#{SolucionProvider8.rowVariable}", "solucion"},
		{"#{SolucionProvider8.valueBinding}", "#{solucion.campo}"},
		{"#{SolucionProvider8.labelBinding}", "#{solucion.campo}"},
		{"#{SolucionProvider8.array}", "#{GenerarProyectoDefaultviewView.leeTablaPlanta.result.leeTablaPlantaResponse.rtabla.solucion}"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider9 = null;
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd.GetMLogico getMLogico = null;
	private static final String[][] GETMLOGICO_PROPERTY_BINDINGS = new String[][] {
		{"#{GetMLogico.authCredentials.authenticationMethod}", "1"},
		{"#{GetMLogico.authCredentials.requiresAuth}", "true"},
		{"#{GetMLogico.autoRefresh}", "false"},
	};
	private transient caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablamodelos_wsd.LeeTablaModelos2 leeTablaModelos2 = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider10 = null;
	private static final String[][] SOLUCIONPROVIDER10_PROPERTY_BINDINGS = new String[][] {
		{"#{SolucionProvider10.rowVariable}", "solucion"},
		{"#{SolucionProvider10.valueBinding}", "#{solucion.campo}"},
		{"#{SolucionProvider10.labelBinding}", "#{solucion.campo}"},
		{"#{SolucionProvider10.array}", "#{GenerarProyectoDefaultviewView.leeTablaModelos2.result.leeTablaModelosResponse.modelos.solucion}"},
	};
	private static final String[][] ACTIONLEECARGA_PROPERTY_BINDINGS = new String[][] {
		{"#{GenerarProyectoDefaultviewView.getMLogico.refresh}", null},
		{"#{GenerarProyectoDefaultviewView.generadorProyecto2.parameters.generadorProyecto.generadorProyecto.proyecto.nombrePro}", "#{GenerarProyectoDefaultviewView.getMLogico.result.getMLogicoResponse.marcoLogicoV1.nombrePro}"},
	};
	private static final String[][] LEETABLAMODELOS2_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaModelos2.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaModelos2.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaModelos2.autoRefresh}", "true"},
	};
	private static final String[][] SOLUCIONPROVIDER4_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider4.rowVariable}", "solucion"},
		{"#{solucionProvider4.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider4.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider4.array}", "#{GenerarProyectoDefaultviewView.leeTablaEncargado.result.leeTablaEncargadoResponse.rtabla.solucion}"},
	};
	private static final String[][] SOLUCIONPROVIDER9_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider9.rowVariable}", "solucion"},
		{"#{solucionProvider9.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider9.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider9.array}", "#{GenerarProyectoDefaultviewView.leeTablaPlanta.result.leeTablaPlantaResponse.rtabla.solucion}"},
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

	public caf.war.fcmpcProyecto.generarproyecto.GenerarProyecto getGenerarProyecto()  {
		if (generarProyecto == null) {
		    generarProyecto = (caf.war.fcmpcProyecto.generarproyecto.GenerarProyecto)resolveExpression("#{GenerarProyecto}");
		}
		return generarProyecto;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getPlantaProvider2()  {
		if (plantaProvider2 == null) {
		    plantaProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{PlantaProvider2}");
		}
	
	    resolveDataBinding(PLANTAPROVIDER2_PROPERTY_BINDINGS, plantaProvider2, "plantaProvider2", false, false);
		return plantaProvider2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstablecimientosProvider2()  {
		if (establecimientosProvider2 == null) {
		    establecimientosProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstablecimientosProvider2}");
		}
	
	    resolveDataBinding(ESTABLECIMIENTOSPROVIDER2_PROPERTY_BINDINGS, establecimientosProvider2, "establecimientosProvider2", false, false);
		return establecimientosProvider2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getProfesionalesProvider2()  {
		if (profesionalesProvider2 == null) {
		    profesionalesProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ProfesionalesProvider2}");
		}
	
	    resolveDataBinding(PROFESIONALESPROVIDER2_PROPERTY_BINDINGS, profesionalesProvider2, "profesionalesProvider2", false, false);
		return profesionalesProvider2;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd.LeeTablaComuna getLeeTablaComuna()  {
		if (leeTablaComuna == null) {
		    leeTablaComuna = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablacomuna_wsd.LeeTablaComuna)resolveExpression("#{LeeTablaComuna}");
		}
	
	    resolveDataBinding(LEETABLACOMUNA_PROPERTY_BINDINGS, leeTablaComuna, "leeTablaComuna", false, false);
		return leeTablaComuna;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado getLeeTablaEncargado()  {
		if (leeTablaEncargado == null) {
		    leeTablaEncargado = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado)resolveExpression("#{LeeTablaEncargado}");
		}
	
	    resolveDataBinding(LEETABLAENCARGADO_PROPERTY_BINDINGS, leeTablaEncargado, "leeTablaEncargado", false, false);
		return leeTablaEncargado;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider2()  {
		if (solucionProvider2 == null) {
		    solucionProvider2 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider2}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER2_PROPERTY_BINDINGS, solucionProvider2, "solucionProvider2", false, false);
		return solucionProvider2;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider3()  {
		if (solucionProvider3 == null) {
		    solucionProvider3 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider3}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER3_PROPERTY_BINDINGS, solucionProvider3, "solucionProvider3", false, false);
		return solucionProvider3;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider4()  {
		if (solucionProvider4 == null) {
		    solucionProvider4 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider4}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER4_PROPERTY_BINDINGS, solucionProvider4, "solucionProvider4", false, false);
		return solucionProvider4;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaplanta_wsd.LeeTablaPlanta getLeeTablaPlanta()  {
		if (leeTablaPlanta == null) {
		    leeTablaPlanta = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaplanta_wsd.LeeTablaPlanta)resolveExpression("#{LeeTablaPlanta}");
		}
	
	    resolveDataBinding(LEETABLAPLANTA_PROPERTY_BINDINGS, leeTablaPlanta, "leeTablaPlanta", false, false);
		return leeTablaPlanta;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider5()  {
		if (solucionProvider5 == null) {
		    solucionProvider5 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider5}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER5_PROPERTY_BINDINGS, solucionProvider5, "solucionProvider5", false, false);
		return solucionProvider5;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado2 getLeeTablaEncargado2()  {
		if (leeTablaEncargado2 == null) {
		    leeTablaEncargado2 = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaencargado_wsd.LeeTablaEncargado2)resolveExpression("#{LeeTablaEncargado2}");
		}
	
	    resolveDataBinding(LEETABLAENCARGADO2_PROPERTY_BINDINGS, leeTablaEncargado2, "leeTablaEncargado2", false, false);
		return leeTablaEncargado2;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.LeeTablaEstablecimiento getLeeTablaEstablecimiento()  {
		if (leeTablaEstablecimiento == null) {
		    leeTablaEstablecimiento = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaestablecimiento_wsd.LeeTablaEstablecimiento)resolveExpression("#{LeeTablaEstablecimiento}");
		}
	
	    resolveDataBinding(LEETABLAESTABLECIMIENTO_PROPERTY_BINDINGS, leeTablaEstablecimiento, "leeTablaEstablecimiento", false, false);
		return leeTablaEstablecimiento;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider6()  {
		if (solucionProvider6 == null) {
		    solucionProvider6 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider6}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER6_PROPERTY_BINDINGS, solucionProvider6, "solucionProvider6", false, false);
		return solucionProvider6;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaplanta_wsd.LeeTablaPlanta2 getLeeTablaPlanta2()  {
		if (leeTablaPlanta2 == null) {
		    leeTablaPlanta2 = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaplanta_wsd.LeeTablaPlanta2)resolveExpression("#{LeeTablaPlanta2}");
		}
	
	    resolveDataBinding(LEETABLAPLANTA2_PROPERTY_BINDINGS, leeTablaPlanta2, "leeTablaPlanta2", false, false);
		return leeTablaPlanta2;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaprofesional_wsd.LeeTablaProfesional getLeeTablaProfesional()  {
		if (leeTablaProfesional == null) {
		    leeTablaProfesional = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablaprofesional_wsd.LeeTablaProfesional)resolveExpression("#{LeeTablaProfesional}");
		}
	
	    resolveDataBinding(LEETABLAPROFESIONAL_PROPERTY_BINDINGS, leeTablaProfesional, "leeTablaProfesional", false, false);
		return leeTablaProfesional;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider7()  {
		if (solucionProvider7 == null) {
		    solucionProvider7 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider7}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER7_PROPERTY_BINDINGS, solucionProvider7, "solucionProvider7", false, false);
		return solucionProvider7;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.GeneradorProyecto21 getGeneradorProyecto2()  {
		if (generadorProyecto2 == null) {
		    generadorProyecto2 = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.generadorproyecto_wsd.GeneradorProyecto21)resolveExpression("#{GeneradorProyecto2}");
		}
	
	    resolveDataBinding(GENERADORPROYECTO2_PROPERTY_BINDINGS, generadorProyecto2, "generadorProyecto2", false, false);
		return generadorProyecto2;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getPlantaProvider4()  {
		if (plantaProvider4 == null) {
		    plantaProvider4 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{PlantaProvider4}");
		}
	
	    resolveDataBinding(PLANTAPROVIDER4_PROPERTY_BINDINGS, plantaProvider4, "plantaProvider4", false, false);
		return plantaProvider4;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstablecimientosProvider4()  {
		if (establecimientosProvider4 == null) {
		    establecimientosProvider4 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstablecimientosProvider4}");
		}
	
	    resolveDataBinding(ESTABLECIMIENTOSPROVIDER4_PROPERTY_BINDINGS, establecimientosProvider4, "establecimientosProvider4", false, false);
		return establecimientosProvider4;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getPlantaProvider4Provider()  {
		if (plantaProvider4Provider == null) {
		    plantaProvider4Provider = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{PlantaProvider4Provider}");
		}
	
	    resolveDataBinding(PLANTAPROVIDER4PROVIDER_PROPERTY_BINDINGS, plantaProvider4Provider, "plantaProvider4Provider", false, false);
		return plantaProvider4Provider;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider8()  {
		if (solucionProvider8 == null) {
		    solucionProvider8 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider8}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER8_PROPERTY_BINDINGS, solucionProvider8, "solucionProvider8", false, false);
		return solucionProvider8;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider9()  {
		if (solucionProvider9 == null) {
		    solucionProvider9 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider9}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER9_PROPERTY_BINDINGS, solucionProvider9, "solucionProvider9", false, false);
		return solucionProvider9;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd.GetMLogico getGetMLogico()  {
		if (getMLogico == null) {
		    getMLogico = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.getmlogico_wsd.GetMLogico)resolveExpression("#{GetMLogico}");
		}
	
	    resolveDataBinding(GETMLOGICO_PROPERTY_BINDINGS, getMLogico, "getMLogico", false, false);
		return getMLogico;
	}

	public caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablamodelos_wsd.LeeTablaModelos2 getLeeTablaModelos2()  {
		if (leeTablaModelos2 == null) {
		    leeTablaModelos2 = (caf.war.fcmpcProyecto.wsclient.sfcmpc.services.leetablamodelos_wsd.LeeTablaModelos2)resolveExpression("#{LeeTablaModelos2}");
		}
	
	    resolveDataBinding(LEETABLAMODELOS2_PROPERTY_BINDINGS, leeTablaModelos2, "leeTablaModelos2", false, false);
		return leeTablaModelos2;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider10()  {
		if (solucionProvider10 == null) {
		    solucionProvider10 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider10}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER10_PROPERTY_BINDINGS, solucionProvider10, "solucionProvider10", false, false);
		return solucionProvider10;
	}

	public String actionLeeCarga() {
	    resolveDataBinding(ACTIONLEECARGA_PROPERTY_BINDINGS, this, "actionLeeCarga.this", true, false);
		return null;
	}
	
}