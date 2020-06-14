function statusCheck(idx, status) {

    var tagId = document.getElementById(idx);

    if(status == 'y'){
        console.log(idx , status, "트루");
        tagId.src = "./images/locker-room.png"
    }else{
        console.log(idx , status, "펄스");
        tagId.src = "./images/mcloset.png"
    }
}