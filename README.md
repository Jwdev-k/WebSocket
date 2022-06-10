# WebSocket
### 스프링부트 웹 채팅방 프로젝트(공부용)개발중
스프링 세큐리티 사용할 예정이였으나 채팅방 구현목적 이므로 사용하지 않음.
## 🔨사용된 기술 스택
- Spring Boot
- Spring JPA
- MariaDB

## SendMessage
`{
"type":"JOIN",
"roomId":"89badd95-fa8f-4080-ad19-4b7c5309d1e3",
"sender":"test",
"message":"안녕하세요."
}`
## RoomList [GET]
`{
"roomId": "89badd95-fa8f-4080-ad19-4b7c5309d1e3",
"name": "테스트방",
"sessions": []
}`
## CreateRoom [POST]
`/api/chat?name=테스트방`

`{
"roomId": "89badd95-fa8f-4080-ad19-4b7c5309d1e3",
"name": "테스트방",
"sessions": []
}`
