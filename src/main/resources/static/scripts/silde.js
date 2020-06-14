document.addEventListener('DOMContentLoaded', function(){
    
    //변수지정
    var $sildeWrap = document.querySelector('.content'),
        $slideContent = document.querySelector('.slider-content'),
        $slide = document.querySelectorAll('.slide'),
        $navPrev = document.getElementById('prev'),
        $slideHeight = 800,
        $slideCount = $slide.length,
        $currentIndex = 0,
        $navNext = document.getElementById('next');
    
        //슬라이드 높이 확인하여 부모의 높이로 지정 -> 대상.offsetHeight
        // for(var i=0 ; i < $slideCount ; i++) {
        //     if($slideHeight < $slide[i].offsetHeight) {
        //         $slideHeight = $slide[i].offsetHeight;
        //     }
        // }
    
        $sildeWrap.style.height = $slideHeight + 'px';
        $slideContent.style.height = $slideHeight + 'px';
    
        //슬라이드가 있으면 가로로 배열하기
        for(var a=0 ; a < $slideCount ; a++){
            $slide[a].style.left = a * 100 + '%';
        }
    
        //슬라이드 이동함수
        function goToSlide(idx) {
            $slideContent.style.left = -100 * idx +'%';
            $slideContent.classList.add("ani");
            $currentIndex = idx;
        }
    
    
        //버튼을 클릭하면 슬라이드 이동
        //다음버튼을 클릭하면 할일, 이전버튼을 클릭하면 할일
        $navPrev.addEventListener('click', function(){
            
            if($currentIndex == 0){
                goToSlide($slideCount - 1);
            }else{
                goToSlide($currentIndex - 1);
            }
        });
        $navNext.addEventListener('click', function(){
            
            if($currentIndex == $slideCount - 1){
                goToSlide(0);
            }else{
                goToSlide($currentIndex + 1);
            }
        });
});
















