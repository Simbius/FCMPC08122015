package caf.war.crearMarcoLogicoTasks.is.document;

import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SFCMPC_docs_marcoLogicoV1 extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "sFCMPC.docs:marcoLogicoV1";
	private java.lang.String nombrePro;
	private java.lang.String periodo;
	private java.lang.String fechaDesde;
	private java.lang.String fechaHasta;
	private java.lang.String encargado;
	private java.lang.String[] planta = null;
	private java.lang.String[] comuna = null;
	private java.lang.String[] profesionales = null;
	private java.lang.String[] establecimientos = null;
	private java.lang.String objetivoGeneral;
	private caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.Objetivo[] objetivo = null;
	private caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos[] objetivosEspecificos = null;
	private java.lang.String aprobadoML;
	public static String[][] FIELD_NAMES = new String[][] {{"nombrePro", "nombrePro"},{"periodo", "periodo"},{"fechaDesde", "fechaDesde"},{"fechaHasta", "fechaHasta"},{"encargado", "encargado"},{"planta", "planta"},{"comuna", "comuna"},{"profesionales", "profesionales"},{"establecimientos", "establecimientos"},{"objetivoGeneral", "ObjetivoGeneral"},{"objetivo", "objetivo"},{"objetivosEspecificos", "objetivosEspecificos"},{"aprobadoML", "aprobadoML"},{"observacionesML", "observacionesML"},
	};
	private java.lang.String observacionesML;
	

	public SFCMPC_docs_marcoLogicoV1() {
	}


	public java.lang.String getNombrePro()  {
		
		return nombrePro;
	}


	public void setNombrePro(java.lang.String nombrePro)  {
		this.nombrePro = nombrePro;
	}


	public java.lang.String getPeriodo()  {
		
		return periodo;
	}


	public void setPeriodo(java.lang.String periodo)  {
		this.periodo = periodo;
	}


	public java.lang.String getFechaDesde()  {
		
		return fechaDesde;
	}


	public void setFechaDesde(java.lang.String fechaDesde)  {
		this.fechaDesde = fechaDesde;
	}


	public java.lang.String getFechaHasta()  {
		
		return fechaHasta;
	}


	public void setFechaHasta(java.lang.String fechaHasta)  {
		this.fechaHasta = fechaHasta;
	}


	public java.lang.String getEncargado()  {
		
		return encargado;
	}


	public void setEncargado(java.lang.String encargado)  {
		this.encargado = encargado;
	}


	public java.lang.String[] getPlanta()  {
		if (planta == null) {
			//TODO: create/set default value here
		}
		return planta;
	}


	public void setPlanta(java.lang.String[] planta)  {
		this.planta = planta;
	}


	public java.lang.String[] getComuna()  {
		if (comuna == null) {
			//TODO: create/set default value here
		}
		return comuna;
	}


	public void setComuna(java.lang.String[] comuna)  {
		this.comuna = comuna;
	}


	public java.lang.String[] getProfesionales()  {
		if (profesionales == null) {
			//TODO: create/set default value here
		}
		return profesionales;
	}


	public void setProfesionales(java.lang.String[] profesionales)  {
		this.profesionales = profesionales;
	}


	public java.lang.String[] getEstablecimientos()  {
		if (establecimientos == null) {
			//TODO: create/set default value here
		}
		return establecimientos;
	}


	public void setEstablecimientos(java.lang.String[] establecimientos)  {
		this.establecimientos = establecimientos;
	}


	public java.lang.String getObjetivoGeneral()  {
		
		return objetivoGeneral;
	}


	public void setObjetivoGeneral(java.lang.String objetivoGeneral)  {
		this.objetivoGeneral = objetivoGeneral;
	}


	/**
	 * IS document wrapper
	 */
	public static class Objetivo extends java.lang.Object implements Serializable {
	
		
		private static final long serialVersionUID = 1L;
		private java.lang.String oindicador;
		private java.lang.String omv;
		private java.lang.String ovalor;
		private java.lang.String olineaBase;
		private java.lang.String oano1;
		private java.lang.String oano2;
		public static String[][] FIELD_NAMES = new String[][] {{"oindicador", "oindicador"},{"omv", "omv"},{"ovalor", "ovalor"},{"olineaBase", "olineaBase"},{"oano1", "oano1"},{"oano2", "oano2"},{"osupuestos", "osupuestos"},
		};
		private java.lang.String[] osupuestos = null;
		
	
		public Objetivo() {
		}


		public java.lang.String getOindicador()  {
			
			return oindicador;
		}


		public void setOindicador(java.lang.String oindicador)  {
			this.oindicador = oindicador;
		}


		public java.lang.String getOmv()  {
			
			return omv;
		}


		public void setOmv(java.lang.String omv)  {
			this.omv = omv;
		}


		public java.lang.String getOvalor()  {
			
			return ovalor;
		}


		public void setOvalor(java.lang.String ovalor)  {
			this.ovalor = ovalor;
		}


		public java.lang.String getOlineaBase()  {
			
			return olineaBase;
		}


		public void setOlineaBase(java.lang.String olineaBase)  {
			this.olineaBase = olineaBase;
		}


		public java.lang.String getOano1()  {
			
			return oano1;
		}


		public void setOano1(java.lang.String oano1)  {
			this.oano1 = oano1;
		}


		public java.lang.String getOano2()  {
			
			return oano2;
		}


		public void setOano2(java.lang.String oano2)  {
			this.oano2 = oano2;
		}


		public java.lang.String[] getOsupuestos()  {
			if (osupuestos == null) {
				//TODO: create/set default value here
			}
			return osupuestos;
		}


		public void setOsupuestos(java.lang.String[] osupuestos)  {
			this.osupuestos = osupuestos;
		}
	
	}


	public caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.Objetivo[] getObjetivo()  {
		if (objetivo == null) {
			//TODO: create/set default value here
		}
		return objetivo;
	}


	public void setObjetivo(caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.Objetivo[] objetivo)  {
		this.objetivo = objetivo;
	}


	/**
	 * IS document wrapper
	 */
	public static class ObjetivosEspecificos extends java.lang.Object implements Serializable {
	
		
		private static final long serialVersionUID = 1L;
		private java.lang.String componente;
		private java.lang.String nombreObjetivo;
		private java.lang.String descripcionObjetivo;
		private caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos.Especificos[] especificos = null;
		public static String[][] FIELD_NAMES = new String[][] {{"componente", "componente"},{"nombreObjetivo", "nombreObjetivo"},{"descripcionObjetivo", "descripcionObjetivo"},{"especificos", "especificos"},{"estrategia", "estrategia"},
		};
		private caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos.Estrategia[] estrategia = null;
		
	
		public ObjetivosEspecificos() {
		}


		public java.lang.String getComponente()  {
			
			return componente;
		}


		public void setComponente(java.lang.String componente)  {
			this.componente = componente;
		}


		public java.lang.String getNombreObjetivo()  {
			
			return nombreObjetivo;
		}


		public void setNombreObjetivo(java.lang.String nombreObjetivo)  {
			this.nombreObjetivo = nombreObjetivo;
		}


		public java.lang.String getDescripcionObjetivo()  {
			
			return descripcionObjetivo;
		}


		public void setDescripcionObjetivo(java.lang.String descripcionObjetivo)  {
			this.descripcionObjetivo = descripcionObjetivo;
		}


		/**
		 * IS document wrapper
		 */
		public static class Especificos extends java.lang.Object implements Serializable {
		
			
			private static final long serialVersionUID = 1L;
			private java.lang.String valor;
			private java.lang.String kindicador;
			private java.lang.String mv;
			private java.lang.String lineaBase;
			private java.lang.String ano1;
			private java.lang.String ano2;
			public static String[][] FIELD_NAMES = new String[][] {{"valor", "valor"},{"kindicador", "kindicador"},{"mv", "mv"},{"lineaBase", "lineaBase"},{"ano1", "ano1"},{"ano2", "ano2"},{"rsupuestos", "rsupuestos"},
			};
			private java.lang.String[] rsupuestos = null;
			
		
			public Especificos() {
			}


			public java.lang.String getValor()  {
				
				return valor;
			}


			public void setValor(java.lang.String valor)  {
				this.valor = valor;
			}


			public java.lang.String getKindicador()  {
				
				return kindicador;
			}


			public void setKindicador(java.lang.String kindicador)  {
				this.kindicador = kindicador;
			}


			public java.lang.String getMv()  {
				
				return mv;
			}


			public void setMv(java.lang.String mv)  {
				this.mv = mv;
			}


			public java.lang.String getLineaBase()  {
				
				return lineaBase;
			}


			public void setLineaBase(java.lang.String lineaBase)  {
				this.lineaBase = lineaBase;
			}


			public java.lang.String getAno1()  {
				
				return ano1;
			}


			public void setAno1(java.lang.String ano1)  {
				this.ano1 = ano1;
			}


			public java.lang.String getAno2()  {
				
				return ano2;
			}


			public void setAno2(java.lang.String ano2)  {
				this.ano2 = ano2;
			}


			public java.lang.String[] getRsupuestos()  {
				if (rsupuestos == null) {
					//TODO: create/set default value here
				}
				return rsupuestos;
			}


			public void setRsupuestos(java.lang.String[] rsupuestos)  {
				this.rsupuestos = rsupuestos;
			}
		
		}


		public caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos.Especificos[] getEspecificos()  {
			if (especificos == null) {
				//TODO: create/set default value here
			}
			return especificos;
		}


		public void setEspecificos(caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos.Especificos[] especificos)  {
			this.especificos = especificos;
		}


		/**
		 * IS document wrapper
		 */
		public static class Estrategia extends java.lang.Object implements Serializable {
		
			
			private static final long serialVersionUID = 1L;
			private java.lang.String tipoActividad;
			private java.lang.String nombreActividad;
			private java.lang.String categoria;
			private java.lang.String[] tipoParticipante = null;
			private java.lang.String area;
			private java.lang.String nivel;
			private java.lang.String contenidos;
			private caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos.Estrategia.Ciclo[] ciclo = null;
			public static String[][] FIELD_NAMES = new String[][] {{"tipoActividad", "tipoActividad"},{"nombreActividad", "nombreActividad"},{"categoria", "categoria"},{"tipoParticipante", "tipoParticipante"},{"area", "area"},{"nivel", "nivel"},{"contenidos", "contenidos"},{"ciclo", "ciclo"},{"objetivosXactividad", "objetivosXactividad"},
			};
			private java.lang.String[] objetivosXactividad = null;
			
		
			public Estrategia() {
			}


			public java.lang.String getTipoActividad()  {
				
				return tipoActividad;
			}


			public void setTipoActividad(java.lang.String tipoActividad)  {
				this.tipoActividad = tipoActividad;
			}


			public java.lang.String getNombreActividad()  {
				
				return nombreActividad;
			}


			public void setNombreActividad(java.lang.String nombreActividad)  {
				this.nombreActividad = nombreActividad;
			}


			public java.lang.String getCategoria()  {
				
				return categoria;
			}


			public void setCategoria(java.lang.String categoria)  {
				this.categoria = categoria;
			}


			public java.lang.String[] getTipoParticipante()  {
				if (tipoParticipante == null) {
					//TODO: create/set default value here
				}
				return tipoParticipante;
			}


			public void setTipoParticipante(java.lang.String[] tipoParticipante)  {
				this.tipoParticipante = tipoParticipante;
			}


			public java.lang.String getArea()  {
				
				return area;
			}


			public void setArea(java.lang.String area)  {
				this.area = area;
			}


			public java.lang.String getNivel()  {
				
				return nivel;
			}


			public void setNivel(java.lang.String nivel)  {
				this.nivel = nivel;
			}


			public java.lang.String getContenidos()  {
				
				return contenidos;
			}


			public void setContenidos(java.lang.String contenidos)  {
				this.contenidos = contenidos;
			}


			/**
			 * IS document wrapper
			 */
			public static class Ciclo extends java.lang.Object implements Serializable {
			
				
				private static final long serialVersionUID = 1L;
				private java.lang.String periodo;
				private java.lang.String sesiones;
				public static String[][] FIELD_NAMES = new String[][] {{"periodo", "periodo"},{"sesiones", "sesiones"},{"cantidadHoras", "cantidadHoras"},
				};
				private java.lang.String cantidadHoras;
				
			
				public Ciclo() {
				}


				public java.lang.String getPeriodo()  {
					
					return periodo;
				}


				public void setPeriodo(java.lang.String periodo)  {
					this.periodo = periodo;
				}


				public java.lang.String getSesiones()  {
					
					return sesiones;
				}


				public void setSesiones(java.lang.String sesiones)  {
					this.sesiones = sesiones;
				}


				public java.lang.String getCantidadHoras()  {
					
					return cantidadHoras;
				}


				public void setCantidadHoras(java.lang.String cantidadHoras)  {
					this.cantidadHoras = cantidadHoras;
				}
			
			}


			public caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos.Estrategia.Ciclo[] getCiclo()  {
				if (ciclo == null) {
					//TODO: create/set default value here
				}
				return ciclo;
			}


			public void setCiclo(caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos.Estrategia.Ciclo[] ciclo)  {
				this.ciclo = ciclo;
			}


			public java.lang.String[] getObjetivosXactividad()  {
				if (objetivosXactividad == null) {
					//TODO: create/set default value here
				}
				return objetivosXactividad;
			}


			public void setObjetivosXactividad(java.lang.String[] objetivosXactividad)  {
				this.objetivosXactividad = objetivosXactividad;
			}
		
		}


		public caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos.Estrategia[] getEstrategia()  {
			if (estrategia == null) {
				//TODO: create/set default value here
			}
			return estrategia;
		}


		public void setEstrategia(caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos.Estrategia[] estrategia)  {
			this.estrategia = estrategia;
		}
	
	}


	public caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos[] getObjetivosEspecificos()  {
		if (objetivosEspecificos == null) {
			//TODO: create/set default value here
		}
		return objetivosEspecificos;
	}


	public void setObjetivosEspecificos(caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1.ObjetivosEspecificos[] objetivosEspecificos)  {
		this.objetivosEspecificos = objetivosEspecificos;
	}


	public java.lang.String getAprobadoML()  {
		
		return aprobadoML;
	}


	public void setAprobadoML(java.lang.String aprobadoML)  {
		this.aprobadoML = aprobadoML;
	}


	public java.lang.String getObservacionesML()  {
		
		return observacionesML;
	}


	public void setObservacionesML(java.lang.String observacionesML)  {
		this.observacionesML = observacionesML;
	}

}