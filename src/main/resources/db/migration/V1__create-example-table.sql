CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS examples
(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name varchar NOT NULL,
    description varchar NOT NULL
);