package io.reflectoring.patterns.factory.air

import io.reflectoring.patterns.factory.AbstractFactory
import io.reflectoring.patterns.factory.rocket.RocketMark
import org.springframework.stereotype.Service

@Service
class AirFactory(
    val list: List<Aircraft>
): AbstractFactory<Aircraft, AirMark>(list, Aircraft::getMark)