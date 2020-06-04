function check() {
    var n = document.myform.name.value;
    var p = document.myform.num.value;
    
    if(n==""){
        alert('이름을 입력해주세요.');
        document.myform.name.focus();
        return;
    }
    if(p==""){
        alert('전화번호를 입력해주세요.');
        document.myform.num.focus();
        return;
    }    
}















