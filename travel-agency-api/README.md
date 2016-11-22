# travel_agency_api
## 1. Clonar el proyecto
```
git clone https://github.com/cube5/travel-agency.git travel-agency
cd travel-agency
```

## 2. Crear la BD
```sql
-- crear la base de datos
CREATE DATABASE IF NOT EXISTS travel_agency;

-- crea el usuario para ingresar
CREATE USER IF NOT EXISTS 'travel_agency'@'localhost' IDENTIFIED BY 'password';

-- todos los privilegios SOLO para esta base
GRANT ALL PRIVILEGES ON travel_agency.* TO 'travel_agency'@'localhost';
```
## 3. Iniciar el proyecto con maven
```
cd travel-agency-api
mvn spring-boot:run
```

## 4. Poblar las tablas y correr de nuevo el server
Para esto hay que cambiar la variable `initialize` a `true` en `src/main/resources/application.yml`
```
...
initialize: true
...
```
```
mvn spring-boot:run
```

## 5. Ir al cliente web que consume la api
```
cd ../travel-agency-client
npm install
npm start
```
Y asi entrar a http://localhost:3000
