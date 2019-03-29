apiclient = (function() {

	return {
		getWeatherByCityName : function(city, callback) {
	        String path=""
			$.get("https://toro-arsw-t2.herokuapp.com/wea/" + city, function(data) {
				callback(data);
			});
		}
	}

})();