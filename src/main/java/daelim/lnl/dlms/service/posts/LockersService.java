package daelim.lnl.dlms.service.posts;

import daelim.lnl.dlms.domain.posts.Lockers;
import daelim.lnl.dlms.domain.posts.LockersRepository;
import daelim.lnl.dlms.domain.posts.Posts;
import daelim.lnl.dlms.domain.posts.PostsRepository;
import daelim.lnl.dlms.web.dto.PostsListResponseDto;
import daelim.lnl.dlms.web.dto.PostsResponseDto;
import daelim.lnl.dlms.web.dto.PostsSaveRequestDto;
import daelim.lnl.dlms.web.dto.PostsUpdateRequestDto;
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
//    @Transactional
//    public Long update(Long id, PostsUpdateRequestDto requestDto) {
//        Lockers lockers = lockersRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));
//
//        lockers.update(requestDto.getPhone_num(), requestDto.getPosition());
//
//        return id;
//    }
//
//    public LockersResponseDto findById(Long id) {
//
//        Lockers entity = lockersRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));
//
//        return new LockersResponseDto(entity);
//    }
//
//    @Transactional(readOnly = true)
//    public List<PostsListResponseDto> findAllDesc(){
//        return lockersRepository.findAllDesc().stream()
//                .map(PostsListResponseDto::new)
//                .collect(Collectors.toList());
//    }
}
