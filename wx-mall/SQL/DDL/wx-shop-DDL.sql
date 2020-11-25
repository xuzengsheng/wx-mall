-- wx_shopmall.banner_info definition

CREATE TABLE `banner_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `bannerName` varchar(100) NOT NULL COMMENT '轮播图名称',
  `imgUrl` varchar(1000) NOT NULL COMMENT '轮播图图片地址',
  `clickUrl` varchar(1000) DEFAULT NULL COMMENT '点击链接地址',
  `seq` int(11) NOT NULL COMMENT '轮播图排序号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='轮播图';


-- wx_shopmall.brand_info definition

CREATE TABLE `brand_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(100) NOT NULL COMMENT '品牌名称',
  `imgUrl` varchar(1000) NOT NULL COMMENT '图片地址',
  `type` varchar(10) NOT NULL COMMENT '活动类型',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='品牌特卖';


-- wx_shopmall.classfy_info definition

CREATE TABLE `classfy_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parentId` int(11) NOT NULL DEFAULT '0' COMMENT '父级分类id',
  `name` varchar(100) NOT NULL COMMENT '分类名称',
  `imgUrl` varchar(1000) DEFAULT NULL COMMENT '图片地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=409 DEFAULT CHARSET=utf8 COMMENT='商品分类';


-- wx_shopmall.goods_info definition

CREATE TABLE `goods_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(100) NOT NULL COMMENT '商品名称',
  `price` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '商品实际价格',
  `privilegePrice` decimal(10,0) NOT NULL COMMENT '商品原价',
  `imgUrl` varchar(1000) NOT NULL COMMENT '商品图片地址',
  `imgUrls` text COMMENT '详细图片地址',
  `details` text NOT NULL COMMENT '查看详细图片地址',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `clickRate` bigint(20) NOT NULL DEFAULT '0' COMMENT '点击量',
  `buyRate` bigint(20) NOT NULL DEFAULT '0' COMMENT '购买量',
  `stock` int(11) NOT NULL DEFAULT '0' COMMENT '库存量',
  `isHot` int(11) NOT NULL DEFAULT '0' COMMENT '是否热销， 0 否 ；1是',
  `isNew` int(11) NOT NULL DEFAULT '0' COMMENT '是否新品  0否 1是',
  `classifyId` varchar(100) DEFAULT NULL COMMENT '所属类别id',
  `discount` decimal(10,0) DEFAULT NULL COMMENT '折扣',
  `activityId` varchar(100) DEFAULT NULL COMMENT '参与活动的id',
  `description` text COMMENT '商品描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 COMMENT='商品信息';


-- wx_shopmall.menu_info definition

CREATE TABLE `menu_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `menuName` varchar(100) NOT NULL COMMENT '菜单名称',
  `imgUrl` varchar(1000) NOT NULL COMMENT '菜单图片地址',
  `clickUrl` varchar(1000) DEFAULT NULL COMMENT '点击菜单跳转地址',
  `seq` int(11) NOT NULL COMMENT '排序号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='主页菜单';


-- wx_shopmall.navbar_info definition

CREATE TABLE `navbar_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `navbarName` varchar(100) NOT NULL COMMENT '名称',
  `seq` int(11) NOT NULL COMMENT '排序号',
  `clickUrl` varchar(1000) DEFAULT NULL COMMENT '点击链接地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='导航条';