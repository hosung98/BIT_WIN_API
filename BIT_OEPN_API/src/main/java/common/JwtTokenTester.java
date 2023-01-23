package common;

public class JwtTokenTester {

	public static void main(String[] args) {

		
		JwtTokenProvider obj = new JwtTokenProvider();
		System.out.println("Token value : " + obj.createToken("admin1"));
		
		System.out.println("Token 유효 검증 : " + obj.validateToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VySWQiOiJhZG1pbjEiLCJpYXQiOjE2NzQ0NzE5MDcsImV4cCI6MTY3NDQ3MTk2N30.VuA6pY-mQuQv6zKmwe3ZG7yxknQFOYMndY8iDz07ZAQ"));
		
	}

}
