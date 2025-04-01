package io.reflectoring.patterns.factory.air

import io.reflectoring.patterns.factory.rocket.RocketMark

interface Rocket {
    fun getMark(): RocketMark
}