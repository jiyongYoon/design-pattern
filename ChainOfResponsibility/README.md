# 책임연쇄(책임체인) 패턴

## 개념
- 요청을 처리하는 모듈을 만들어서, 연쇄(체인) 형태로 요청을 처리하는 디자인 패턴.

## 쓰는 이유?
- 기능을 클래스 별로 분리하여 구현하도록 유도하므로 클래스의 코드가 최적화됨(단일 책임 원칙)
- ex1) URL이 요청되었을 때, 1단계는 프로토콜을, 2단계는 도메인을, 3단계는 포트를 처리하게 하거나
- ex2) 결제 요청이 되었을 떄, 결제 방법을 단계별로 두어 처리가 가능하도록 하게 함.
- 연쇄작용, 즉 체인의 순서 및 구성을 비즈니스 로직에 맞게 여러 형태로 구성할 수 있음(ex, 트리, 역트리, 리스트, 무작위 등)

## 예시 코드 설명 

- *`Handler`는 다음 체인을 위한 `Handler`필드를 가지고 있음*
- *모든 `Handler`가 구현할 `process()` 추상메서드를 가지고 있으며, `run()`메서드를 통해서 연쇄작용을 함.*
- *`Handler`의 실제 구현체는 그 클래스에서 동작할 `process()`를 정의함. (단일 책임)*
- *`CoupangPaymentService`와 같이 해당 서비스에 따라 `Handler` 체인 순서를 효율적으로 구성해보았음.*

## 배운 점
- `CoupangPaymentSerice`와 같이 내부 로직의 캡슐화가 가능함.
- 단순히 리스트 형태라면 순차적으로 접근을 하면 되고, 이런 상황에서는 사용하는 클래스에서 `if - else if - else` 로 분기처리 하는 것이 빠르고 효율적일 수도 있겠으나,  
- 그 연쇄 작용이 리스트가 아닌 `Tree` 형태나 복잡한 구조를 가지고 있는 경우에는 분기처리를 할 경우 유지보수 및 확장성이 떨어지게 될 것임.
- `Command` 패턴과 함께 사용하여 메서드 및 동작을 파라미터로 전달하여 사용할 수도 있음.

### 참고자료: 
- [GIS Developer 유튜브](https://youtu.be/4WO95iHQTx8)
- [코드없는 프로그래밍 유튜브](https://youtu.be/Y0xn5ihjhg4)