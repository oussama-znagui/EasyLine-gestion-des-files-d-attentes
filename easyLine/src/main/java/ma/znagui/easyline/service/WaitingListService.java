package ma.znagui.easyline.service;

import ma.znagui.easyline.dto.waitingList.WaitingListCreateDTO;
import ma.znagui.easyline.dto.waitingList.WaitingListResponseDTO;
import ma.znagui.easyline.entity.WaitingList;

public interface WaitingListService {
    public WaitingListResponseDTO create(WaitingListCreateDTO dto);
}
