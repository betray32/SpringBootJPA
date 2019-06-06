package com.springboot.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.bean.Persona;
import com.springboot.jpa.main.CustomYMLFile;

/**
 * Conexiones con procedimientos almacenados PostGres
 * 
 * @author camilongo
 *
 */
@Repository
public class DaoStoreProcedureQuery {

	/**
	 * LOG
	 */
	private static final Log log = LogFactory.getLog(DaoStoreProcedureQuery.class);

	/**
	 * Maneja las conexiones a bases de datos
	 */
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Properties
	 * 
	 * @return
	 */
	@Autowired
	private CustomYMLFile prop;

	/**
	 * Consulta la lista de personas , este procedimiento no tiene parametros de entrada ni de salida y
	 * devuelve un cursor
	 */
	public List<Persona> obtenerDatosPersonas() {

		try {

			log.info("Procediendo a obtener el detalle de los clientes");
			StoredProcedureQuery storedProcedureQuery = entityManager

					// Definicion
					.createStoredProcedureQuery(prop.getPROCEDURE_DEVUELVE_CURSOR(), Persona.class);

			@SuppressWarnings("unchecked")
			List<Persona> res = storedProcedureQuery.getResultList();

			log.info("Lista consultada exitosamente");
			log.info("Recorriendo lista de salida...");
			for (Persona p : res) {
				log.info("Persona : " + p);
			}

			return res;

		} catch (Exception e) {
			log.error("Error al consultar procedure [" + prop.getPROCEDURE_DEVUELVE_CURSOR() + "] , Detalle > " + e.getMessage());
		}

		return null;
	}

}
