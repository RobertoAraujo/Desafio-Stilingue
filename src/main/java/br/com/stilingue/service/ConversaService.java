package br.com.stilingue.service;

import br.com.stilingue.model.ConversaEntity;
import br.com.stilingue.repository.ConversaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

//    List<ConversaEntity> list = conversaRepository.findAll();

    public ConversaEntity updateConversa(long Id, ConversaEntity conversa) {
        List<ConversaEntity> list = conversaRepository.findAll();
        ConversaEntity c = null;
        for (ConversaEntity conver: list){
            if (conver.getId()==Id){
                conver.setData(conver.getData());
                conver.setMensagem(conver.getMensagem());
                conver.setStatus(conver.getStatus());
                conversa=conver;
            }
        }
        conversaRepository.save(conversa);
        return conversa;
    }
    public List<ConversaEntity> deleteConversa(long Id) {
        List<ConversaEntity> list = conversaRepository.findAll();
        for (ConversaEntity conversa: list){
            if (conversa.getId()== Id){
                list.remove(conversa);
            }
        }
        return list;
    }
}
