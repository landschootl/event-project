package adeo.leroymerlin.cdp.adapters.secondary.restapis;

import adeo.leroymerlin.cdp.application.entities.Event;
import adeo.leroymerlin.cdp.application.ports.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventImplRepository implements EventRepository {

    private final EventJpaWriteRepository eventJpaWriteRepository;
    private final EventJpaReadRepository eventJpaReadRepository;

    public EventImplRepository(@Autowired EventJpaWriteRepository eventJpaWriteRepository,
                               @Autowired EventJpaReadRepository eventJpaReadRepository) {
        this.eventJpaWriteRepository = eventJpaWriteRepository;
        this.eventJpaReadRepository = eventJpaReadRepository;
    }

    @Override
    public void deleteById(Long eventId) {
        eventJpaWriteRepository.deleteById(eventId);
    }

    @Override
    public List<Event> findAllBy() {
        return eventJpaReadRepository.findAllBy().stream()
                .map(EventMapper::mapEventModelToEventEntity)
                .toList();
    }
}
