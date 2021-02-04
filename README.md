# com.nero.spring.jdbctemplate
Spring JdbcTemplate 使用demo

# 数据库表
```sql
CREATE TABLE `user` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL DEFAULT '' COLLATE 'utf8_general_ci',
	`age` INT(11) NOT NULL DEFAULT '0',
	PRIMARY KEY (`id`) USING BTREE,
	FULLTEXT INDEX `name` (`name`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=60
;
```

