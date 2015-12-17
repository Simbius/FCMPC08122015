package caf.war.generaProyectoTasks.is.document;

import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SFCMPC_docs_planProyectoV2 extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "sFCMPC.docs:planProyectoV2";
	// Used by Designer to access the source document.
	@SuppressWarnings("unused")
	private static final String DOCUMENT_SRC = "http://172.16.58.129:5555";
	public static String[][] FIELD_NAMES = new String[][] {{"planProyecto", "planProyecto"},
	};
	private caf.war.generaProyectoTasks.is.document.SFCMPC_docs_planProyectoV2.PlanProyecto planProyecto = null;
	

	public SFCMPC_docs_planProyectoV2() {
	}


	/**
	 * IS document wrapper
	 */
	public static class PlanProyecto extends java.lang.Object implements Serializable {
	
		
		private static final long serialVersionUID = 1L;
		private caf.war.generaProyectoTasks.is.document.SFCMPC_docs_marcoLogicoV2 marcoLogicoV2 = null;
		private java.lang.String comentarios;
		private java.lang.String tipoOperacion;
		public static String[][] FIELD_NAMES = new String[][] {{"marcoLogicoV2", "marcoLogicoV2"},{"comentarios", "Comentarios"},{"tipoOperacion", "tipoOperacion"},{"aprobacion", "aprobacion"},
		};
		private java.lang.String aprobacion;
		
	
		public PlanProyecto() {
		}


		public caf.war.generaProyectoTasks.is.document.SFCMPC_docs_marcoLogicoV2 getMarcoLogicoV2()  {
			if (marcoLogicoV2 == null) {
				marcoLogicoV2 = new caf.war.generaProyectoTasks.is.document.SFCMPC_docs_marcoLogicoV2();
			}
			return marcoLogicoV2;
		}


		public void setMarcoLogicoV2(caf.war.generaProyectoTasks.is.document.SFCMPC_docs_marcoLogicoV2 marcoLogicoV2)  {
			this.marcoLogicoV2 = marcoLogicoV2;
		}


		public java.lang.String getComentarios()  {
			
			return comentarios;
		}


		public void setComentarios(java.lang.String comentarios)  {
			this.comentarios = comentarios;
		}


		public java.lang.String getTipoOperacion()  {
			
			return tipoOperacion;
		}


		public void setTipoOperacion(java.lang.String tipoOperacion)  {
			this.tipoOperacion = tipoOperacion;
		}


		public java.lang.String getAprobacion()  {
			
			return aprobacion;
		}


		public void setAprobacion(java.lang.String aprobacion)  {
			this.aprobacion = aprobacion;
		}
	
	}


	public caf.war.generaProyectoTasks.is.document.SFCMPC_docs_planProyectoV2.PlanProyecto getPlanProyecto()  {
		if (planProyecto == null) {
			planProyecto = new caf.war.generaProyectoTasks.is.document.SFCMPC_docs_planProyectoV2.PlanProyecto();
		}
		return planProyecto;
	}


	public void setPlanProyecto(caf.war.generaProyectoTasks.is.document.SFCMPC_docs_planProyectoV2.PlanProyecto planProyecto)  {
		this.planProyecto = planProyecto;
	}

}