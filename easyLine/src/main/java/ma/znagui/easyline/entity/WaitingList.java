package ma.znagui.easyline.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class WaitingList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "la date svp !")
    private LocalDate date;

    private int capacity;

    private String algorithme;

    @OneToMany(mappedBy = "waitingList")
    private List<Visit> visits;

}
