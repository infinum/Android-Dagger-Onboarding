package com.infinum.daggeronboarding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hero_headquarters.*
import javax.inject.Inject

class HeroHeadquartersActivity : AppCompatActivity() {

    @Inject
    lateinit var mission: Mission

    @Inject
    lateinit var avengers: Avengers

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as SuperHeroApplication).marvelComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hero_headquarters)

        missionDescription.text = """
            MISSION BRIEFING 
            
            Leader: ${avengers.leader.name()}
            Location: ${mission.location}
            Difficulty: ${mission.difficulty} 
            Target: ${mission.enemy}
        """.trimStart()
    }
}