package com.robertgleason.spring6di.controllers;import org.junit.jupiter.api.Test;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.context.SpringBootTest;@SpringBootTestclass PropertyInjectedControllerTest {    // LEAST OPTIMAL WAY!    @Autowired    PropertyInjectedController propertyInjectedController;    @Test    void sayHello() {        System.out.println(propertyInjectedController.sayHello());    }}