import java.time.LocalDate;

import allClass.*;

public class App {
    public static void main(String[] args) throws Exception {

        Course course = new Course();
        course.setDescription("Description course");
        course.setTitle("Title course");
        course.setWorkload(40);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Title mentoring");
        mentoring.setDescription("Description mentoring");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp name");
        bootcamp.setDescription("Description bootcamp");
        bootcamp.getContents().add(course);
        bootcamp.getContents().add(mentoring);

        Dev devErick = new Dev();
        devErick.setName("Erick");
        devErick.signUpBootcamp(bootcamp);

        Dev dev2 = new Dev();
        dev2.setName("dev 2");
        dev2.signUpBootcamp(bootcamp);
        dev2.progress();


        System.out.println(devErick.getSignedContents());
        
        System.out.println(dev2.getCompletedContents());
    }
}
