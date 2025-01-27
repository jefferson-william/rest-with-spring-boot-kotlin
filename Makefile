boot:
	cp .env.example .env

install:
	mvn clean install

up:
	docker compose stop
	docker compose up

create:
	docker compose exec postgres psql -U postgres -tc "SELECT 1 FROM pg_database WHERE datname = 'kotlin'" | grep -q 1 || docker compose exec postgres psql -U postgres -c "CREATE DATABASE kotlin;"

dev:
	mvn spring-boot:run

run:
	mvn spring-boot:run
