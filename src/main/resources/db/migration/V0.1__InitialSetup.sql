CREATE TABLE users (
                       id BINARY(16) NOT NULL,
                       user_name VARCHAR(255) NOT NULL,
                       first_name VARCHAR(255) NOT NULL,
                       last_name VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       date_of_birth DATE NOT NULL,
                       time_of_registration DATETIME(6) NOT NULL,
                       last_time_updated DATETIME(6) NOT NULL,

                       CONSTRAINT pk_user PRIMARY KEY (id)
);

CREATE TABLE users_roles (
    user_id BINARY(16) NOT NULL,
    role VARCHAR(255) NOT NULL,

    CONSTRAINT fk_user_role FOREIGN KEY (user_id) REFERENCES herzeln.users (id)
);



