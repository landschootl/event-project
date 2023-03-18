package adeo.leroymerlin.cdp.application.ports;

import adeo.leroymerlin.cdp.application.entities.Event;

import java.util.List;

public interface EventRepository {

    void deleteById(Long eventId);

    List<Event> findAllBy();
}
