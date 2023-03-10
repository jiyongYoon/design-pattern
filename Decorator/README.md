# 데코레이터 패턴

## 개념
- 객체의 기능을 마치 장식처럼 계속 추가할 수 있는 패턴.

## 쓰는 이유?
- 기능을 실행 중에 동적으로 변경 또는 확장할 수 있음.

## 예시 코드 설명 

**Item**
- *기능을 추가할 객체의 대상.*

**Strings**
- *기능을 추가할 가장 root 객체. 해당 클래스도 `Item`을 상속함.*

**Decorator**
- *기능을 추가할 수 있는 객체. 추상 클래스이며, 내부적으로 기능을 추가할 대상인 `Item`을 필드로 가짐.*

**Side, Box, LineNumberDecorator**
- *각 클래스별로 추가할 기능을 실제로 구현한 클래스.*
- *`Decorator`를 상속함.*

**사용**  
- `Item`을 상속받은 `Strings`는 `Decorator`를 상속한 클래스에 파라미터로 넘길 수 있음.
- `Strings`를 꾸미고자 하는 `Decorator` 클래스에 파라미터로 넘김.
- 꾸며진 결과물 역시 `Item`이기 때문에 또 `Decorator`에 넘길 수 있음.

### 참고자료: 
- [GIS Developer 유튜브](https://youtu.be/UTmY_oB4V8I)