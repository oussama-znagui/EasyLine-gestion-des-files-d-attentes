package ma.znagui.easyline.dto.waitingList;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaitingListCreateDTO {
    @NotNull(message = "La date ne peut pas être nulle.")
    private LocalDate date;
    @AssertTrue(message = "la date du liste d'attente doit etre superieur a la date d'aujourd'hui")
    public boolean isDateInPast(){
        return date != null && !date.isBefore(LocalDate.now());
    }

    private int capacity;
    private String algorithme;

}
