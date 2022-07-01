package br.com.stilingue.service;

import br.com.stilingue.model.ConversaEntity;
import br.com.stilingue.repository.ConversaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConversaService {

    @Autowired
    private ConversaRepository conversaRepository;

    public List<ConversaEntity> findAll() {
        return conversaRepository.findAll();
    }
}
