# 2.1 Task Planner API

### Codigo de honor:
Debes seguir el Código de honor del ingeniero de sistemas para defender el estándar de integridad académica de la ECI:

* Tus respuestas a tareas, cuestionarios y exámenes deben ser tu propio trabajo (excepto para las tareas que permiten explícitamente la colaboración).

* No puedes compartir tus soluciones de tareas, cuestionarios o exámenes con otra persona a menos que el instructor lo permita explícitamente. Esto incluye cualquier cosa escrita por ti, como también cualquier solución oficial proporcionada por el docente o el monitor del curso.

* No puedes participar en otras actividades que mejorarán de manera deshonesta tus resultados o que mejorarán de manera deshonesta o dañarán los resultados de otras personas.

## Prerrequisitos

### Git

```
> git --version

git version 2.21.0.windows.1
```

### Gradle

```
> gradle -v

------------------------------------------------------------
Gradle 6.6.1
------------------------------------------------------------

Build time:   2020-08-25 16:29:12 UTC
Revision:     f2d1fb54a951d8b11d25748e4711bec8d128d7e3

Kotlin:       1.3.72
Groovy:       2.5.12
Ant:          Apache Ant(TM) version 1.10.8 compiled on May 10 2020
JVM:          1.8.0_261 (Oracle Corporation 25.261-b12)
OS:           Windows 10 10.0 amd64
```

### JDK

```
> java -version

java version "1.8.0_261"
Java(TM) SE Runtime Environment (build 1.8.0_261-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.261-b12, mixed mode)
```

### Docker

Necesario para crear y ejecutar la imagenes de las aplicaciones desarrolladas:

```
> docker --version

Docker version 19.03.12, build 48a66213fe
```

## Instalación

Para descargar localmente el repositorio se utiliza el comando como sigue:
```
git clone https://github.com/Diego23p/IETI_6.git
```

Para crear el archivo jar:
``` gradle build  ```

Para ejecutar la aplicación localmente:
``` gradlew bootRun ```

## Desarrollo

### PART 1:

#### EndPoints:

##### GetAll: (get)

``` http://localhost:8080/user ```

![](/img/1.jpg)

##### GetById: (get)

``` http://localhost:8080/user/getById/<User> ```

![](/img/2.jpg)

##### Create: (post)

``` http://localhost:8080/user ```

![](/img/3.jpg)

##### Update: (put)

``` http://localhost:8080/user ```

![](/img/4.jpg)

##### Remove: (delete)

``` http://localhost:8080/user/removeById/<id> ```

![](/img/5.jpg)

### PART 2

Construir la imagen Docker:

``` docker build -t diego23p/ieti-backend . ```

Ejecutar el contenedor en Docker:

``` docker run -d -p 8080:8080 --name task_backend diego23p/ieti-backend ```

![](/img/6.jpg)

Subir la imagen a Docker Hub:

``` docker push diego23p/ieti-backend ```

Container en Heroku:

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://serene-castle-82142.herokuapp.com/user)

![](/img/7.jpg)

### PART 3

Código para obtener datos Heroku:

```
componentDidMount() {
    fetch('https://serene-castle-82142.herokuapp.com/user')
        .then(response => response.json())
        .then(data => {
            let usersList = [];
            data.map((user) => {
                usersList.push({
                    email:user.email,
                    fullName:user.fullName,
                    password: user.password
                })
             });
            this.setState({userList: usersList});
        });
}
```

Clase UserList:

https://github.com/Diego23p/IETI_6/blob/master/FrontEnd/src/components/User/UserList.js

Datos obtenidos del backend:

![](/img/8.jpg)

# Autores

- [Diego Alejandro Puerto Gómez](https://github.com/Diego23p)
