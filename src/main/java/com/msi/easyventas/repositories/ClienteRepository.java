package com.msi.easyventas.repositories;

import com.msi.easyventas.dtos.ClienteDeleteDTO;
import com.msi.easyventas.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    boolean existsByDocumento(int documento);

    @Query(value = "select * from Clientes where documento = :documento", nativeQuery = true)
    List<Cliente> searchByDocumento(@Param("documento") int documento);

    void deleteByDocumento(int documento);

    @Query(value = "select * from Clientes where documento = :documento LIMIT 1", nativeQuery = true)
    Cliente searchByDocumento1(@Param("documento") int documento);

    @Modifying
    @Query(value = "UPDATE clientes SET estado = FALSE WHERE id_cliente = :id_cliente", nativeQuery = true)
    void updateClienteStatus(@Param("id_cliente") long id_cliente);
}
