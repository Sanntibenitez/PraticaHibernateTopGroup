package com.tg.practice.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tg.practice.model.Familia;
import com.tg.practice.model.Medida;
import com.tg.practice.model.Producto;
import com.tg.practice.model.TipoProducto;

public class PracticeTest {
	private static Logger log = LoggerFactory.getLogger(PracticeTest.class);
	protected static SessionFactory sessionFactory;

	@BeforeClass
	public static void initialize() {

		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		log.info("Session factory creado correctamente");

	}

	@Test
	public void test() {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		for (int i = 0; i <= 50000; i++) {

			Producto producto = new Producto();
			Medida medida = new Medida();
			Familia familia = new Familia();
			TipoProducto tipoProducto = new TipoProducto();
			
			medida.setAltura(10d);
			medida.setAncho(10d);
			medida.setLargo(10d);

			familia.setClave("Clave");
			familia.setDescripcion("Descripcion");

			tipoProducto.setDescripcion("Descripcion");

			producto.setCodigo("Codigo");
			producto.setDescripcion("Descricpion");
			producto.setFamilia(familia);
			producto.setInferior(true);
			producto.setMedida(medida);
			producto.setProductosPorPaquete((short) 1);
			producto.setTipoProducto(tipoProducto);

			session.save(producto);

			if (i % 100 == 0) {
				session.flush();
				session.clear();
			}
		}

		tx.commit();
		session.close();

	}

}
