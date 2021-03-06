package inheritance;
/* 지금까지 했던 ..정리!
 * this.변수
 * this.메서드()
 * this()
 * this(인자, 인자, ...)  --- 자기자신의 생성자 호출
 * 
 * super.변수
 * super.메서드()
 * super()
 * super(인자, 인자, ...) --- 부모의 생성자 호출
 * 
 */

//부모클래스 생성
class ParentEx{
	public ParentEx() {
		System.out.println("parent class");//3
	}
}
//자식클래스 생성
class ChildEx extends ParentEx{
	//디폴트 생성자
	public ChildEx() {
		super(); //생략가능 ,2
		System.out.println("child class");//4
	}
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		//객체 생성
		new ChildEx(); //1
	}

}
