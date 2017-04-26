CREATE DATABASE IF NOT EXISTS SUPER_SHOP DEFAULT CHARSET UTF8 COLLATE UTF8_GENERAL_CI ;

USE SUPER_SHOP ;

DROP TABLE IF EXISTS `TB_USER`;

CREATE TABLE TB_USER (
  USER_ID BIGINT UNSIGNED AUTO_INCREMENT COMMENT '用户ID',
  USER_NAME VARCHAR (50) NOT NULL UNIQUE COMMENT '登陆用户名',
  PASS_WORD VARCHAR (50) NOT NULL COMMENT '登陆密码',
  REAL_NAME VARCHAR (20) NOT NULL COMMENT '真实姓名',
  EMAIL VARCHAR (100) NOT NULL UNIQUE COMMENT '电子邮件',
  CELL_PHONE VARCHAR (20) NOT NULL UNIQUE COMMENT '手机号码',
  ADDRESS VARCHAR (100) NOT NULL COMMENT '邮寄地址',
  USER_TYPE TINYINT UNSIGNED NOT NULL COMMENT '用户类型 1:系统用户 0:注册会员用户',
  STATE TINYINT UNSIGNED NOT NULL DEFAULT '1' COMMENT '状态 1:可用状态  0:删除状态',
  CREATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '创建人ID',
  CREATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
  UPDATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '修改人ID',
  UPDATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '修改时间',
  PRIMARY KEY (USER_ID),
  KEY IDX_USER_STATE (STATE),
  KEY IDX_USER_TYPE (USER_TYPE)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 AUTO_INCREMENT = 1000 COMMENT='系统登录用户表';

DROP TABLE IF EXISTS `TB_PRO_TYPE` ;

CREATE TABLE TB_PRO_TYPE (
  TYPE_ID BIGINT UNSIGNED AUTO_INCREMENT COMMENT '商品类型ID',
  TYPE_NAME VARCHAR (50) NOT NULL COMMENT '商品类型名称',
  TYPE_P_ID BIGINT UNSIGNED NOT NULL COMMENT '商品类型父ID',
  MENU_URI VARCHAR (100) COMMENT '菜单URL',
  MENU_STYLE TINYINT UNSIGNED COMMENT '菜单样式 1: 平铺,2: 层级菜单, 3: 图片 ,4: 仅链接',
  IS_MENU TINYINT UNSIGNED NOT NULL COMMENT ' 1:是菜单  0:不是菜单',
  STATE TINYINT UNSIGNED NOT NULL DEFAULT '1' COMMENT '状态 1:可用状态  0:删除状态',
  CREATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '创建人ID',
  CREATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
  UPDATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '修改人ID',
  UPDATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '修改时间',
  PRIMARY KEY (TYPE_ID),
  KEY IDX_TYPE_NAME (TYPE_NAME),
  KEY IDX_TYPE_P_ID (TYPE_P_ID),
  KEY IDX_TYPE_STATE (STATE)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 AUTO_INCREMENT = 1000 COMMENT = '商品类型表';

DROP TABLE IF EXISTS `TB_PRODUCT`;

CREATE TABLE TB_PRODUCT (
  PRO_ID BIGINT UNSIGNED AUTO_INCREMENT COMMENT '商品ID',
  PRO_NAME VARCHAR (100) NOT NULL UNIQUE COMMENT '商品名称',
  PRO_REAL_PRICE DOUBLE (9, 2) UNSIGNED NOT NULL COMMENT '商品原价',
  PRO_NOW_PRICE DOUBLE (9, 2) UNSIGNED NOT NULL COMMENT '商品现价',
  IS_STOCK TINYINT UNSIGNED NOT NULL COMMENT '是否有库存 1：有库存 0：无库存',
  PRO_DESC VARCHAR (200) NOT NULL COMMENT '商品简述',
  PRO_SIZE VARCHAR (50) NOT NULL COMMENT '商品大小',
  PRO_COLOR VARCHAR (50) NOT NULL COMMENT '商品颜色',
  PRO_SCORE DOUBLE (2, 1) UNSIGNED NOT NULL COMMENT '评价分数',
  PRO_TYPE_ID BIGINT UNSIGNED NOT NULL COMMENT '商品类型ID',
  PRO_PIC_ID BIGINT UNSIGNED NOT NULL COMMENT '商品默认图片ID',
  PRO_PIC_URI VARCHAR (100) NOT NULL COMMENT '商品默认图片URL',
  STATE TINYINT UNSIGNED NOT NULL DEFAULT '1' COMMENT '状态 1:可用状态  0:删除状态',
  CREATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '创建人ID',
  CREATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
  UPDATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '修改人ID',
  UPDATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '修改时间',
  PRIMARY KEY (PRO_ID),
  KEY IDX_PRO_NAME (PRO_NAME),
  KEY IDX_PRO_STATE (STATE)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 AUTO_INCREMENT = 1000 COMMENT = '商品表' ;

DROP TABLE IF EXISTS `TB_PRO_DETAIL` ;

CREATE TABLE TB_PRO_DETAIL (
  DET_ID BIGINT UNSIGNED AUTO_INCREMENT COMMENT '商品明细ID',
  PRO_ID BIGINT UNSIGNED NOT NULL COMMENT '商品ID',
  DET_LENGTH VARCHAR (10) NOT NULL COMMENT '长度',
  DET_HEIGHT VARCHAR (10) NOT NULL COMMENT '宽度',
  DET_WIDTH VARCHAR (10) NOT NULL COMMENT '高度',
  DET_MATE VARCHAR (20) NOT NULL COMMENT '质地',
  DET_ADDR VARCHAR (20) NOT NULL COMMENT '产地',
  DET_DATE DATETIME NOT NULL COMMENT '生产日期',
  DET_DESC VARCHAR (500) NOT NULL COMMENT '详细介绍',
  STATE TINYINT UNSIGNED NOT NULL DEFAULT '1' COMMENT '状态 1:可用状态  0:删除状态',
  CREATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '创建人ID',
  CREATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
  UPDATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '修改人ID',
  UPDATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '修改时间',
  PRIMARY KEY (DET_ID),
  KEY IDX_DET_PRO_ID (PRO_ID),
  KEY IDX_DET_STATE (STATE)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 AUTO_INCREMENT = 1 COMMENT = '商品明细表' ;

DROP TABLE IF EXISTS `TB_PRO_PIC` ;

CREATE TABLE TB_PRO_PIC (
  PIC_ID BIGINT UNSIGNED AUTO_INCREMENT COMMENT '图片ID',
  PRO_ID BIGINT UNSIGNED NOT NULL COMMENT '商品ID',
  PIC_URI VARCHAR (100) NOT NULL COMMENT '图片URL',
  IS_ORDER TINYINT NOT NULL COMMENT '图片排序',
  STATE TINYINT UNSIGNED NOT NULL DEFAULT '1' COMMENT '状态 1:可用状态  0:删除状态',
  CREATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '创建人ID',
  CREATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
  UPDATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '修改人ID',
  UPDATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '修改时间',
  PRIMARY KEY (PIC_ID),
  KEY IDX_PIC_PRO_ID (PRO_ID),
  KEY IDX_PIC_STATE (STATE)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 AUTO_INCREMENT = 1000 COMMENT = '商品图片表' ;

DROP TABLE IF EXISTS `TB_PRO_CAR` ;

CREATE TABLE TB_PRO_CAR (
  CAR_ID BIGINT UNSIGNED AUTO_INCREMENT COMMENT '购物车ID',
  USER_ID BIGINT UNSIGNED NOT NULL COMMENT '用户ID',
  PRO_ID BIGINT UNSIGNED NOT NULL COMMENT '产品ID',
  PRO_SIZE VARCHAR (10) NOT NULL COMMENT '产品大小',
  PRO_COLOR VARCHAR (20) NOT NULL COMMENT '产品颜色',
  PRO_NUM BIGINT UNSIGNED NOT NULL COMMENT '产品数量',
  PRO_PRICE DOUBLE (9, 2) UNSIGNED NOT NULL COMMENT '产品单价',
  TAL_PRICE DOUBLE (9, 2) UNSIGNED NOT NULL COMMENT '产品总价',
  STATE TINYINT UNSIGNED NOT NULL DEFAULT '1' COMMENT '状态 1:可用状态  0:删除状态',
  CREATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '创建人ID',
  CREATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
  UPDATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '修改人ID',
  UPDATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '修改时间',
  PRIMARY KEY (CAR_ID),
  KEY IDX_CAR_USER_ID (USER_ID),
  KEY IDX_CAR_PRO_ID (PRO_ID),
  KEY IDX_CAR_STATE (STATE)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 AUTO_INCREMENT = 1000 COMMENT = '购物车表' ;

DROP TABLE IF EXISTS `TB_PRO_COMMENT` ;

CREATE TABLE TB_PRO_COMMENT (
  COM_ID BIGINT UNSIGNED AUTO_INCREMENT COMMENT '商品评论ID',
  PRO_ID BIGINT UNSIGNED NOT NULL COMMENT '商品ID',
  USER_ID BIGINT UNSIGNED NOT NULL COMMENT '用户ID',
  COM_TITLE VARCHAR (50) NOT NULL COMMENT '评论标题',
  COM_DESC VARCHAR (500) NOT NULL COMMENT '评论内容',
  PRO_SCORE DOUBLE UNSIGNED NOT NULL COMMENT '评价分数',
  STATE TINYINT UNSIGNED NOT NULL DEFAULT '1' COMMENT '状态 1:可用状态  0:删除状态',
  CREATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '创建人ID',
  CREATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
  UPDATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '修改人ID',
  UPDATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '修改时间',
  PRIMARY KEY (COM_ID),
  KEY IDX_COM_USER_ID (USER_ID),
  KEY IDX_COM_PRO_ID (PRO_ID),
  KEY IDX_COM_STATE (STATE)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 AUTO_INCREMENT = 1000 COMMENT = '商品评论表' ;

DROP TABLE IF EXISTS `TB_ORDER` ;

CREATE TABLE TB_ORDER (
  ORDER_ID VARCHAR (20) COMMENT '订单ID',
  USER_ID BIGINT UNSIGNED NOT NULL COMMENT '用户ID',
  ORDER_PRICE DOUBLE (9, 2) UNSIGNED NOT NULL COMMENT '订单价格',
  ORDER_NAME VARCHAR (20) NOT NULL COMMENT '订单收货人',
  ORDER_ADDR VARCHAR (100) NOT NULL COMMENT '收货地址',
  ORDER_PHONE VARCHAR (20) NOT NULL COMMENT '收货人电话',
  ORDER_TEL VARCHAR (20) COMMENT '收货人联系电话',
  ORDER_DESC VARCHAR (100) COMMENT '订单备注',
  STATE TINYINT UNSIGNED NOT NULL DEFAULT '1' COMMENT '状态 1:可用状态  0:删除状态',
  CREATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '创建人ID',
  CREATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
  UPDATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '修改人ID',
  UPDATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '修改时间',
  PRIMARY KEY (ORDER_ID),
  KEY IDX_ORDER_USER_ID (USER_ID),
  KEY IDX_ORDER_STATE (STATE)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 AUTO_INCREMENT = 1000 COMMENT = '订单表' ;

DROP TABLE IF EXISTS `TB_ORDER_DETAIL` ;

CREATE TABLE TB_ORDER_DETAIL (
  ODET_ID BIGINT UNSIGNED AUTO_INCREMENT COMMENT '订单明细ID',
  ORDER_ID VARCHAR (20) NOT NULL COMMENT '订单ID',
  PRO_ID BIGINT UNSIGNED NOT NULL COMMENT '订单ID',
  PRO_NAME VARCHAR (50) NOT NULL COMMENT '商品名称',
  PRO_DESC VARCHAR (200) NOT NULL COMMENT '商品描述',
  PRO_SIZE VARCHAR (10) NOT NULL COMMENT '商品大小',
  PRO_COLOR VARCHAR (20) NOT NULL COMMENT '商品颜色',
  PRO_NUM TINYINT UNSIGNED NOT NULL COMMENT '商品数量',
  PRO_PRICE DOUBLE (9, 2) UNSIGNED NOT NULL COMMENT '商品单价',
  TAL_PRICE DOUBLE (9, 2) UNSIGNED NOT NULL COMMENT '订单总计',
  STATE TINYINT UNSIGNED NOT NULL DEFAULT '1' COMMENT '状态 1:可用状态  0:删除状态',
  CREATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '创建人ID',
  CREATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
  UPDATE_BY BIGINT UNSIGNED NOT NULL DEFAULT '1000' COMMENT '修改人ID',
  UPDATE_DATE DATETIME NOT NULL DEFAULT NOW() COMMENT '修改时间',
  PRIMARY KEY (ODET_ID),
  KEY IDX_ODET_USER_ID (ORDER_ID),
  KEY IDX_ODET_PRO_ID (PRO_ID),
  KEY IDX_ODET_STATE (STATE)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 AUTO_INCREMENT = 1000 COMMENT = '订单表' ;

DROP TABLE IF EXISTS `ORDER_SEQ` ;

CREATE TABLE ORDER_SEQ (
  TIMESTR VARCHAR (20) NOT NULL,
  ORDER_SN INT NOT NULL
) ENGINE = INNODB DEFAULT CHARSET = UTF8 COMMENT = '生成订单编号' ;

DROP TABLE IF EXISTS `TB_NOTIFY_LOG` ;

CREATE TABLE TB_NOTIFY_LOG (
  SN BIGINT AUTO_INCREMENT COMMENT '日志ID',
  CMD_TYPE VARCHAR (100) NOT NULL COMMENT '操作类型',
  TABLE_NAME VARCHAR (100) NOT NULL COMMENT '表名',
  PK_VALUES VARCHAR (100) NOT NULL COMMENT '主键值',
  WHERE_CONDITION VARCHAR (100) NOT NULL COMMENT '条件',
  PRIMARY KEY(SN)
) ENGINE = INNODB DEFAULT CHARSET = UTF8 AUTO_INCREMENT = 1000 ;