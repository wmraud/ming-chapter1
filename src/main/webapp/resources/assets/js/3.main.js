// clock
var month_name = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

function getToday() {
    var now = new Date();
    var year = now.getFullYear();
    var month = now.getMonth();
    var date = now.getDate();
    var hour = now.getHours()
    var minute = now.getMinutes();
    var second = now.getSeconds();
    var ampm = hour >= 12 ? 'Pm' : 'Am';

    date = date >= 10 ? date : '0' + date;
    hour = hour >= 10 ? hour : '0' + hour;
    minute = minute >= 10 ? minute : '0' + minute;
    second = second >= 10 ? second : '0' + second;


    $('#clock_day').text(date);
    $('#clock_month').text(month_name[month]);
    $('#clock_year').text(year);
    $('#clock_ampm').text(ampm)
    $('#clock_time').text(hour + ':' + minute + ':' + second);

    return { 
        now : now,
        year: year,
        month : month + 1,
        date : date
    };
}

function init() {
    getToday();
    setInterval(getToday, 500);
}

init();

var now = getToday().now;
var before_now = new Date(now.setMonth(now.getMonth() - 2));

var month_format = (getToday().month = getToday().month >= 10 ? getToday().month : '0' + getToday().month);

var before_year = before_now.getFullYear();
var before_month = before_now.getMonth();
var before_month_format = before_month = before_month >= 10 ? before_month : '0' + before_month;
var before_day = before_now.getDate();
var before_day_format = before_day = before_day >= 10 ? before_day : '0' + before_day;

// console.log(before_month);
// console.log(before_year);
// console.log(before_day);

// console.log('?order_status=all&history_start_date=' + before_year + '-' + before_month_format + '-' + before_day_format +' &history_end_date='+ getToday().year + '-' + month_format + '-' + getToday().date +'&mode=&term=three');
$('#myshop-link').attr('href', '/myshop/main.html?order_status=all&history_start_date=' + before_year + '-' + before_month_format + '-' + before_day_format +' &history_end_date='+ getToday().year + '-' + month_format + '-' + getToday().date +'&mode=&term=three')


////////////////////////////