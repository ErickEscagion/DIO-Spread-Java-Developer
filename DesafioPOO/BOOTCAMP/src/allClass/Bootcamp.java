package allClass;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finishDate = initialDate.plusDays(45);
    private Set<Dev> devsEnrolled = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getInitialDate() {
        return initialDate;
    }
    public LocalDate getFinishDate() {
        return finishDate;
    }
    public Set<Dev> getDevsEnrolled() {
        return devsEnrolled;
    }
    public void setDevsEnrolled(Set<Dev> devsEnrolled) {
        this.devsEnrolled = devsEnrolled;
    }
    public Set<Content> getContents() {
        return contents;
    }
    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contents == null) ? 0 : contents.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((devsEnrolled == null) ? 0 : devsEnrolled.hashCode());
        result = prime * result + ((finishDate == null) ? 0 : finishDate.hashCode());
        result = prime * result + ((initialDate == null) ? 0 : initialDate.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (contents == null) {
            if (other.contents != null)
                return false;
        } else if (!contents.equals(other.contents))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (devsEnrolled == null) {
            if (other.devsEnrolled != null)
                return false;
        } else if (!devsEnrolled.equals(other.devsEnrolled))
            return false;
        if (finishDate == null) {
            if (other.finishDate != null)
                return false;
        } else if (!finishDate.equals(other.finishDate))
            return false;
        if (initialDate == null) {
            if (other.initialDate != null)
                return false;
        } else if (!initialDate.equals(other.initialDate))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    

}
