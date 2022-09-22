# MyBatis DB연결 세팅

### 설정방법
- MyBatisConfig 파일 필요
- resources/mapper/*.xml 파일 필요
- Users 엔티티 필요
- UsersDao 인터페이스 생성 필요

### 테이블 생성
```sql
DROP TABLE stadium;
##야구장
CREATE TABLE stadium(
	id int auto_increment primary key,
    name varchar(100),
    toarea VARCHAR(20),
    createdAt TIMESTAMP
);

DROP TABLE team;
##팀
CREATE TABLE team(
	 id int auto_increment primary key,
    stadiumId int,
    name varchar(100),
    createdAt TIMESTAMP,
    FOREIGN KEY(stadiumId) REFERENCES stadium(id) 
) ;

DROP TABLE player;
##선수
CREATE TABLE player(
	id int auto_increment primary key,
    name varchar(100),
    teamId int,
    position varchar(100),
    createdAt TIMESTAMP,
    FOREIGN KEY(teamId) REFERENCES team(id)
) ;

DROP TABLE expulsion;
#퇴출
CREATE TABLE expulsion(
	id int auto_increment primary key,
    reason varchar(100),
    playerId int,
    createdAt TIMESTAMP,
    FOREIGN KEY(playerId) REFERENCES player(id) 
) ;

SELECT * FROM expulsion;

```

### 더미데이터 추가
```sql

#구장
INSERT into stadium(NAME,toarea,createdAt)
VALUES("사직야구장","부산",now());
INSERT into stadium(NAME,toarea,createdAt)
VALUES("수원KT 야구장","수원",now());
INSERT into stadium(NAME,toarea,createdAt)
VALUES("잠실야구장","서울",NOW());
#팀

INSERT into team(stadiumId,name,createdAt)
VALUES("1","롯데",now());
INSERT into team(stadiumId,name,createdAt)
VALUES("2","KT위즈",now());
INSERT into team(stadiumId,name,createdAt)
VALUES("3","두산",now());

DELETE FROM player WHERE id =3;

#선수 
INSERT into player(name,teamId,position,createdAt)
VALUES("이대호",3,"1루수",now());
INSERT into player(name,teamId,position,createdAt)
VALUES("전준우",3,"좌익수",now());
INSERT into player(name,teamId,position,createdAt)
VALUES("김원중",3,"투수",now());


INSERT into player(name,teamId,position,createdAt)
VALUES("강백호",1,"루수",now());
INSERT into player(name,teamId,position,createdAt)
VALUES("박병호",1,"루수",now());
INSERT into player(name,teamId,position,createdAt)
VALUES("고영표",1,"투수",now());


INSERT into player(name,teamId,position,createdAt)
VALUES("정수빈",2,"중견수",now());
INSERT into player(name,teamId,position,createdAt)
VALUES("장원준",2,"투수",now());
INSERT into player(name,teamId,position,createdAt)
VALUES("이영하",2,"투수",now());

```