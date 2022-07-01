package br.com.stilingue.repository;

import br.com.stilingue.model.ConversaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversaRepository extends JpaRepository<ConversaEntity, Long> {

}
