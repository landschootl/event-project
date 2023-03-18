package adeo.leroymerlin.cdp.adapters.secondary.models;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Band")
public class BandModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(fetch=FetchType.EAGER)
    private Set<MemberModel> members;

    public Long getId() {
        return id;
    }

    public BandModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BandModel setName(String name) {
        this.name = name;
        return this;
    }

    public Set<MemberModel> getMembers() {
        return members;
    }

    public BandModel setMembers(Set<MemberModel> members) {
        this.members = members;
        return this;
    }
}
