package com.infinum.daggeronboarding

import dagger.Component

@Component(
    modules = [
        MissionModule::class
    ]
)
interface MarvelComponent {

    fun inject(headquartersActivity: HeroHeadquartersActivity)
}