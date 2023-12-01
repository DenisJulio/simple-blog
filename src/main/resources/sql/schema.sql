CREATE TABLE IF NOT EXISTS author (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS blog_post (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    content TEXT,
    author_id BIGINT,
    FOREIGN KEY (author_id) REFERENCES author(id)
);