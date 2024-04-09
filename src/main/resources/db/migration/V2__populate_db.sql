INSERT into client (NAME)
VALUES
('Solomiya'),
('Olexandr'),
('Emiliya'),
('Olena'),
('Anna'),
('Ivan'),
('Oleh'),
('Artur'),
('Eugen'),
('Viktoriya');

INSERT into planet (ID, NAME)
VALUES
    ('LEO3', 'Leonardo'),
    ('RONNIE7', 'Ronald'),
    ('BERNIE66', 'Bernard'),
    ('WOODIE999', 'Woodworth'),
    ('SORRY1', 'Sorrento');

INSERT into ticket(CREATED_AT, CLIENT_ID, FROM_PLANET_ID, TO_PLANET_ID)
VALUES
    (CURRENT_TIME, 1, 'SORRY1', 'LEO3'),
    (CURRENT_TIME, 2, 'RONNIE7', 'BERNIE66'),
    (CURRENT_TIME, 3, 'BERNIE66', 'LEO3'),
    (CURRENT_TIME, 4, 'SORRY1', 'WOODIE999'),
    (CURRENT_TIME, 5, 'LEO3', 'WOODIE999'),
    (CURRENT_TIME, 6, 'WOODIE999', 'LEO3'),
    (CURRENT_TIME, 7, 'RONNIE7', 'SORRY1'),
    (CURRENT_TIME, 8, 'SORRY1', 'BERNIE66'),
    (CURRENT_TIME, 9, 'RONNIE7', 'SORRY1'),
    (CURRENT_TIME, 10, 'LEO3', 'RONNIE7');