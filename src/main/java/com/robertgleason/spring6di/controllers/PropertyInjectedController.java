package com.robertgleason.spring6di.controllers;import com.robertgleason.spring6di.services.GreetingService;// Not Prefferedpublic class PropertyInjectedController {    GreetingService greetingService;    public String sayHello() {        return greetingService.sayGreeting();    }}