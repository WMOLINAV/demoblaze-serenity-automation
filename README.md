# Demoblaze Automation – Serenity BDD

Este repositorio contiene un proyecto de automatización de pruebas que integra
"pruebas Web" y "pruebas de API" utilizando "Serenity BDD" como framework base.

El objetivo principal es demostrar una estrategia de automatización completa,
separando correctamente la validación de interfaz gráfica y la validación directa
de servicios REST.

---

## 📂 Estructura general del proyecto

demoblaze-serenity-automation/
├── src/test/java
│   ├── ui.demoblaze        # Automatización Web (Serenity + Screenplay)
│   ├── api.demoblaze       # Automatización API (Serenity + RestAssured)
│
├── README_WEB.md           # Documentación específica de pruebas Web
├── README_API.md           # Documentación específica de pruebas API
├── conclusiones_web.txt    # Conclusiones de automatización Web
├── conclusiones_api.txt    # Conclusiones del ejercicio de API
├── pom.xml
└── .gitignore
---

## 📘 Documentación específica

- 📄 **Pruebas Web**: ver `README_WEB.md`
- 📄 **Pruebas API**: ver `README_API.md`

Cada documento detalla el alcance, ejecución y consideraciones de su respectivo tipo de prueba.

---

## 🚀 Tecnologías principales

- Java 17
- Maven
- Serenity BDD
- Cucumber (solo Web)
- RestAssured (API)
- JUnit
- Selenium WebDriver

---

## 📊 Reportes

Luego de la ejecución de las pruebas, los reportes Serenity se encuentran en:c
target/site/serenity/index.html


## ✅ SonarCloud CI

Este cambio se realiza para disparar manualmente una nueva
ejecución del pipeline de SonarCloud desde GitHub Actions.

