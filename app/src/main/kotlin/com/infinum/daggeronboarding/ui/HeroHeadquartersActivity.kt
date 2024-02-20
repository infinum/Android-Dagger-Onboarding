package com.infinum.daggeronboarding.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.infinum.daggeronboarding.data.Avengers
import com.infinum.daggeronboarding.data.Mission
import com.infinum.daggeronboarding.databinding.ActivityHeroHeadquartersBinding
import javax.inject.Inject

class HeroHeadquartersActivity : AppCompatActivity() {

    @Inject
    lateinit var mission: Mission

    @Inject
    lateinit var avengers: Avengers

    val viewBinding: ActivityHeroHeadquartersBinding by viewBinding(ActivityHeroHeadquartersBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as SuperHeroApplication).marvelComponent.inject(this)
        super.onCreate(savedInstanceState)

        viewBinding.missionDescription.text = """
            MISSION BRIEFING 
            
            Leader: ${avengers.leader.name()}
            Location: ${mission.location}
            Difficulty: ${mission.difficulty} 
            Target: ${mission.enemy}
        """.trimStart()
    }
}