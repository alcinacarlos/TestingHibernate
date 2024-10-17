package com.carlosalcina

import jakarta.persistence.*

@Entity
@Table(name = "Empleados")
class Empleado(
    @Column(name = "Nombre")
    val nombre:String,

    @Column
    val edad: Int,

    @OneToOne
    val dpto:Departamento,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long = 0
) {
}