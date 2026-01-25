CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) UNIQUE NOT NULL,
    author VARCHAR(100) NOT NULL,
    price NUMERIC(10,2) CHECK (price >= 0),
    pages INT CHECK (pages > 0),
    published_year INT CHECK (published_year > 0)
);

