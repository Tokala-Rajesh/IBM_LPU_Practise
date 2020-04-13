package comm.example.bean;

//import lombok.Setter;
//
//@Setter
public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public BaseBallCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice backvolley today.!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
