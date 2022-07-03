package br.com.stilingue.controller;

import br.com.stilingue.model.ConversaEntity;
import br.com.stilingue.service.ConversaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/conversa/")
public class ConversaController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConversaController.class);
    @Autowired
    private ConversaService conversaService;

    @GetMapping(value = "listar")
    public ResponseEntity<List<ConversaEntity>> listar(){
        LOGGER.info("Buscando Conversas.");
        return ResponseEntity.ok(conversaService.findAll());
    }
    @GetMapping(value = "{id}")
    public Optional<ConversaEntity> getById(@PathVariable long id) {
        LOGGER.info("Buscando Conversas por Id.");
        return conversaService.findById(id);
    }
    @PostMapping(value = "inserir")
    public ConversaEntity create(@RequestBody ConversaEntity entity) {
        LOGGER.info("Cadastrado com sucesso!");
        return conversaService.save(entity);
    }
    @PutMapping(value = "update/{id}")
    public ConversaEntity update(@PathVariable(value = "id") Long id,@RequestBody ConversaEntity conversa) {
        return conversaService.updateConversa((id),conversa);
    }
    @DeleteMapping(value = "delete/{id}")
    public void deleteCourse(@PathVariable Long id) {
        LOGGER.info("Buscando Conversas por Id.");
        conversaService.deleteConversa((id));
    }
}
