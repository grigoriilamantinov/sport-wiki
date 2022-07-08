FROM openjdk
COPY /sport-wiki /sport-wiki-app

WORKDIR /sport-wiki-app

EXPOSE 8080

RUN javac SportWikiApplication.java

CMD [ "java", "main" ]