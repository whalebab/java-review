package java_basic.poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        // ※ 객체를 생성할 때는 객체와 객체의 부모만 인스턴스에 생성된다. (객체 생성 시 해당 타입의 상위 부모 타임은 모두 함께 생성됨)
        // 이때 Child 인스턴스는 생성되지 않고 Parent 인스턴스만 생성되므로 Child로 DownCasting 불가
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.childMethod(); // 실행 불가
    }
}
