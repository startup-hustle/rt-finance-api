package rt.finance.service.impl;

import lombok.Data;
import org.springframework.stereotype.Service;
import rt.finance.dto.BillInfoRequestDto;
import rt.finance.dto.BillInfoResponseDto;
import rt.finance.entity.BillInfo;
import rt.finance.mapper.BillInfoMapper;
import rt.finance.repository.BillInfoRepository;
import rt.finance.service.BillInfoService;

@Service
@Data
public class BillInfoServiceImpl implements BillInfoService{

    final BillInfoRepository billInfoRepository;
    final BillInfoMapper billInfoMapper;

    @Override
    public BillInfoResponseDto addBillInfo(BillInfoRequestDto billInfoRequestDto) {
        BillInfo billInfo = billInfoMapper.toEntity(billInfoRequestDto);
        billInfo = billInfoRepository.save(billInfo);
        return billInfoMapper.toResponseDto(billInfo);
    }
}
