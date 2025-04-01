package io.reflectoring.patterns.factory.air

import io.reflectoring.patterns.factory.AbstractFactory
import io.reflectoring.patterns.factory.rocket.RocketMark
import org.springframework.stereotype.Service

@Service
class RocketFactory(
    val list: List<Rocket>
): AbstractFactory<Rocket, RocketMark>(list, Rocket::getMark)