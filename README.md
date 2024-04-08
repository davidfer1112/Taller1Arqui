 
# Taller 1: Arquitectura de Software con Jakarta EE

## Descripción General

Este repositorio contiene los archivos del Taller 1 de la asignatura de Arquitectura de Software. El proyecto está estructurado utilizando Jakarta EE (anteriormente Java EE), aprovechando su robusta plataforma para construir aplicaciones empresariales en Java.

## Estructura del Proyecto

![Diagrama de Arquitectura de Software](https://github.com/davidfer1112/Taller1Arqui/assets/90224781/dd213fa7-956f-4fba-b628-ec952ba67c19)

El proyecto está dividido en varios paquetes y archivos, cada uno con un propósito único en la arquitectura de la aplicación:

- **Páginas Web**: Archivos JSP que forman la interfaz de usuario de la aplicación.
  - `index.jsp`: Página principal de la aplicación.
  - `mostrarUsuarios.jsp`: Página para mostrar los detalles de los usuarios.
  - `editarUsuarios.jsp`: Página para editar los detalles de los usuarios.

- **Servicios Web RESTful**: Estas clases definen los puntos finales RESTful para la aplicación.
  - `JakartaRestConfiguration.java`: Configura los servicios RESTful.
  - `JakartaEE8Resource.java`: Una clase de recurso de ejemplo.

- **Lógica (Paquete)**: Contiene la lógica de negocio.
  - `Controller.java`: El controlador principal que coordina diversas acciones.
  - `Usuario.java`: Representa la entidad de usuario dentro de la aplicación.

- **Persistencia (Paquete)**: Maneja la persistencia de datos.
  - `ControllerPersistencia.java`: Gestiona la lógica de persistencia.
  - `UsuarioJpaController.java`: Controlador específico para la persistencia de la entidad usuario.

- **Servlets (Paquete)**: Servlets de Java que actúan como controladores.
  - `SvEditar.java`: Maneja las solicitudes de edición de detalles de usuarios.
  - `SvEliminar.java`: Maneja las solicitudes de eliminación de detalles de usuarios.
  - `SvUsuario.java`: Gestiona operaciones relacionadas con el usuario.

- **Excepciones de Persistencia**: Excepciones personalizadas para operaciones de persistencia.

- **META-INF**:
  - `persistence.xml`: Archivo XML que define la unidad de persistencia.

## Servidor y Base de Datos

La aplicación se ejecuta en Apache Tomcat, que actúa como el contenedor de servlets. Está conectado a una base de datos MySQL, donde se almacenan todos los datos persistentes.

</br>

# EN

---

# Workshop 1: Jakarta EE Software Architecture 

## Overview

This repository contains the files for Workshop 1 of the Software Architecture course. The project is structured using Jakarta EE (formerly Java EE), leveraging its robust platform for building enterprise applications in Java.

## Project Structure

![Software Architecture Diagram](https://github.com/davidfer1112/Taller1Arqui/assets/90224781/dd213fa7-956f-4fba-b628-ec952ba67c19)

The project is divided into several packages and files, each serving a unique purpose in the application's architecture:

- **Web Pages**: These are JSP files that form the user interface of the application.
  - `index.jsp`: The main landing page of the application.
  - `mostrarUsuarios.jsp`: A page to display user details.
  - `editarUsuarios.jsp`: A page to edit user details.

- **RESTful Web Services**: These classes define the RESTful endpoints for the application.
  - `JakartaRestConfiguration.java`: Configures the RESTful services.
  - `JakartaEE8Resource.java`: A sample resource class.

- **Logic (Package)**: Contains business logic.
  - `Controller.java`: The main controller coordinating various actions.
  - `Usuario.java`: Represents the user entity within the application.

- **Persistence (Package)**: Handles data persistence.
  - `ControllerPersistencia.java`: Manages persistence logic.
  - `UsuarioJpaController.java`: Specific controller for user entity persistence.

- **Servlets (Package)**: Java servlets that act as controllers.
  - `SvEditar.java`: Handles edit requests for user details.
  - `SvEliminar.java`: Handles delete requests for user details.
  - `SvUsuario.java`: Manages user-related operations.

- **Persistence Exceptions**: Custom exceptions for persistence operations.

- **META-INF**:
  - `persistence.xml`: XML file that defines the persistence unit.

## Server and Database

The application

