package com.infinum.daggeronboarding.di

import com.infinum.daggeronboarding.data.Difficulty
import com.infinum.daggeronboarding.data.Enemy
import com.infinum.daggeronboarding.data.Location
import com.infinum.daggeronboarding.data.Mission
import dagger.Module
import dagger.Provides

@Module
class MissionModule {

    @Provides
    fun provideMission() = Mission.Builder()
        .difficulty(Difficulty.WORLD_THREATENING)
        .location(Location.OUTTER_RIM_TERRITORIES)
        .enemy(Enemy.MASTERS_OF_EVIL)
        .build()
}