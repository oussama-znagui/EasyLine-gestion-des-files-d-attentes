package ma.znagui.easyline.dto.waitingList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.easyline.entity.Visit;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaitingListResponseDTO {
    private Long id;
    private LocalDate date;
    private int capacity;
    private String algorithme;


}
