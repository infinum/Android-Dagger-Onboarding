package com.infinum.daggeronboarding

import android.app.Application

class SuperHeroApplication : Application() {

    val marvelComponent: MarvelComponent = DaggerMarvelComponent.create()

}