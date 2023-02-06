package co.develhope.hybernate.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "enrollments")
@Data
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student studentId;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private SchoolClass classId;

    @Column(nullable = false)
    private LocalDate date = LocalDate.now();
}
