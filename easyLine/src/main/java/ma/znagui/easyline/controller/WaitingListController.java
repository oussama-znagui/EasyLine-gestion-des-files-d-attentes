package ma.znagui.easyline.controller;

import jakarta.validation.Valid;
import ma.znagui.easyline.dto.waitingList.WaitingListCreateDTO;
import ma.znagui.easyline.dto.waitingList.WaitingListResponseDTO;
import ma.znagui.easyline.service.WaitingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/waiting-list")
public class WaitingListController {
    @Autowired
    WaitingListService service;

    @GetMapping
    public String hello(){
        return "hello";
    }


    @PostMapping
    public ResponseEntity<WaitingListResponseDTO> create(@Valid @RequestBody WaitingListCreateDTO dto){
        return ResponseEntity.ok(service.create(dto));
    }
}
