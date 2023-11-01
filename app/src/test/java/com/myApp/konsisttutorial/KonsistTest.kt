package com.myApp.konsisttutorial

import com.lemonappdev.konsist.api.Konsist
import com.lemonappdev.konsist.api.ext.list.withPackage
import com.lemonappdev.konsist.api.verify.assertTrue
import org.junit.Test

class SampleKonsistTest {
    @Test
    fun entityEndsWithEntity() {
        Konsist
            .scopeFromProject()
            .classes()
            .withPackage("data")
            .assertTrue { it.name.endsWith("Entity") }
    }
}