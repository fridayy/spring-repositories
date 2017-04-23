package ninja.harmless.data;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

/**
 * @author bnjm@harmless.ninja - 4/23/17.
 */
@Document(collection = "student")
@Entity
@Table(name = "student")
public class Student {

    @Id
    private UUID uuid;

    @Column
    private String name;

    @Column
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.age = age;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
