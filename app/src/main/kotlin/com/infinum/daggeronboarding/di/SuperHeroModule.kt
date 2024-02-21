package com.infinum.daggeronboarding.di

import com.infinum.daggeronboarding.data.CaptainAmerica
import com.infinum.daggeronboarding.data.Superhero
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface SuperHeroModule {

    fun superHero(captainAmerica: CaptainAmerica): Superhero
}