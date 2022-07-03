package br.com.stilingue.mapper;

import br.com.stilingue.dto.ConversaDTO;
import br.com.stilingue.model.ConversaEntity;

public class ConversaMapper {

    public static ConversaEntity toEntity(ConversaDTO dto){
        return mergeEntity(new ConversaEntity(), dto);
    }

    private static ConversaEntity mergeEntity(ConversaEntity entity, ConversaDTO dto) {
        entity.setData(dto.getData());
        entity.setMensagem(dto.getMensagem());
        entity.setStatus(dto.getStatus());
        return entity;
    }

    public static ConversaDTO toDTO(ConversaEntity entity){
        return merge(new ConversaDTO(), entity);
    }
    private static ConversaDTO merge(ConversaDTO dto,ConversaEntity entity){
        dto.setData(entity.getData());
        dto.setMensagem(entity.getMensagem());
        dto.setStatus(entity.getStatus());
        return dto;
    }

}
