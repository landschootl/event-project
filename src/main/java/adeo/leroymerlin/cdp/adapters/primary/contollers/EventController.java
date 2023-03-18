package adeo.leroymerlin.cdp.adapters.primary.contollers;

import adeo.leroymerlin.cdp.adapters.primary.dtos.EventDto;
import adeo.leroymerlin.cdp.application.entities.Event;
import adeo.leroymerlin.cdp.application.usecases.DeleteEventUseCase;
import adeo.leroymerlin.cdp.application.usecases.GetEventUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final GetEventUseCase eventService;
    private final DeleteEventUseCase deleteEventUseCase;

    public EventController(@Autowired GetEventUseCase eventService,
                           @Autowired DeleteEventUseCase deleteEventUseCase) {
        this.eventService = eventService;
        this.deleteEventUseCase = deleteEventUseCase;
    }

    @GetMapping(value = "/")
    public List<Event> findEvents() {
        return eventService.handle();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteEvent(@PathVariable Long id) {
        deleteEventUseCase.handle(id);
    }

    @GetMapping(value = "/search/{query}")
    public List<Event> findEvents(@PathVariable String query) {
        // TODO
        return Collections.emptyList();
    }

    @PutMapping(value = "/{id}")
    public void updateEvent(@PathVariable Long id, @RequestBody EventDto eventDto) {
        // TODO
    }
}
