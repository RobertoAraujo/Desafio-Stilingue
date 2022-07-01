package br.com.stilingue.controller;

import br.com.stilingue.dto.ConversaDTO;
import br.com.stilingue.model.ConversaEntity;
import br.com.stilingue.service.ConversaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/conversa/")
public class ConversaController {

    @Autowired
    private ConversaService conversaService;

    @GetMapping(value = "listar")
    public ResponseEntity<List<ConversaEntity>> listarTodos(){
        return ResponseEntity.ok(conversaService.findAll());
    }


}
