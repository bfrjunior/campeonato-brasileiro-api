package br.com.cbf.campeonatobrasileiro.repository;

import br.com.cbf.campeonatobrasileiro.entity.Time;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends JpaRepository<Time, Integer> {

    List<Time> findByNomeIgnoreCaseAndAndIdNot(String nome, Integer id);

}
