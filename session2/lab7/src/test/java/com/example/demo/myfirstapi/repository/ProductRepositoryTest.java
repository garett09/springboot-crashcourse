package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Optional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
    }

    @Test
    void shouldInitializeWithThreeProducts() {
        List<Product> products = productRepository.findAll();
        assertEquals(3, products.size(), "Repository should have 3 products initially");
    }

    @Test
    void shouldReturnAllProducts() {
        List<Product> products = productRepository.findAll();
        assertNotNull(products, "findAll should not return null");
        assertEquals(3, products.size(), "Expected 3 initial products");
    }

    @Test
    void shouldFindProductByIdIfExists() {
        Optional<Product> product = productRepository.findById(1L);
        assertTrue(product.isPresent(), "Product with ID 1 should exist");
        assertEquals("Laptop", product.get().getName());
    }

    @Test
    void shouldReturnEmptyOptionalIfProductNotFound() {
        Optional<Product> product = productRepository.findById(999L);
        assertFalse(product.isPresent(), "Product with ID 999 should not exist");
    }

    @Test
    void shouldAddNewProductIfIdIsNull() {
        Product newProduct = new Product(null, "Headphones", 150.00);
        Product saved = productRepository.save(newProduct);
        assertNotNull(saved.getId(), "New product should have generated ID");
        assertEquals(4, productRepository.findAll().size(), "Product count should increase");
        assertEquals("Headphones", saved.getName());
    }

    @Test
    void shouldUpdateExistingProductIfIdExists() {
        Product updatedProduct = new Product(1L, "Gaming Laptop", 2000.00);
        Product result = productRepository.save(updatedProduct);
        assertEquals("Gaming Laptop", result.getName());
        assertEquals(2000.00, result.getPrice());
        assertEquals(3, productRepository.findAll().size(), "Product count should remain the same after update");
    }

    @Test
    void shouldReturnSameProductIfIdNotFound() {
        Product nonExisting = new Product(999L, "Ghost Product", 500.00);
        Product result = productRepository.save(nonExisting);
        assertEquals(999L, result.getId());
        assertEquals("Ghost Product", result.getName());
        assertEquals(3, productRepository.findAll().size(), "Product count should not increase if ID not found");
    }
}