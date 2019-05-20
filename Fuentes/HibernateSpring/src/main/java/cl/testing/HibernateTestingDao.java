package cl.testing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import cl.testing.dao.ConexionQueryDirecta;

/**
 * HibernateTestingDao
 * 
 * @author ccontrerasc
 *
 */
@Repository
public class HibernateTestingDao implements CommandLineRunner {

	/**
	 * LOG
	 */
	private static final Log log = LogFactory.getLog(HibernateTestingDao.class);

	@Autowired
	private ConexionQueryDirecta queryDirecta;

	/**
	 * Ejecucion automatica
	 */
	@Override
	public void run(String... args) throws Exception {

		log.info("Consultando por Query Directa");
		queryDirecta.consultaQueryDirecta();
		
		log.info("Consultando por Query con Parametros");
		queryDirecta.consultaQueryParam(1);

		log.info("Proceso finalizado");

	}

}
