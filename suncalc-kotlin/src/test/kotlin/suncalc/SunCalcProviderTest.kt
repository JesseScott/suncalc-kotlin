package suncalc

import org.junit.jupiter.api.BeforeEach
import org.shredzone.commons.suncalc.MoonIllumination

class SunCalcProviderTest {

    private lateinit var sunCalcProvider: SunCalcProvider

    @BeforeEach
    fun setUp() {
        sunCalcProvider = SunCalcProvider()
    }

    @org.junit.jupiter.api.Test
    fun getMoonIllumination() {
        // Arrange

        // Act
        val moonIllumination = sunCalcProvider.getMoonIllumination()

        // Assert
        assert(moonIllumination is MoonIllumination)
    }
}