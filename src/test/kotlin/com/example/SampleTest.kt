package com.example

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SampleTest {
    @Test
    fun addition(){
        val sum = 3 + 4
        assertThat(sum).isEqualTo(7)
    }
}