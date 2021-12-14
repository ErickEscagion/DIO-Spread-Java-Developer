package allClass;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> signedContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void signUpBootcamp (Bootcamp bootcamp){
        this.signedContents.addAll(bootcamp.getContents());
        bootcamp.getDevsEnrolled().add(this);
    }

    public void progress () {
        Optional<Content> content = this.signedContents.stream().findFirst();
        if(content.isPresent()){
            this.completedContents.add(content.get());
            this.signedContents.remove(content.get());
        } else{
            System.err.println("Voçê não está matriculado em nenhym conteudo!");
        }
    }

    public double calculateTotalXp (){
        return this.completedContents
        .stream()
        .mapToDouble(Content::calculateXp)
        .sum();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Content> getSignedContents() {
        return signedContents;
    }
    public void setSignedContents(Set<Content> signedContents) {
        this.signedContents = signedContents;
    }
    public Set<Content> getCompletedContents() {
        return completedContents;
    }
    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((completedContents == null) ? 0 : completedContents.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((signedContents == null) ? 0 : signedContents.hashCode());
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
        Dev other = (Dev) obj;
        if (completedContents == null) {
            if (other.completedContents != null)
                return false;
        } else if (!completedContents.equals(other.completedContents))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (signedContents == null) {
            if (other.signedContents != null)
                return false;
        } else if (!signedContents.equals(other.signedContents))
            return false;
        return true;
    } 
    
}
