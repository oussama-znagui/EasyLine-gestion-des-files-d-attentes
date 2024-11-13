package ma.znagui.easyline.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class VisitKey implements Serializable {
    private Long visitorID;
    private Long waitingListID;
}
