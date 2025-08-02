SELECT i.unique_id,s.name
FROM employees s
LEFT JOIN employeeuni i
ON s.id=i.id;