package com.infinum.daggeronboarding.data

class Mission private constructor(
    val location: Location,
    val enemy: Enemy,
    val difficulty: Difficulty
) {

    data class Builder(
        private var location: Location = Location.UNKNOWN,
        private var enemy: Enemy = Enemy.ULTRON,
        private var difficulty: Difficulty = Difficulty.NORMAL
    ) {

        fun location(location: Location) = apply { this.location = location }
        fun enemy(enemy: Enemy) = apply { this.enemy = enemy }
        fun difficulty(difficulty: Difficulty) = apply { this.difficulty = difficulty }
        fun build() = Mission(location, enemy, difficulty)
    }
}

enum class Location {
    OUTTER_RIM_TERRITORIES,
    EARTH,
    UNKNOWN
}

enum class Enemy {
    MASTERS_OF_EVIL,
    THANOS,
    ULTRON
}

enum class Difficulty {
    HARD,
    WORLD_THREATENING,
    NORMAL
}