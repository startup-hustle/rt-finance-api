package rt.finance.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rt.finance.dto.BillInfoRequestDto;
import rt.finance.dto.BillInfoResponseDto;
import rt.finance.service.BillInfoService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class BillController {

    private final BillInfoService billInfoService;

    @PostMapping("/bill-info")
    public ResponseEntity<BillInfoResponseDto> addBillInfo(@RequestBody BillInfoRequestDto billInfoDto) {
        BillInfoResponseDto responseDto = billInfoService.addBillInfo(billInfoDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(responseDto);
    }
}
