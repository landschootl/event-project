package adeo.leroymerlin.cdp.adapters.secondary.restapis;

import adeo.leroymerlin.cdp.adapters.secondary.models.BandModel;
import adeo.leroymerlin.cdp.adapters.secondary.models.EventModel;
import adeo.leroymerlin.cdp.adapters.secondary.models.MemberModel;
import adeo.leroymerlin.cdp.application.entities.Band;
import adeo.leroymerlin.cdp.application.entities.Event;
import adeo.leroymerlin.cdp.application.entities.Member;
import lombok.experimental.UtilityClass;

import java.util.stream.Collectors;

@UtilityClass
public class EventMapper {

    public Event mapEventModelToEventEntity(EventModel eventModel) {
        return new Event()
                .setId(eventModel.getId())
                .setComment(eventModel.getComment())
                .setNbStars(eventModel.getNbStars())
                .setTitle(eventModel.getTitle())
                .setImgUrl(eventModel.getImgUrl())
                .setBands(eventModel.getBands().stream()
                        .map(EventMapper::mapBandModelToBandEntity)
                        .collect(Collectors.toSet()));
    }

    private Band mapBandModelToBandEntity(BandModel bandModel) {
        return new Band()
                .setId(bandModel.getId())
                .setName(bandModel.getName())
                .setMembers(bandModel.getMembers().stream()
                        .map(EventMapper::mapMemberModelToMemberEntity)
                        .collect(Collectors.toSet()));
    }

    private Member mapMemberModelToMemberEntity(MemberModel memberModel) {
        return new Member()
                .setId(memberModel.getId())
                .setName(memberModel.getName());
    }

    public EventModel mapEventEntityToEventModel(Event event) {
        return new EventModel()
                .setId(event.getId())
                .setComment(event.getComment())
                .setNbStars(event.getNbStars())
                .setTitle(event.getTitle())
                .setImgUrl(event.getImgUrl())
                .setBands(event.getBands().stream()
                        .map(EventMapper::mapBandEntityToBandModel)
                        .collect(Collectors.toSet()));
    }

    private BandModel mapBandEntityToBandModel(Band band) {
        return new BandModel()
                .setId(band.getId())
                .setName(band.getName())
                .setMembers(band.getMembers().stream()
                        .map(EventMapper::mapMemberEntityToMemberModel)
                        .collect(Collectors.toSet()));
    }

    private MemberModel mapMemberEntityToMemberModel(Member member) {
        return new MemberModel()
                .setId(member.getId())
                .setName(member.getName());
    }
}
