package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product1;
    private Product product2;
    @BeforeEach
    void setUp(){
        product1 = new Product(1L, "Test Product", 19.99);
        product2 = new Product("Test Product", 49.99);

    }

    @Test
    void testGetId() {
        assertEquals(1L, product1.getId());
        assertNull(product2.getId());
    }
    @Test
    void testGetName() {
        assertEquals("Test Product", product1.getName());
        assertEquals("Test Product", product2.getName());
    }
    @Test
    void testGetPrice() {
        assertEquals(19.99, product1.getPrice());
        assertEquals(49.99, product2.getPrice());
    }

    @Test
    void testSetId() {
        product1.setId(2L);
        assertEquals(2L, product1.getId());
        product2.setId(3L);
        assertEquals(3L, product2.getId());
    }

    @Test
    void testSetName(){
        product1.setName("Updated Product");
        assertEquals("Updated Product", product1.getName());
        product2.setName("Updated Product");
        assertEquals("Updated Product", product2.getName());
    }

    @Test
    void testSetPrice() {
        product1.setPrice(29.99);
        assertEquals(29.99, product1.getPrice());
        product2.setPrice(59.99);
        assertEquals(59.99, product2.getPrice());
    }

    @Test
    void testToString() {
        String expected = "Product{id=1, name='Test Product', price=19.99}";
        assertEquals(expected, product1.toString());
        String expected2 = "Product{id=null, name='Test Product', price=49.99}";
        assertEquals(expected2, product2.toString());
    }

    @Test
    void testEquals() {
        Product anotherProduct = new Product(1L, "Test Product", 19.99);
        assertEquals(product1, anotherProduct);
        Product anotherProduct2 = new Product("Test Product", 49.99);
        assertEquals(product2, anotherProduct2);
    }

    @Test
    void testNotEquals() {
        Product differentProduct = new Product(2L, "Different Product", 29.99);
        assertNotEquals(product1, differentProduct);
        Product differentProduct2 = new Product("Different Product", 59.99);
        assertNotEquals(product2, differentProduct2);
    }

    @Test
    void testHashCode() {
        Product anotherProduct = new Product(1L, "Test Product", 19.99);
        assertEquals(product1.hashCode(), anotherProduct.hashCode());
        Product anotherProduct2 = new Product("Test Product", 49.99);
        assertEquals(product2.hashCode(), anotherProduct2.hashCode());
    }




}