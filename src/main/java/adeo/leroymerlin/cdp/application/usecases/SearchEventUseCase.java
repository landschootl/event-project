package adeo.leroymerlin.cdp.application.usecases;

import adeo.leroymerlin.cdp.application.entities.DomainError;
import adeo.leroymerlin.cdp.application.entities.event.Event;
import adeo.leroymerlin.cdp.application.entities.event.EventSearchCriteria;
import adeo.leroymerlin.cdp.application.ports.EventRepository;
import io.vavr.control.Either;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service that searches for events matching the criteria
 */
@Service
public class SearchEventUseCase {

    private final EventRepository eventRepository;

    public SearchEventUseCase(@Autowired EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Either<DomainError, List<Event>> handle(EventSearchCriteria eventSearchCriteria) {
        return Either.right(eventRepository.search(eventSearchCriteria));
    }
}
