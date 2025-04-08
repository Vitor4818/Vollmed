package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

// Ao criar o repositório, passamos como parâmetros a entidade (Medico) e o tipo da chave primária (Long)
public interface MedicoRepository  extends JpaRepository <Medico, Long>{

}
