package adeo.leroymerlin.cdp.application.entities;

import java.util.Set;

public class Band {

    private Long id;
    private String name;
    private Set<Member> members;

    public Long getId() {
        return id;
    }

    public Band setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Band setName(String name) {
        this.name = name;
        return this;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public Band setMembers(Set<Member> members) {
        this.members = members;
        return this;
    }
}
