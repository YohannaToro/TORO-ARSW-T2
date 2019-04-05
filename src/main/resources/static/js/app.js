app = (function () {


    return {

        getWeatherByCityName:function(name){
            console.log("parceeeeeee");
            return appclient.getWeatherByCityName(name, function (weathers) {
                console.log("parceeeeeee");

                    $("#tableRepository").append("<tr><td>" + weathers.id
                        + "</td><td>" + weathers.cod
                        + "</td><td>" +weathers.name
                        + "</td>")
        });
    }
    }
    }
    );