package rt.finance.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rt.finance.dto.BillInfoRequestDto;
import rt.finance.dto.BillInfoResponseDto;
import rt.finance.entity.BillInfo;

@Mapper(componentModel = "spring")
public interface BillInfoMapper {

    @Mapping(source = "name", target = "billName")
    @Mapping(source = "amount", target = "billAmount")
    BillInfoResponseDto toResponseDto(BillInfo billInfo);

    @Mapping(source = "name", target = "billName")
    @Mapping(source = "amount", target = "billAmount")
    BillInfoRequestDto toRequestDto(BillInfo billInfo);

    @Mapping(target = "name", source = "billName")
    @Mapping(target = "amount", source = "billAmount")
    BillInfo toEntity(BillInfoRequestDto requestDto);

    @Mapping(target = "name", source = "billName")
    @Mapping(target = "amount", source = "billAmount")
    BillInfo toEntity(BillInfoResponseDto responseDto);
}
