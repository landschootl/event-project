package adeo.leroymerlin.cdp.application.entities;

import java.util.Set;

public class Event {

    private Long id;
    private String title;
    private String imgUrl;
    private Set<Band> bands;
    private Integer nbStars;
    private String comment;

    public Long getId() {
        return id;
    }

    public Event setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Event setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Event setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public Set<Band> getBands() {
        return bands;
    }

    public Event setBands(Set<Band> bands) {
        this.bands = bands;
        return this;
    }

    public Integer getNbStars() {
        return nbStars;
    }

    public Event setNbStars(Integer nbStars) {
        this.nbStars = nbStars;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Event setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
