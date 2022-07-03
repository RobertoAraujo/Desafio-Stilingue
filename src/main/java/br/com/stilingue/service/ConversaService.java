package br.com.stilingue.service;

import br.com.stilingue.model.ConversaEntity;
import br.com.stilingue.repository.ConversaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConversaService {

    @Autowired
    private ConversaRepository conversaRepository;

    public List<ConversaEntity> findAll() {
        return conversaRepository.findAll();
    }
    public Optional<ConversaEntity> findById(long id) {
        return conversaRepository.findById(id);
    }
    public ConversaEntity save(ConversaEntity entity) {
        conversaRepository.save(entity);
        return entity;
    }

}
