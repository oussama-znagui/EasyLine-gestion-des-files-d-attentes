package ma.znagui.easyline.dto.visit;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.easyline.entity.Visitor;
import ma.znagui.easyline.entity.WaitingList;
import ma.znagui.easyline.enums.VisitStatus;
import ma.znagui.easyline.validator.CheckExisting;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitCreateDTO {
    @NotNull(message = "ID de Visiteur SVP!")
    @CheckExisting(entityC = Visitor.class)
    private Long visitorID;

    @NotNull(message = "ID de la liste d'attente SVP!")
    @CheckExisting(entityC = WaitingList.class)
    private Long waitingListID;

    @NotNull(message = "La date d'arriver de client SVP!")
    private LocalDate arrivalTime;
    private String status;
    private int priority;
    private LocalTime ept;

}
