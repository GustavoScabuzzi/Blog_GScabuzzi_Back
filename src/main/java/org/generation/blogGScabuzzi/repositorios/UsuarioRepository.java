package org.generation.blogGScabuzzi.repositorios;

import java.util.List;
import java.util.Optional;

import org.generation.blogGScabuzzi.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
	public Optional<Usuario> findByEmail(String email);

}
