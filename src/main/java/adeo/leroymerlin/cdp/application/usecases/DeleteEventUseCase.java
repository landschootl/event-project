package adeo.leroymerlin.cdp.application.usecases;

import adeo.leroymerlin.cdp.application.ports.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEventUseCase {

    private final EventRepository eventRepository;

    public DeleteEventUseCase(@Autowired EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void handle(Long id) {
        eventRepository.deleteById(id);
    }
}
