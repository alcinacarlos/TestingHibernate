package com.carlosalcina

import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence

fun main() {
    // cargar config
    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("unidadSQL")
    //conexion base de datos -> em contiene la conexion
    val em = emf.createEntityManager()
    //transaccion
    em.transaction.begin()

    val e = Empleado( "Lucas", 33)
    em.persist(e) // persits persiste el objeto en un PersistenceContext

    //empujamos los cambios a la base de datos
    em.transaction.commit()

    val e2 = Empleado("Setillla", 22)

    em.transaction.begin()
    em.persist(e2)
    em.transaction.commit()

    //cerrar la conexion
    em.close()

}