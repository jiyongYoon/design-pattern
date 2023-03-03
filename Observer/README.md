# 옵저버 패턴

## 개념
- 한 대상의 상태변화에 관심이 있는 관찰자(다른 객체)에게 상태변화를 알리는 패턴

## 쓰는 이유?
- 관심 대상의 코드를 변경하지 않고 관찰자 및 관찰자 종류를 새롭게 도입할 수 있음.
- 런타임에 객체 간의 관계들을 형성할 수 있음.
- (ex, EventListener, [SseEmitter](https://github.com/jiyongYoon/study_springboot_anySkills/tree/master/src/main/java/com/example/test/component/sse) 등에 사용되는 것을 봄)

## 예시 코드 설명 

**[1. 관심 대상]**
- *`DiceGame` 추상클래스는 관심의 대상이며 이를 구독할 Player리스트를 가지고 있고, 리스트에 Player를 추가하는 `addPlayer()` 메서드를 가지고 있음.*
- *그리고 `pattern.DiceGame`이 동작하는 `play()` 추상메서드를 가지고 있음.*
- *`FairDiceGame`은 `DiceGame`을 상속받고 실제 동작인 `play()`를 구현함.*

**[2. 관찰자]**
- *`Player` 추상클래스는 필요한 필드와 `update()`라는 추상메서드를 가지고 있음.*
- *`OddBettingPlayer`와 `EvenBettingPlayer`는 `Player`를 상속받고 실제 동작인 `update()`를 구현함.*

**[3. 동작]**
- *`FairDiceGame`에 구독할 플레이어를 추가하고, 게임을 `play()`함.*

**[4. 확장]**
- *새로운 게임인 `UnFairDiceGame`이 생기면 해당 게임은 `DiceGame`을 상속받고 실제 동작인 `play()`만 구현해주면 됨.*
- *새로운 관찰자인 `NBettingPlayer`는 특정 숫자가 나오는지 관심이 있는 관찰자이며, `Player`를 상속받고 실제 동작인 `update()`를 구현해주면 됨*

## 정리
- 관심의 대상은 관찰자를 담을 Field를 가지고 있고, 본인의 실제 동작(`play() 구현`)과 함께 관찰자에게 이 동작이 일어남을 알리면 됨.(`update() 호출`)
- 관찰자는 동작이 일어나면 어떻게 행동할지만 정의하면 됨(`update() 구현`)

## 배운 점
- 어떤 특정 클래스의 동작이 `누가 관심을 가지는지`에 따라서 메서드를 구현할 위치가 달라질 것 같다.
- 예를 들면, 이번 예시의 `Player` 클래스의 메서드인 `update()`는 `Game` 클래스에서는 관심이 있을 필요가 없다. 따라서, `Player` 클래스에 구현하고, `Game` 클래스에서는 그저 `update()` 메서드를 호출하기만 하면 된다.
- 특히, 이 구조에서 `Game` 클래스가 여러 종류로 확장할 가능성이 많을수록, 동일한 코드가 `Game`종류의 클래스에서 반복되지 않도록 하기 위해서는 이 구조가 더 중요하다.
  (ex, `DTO` 클래스의 `toDto()` 메서드와 같이!)

### 참고자료: 
- [GIS Developer 유튜브](https://youtu.be/4WO95iHQTx8)