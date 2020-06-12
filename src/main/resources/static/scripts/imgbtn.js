function change(i) {
    var img = document.getElementById(i);
    
    if(img.src.match('mcloset')){
        img.src = "./images/locker-room.png"
    }else {
        img.src = "./images/mcloset.png"
    }
}






















