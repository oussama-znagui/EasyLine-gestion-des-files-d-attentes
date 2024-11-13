package ma.znagui.eazyline.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.eazyline.enums.VisitStatus;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Visit {
    @EmbeddedId
    private VisitKey id;
    private LocalTime arrivalTime;
    private LocalTime startTime;
    private LocalTime endTime;
    private VisitStatus status;
    private int priority;
    private LocalTime ept;



    @ManyToOne
    @MapsId("visitorID")
    private Visitor visitor;

    @ManyToOne
    @MapsId("waitingListID")
    private WaitingList waitingList;

}
