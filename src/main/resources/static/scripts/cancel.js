var main = {
    update : function (id) {
        var data = {
            position: null
        };

        $.ajax({
            type: 'PUT',
            url: 'api/v1/posts/'+id,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            alert('예약 취소가 성공적으로 처리되었습니다.');
            window.location.href="/cancel";
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};
