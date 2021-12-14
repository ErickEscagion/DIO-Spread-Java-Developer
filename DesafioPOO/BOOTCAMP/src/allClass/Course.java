package allClass;

public class Course extends Content {
    private int workload;


    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course [description=" + getDescription() + ", title=" + getTitle() + ", workload=" + workload + "]";
    }

    @Override
    public double calculateXp() {
        return XP_PADRAO * workload;
    }

}
