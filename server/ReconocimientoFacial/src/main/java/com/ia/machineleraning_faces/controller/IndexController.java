package com.ia.machineleraning_faces.controller;

import com.ia.machineleraning_faces.service.steven.CosumirClienteHttpsIface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

@Controller
public class IndexController {
  private CosumirClienteHttpsIface cosumirClienteHttps;

  @Autowired
  public IndexController(CosumirClienteHttpsIface cosumirClienteHttps) {
    this.cosumirClienteHttps = cosumirClienteHttps;
  }

  @GetMapping("/index")
  public ResponseEntity<String> index() {
    return ResponseEntity.ok("Hola Mundo!");
  }
  @GetMapping("/consumirServicioTercero")
  public ResponseEntity<String> consumirServicioTercero() throws NoSuchAlgorithmException, KeyManagementException {
    String respuesta = cosumirClienteHttps.getCosumirCliente();
    return ResponseEntity.ok(respuesta);
  }
}
