package Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Transport {
    @Id
    private Integer ID;
    private String Name;
    private Integer Weight;
    private Integer Price;
    private Integer MaxSpped;
    @Column(name = "Name", nullable = false, unique = true, length = 40)
    private String email;
}
