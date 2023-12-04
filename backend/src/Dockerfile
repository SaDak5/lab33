# Utiliser une image de base avec Java
FROM openjdk:11-jdk

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier JAR construit (assurez-vous que le fichier JAR est dans le même répertoire que ce Dockerfile)
COPY target/*.jar app.jar

# Exposer le port sur lequel l'application Spring Boot s'exécute (ajustez-le en fonction de votre application)
EXPOSE 8085

# Commande pour exécuter l'application Spring Boot lorsque le conteneur démarre
CMD ["java", "-jar", "app.jar"]
