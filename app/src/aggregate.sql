SELECT users.username, COUNT(comments.id) as comment_count 
FROM users 
LEFT JOIN comments ON users.id = comments.user_id 
GROUP BY users.id;

