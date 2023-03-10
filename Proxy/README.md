# 프록시 패턴

## 개념
- 어떤 작업의 실행을 대리인을 통해 실행하도록 하는 패턴.

## 쓰는 이유?
- 어떤 작업을 할 때 중간 단계를 두면 얻을 수 있는 이점을 활용하고자 할 때 사용하는 것으로 보임.
- ex1) 메일을 여러명에게 보낼 경우, 1명씩 보내면 오래 걸리는 작업을 10명씩 묶어서 보내게 한다거나
- ex2) 어떤 작업의 결과물을 `Caching` 해두었다가, 동일한 요청이 오는 경우 실제 작업을 하지 않고 중간 단계에서 `Caching`된 데이터를 리턴해줌.

## 예시 코드 설명 

**Display**
- *무언가를 출력하는 `print()` 메서드를 가지고 있음*

**ScreenDisplay**
- *실제 작업을 하는 클래스. `Display` 인터페이스를 구현하여 `print()` 메서드를 구현하였으며, `print()` 메서드를 실행하기 위해서는 매 메서드 호출 시 `0.5초`의 시간이 필요함.*

**BufferDisplay**
- *실제 작업을 하는 `ScreenDisplay` 클래스의 문제를 해결하기 위해 프록시 객체가 되며, `print()`에 전달 될 `String` 값을 모아서 전달하는 역할을 하여 성능을 개선함.*

**사용**  
- 프록시 적용 전
  - `Main` 클래스에서 `ScreenDisplay` 객체를 직접 사용하여 해당 객체의 `print()`메서드를 실행함.
- 프록시 적용 후
  - 기존 `Main` 클래스에서 직접 `ScreenDisplay`를 사용하지 않고, `ScreenDisplay`를 필드로 가지고 프록시 역할을 하는 `BufferDisplay`를 사용함.

### 참고자료: 
- [GIS Developer 유튜브](https://youtu.be/NoRPG06c48U)