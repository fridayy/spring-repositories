package ninja.harmless;

import ninja.harmless.data.Student;
import ninja.harmless.data.StudentBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author bnjm@harmless.ninja - 4/23/17.
 */
@Component
public class Clrunner implements CommandLineRunner {

    @Autowired
    StudentBaseRepository jpaRepository;


    @Override
    public void run(String... args) throws Exception {

        Student s1 = new Student("Simone", 24);
        Student s2 = new Student("Benjamin", 32);
        jpaRepository.save(s1);
        jpaRepository.save(s2);

        Iterable<Student> all = jpaRepository.findAll();

        all.forEach(System.out::println);

    }
}

