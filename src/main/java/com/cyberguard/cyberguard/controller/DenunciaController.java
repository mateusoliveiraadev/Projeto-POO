package com.cyberguard.cyberguard.controller;

import com.cyberguard.cyberguard.entity.Denuncia;
import com.cyberguard.cyberguard.service.DenunciaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/denuncias")
public class DenunciaController {

    private final DenunciaService service;

    public DenunciaController(DenunciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Denuncia> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public Denuncia criar(@RequestBody Denuncia denuncia) {
        return service.salvar(denuncia);
    }
}