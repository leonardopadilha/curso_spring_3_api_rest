package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;


/*
    1º) Qual tipo da entidade que essa interface irá trabalhar - Medico
    2º) Qual tipo da chave primária dessa entidade
*/

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
