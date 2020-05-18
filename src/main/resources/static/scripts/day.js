$(function() {
    
    var dpFrom = $('#from').datepicker({
        dateFormat: 'yy-mm-dd',
        minDate: 0,
        onSelect: function() {
            dpTo.datepicker('option','minDate',dpFrom.datepicker('getDate'));
        }
    });
    
    dpFrom.datepicker('setDate', new Date());
    
    var dpTo = $('#to').datepicker({
        dateFormat: 'yy-mm-dd',
        minDate: 0
    });
    
    dpTo.datepicker('setDate',7);
    
});