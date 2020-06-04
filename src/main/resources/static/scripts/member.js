var main = {
    delete : function (id) {
        $.ajax({
            type: 'DELETE',
            url: 'api/v1/posts/'+id,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8'
        }).done(function () {
            alert('회원 탈퇴가 성공적으로 처리되었습니다.');
            window.location.href="/member";
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};
