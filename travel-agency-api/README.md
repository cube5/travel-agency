# travel_agency_api

## 1. Crear la BD
```sql
-- crear la base de datos
CREATE DATABASE IF NOT EXISTS travel_agency;

-- crea el usuario para ingresar
CREATE USER IF NOT EXISTS 'travel_agency'@'%' IDENTIFIED BY '';

-- todos los privilegios SOLO para esta base
GRANT ALL PRIVILEGES ON travel_agency.* TO 'travel_agency'@'%';
```