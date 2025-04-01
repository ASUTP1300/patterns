package io.reflectoring.patterns.factory.air

import io.reflectoring.patterns.factory.rocket.RocketMark
import org.springframework.stereotype.Service

@Service
class SuhouImpl : Aircraft {
    override fun getMark(): AirMark {
        return AirMark.SUHOU
    }
}