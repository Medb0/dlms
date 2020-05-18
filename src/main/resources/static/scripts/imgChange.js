/*state = 0;

function changeImage() {
    
    if(state == 0){
        state = 1;
        document.getElementById('seat').src = "/images/afterseat.png"
    }else {
        state = 0;
        document.getElementById('seat').src = "/images/beseat.png"
    }
}
*/
/*
function fun3() {
        document.igg.src = "/images/afterseat.png";
        // images[1] 대신에 img 이름 igg 를 써도 된다
}
*/
/*
state = 0;

function change() {
  
   if(state == 0){
        state = 1;
       document.getElementById('seat').style.backgroundColor='#fa777d';
    }else {
        state = 0;
        document.getElementById('seat').style.backgroundColor='#484848';
    } 
}
*/
/*
function change1(obj){
    obj.style.background = 'red';
    obj.style.color = 'white';
}
     
function change2(obj){
    obj.style.background = 'white';
    obj.style.color = 'black';
}
*/
/*
function noSpaceForm(obj) 
{             
    var str_space = /\s/;               // 공백 체크
    if(str_space.exec(obj.value)) 
    {     // 공백 체크
        alert("입력란이 비어있습니다.");
        obj.focus();
        obj.value = obj.value.replace(' ',''); // 공백제거
        return false;
    }
}
*/
function check() {
    var n = document.myform.name.value;
    var p = document.myform.phone.value;
    
    if(n==""){
        alert('이름을 입력해주세요.');
        document.myform.name.focus();
        return;
    }
    if(p==""){
        alert('전화번호를 입력해주세요.');
        document.myform.phone.focus();
        return;
    }
    
}























