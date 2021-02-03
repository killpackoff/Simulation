package com.killpackoff.simulation.core

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito


/**
 * @author ma.kolpakov
 */
internal class TestTest {
    val text = mock<String>()
    val a = mock<A> {
        on { sendA() } doReturn text
        on { sendB() } doReturn text
        on { sendC() } doReturn text
    }

    val b = mock<B>(){
        on{ma} doReturn a
    }

    @Test
    fun `Должен получить A`() {
        assertEquals(text, b.receiveA())
    }

    @Test
    fun `Должен получить B`() {
        assertEquals(text, b.receiveB())
    }

    @Test
    fun `Должен получить C`() {
        assertEquals(text, b.receiveC())
    }

}

open class A {
    open fun sendA() = "a"
    open fun sendB() = "b"
    open fun sendC() = "C"
}

open class B( open var ma: A) {
    fun receiveA() = ma.sendA()
    fun receiveB() = ma.sendB()
    fun receiveC() = ma.sendC()
}