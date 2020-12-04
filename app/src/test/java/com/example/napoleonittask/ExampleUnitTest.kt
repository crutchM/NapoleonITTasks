package com.example.napoleonittask

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun creationIsCorrect(){
        val product = Product(0, "box", "container", 5);
        assertEquals(0, product.index);
        assertEquals("box", product.name);
        assertEquals("container", product.type);
        assertEquals(5, product.count);
    }
    @Test
    fun sortIsCorrcect(){
        val first = Product(5, "T-Shirt", "Clothes", 23);
        val second = Product(9, "Pen", " chancellery", 58);
        val third =Product(6, "potato", "food", 150);
        val fourth = Product(2, "Charger", "Technics", 9);
        val expected = arrayListOf<Product>(fourth, first, second, third);
        var tmp = arrayListOf<Product>(first, second, third, fourth);
        tmp = tmp.Sort();
        assertEquals(tmp.size,expected.size);
        for(i in 0.. expected.size)
            assertEquals(tmp[i], expected[i]);
    }
}