package adeo.leroymerlin.cdp.adapters.secondary.restapis;

import adeo.leroymerlin.cdp.adapters.secondary.models.EventModel;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EventJpaWriteRepository extends Repository<EventModel, Long> {

    void deleteById(Long eventId);
}
