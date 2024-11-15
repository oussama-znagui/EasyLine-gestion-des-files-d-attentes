package ma.znagui.easyline.mapper;

import ma.znagui.easyline.dto.waitingList.WaitingListCreateDTO;
import ma.znagui.easyline.dto.waitingList.WaitingListResponseDTO;
import ma.znagui.easyline.entity.WaitingList;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public abstract class WaitingListMapper {


    public abstract WaitingList createDTOtoWaitingList(WaitingListCreateDTO dto);

    public abstract WaitingListResponseDTO waitingListToResponseDTO(WaitingList waitingList);

}

