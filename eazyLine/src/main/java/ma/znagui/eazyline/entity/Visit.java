package ma.znagui.eazyline.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @ManyToOne
    @MapsId("visitorID")
    @JoinColumn(name = "visitor_id", nullable = false)
    private Visitor visitor;

    @ManyToOne
    @MapsId("waitingListID")
    @JoinColumn(name = "waitingList_id", nullable = false)
    private WaitingList waitingList;

}
