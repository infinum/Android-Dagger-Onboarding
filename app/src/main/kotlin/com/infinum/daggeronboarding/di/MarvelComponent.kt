package com.infinum.daggeronboarding.di

import com.infinum.daggeronboarding.ui.HeroHeadquartersActivity
import dagger.Component

@Component(
    modules = [
        MissionModule::class
    ]
)
interface MarvelComponent {

    fun inject(headquartersActivity: HeroHeadquartersActivity)
}