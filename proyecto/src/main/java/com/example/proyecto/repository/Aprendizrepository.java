package com.example.proyecto.repository;

    import com.example.proyecto.model.Aprendizentity;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface Aprendizrepository extends JpaRepository<Aprendizentity, Long> {
}