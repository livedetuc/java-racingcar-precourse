# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)


## 기능 목록

- [CarName / 자동차 이름] 사용자 입력 예외 처리
  - 각 이름이 5자 이하
- [TryCount / 시도 횟수] 사용자 입력 예외 처리
  - 숫자여야 함
  - 0 보다 큰 자연수
- [Car / 자동차]
  - 전진 혹은 멈춤 (goForwardOrStop)
- [RandomNo / 랜덤 숫자]
  - 랜덤 수는 0 ~ 9사이의 자연수
  - 0 ~ 3: car 멈춤
  - 4 ~ 9: car 전진
 - [Cars / 자동차들]: 
   - 레이싱 결과 핸들링 (getWinners)
      - 자동차 중 가장 많이 전진한 자동차 구하기