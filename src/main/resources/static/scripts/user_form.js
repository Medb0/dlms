var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });

        $('#btn-update').on('click', function () {
            _this.update();
        });
    },
    save : function () {
        var data = {
            phone_num : $('#phone_num').val(),
            position : $('#position').val()
        };

        $.ajax({
            type : 'POST',
            url : '/api/v1/posts',
            dataType : 'json',
            contentType : 'application/json; charset=utf-8',
            data : JSON.stringify(data)
        }).done(function () {
            alert('예약이 완료되었습니다.');
            window.location.href = '/user';
        }).fail(function () {
            alert(JSON.stringify(error));
        });
    },
    update : function () {
        var data = {
            phone_num : $('#phone_num').val(),
            position : $('#position').val()
        };

        var id = $('#id').val();

        $.ajax({
            type: 'PUT',
            url: '/api/v1/posts/'+id,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            alert('예약이 성공적으로 완료되었습니다.');
            window.location.href = "/user";
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};

main.init();