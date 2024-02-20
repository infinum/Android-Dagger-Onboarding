package com.infinum.daggeronboarding.data

import javax.inject.Inject

interface Superhero {

    fun name(): String

    fun catchphrase(): String

    fun powers(): List<Power>
}

class CaptainAmerica : Superhero {

    override fun name(): String = "Steve Rogers aka Captain America"

    override fun catchphrase(): String = "I can do this all day!"

    override fun powers(): List<Power> = listOf(
        Power.SUPERHUMAN_STRENGTH,
        Power.DEXTERITY,
        Power.DAMAGE_BOOST
    )
}