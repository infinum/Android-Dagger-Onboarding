package com.infinum.daggeronboarding

import dagger.Binds
import dagger.Module
import javax.inject.Inject


interface Superhero {

    fun name(): String

    fun catchphrase(): String

    fun powers(): List<Power>
}

class CaptainAmerica @Inject constructor(): Superhero {

    override fun name(): String = "Steve Rogers aka Captain America"

    override fun catchphrase(): String = "I can do this all day!"

    override fun powers(): List<Power> = listOf(
        Power.SUPERHUMAN_STRENGTH,
        Power.DEXTERITY,
        Power.DAMAGE_BOOST
    )
}

@Module
interface SuperHeroModule {

    @Binds
    fun bindSuperHero(captainAmerica: CaptainAmerica): Superhero
}