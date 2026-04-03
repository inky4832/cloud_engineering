package exam11_static2;

public class Cat {

	private String name;
	private int age;
	private String gender;
	
	public Cat() {}

	public Cat(String name, int age, String gender) {
		this.name = name;
		//age 검증
//		if(age >= 30) {
		if(ValidClass.ageValidCheck(age)) {
			System.out.println("나이 입력 오류발생");
		}else {
			this.age = age;			
		}
		this.gender = gender;
	}
	public void setAge(int age) {
		//age 검증
//		if(age >= 30) {
		if(ValidClass.ageValidCheck(age)) {
			System.out.println("나이 수정 오류발생");
		}else {
			this.age = age;			
		}
	}
	//필요시 메서드 추가
		// age 검증하는 메서드
//		private boolean ageValidCheck(int age) {
//			 boolean result = false;
//			 //조건체크
//			 if(age >= 30)result=true;
//			 return result;
//		}
		private boolean ageValidCheck2(int age) {
			 //조건체크
			 if(age >= 20) {
				 return true;
			 }else {
				 return false;
			 }
		}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
