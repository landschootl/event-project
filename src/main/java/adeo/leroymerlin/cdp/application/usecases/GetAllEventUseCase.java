package adeo.leroymerlin.cdp.application.usecases;

import adeo.leroymerlin.cdp.application.entities.DomainError;
import adeo.leroymerlin.cdp.application.entities.event.Event;
import adeo.leroymerlin.cdp.application.ports.EventRepository;
import io.vavr.control.Either;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service that retrieves all the events
 */
@Service
public class GetAllEventUseCase {

    private final EventRepository eventRepository;

    public GetAllEventUseCase(@Autowired EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Either<DomainError, List<Event>> handle() {
        return Either.right(eventRepository.getAll());
    }
}
