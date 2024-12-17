package rt.finance.service;

import rt.finance.dto.BillInfoRequestDto;
import rt.finance.dto.BillInfoResponseDto;

public interface BillInfoService {

    BillInfoResponseDto addBillInfo(BillInfoRequestDto billInfoRequestDto);
}
