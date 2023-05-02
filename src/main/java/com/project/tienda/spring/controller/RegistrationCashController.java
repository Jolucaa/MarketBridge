package com.project.tienda.spring.controller;

import com.project.tienda.controller.ClientCommandRestController;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationCashController {
    @RequestMapping(value = "/{order}", method = RequestMethod.GET)
    public ResponseEntity<?> getLineOperation(Model model, @PathParam("order") String order){
       ClientCommandRestController clientCommandRestController = new ClientCommandRestController();
       return ResponseEntity.ok().build();
    }
}
