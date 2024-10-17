package com.carlosalcina

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "departamentos")
class Departamento(
    @Column(name = "nombre", nullable = false, unique = true)
    val nombre:String,

    @Column(name = "fecha_creación")
    @Temporal(TemporalType.DATE)
    val fechaCreaccion: Date,

    @OneToOne(mappedBy = "dpto")
    val empleado: Empleado? = null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val numDpo:Long = 0,

){

}