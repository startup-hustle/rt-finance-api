package rt.finance.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
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
@Data
@RequestMapping("/api/v1")
@Tag(name = "Bill Management", description = "Operations about Bills")
public class BillController {

    final BillInfoService billInfoService;

    @PostMapping("/bill-info")
    @Operation(
            summary = "Add New Bill Info"
            , description = "Add A New Bill Info with their unique ID"
            , tags = {"Bill Management"}
            , responses = {
                @ApiResponse(responseCode = "201", description = "Bill Info successfully added")
            }
    )
    public ResponseEntity<BillInfoResponseDto> addBillInfo(
            @Parameter(description = "RequestDto for Bill Info", required = true)
            @RequestBody BillInfoRequestDto billInfoDto) {
        BillInfoResponseDto responseDto = billInfoService.addBillInfo(billInfoDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(responseDto);
    }
}
