boot:
	cp .env.example .env

install:
	mvn clean install

up:
	docker compose stop
	docker compose up

stop:
	docker compose stop

create:
	docker compose exec postgres psql -U postgres -tc "SELECT 1 FROM pg_database WHERE datname = 'postgres'" | grep -q 1 || docker compose exec postgres psql -U postgres -c "CREATE DATABASE postgres;"

dev:
	mvn spring-boot:run

run:
	mvn spring-boot:run -DskipTests

test:
	mvn test

migrate:
	mvn flyway:migrate

reset:
	docker compose rm --stop --volumes
	docker compose up -d
	sleep 1
	make create