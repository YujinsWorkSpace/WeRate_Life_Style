SELECT posts.* 
FROM posts 
JOIN users ON posts.user_id = users.id 
WHERE users.username = 'specific_username';

