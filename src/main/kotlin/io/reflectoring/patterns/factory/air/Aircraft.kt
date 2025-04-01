package io.reflectoring.patterns.factory.air

import io.reflectoring.patterns.factory.rocket.RocketMark

interface Aircraft {
    fun getMark(): AirMark
}