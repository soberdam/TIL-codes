## 기술 요구사항
방명록 테이블 작성을 위한 스크립트는 다음과 같습니다.


CREATE TABLE `guestbook` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'guestbook id',
   `name` VARCHAR(255) NOT NULL COMMENT 'user name',
  `content` TEXT NOT NULL COMMENT 'guestbook content',
  `regdate` DATETIME NULL DEFAULT NULL COMMENT '등록일',
  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;


완성된 JSP 파일(guestbook.jsp)은 미리 제공되며, 미완성된 Servlet, Dao 클래스가 제공됩니다. 미완성된 Servlet, Dao 클래스를 완성하여 기획서의 내용과 같게 동작하도록 하십시요.

## 개발 순서
1. MySQL데이터베이스에 방명록 테이블을 생성합니다.
2. 제공된 프로젝트를 이클립스에서 maven import합니다.
3. 프로젝트에 포함된 Servlet, Dao 클래스를 수정하여 기획서에서 요구한대로 동작되도록 하세요.
