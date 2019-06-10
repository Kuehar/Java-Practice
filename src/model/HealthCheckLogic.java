package model;

public class HealthCheckLogic {
	public void HealthCheck(Health health) {
		double weight = health.getWeight();
		double height = health.getHeight();
		height /= 100;
		double bmi = weight/(height*height);
		health.setBmi(bmi);

		String bodyType;
		if(bmi < 18.5) {
			bodyType = "痩せ型";
		}else if(bmi <= 18.5 && bmi > 25) {
			bodyType = "普通";
		}else {
			bodyType = "肥満";
		}
		health.setBodyType(bodyType);
}
}