var main ={
    save: function () {
        var data = {
            position: $('#position').val(),
            stduent_id:$('#stduent_id').val(),
            name: $('#name').val(),
            phone_num: $('#phone_num').val(),
            pwd: $('#pwd').val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/posts',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            window.location.href = '/api/v1/lockers/'+data.position;
            // alert('예약이 완료되었습니다.');
            window.location.href = '/u_complete';
        }).fail(function (error) {
            alert("예약된 좌석이거나 예약을 하셨습니다.");
            window.location.href = '/u_popup';
        });
    }
};
