# 어댑터 패턴

## 개념
- 대상 클래스를 원하는 다른 클래스 형태로 변환해주는 패턴 (대상 클래스는 어떤 이유에서 변경이 불가능하다고 가정했을 때)
- 때문에 `Wrapper` 라고 생각해도 됨.

## 쓰는 이유?
- 예전에 작업한 레거시 코드거나, 혹은 외부에서 만든 라이브러리 등은 변경 등이 불가능한 경우가 발생함.

## 예시 코드 설명 

**Animal**
- *`Cat`과 `Dog`가 구현하는 추상 클래스. 내부에 `sound()` 추상메서드를 가지고 있음.*
- *`Cat`과 `Dog`는 `sound()`를 실제로 구현함.*

**Tiger**
- *어떤 이유에서 `Animal`를 상속할 수 없음.*
- *`sound()`와 비슷한 동작을 하는 `roar()`를 가지고 있음.*

**TigerAdapter**
- *필드로 `Tiger` 클래스를 가질 수 있으며, `Tiger` 대신 `Animal` 클래스를 상속받음.*
- *`Tiger`를 가지고 다른 `Animal` 클래스가 하는 동작을 동일하게 하도록 `roar()`메서드를 사용하여 `sound()` 메서드를 구현함.*

**사용**
- `Tiger` 대신 `TigerAdapter`를 사용하면 `Cat`, `Dog`, `Tiger` 모두 `Animal`로 사용할 수 있음.

### 참고자료: 
- [GIS Developer 유튜브](https://youtu.be/7MSzyqhrO-A)
- [코드없는 프로그래밍 유튜브](https://youtu.be/IHU-wDglGM0)