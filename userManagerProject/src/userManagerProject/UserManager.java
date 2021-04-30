package userManagerProject;

public class UserManager {

	private Logger[] logger;
	
	public UserManager(Logger[] logger) {
		
		this.logger = logger;
		
	}
	
	
	public void add(User user) {
		
		System.out.println(user.getFirstName()+" "+user.getLastName()+" isim ve soyisimli kullanýcý sisteme baþarýyla kaydedildi. Kullanýcý data kimliði: " + user.getDataId());
		
		for(Logger log: logger) {
			
			log.log();
			
		}
		
	} //ELOPARTO
	
	public void delete(User user) {
		
		System.out.println(user.getDataId()+" kimliðine sahip "+user.getFirstName()+" "+user.getLastName()+" isim ve soyisimli kullanýcý sistemden baþarýyla silindi." );
		
		for(Logger log: logger) {
			
			log.log();
			
		}

	}
	
	public Logger[] getLoggers() {
		
		return logger;
		
	}
}
