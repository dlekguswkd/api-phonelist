# docker 이미지 만들기 위한것

# JDK 17 베이스 이미지 사용
FROM openjdk:17

# 컨테이너 내부에서 애플리케이션 파일을 저장할 디렉토리 생성
WORKDIR /app

# 빌드된 jar 파일을 컨테이너의 /app 디렉토리로 복사
COPY target/api-phonelist-0.0.1-SNAPSHOT.jar /app/api-phonelist.jar

# 컨테이너가 시작될 때 실행될 명령어 설정  -> 바로실행됨
ENTRYPOINT ["java", "-jar", "/app/api-phonelist.jar"]