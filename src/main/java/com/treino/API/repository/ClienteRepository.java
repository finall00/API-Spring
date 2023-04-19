package com.treino.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.treino.API.model.Cliente;



// @Repository -> pode ser removida sem afetar o funcionamento da aplicação, uma vez que a herança de JpaRepository já torna a interface um repositório gerenciado pelo Spring.
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
