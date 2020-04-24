
INSERT INTO users(user_id, name, avatar_path, iine) VALUES(1, 'Firmino', 'firmino.jpg', 100);
INSERT INTO users(user_id, name, avatar_path, iine) VALUES(2, 'Mane', 'mane.jpg', 70);
INSERT INTO users(user_id, name, avatar_path, iine) VALUES(3, 'Allison', 'allison.jpg', 90);

INSERT INTO posts(post_id, from_user_id, to_user_id, message) VALUES(1, 2, 3, '最初の投稿');
INSERT INTO posts(post_id, from_user_id, to_user_id, message) VALUES(2, 3, 1, '2つ目');

INSERT INTO countList(post_id, iine1, iine2, iine3) VALUES(1, 0, 0, 0);
INSERT INTO countList(post_id, iine1, iine2, iine3) VALUES(2, 0, 0, 0);
