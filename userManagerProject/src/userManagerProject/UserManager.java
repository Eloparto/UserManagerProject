package userManagerProject;

public class UserManager {

	private Logger[] logger;
	
	public UserManager(Logger[] logger) {
		
		this.logger = logger;
		
	}
	
	
	public void add(User user) {
		
		System.out.println(user.getFirstName()+" "+user.getLastName()+" isim ve soyisimli kullan�c� sisteme ba�ar�yla kaydedildi. Kullan�c� data kimli�i: " + user.getDataId());
		
		for(Logger log: logger) {
			
			log.log();
			
		}
		
	} //ELOPARTO
	
	public void delete(User user) {
		
		System.out.println(user.getDataId()+" kimli�ine sahip "+user.getFirstName()+" "+user.getLastName()+" isim ve soyisimli kullan�c� sistemden ba�ar�yla silindi." );
		
		for(Logger log: logger) {
			
			log.log();
			
		}

	}
	
	public Logger[] getLoggers() {
		
		return logger;
		
	}
}
