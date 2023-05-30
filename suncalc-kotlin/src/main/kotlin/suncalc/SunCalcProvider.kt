package suncalc

import org.shredzone.commons.suncalc.MoonIllumination

/**
 * Abstraction for SunCalc library
 */
class SunCalcProvider {

    /**
     * Get the moon illumination, which includes
     * - fraction [MoonIllumination.fraction]
     * - phase [MoonIllumination.phase]
     * - angle [MoonIllumination.angle]
     *
     * @return [MoonIllumination]
     */
    fun getMoonIllumination(): MoonIllumination {
        return MoonIllumination.compute().execute()
    }
}