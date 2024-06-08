# taskmanager
Objetivo: Crear una plataforma de gestión de tareas colaborativas que permita a los usuarios crear, asignar y gestionar tareas en equipo, con funcionalidades avanzadas como notificaciones en tiempo real, autenticación segura y soporte para múltiples dispositivos.
Funcionalidades:
1.	Gestión de Usuarios:
•	Registro y autenticación de usuarios.
•	Roles y permisos (administradores, usuarios estándar).
•	Perfil de usuario.
2.	Gestión de Tareas:
•	Creación, edición y eliminación de tareas.
•	Asignación de tareas a usuarios.
•	Establecimiento de fechas de vencimiento y prioridades.
•	Seguimiento del progreso de las tareas.
•	Etiquetado y categorización de tareas.
3.	Colaboración en Tiempo Real:
•	Notificaciones en tiempo real (por ejemplo, cuando se le asigna una tarea, cuando se completa una tarea)
•	Comentarios en tareas.
•	Historial de actividades.
4.	Autenticación y Seguridad:
•	Autenticación Basada en OAuth 2.0 y Open ID Connect.
•	Protección de rutas y recursos mediante roles y permisos.
5.	Integración con Herramientas Externas:
•	Integración con servicios de mensajería como Slack.
•	Integración con calendarios externos (Google Calendar).
6.	Monitorización y análisis:
•	Panel de control con métricas y estadísticas de tareas.
•	Análisis de productividad y rendimiento del equipo.
7.	Despliegue y Escalabilidad:
•	Contenedorización con Docker
•	Orquestación con Kubernetes.
•	Pipeline de CI/CD para despliegue automatizado





Tecnologías Usadas: 
Backend:
•	Java, Spring Boot, Spring Cloud.
•	JPA/Hibernate,
•	MongoDB para almacenamiento
•	RabbitMQ/Kafka para mensajería asíncrona.
•	Redis para cacheo.
•	Keycloak para autenticación y autorización
      Frontend:
•	Reac.js
•	React Native
      DevOps:
•	Docker y Kubernetes.
•	Jenkins, GitLab CI, GitHub Action para CI/CD.
•	Prometheus y Grafana para monitorización.
•	ELK Stack para gestión de logs
