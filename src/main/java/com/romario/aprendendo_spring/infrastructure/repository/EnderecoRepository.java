package com.romario.aprendendo_spring.infrastructure.repository;

import com.romario.aprendendo_spring.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
