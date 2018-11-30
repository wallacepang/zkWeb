CREATE TABLE `t_zkconfig` (
  `zk_id` varchar(200) NOT NULL,
  `zk_description` varchar(100) DEFAULT NULL,
  `zk_connect_str` varchar(100) DEFAULT NULL,
  `zk_session_time_out` varchar(100) DEFAULT NULL,
  `zk_user_name` varchar(100) DEFAULT NULL,
  `zk_user_pwd` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`zk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



