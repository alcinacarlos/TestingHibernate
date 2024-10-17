package com.carlosalcina

import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence
import java.time.Instant
import java.time.LocalDate
import java.util.*

fun main() {
    // cargar config
    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("unidadSQL")
    //conexion base de datos -> em contiene la conexion
    val em = emf.createEntityManager()
    //transaccion
    em.transaction.begin()

    val date = Date.from(Instant.now())
    val d = Departamento("IT", date)
    val e = Empleado( "Lucas", 33, d)
    em.persist(e) // persits persiste el objeto en un PersistenceContext

    //empujamos los cambios a la base de datos
    em.transaction.commit()

    /*
    val e2 = Empleado("Setillla", 22)
    em.transaction.begin()
    em.persist(e2)
    em.transaction.commit()
*/
    //cerrar la conexion
    em.close()

}