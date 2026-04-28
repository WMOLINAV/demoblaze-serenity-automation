# Pruebas de API – Demoblaze (Serenity + RestAssured)

Este documento describe la automatización de pruebas de los servicios REST
expuestos por la plataforma Demoblaze, utilizando **Serenity BDD** y **RestAssured**.

Las pruebas se ejecutan de forma independiente a la automatización Web.

---

## 🎯 Objetivo

Validar el comportamiento de los servicios REST de **Signup** y **Login**,
considerando escenarios positivos y negativos, de acuerdo con el enunciado del ejercicio.

---

## 🔗 Servicios probados

### Signup
- **POST /signup**
    - Crear un usuario nuevo
    - Intentar crear un usuario ya existente

### Login
- **POST /login**
    - Login con credenciales válidas
    - Login con credenciales inválidas

---

## 📂 Estructura de pruebas de API

src/test/java/api.demoblaze
├── tests
│   ├── SignupApiTest.java
│   └── LoginApiTest.java
├── endpoints
├── models
└── utils
└── ApiConfig.java

---

## 🧪 Casos de prueba implementados

### SignupApiTest
- ✅ Crear usuario nuevo (username dinámico)
- ✅ Validar duplicación de usuario

### LoginApiTest
- ✅ Login exitoso (validación de token)
- ✅ Login fallido (validación de mensaje de error)

---

## ▶️ Ejecución de pruebas

Ejecutar pruebas de Signup:
```bash
mvn -Dtest=SignupApiTest test

Ejecutar pruebas de Login:
mvn -Dtest=LoginApiTest test

Ejecutar todas las pruebas de API:
mvn -Dtest=*ApiTest test

Consideraciones importantes de la API

La API de Demoblaze no sigue estrictamente el estándar REST:

Retorna 200 OK incluso en errores de negocio.
Algunas respuestas no están en formato JSON.


Las validaciones se adaptaron al comportamiento real de la API,
priorizando estabilidad y exactitud funcional.
Las ejecuciones de API también se reflejan en los reportes Serenity:
target/site/serenity/index.html