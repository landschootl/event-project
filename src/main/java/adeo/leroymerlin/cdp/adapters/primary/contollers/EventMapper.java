package adeo.leroymerlin.cdp.adapters.primary.contollers;

import adeo.leroymerlin.cdp.adapters.primary.dtos.BandDto;
import adeo.leroymerlin.cdp.adapters.primary.dtos.EventDto;
import adeo.leroymerlin.cdp.adapters.primary.dtos.MemberDto;
import adeo.leroymerlin.cdp.application.entities.Band;
import adeo.leroymerlin.cdp.application.entities.Event;
import adeo.leroymerlin.cdp.application.entities.Member;
import lombok.experimental.UtilityClass;

import java.util.stream.Collectors;

@UtilityClass
public class EventMapper {

    public Event mapEventDtoToEventEntity(EventDto eventDto) {
        return new Event()
                .setId(eventDto.getId())
                .setComment(eventDto.getComment())
                .setNbStars(eventDto.getNbStars())
                .setTitle(eventDto.getTitle())
                .setImgUrl(eventDto.getImgUrl())
                .setBands(eventDto.getBands().stream()
                        .map(EventMapper::mapBandDtoToBandEntity)
                        .collect(Collectors.toSet()));
    }

    private Band mapBandDtoToBandEntity(BandDto bandDto) {
        return new Band()
                .setId(bandDto.getId())
                .setName(bandDto.getName())
                .setMembers(bandDto.getMembers().stream()
                        .map(EventMapper::mapMemberDtoToMemberEntity)
                        .collect(Collectors.toSet()));
    }

    private Member mapMemberDtoToMemberEntity(MemberDto memberDto) {
        return new Member()
                .setId(memberDto.getId())
                .setName(memberDto.getName());
    }
}
