# Biblioteca API - Spring Boot (UFPS)

Este proyecto implementa una API REST para la gestión de libros, aplicando la arquitectura por capas y el patrón **Repository** con Spring Data JPA.

## 🏗️ Arquitectura
El proyecto sigue una estructura de capas para asegurar la separación de responsabilidades:
- **Entity**: Mapeo de la tabla `libros` con JPA y validaciones de Jakarta.
- **Repository**: Abstracción del acceso a datos mediante `JpaRepository`.
- **Service**: Capa de negocio para validaciones y orquestación.
- **Controller**: Exposición de endpoints RESTful y manejo de respuestas HTTP.

## 🚀 Ejecución
1. Clonar el repositorio.
2. Ejecutar `mvn spring-boot:run`.
3. Acceder a la consola H2 en: `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:biblioteca_db`).

## 🛠️ Endpoints Principales
- `GET /api/libros`: Listar todos los libros.
- `POST /api/libros`: Crear un nuevo libro (Retorna 201 Created).

## 📸 Evidencias
<img width="1081" height="715" alt="image" src="https://github.com/user-attachments/assets/06f3ccba-1e55-4d5e-be31-1c582f413ecf" />

<img width="1157" height="423" alt="image" src="https://github.com/user-attachments/assets/256d2004-edb2-41d5-a198-e8313e74ee8a" />


