package adeo.leroymerlin.cdp.adapters.primary.dtos;

import java.util.Set;

public class BandDto {

    private Long id;
    private String name;
    private Set<MemberDto> members;

    public Long getId() {
        return id;
    }

    public BandDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BandDto setName(String name) {
        this.name = name;
        return this;
    }

    public Set<MemberDto> getMembers() {
        return members;
    }

    public BandDto setMembers(Set<MemberDto> members) {
        this.members = members;
        return this;
    }
}
