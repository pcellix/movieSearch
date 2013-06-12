public class Main {

	public static void main(String args[]) throws InterruptedException {
		int openings = 0;
		int closures = 0;
		int end = 0;
		
		String result = "";
		String startTag = "<head>";
		String endTag = "</body>";
		String response = "<html><head>adas</head><body>asdsada</body></html>";
		
		
		for (int i = response.indexOf(startTag); i < response.length(); i++){
			if (i < (response.length() - endTag.length() - 1)) {
				if (response.substring(i, i + startTag.length()).equals(
						startTag)) {
					openings++;
				}
				if (response.substring(i, i + endTag.length()).equals(endTag)) {
					closures++;
				}
				if (openings == closures) {
					end = i;
					break;
				}
			}
		}	
		
		System.out.println(response.substring(response.indexOf(startTag), end));				
	}
}
