package adeo.leroymerlin.cdp.adapters.secondary.restapis;

import adeo.leroymerlin.cdp.adapters.secondary.models.EventModel;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface EventJpaReadRepository extends Repository<EventModel, Long> {

    List<EventModel> findAllBy();
}
