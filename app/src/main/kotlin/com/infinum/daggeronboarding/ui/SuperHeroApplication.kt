package com.infinum.daggeronboarding.ui

import android.app.Application
import com.infinum.daggeronboarding.di.DaggerMarvelComponent
import com.infinum.daggeronboarding.di.MarvelComponent

class SuperHeroApplication : Application() {

    val marvelComponent: MarvelComponent = DaggerMarvelComponent.create()

}