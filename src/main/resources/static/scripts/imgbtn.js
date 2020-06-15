function statusCheck(idx, status) {

    var tagId = document.getElementById(idx);

    if(status == 'y'){
        tagId.src = "./images/locker-room.png"
        tagId.setAttribute('onclick', "");
    }else{
        tagId.src = "./images/mcloset.png"
        tagId.setAttribute('onclick', "window.open('/u_popup/"+ idx +"','pop','width=400px height=800px,location=no,status=no,scrollbars=no');");
    }
}