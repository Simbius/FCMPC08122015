package caf.war.crearMarcoLogicoTasks.is.document;

import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class SFCMPC_docs_publicaMarcoV1 extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "sFCMPC.docs:publicaMarcoV1";
	public static String[][] FIELD_NAMES = new String[][] {{"marcoLogicoV1", "marcoLogicoV1"},
	};
	private caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1 marcoLogicoV1 = null;
	

	public SFCMPC_docs_publicaMarcoV1() {
	}


	public caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1 getMarcoLogicoV1()  {
		if (marcoLogicoV1 == null) {
			marcoLogicoV1 = new caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1();
		}
		return marcoLogicoV1;
	}


	public void setMarcoLogicoV1(caf.war.crearMarcoLogicoTasks.is.document.SFCMPC_docs_marcoLogicoV1 marcoLogicoV1)  {
		this.marcoLogicoV1 = marcoLogicoV1;
	}

}