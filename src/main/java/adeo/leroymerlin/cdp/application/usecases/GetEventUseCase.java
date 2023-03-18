package adeo.leroymerlin.cdp.application.usecases;

import adeo.leroymerlin.cdp.application.entities.Event;
import adeo.leroymerlin.cdp.application.ports.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetEventUseCase {

    private final EventRepository eventRepository;

    public GetEventUseCase(@Autowired EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> handle() {
        return eventRepository.findAllBy();
    }
}
