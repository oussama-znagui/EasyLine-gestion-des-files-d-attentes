package ma.znagui.easyline.service.Impl;

import ma.znagui.easyline.dto.waitingList.WaitingListCreateDTO;
import ma.znagui.easyline.dto.waitingList.WaitingListResponseDTO;
import ma.znagui.easyline.entity.WaitingList;
import ma.znagui.easyline.mapper.WaitingListMapper;
import ma.znagui.easyline.repository.WaitingListRepository;
import ma.znagui.easyline.service.WaitingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaitingListServiceImpl implements WaitingListService {

    @Autowired
    WaitingListRepository repository;
    @Autowired
    WaitingListMapper mapper;

    public WaitingListResponseDTO create(WaitingListCreateDTO dto) {
        WaitingList toCreate = mapper.createDTOtoWaitingList(dto);
        WaitingList created = repository.save(toCreate);
        return mapper.waitingListToResponseDTO(created);
    }
}
