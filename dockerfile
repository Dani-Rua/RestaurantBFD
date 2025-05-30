FROM gradle:jdk17-corretto-al2023 AS build

WORKDIR /app

COPY RestaurantOrder/build.gradle RestaurantOrder/settings.gradle /app/

COPY RestaurantOrder/src /app/src

RUN gradle clean
RUN gradle build

FROM eclipse-temurin:17-jre-alpine

RUN apk add --no-cache bash

WORKDIR /app

COPY --from=build /app/build/libs/order-1.0.0.jar /app/Microservicio.jar

EXPOSE 8091

ENTRYPOINT ["java", "-jar", "Microservicio.jar"]

