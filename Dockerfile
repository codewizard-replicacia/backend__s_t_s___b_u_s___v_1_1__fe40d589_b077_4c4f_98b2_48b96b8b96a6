FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend__s_t_s___b_u_s___v_1_1__fe40d589_b077_4c4f_98b2_48b96b8b96a6 backend__s_t_s___b_u_s___v_1_1__fe40d589_b077_4c4f_98b2_48b96b8b96a6
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend__s_t_s___b_u_s___v_1_1__fe40d589_b077_4c4f_98b2_48b96b8b96a6/target/_s_t_s_-_b_u_s_-_v_1_1_-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar _s_t_s_-_b_u_s_-_v_1_1_-0.0.1-SNAPSHOT.jar"]