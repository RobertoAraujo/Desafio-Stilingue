package br.com.stilingue.controller;

import br.com.stilingue.dto.ConversaDTO;
import br.com.stilingue.model.ConversaEntity;
import br.com.stilingue.service.ConversaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
    public ConversaEntity update(@PathVariable String id,@RequestBody ConversaEntity conversa) {
        return this.conversaService.updateConversa(Long.parseLong(id),conversa);
    }
    @DeleteMapping(value = "delete/{id}")
    public List<ConversaEntity> deleteCourse(@PathVariable String id) {
        if (id != null){
            LOGGER.info("Buscando Conversas por Id.");
            return this.conversaService.deleteConversa(Long.parseLong(id));
        }
        LOGGER.error("Fala ao busca o Id.");
        return null;
    }
}
