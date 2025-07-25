package sanfe.spring_ships_hexagonal.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sanfe.spring_ships_hexagonal.infrastructure.entities.DockEntity;

public interface JPADockRepository extends JpaRepository<DockEntity, Long> {
}
