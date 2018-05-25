
private static final String[] specialNamesMonthDayEs = {
	        "",
	        "uno",
	        "dos",
	        "tres",
	        "cuatro",
	        "cinco",
	        "seis",
	        "siete",
	        "ocho",
	        "nueve",
	        "diez",
	        "once",
	        "doce",
	        "trece",
	        "catorce",
	        "quince",
	        "dieciséis",
	        "diecisiete",
	        "dieciocho",
	        "diecinueve",
	        "veinte",
	        "veintiuno",
	        "veintidós",
	        "veintitrés",
	        "veinticuatro",
	        "veinticinco",
	        "veintiséis",
	        "veintisiete",
	        "veintiocho",
	        "veintinueve",
	        "treinta",
	        "treinta y uno"
	    };

	private static final String[] specialNamesOfMonthEs = {
	        "Enero",
	        "Febrero",
	        "Marzo",
	        "Abril",
	        "Mayo",
	        "Junio",
	        "Julio",
	        "Agosto",
	        "Septiembre",
	        "Octubre",
	        "Noviembre",
	        "Diciembre",
	    };
	
	/**
	 * 
	 * @param dateToConvert
	 * @return
	 */
	public String convertDateToWord(Date dateToConvert) {
		
		String buildStringDate="";
		Calendar cal = Calendar.getInstance(); // get todays date
		cal.setTime(dateToConvert);
		
		try {
//			Integer dia= dateToConvert.getDate();// deprecated
			Integer dia= cal.get(Calendar.DAY_OF_MONTH); // get the days from 1 to 31
			buildStringDate = buildStringDate + specialNamesMonthDayEs[dia];
			buildStringDate = buildStringDate + " de ";
//			buildStringDate = buildStringDate + specialNamesOfMonthEs[dateToConvert.getMonth()]; // deprecated
			buildStringDate = buildStringDate + specialNamesOfMonthEs[cal.get(Calendar.MONTH)];
			buildStringDate = buildStringDate + " de ";
			SimpleDateFormat df = new SimpleDateFormat("yyyy");
			buildStringDate = buildStringDate + df.format(dateToConvert);			
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		
		return buildStringDate;
		
	}
