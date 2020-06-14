package daelim.lnl.dlms.service.posts;

import daelim.lnl.dlms.domain.posts.Lockers;
import daelim.lnl.dlms.domain.posts.LockersRepository;
import daelim.lnl.dlms.web.dto.LockersListResponseDto;
import daelim.lnl.dlms.web.dto.LockersResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LockersService {
    private final LockersRepository lockersRepository;

//    @Transactional
//    public Long save(PostsSaveRequestDto requestDto) {
//        return lockersRepository.save(requestDto.toEntity()).getId();
//    }
//
    @Transactional
    public String update(String position) {

        Lockers entity = lockersRepository.findByPosition(position);

        return entity.getPosition();
    }
//
//    public LockersResponseDto findById(Long id) {
//
//        Lockers entity = lockersRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));
//
//        return new LockersResponseDto(entity);
//    }

    @Transactional(readOnly = true)
    public List<LockersListResponseDto> findAllDesc(){
        return lockersRepository.findAllDesc().stream()
                .map(LockersListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public String updateStatus(String targetPosition) {

        Lockers entity = lockersRepository.findByPosition(targetPosition);

        entity.setStatus("y");

        entity.save(entity);

        return entity.getStatus();
    }

    public LockersResponseDto findByIdx(Long idx) {

        Lockers entity = lockersRepository.findById(idx).orElseThrow(() -> new IllegalArgumentException("해당 사물함 번호가 없습니다. idx="+idx));

        return new LockersResponseDto(entity);
    }

}
