CREATE TABLE users (
  id INTEGER PRIMARY KEY,
  first_name VARCHAR(500) NOT NULL,
  last_name VARCHAR(500) NOT NULL
);

GRANT SELECT, INSERT ON users TO ${dbAppUser};