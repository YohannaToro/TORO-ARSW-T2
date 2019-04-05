apiclient = (function() {

	return {
		getWeatherByCityName : function(id, callback) {
			axios({
				url: "https://openweathermap.org/data/2.5/weather?q="+id+"&appid=b6907d289e10d714a6e88b30761fae22",
				method: 'get',
				callback(data);
			  })
			  
	      
		}
	}

})();