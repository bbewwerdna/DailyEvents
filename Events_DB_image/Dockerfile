FROM postgres
ENV POSTGRES_ROOT_PASSWORD Rosce@ux8
ENV POSTGRES_DATABASE employeedb
ENV POSTGRES_USER awebb2
ENV POSTGRES_PASSWORD 1234


# USE IF YOU WOULD LIKE TO INSERT DATA INTO DOCKER IMAGE
# ADD data.sql /docker-entrypoint-initdb.d
ADD ./sql-scripts/ /docker-entrypoint-initdb.d/

COPY my.cnf /usr/my.cnf
EXPOSE 5432
