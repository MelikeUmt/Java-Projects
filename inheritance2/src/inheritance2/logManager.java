package inheritance2;

public class logManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritabanına loglandı.");
			}else if(logType == 2) {
				System.out.println("Dosyaya loglandı");
			}else {
				System.out.println("Email gönderildi.");
			}
	}

}


//1.Database
//2.file
//3.Email