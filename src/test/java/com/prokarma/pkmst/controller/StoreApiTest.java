/*
 * Swagger Petstore
 * This is a sample Petstore server.  You can find  out more about Swagger at  [http://swagger.io](http://swagger.io) or on  [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import com.prokarma.pkmst.model.Order;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for StoreApi
 */
@Ignore
public class StoreApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final StoreApi api = new StoreApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with positive integer value.\\ \\ Negative or non-integer values will generate API errors
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOrderTest() throws Exception {
        Long orderId = null;
    ResponseEntity<Void> response = api.deleteOrder(orderId , accept);

        // TODO: test validations
    }
    
    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInventoryTest() throws Exception {
    ResponseEntity<Map<String, Integer>> response = api.getInventory(  accept);

        // TODO: test validations
    }
    
    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10.\\ \\ Other values will generated exceptions
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOrderByIdTest() throws Exception {
        Long orderId = null;
    ResponseEntity<Order> response = api.getOrderById(orderId , accept);

        // TODO: test validations
    }
    
    /**
     * Place an order for a pet
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void placeOrderTest() throws Exception {
        Order body = null;
    ResponseEntity<Order> response = api.placeOrder(body , accept);

        // TODO: test validations
    }
    
}
