package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TipCalculatorTests {
    @Test
    fun calculateTip_20PercentNoRoundUp() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = calculateTip(amount = amount, tipPercent = tipPercent, roundUp = false)

        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}