boot:
	cp .env.example .env

install:
	mvn clean install

up:
	docker compose stop
	docker compose up

create:
	docker compose exec postgres psql -U postgres -tc "SELECT 1 FROM pg_database WHERE datname = 'postgres'" | grep -q 1 || docker compose exec postgres psql -U postgres -c "CREATE DATABASE postgres;"

dev:
	mvn spring-boot:run

run:
	mvn spring-boot:run

test:
	mvn test

reset:
	docker compose rm --stop
	docker volume rm rest-with-spring-boot-kotlin_kotlin_postgres_data
	docker compose up -d
	sleep 2
	make create