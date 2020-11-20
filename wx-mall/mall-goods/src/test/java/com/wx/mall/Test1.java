package com.wx.mall;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wx.mall.entity.GoodsInfo;
import com.wx.mall.service.GoodsInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.log.LogInputStream;

import java.util.List;

/**
 * @program: wx-mall
 * @author: xuzengsheng
 * @create: 2020-11-19 11:25
 * @description:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
    @Autowired
    GoodsInfoService goodsInfoService;

    @Test
    public void test() throws JsonProcessingException {

        String jsonStr = "[{\n" +
                "\t\t\t\t\"name\": \"雅诗兰黛 Estee Lauder 专研紧塑精华素  50ml  (线雕 精华，  紧致上扬）\",\n" +
                "\t\t\t\t\"price\": 979,\n" +
                "\t\t\t\t\"privilegePrice\": 1089,\n" +
                "\t\t\t\t\"imgUrl\": \"https://m.360buyimg.com/mobilecms/s750x750_jfs/t18601/67/2327946788/116068/a8bd4a43/5aefe87aN2bab70b6.jpg!q80.dpg\",\n" +
                "\t\t\t\t\"details\": \"https://img30.360buyimg.com/sku/jfs/t16804/7/2353293106/105081/7e822f50/5aefe704Nd1fe86c2.jpg; https://img30.360buyimg.com/sku/jfs/t17932/302/2306136735/63684/efdd9c37/5aefe704N669f5693.jpg;uhttps://img30.360buyimg.com/sku/jfs/t16801/40/2334287936/129167/bd0f9306/5aefe70bN403644d6.jpg;https://img30.360buyimg.com/sku/jfs/t20077/34/311258456/108994/1f97a01a/5aefe709N555641d4.jpg;https://img30.360buyimg.com/sku/jfs/t18448/146/2268502375/81804/f27bc1d2/5aefe702N57ea8da0.jpg;https://img30.360buyimg.com/sku/jfs/t18046/195/2364128791/137799/1049ea44/5aefe70fN6f52ca27.jpg;https://img30.360buyimg.com/sku/jfs/t18277/88/2271445578/84492/dd0a2c9/5aefe70cN590137e7.jpg;https://img30.360buyimg.com/sku/jfs/t17503/341/2345340921/54264/b3169d17/5aefe70eNdc4144bb.jpg;https://img30.360buyimg.com/sku/jfs/t17593/10/2295824543/58328/db493003/5aefe70eN5b0ddea4.jpg\",\n" +
                "\t\t\t\t\"remark\": null,\n" +
                "\t\t\t\t\"createDate\": null,\n" +
                "\t\t\t\t\"updateDate\": null,\n" +
                "\t\t\t\t\"clickRate\": 2234,\n" +
                "\t\t\t\t\"buyRate\": 0,\n" +
                "\t\t\t\t\"stock\": 0,\n" +
                "\t\t\t\t\"isHot\": \"0\",\n" +
                "\t\t\t\t\"isNew\": \"1\",\n" +
                "\t\t\t\t\"classifyId\": null,\n" +
                "\t\t\t\t\"discount\": \"9.0\",\n" +
                "\t\t\t\t\"activityId\": 3,\n" +
                "\t\t\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\t\t\"desc\": null\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"name\": \"雅诗兰黛（ESTEELAUDER）红石榴鲜养焕亮女士护肤化妆品套装 正装水+洁面+日霜+眼霜+精华+粉底\",\n" +
                "\t\t\t\t\"price\": 880,\n" +
                "\t\t\t\t\"privilegePrice\": 934,\n" +
                "\t\t\t\t\"imgUrl\": \"https://img10.360buyimg.com/n7/s370x370_jfs/t20437/289/1725616899/353585/614763/5b31a0ceN7f4f913f.jpg!q70.jpg\",\n" +
                "\t\t\t\t\"details\": \"https://img30.360buyimg.com/popWaterMark/jfs/t19417/150/2646023481/229973/898a4533/5aff9a6aN3b763fe8.jpg.dpg;https://img30.360buyimg.com/popWaterMark/jfs/t18664/83/2630069693/142080/60f3f444/5aff9a6aN99cf1e67.jpg.dpg;https://img30.360buyimg.com/popWaterMark/jfs/t16975/286/2570793976/98319/655adbef/5aff9a6aNcf59ba1c.jpg.dpg;https://img30.360buyimg.com/popWaterMark/jfs/t22348/195/159928765/208036/b6ce9180/5aff9a6aN1029e5fd.jpg.dpg;https://img30.360buyimg.com/popWaterMark/jfs/t19261/146/2521216762/64088/4eeaa231/5aff9a6aN52c1e98f.jpg.dpg;https://img30.360buyimg.com/popWaterMark/jfs/t16783/2/2609245928/89780/dda11e3e/5aff9a6aNba3c72e7.jpg.dpg;http://img30.360buyimg.com/popWaterMark/jfs/t17926/38/2606507283/65229/aae7adf0/5aff9a6bN1972e5cc.jpg.dpg;https://img30.360buyimg.com/popWaterMark/jfs/t18430/180/2528308859/201934/9f651bab/5aff9a6bNd7eedae2.jpg.dpg;https://img30.360buyimg.com/popWaterMark/jfs/t18976/356/2614161303/55352/5e3d96d4/5aff9a75Nde4cc645.jpg.dpg\",\n" +
                "\t\t\t\t\"remark\": null,\n" +
                "\t\t\t\t\"createDate\": null,\n" +
                "\t\t\t\t\"updateDate\": null,\n" +
                "\t\t\t\t\"clickRate\": 1921,\n" +
                "\t\t\t\t\"buyRate\": 0,\n" +
                "\t\t\t\t\"stock\": 0,\n" +
                "\t\t\t\t\"isHot\": \"0\",\n" +
                "\t\t\t\t\"isNew\": \"1\",\n" +
                "\t\t\t\t\"classifyId\": null,\n" +
                "\t\t\t\t\"discount\": \"9.4\",\n" +
                "\t\t\t\t\"activityId\": 3,\n" +
                "\t\t\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\t\t\"desc\": null\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"name\": \"雅诗兰黛（Estee Lauder）鲜活亮采果萃水（滋润型）200ml（爽肤水 红石榴 补水保湿 干性肌肤）\",\n" +
                "\t\t\t\t\"price\": 399,\n" +
                "\t\t\t\t\"privilegePrice\": 466,\n" +
                "\t\t\t\t\"imgUrl\": \"https://img11.360buyimg.com/n7/s370x370_jfs/t17110/221/817454081/71160/c0a639d0/5aab69deNe0c975f7.jpg!q70.jpg\",\n" +
                "\t\t\t\t\"details\": \"https://img30.360buyimg.com/sku/jfs/t5926/135/9587596423/110905/f7bd526e/59940f2bNdfb56a4b.jpg;https://img30.360buyimg.com/sku/jfs/t7930/292/502689290/84445/4df3f823/59940f2bNe92dc647.jpg;https://img30.360buyimg.com/sku/jfs/t7753/364/513099891/145114/e412386d/59940f2bN6be55ce9.jpg;https://img30.360buyimg.com/sku/jfs/t5953/220/9689612416/52624/f81cf54/59940f2bNf9491510.jpg;https://img30.360buyimg.com/sku/jfs/t7786/358/515598076/95240/dcda6822/59940f2bN30d4e0d1.jpg;https://img30.360buyimg.com/sku/jfs/t7405/328/510674265/52259/b978864d/59940f2bN49ff4132.jpg;https://img30.360buyimg.com/sku/jfs/t7534/344/509271536/80864/295da304/59940f2bNd145d192.jpg;https://img30.360buyimg.com/sku/jfs/t7687/332/514833675/77271/3a8bb2b7/59940f2bNd0a645a0.jpg;https://img30.360buyimg.com/sku/jfs/t7669/8/557968565/50155/b271d718/59940f2bNda023d51.jpg;https://img30.360buyimg.com/sku/jfs/t7375/332/516598563/66730/57e872a0/59940f2fNc61ca8d3.jpg\",\n" +
                "\t\t\t\t\"remark\": null,\n" +
                "\t\t\t\t\"createDate\": null,\n" +
                "\t\t\t\t\"updateDate\": null,\n" +
                "\t\t\t\t\"clickRate\": 1480,\n" +
                "\t\t\t\t\"buyRate\": 0,\n" +
                "\t\t\t\t\"stock\": 0,\n" +
                "\t\t\t\t\"isHot\": \"0\",\n" +
                "\t\t\t\t\"isNew\": \"1\",\n" +
                "\t\t\t\t\"classifyId\": null,\n" +
                "\t\t\t\t\"discount\": \"8.6\",\n" +
                "\t\t\t\t\"activityId\": 3,\n" +
                "\t\t\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\t\t\"desc\": null\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"name\": \"雅诗兰黛（Estee Lauder）肌初赋活原生液200ml(护肤精华 化妆水 保湿补水收缩毛孔)\",\n" +
                "\t\t\t\t\"price\": 789,\n" +
                "\t\t\t\t\"privilegePrice\": 830,\n" +
                "\t\t\t\t\"imgUrl\": \"https://img13.360buyimg.com/n7/s370x370_jfs/t6082/110/283779492/177938/4777ed9d/59278aa7N6184a2a7.jpg!q70.jpg\",\n" +
                "\t\t\t\t\"details\": \"https://img30.360buyimg.com/sku/jfs/t7762/211/596627530/158129/e114b194/59950a30Nd0954785.jpg;https://img30.360buyimg.com/sku/jfs/t7087/297/2342012803/143179/dbb61f07/59950a30N0d740ad5.jpg;https://img30.360buyimg.com/sku/jfs/t7720/239/612920808/190684/9567dfdb/59950a36Nc1cf7a79.jpg;https://img30.360buyimg.com/sku/jfs/t7369/129/575950154/131595/f854d3/59950a3bN8bde8f40.jpg; https://img30.360buyimg.com/sku/jfs/t7405/194/582328689/113983/1fcf8044/59950a3cNb45812ad.jpg;https://img30.360buyimg.com/sku/jfs/t7543/227/604818492/61207/be368306/59950a3fN1e99583d.jpg;https://img30.360buyimg.com/sku/jfs/t7150/215/2311699304/134385/9d284f1d/59950a3fN965f7096.jpg\",\n" +
                "\t\t\t\t\"remark\": null,\n" +
                "\t\t\t\t\"createDate\": null,\n" +
                "\t\t\t\t\"updateDate\": null,\n" +
                "\t\t\t\t\"clickRate\": 921,\n" +
                "\t\t\t\t\"buyRate\": 0,\n" +
                "\t\t\t\t\"stock\": 0,\n" +
                "\t\t\t\t\"isHot\": \"0\",\n" +
                "\t\t\t\t\"isNew\": \"1\",\n" +
                "\t\t\t\t\"classifyId\": null,\n" +
                "\t\t\t\t\"discount\": \"9.5\",\n" +
                "\t\t\t\t\"activityId\": 3,\n" +
                "\t\t\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\t\t\"desc\": null\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"name\": \"雅诗兰黛（Estee Lauder）新肌透修护眼部密集精华15ml （眼霜 眼部精华）\",\n" +
                "\t\t\t\t\"price\": 579,\n" +
                "\t\t\t\t\"privilegePrice\": 612,\n" +
                "\t\t\t\t\"imgUrl\": \"https://img11.360buyimg.com/n2/s350x350_jfs/t9172/137/1477928132/173142/818b28aa/59ba1769N9c9b7660.jpg!q70.jpg\",\n" +
                "\t\t\t\t\"details\": \"https://img30.360buyimg.com/sku/jfs/t9220/313/1466732076/281478/bacc5253/59ba148eN2ed8e131.jpg;https://img30.360buyimg.com/sku/jfs/t8248/341/1478174160/295419/9f84cc2a/59ba1483N4679ccbf.jpg;https://img30.360buyimg.com/sku/jfs/t8305/284/1459181835/293444/62b3f471/59ba148eN98be0bf4.jpg\",\n" +
                "\t\t\t\t\"remark\": null,\n" +
                "\t\t\t\t\"createDate\": null,\n" +
                "\t\t\t\t\"updateDate\": null,\n" +
                "\t\t\t\t\"clickRate\": 719,\n" +
                "\t\t\t\t\"buyRate\": 0,\n" +
                "\t\t\t\t\"stock\": 0,\n" +
                "\t\t\t\t\"isHot\": \"0\",\n" +
                "\t\t\t\t\"isNew\": \"1\",\n" +
                "\t\t\t\t\"classifyId\": null,\n" +
                "\t\t\t\t\"discount\": \"9.5\",\n" +
                "\t\t\t\t\"activityId\": 3,\n" +
                "\t\t\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\t\t\"desc\": null\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"name\": \"欧莱雅 LOREAL 男士水能保湿酷爽水凝露120ml（保湿露 保湿乳 渗透补水 滋润肌肤）\",\n" +
                "\t\t\t\t\"price\": 80,\n" +
                "\t\t\t\t\"privilegePrice\": 96,\n" +
                "\t\t\t\t\"imgUrl\": \"https://m.360buyimg.com/mobilecms/s750x750_jfs/t2485/63/1124159075/138072/23f993a/567a57a8N2b78637b.jpg!q80.jpg\",\n" +
                "\t\t\t\t\"details\": \"https://img30.360buyimg.com/sku/jfs/t18790/311/1703785993/130517/ead29478/5ad41d19Ne24533d7.jpg;https://img30.360buyimg.com/sku/jfs/t18430/119/1674078028/243123/89b96b5f/5ad41d19Nd11f1e72.jpg;https://img30.360buyimg.com/sku/jfs/t18262/107/1621910801/273269/d67a0d81/5ad41d19N37fea36e.jpg;https://img30.360buyimg.com/sku/jfs/t18265/330/1683439864/181669/633b783b/5ad41d19N3a546bfc.jpg;https://img30.360buyimg.com/sku/jfs/t17032/281/1674652732/133031/1447ac31/5ad41d19Ne58feb49.jpg;https://img30.360buyimg.com/sku/jfs/t19780/104/1710555938/196959/cf308621/5ad41d19Nb79580da.jpg\",\n" +
                "\t\t\t\t\"remark\": null,\n" +
                "\t\t\t\t\"createDate\": null,\n" +
                "\t\t\t\t\"updateDate\": null,\n" +
                "\t\t\t\t\"clickRate\": 1023,\n" +
                "\t\t\t\t\"buyRate\": 0,\n" +
                "\t\t\t\t\"stock\": 0,\n" +
                "\t\t\t\t\"isHot\": \"0\",\n" +
                "\t\t\t\t\"isNew\": \"1\",\n" +
                "\t\t\t\t\"classifyId\": null,\n" +
                "\t\t\t\t\"discount\": \"8.3\",\n" +
                "\t\t\t\t\"activityId\": 2,\n" +
                "\t\t\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\t\t\"desc\": null\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"name\": \"欧莱雅(LOREAL)复颜玻尿酸化妆品护肤套装(晶露130ml+乳液110ml+晶露65ml+乳液50ml+导入霜15ml(赠品随机发))\",\n" +
                "\t\t\t\t\"price\": 129,\n" +
                "\t\t\t\t\"privilegePrice\": 134,\n" +
                "\t\t\t\t\"imgUrl\": \"https://m.360buyimg.com/mobilecms/s750x750_jfs/t19711/150/2470548977/494387/9d4aba06/5af699aaNc796b9f2.png!q80.jpg\",\n" +
                "\t\t\t\t\"details\": \"https://img30.360buyimg.com/sku/jfs/t19681/25/2211634922/224287/191b4eab/5aec3acbN626f89d4.jpg;https://img30.360buyimg.com/sku/jfs/t2467/315/1479078334/2361/4757d7d6/566010f4N01f5d17a.png;https://img30.360buyimg.com/sku/jfs/t16642/306/2220348263/237236/7a8104c9/5aec3af5N9813656b.jpg;https://img30.360buyimg.com/sku/jfs/t9727/247/1192461728/260447/b2a56938/59dddb16Ne97d12c9.jpg;https://img30.360buyimg.com/sku/jfs/t10876/185/1189988925/237051/caeaf09f/59dddb23N88df21ff.jpg;https://img30.360buyimg.com/sku/jfs/t14422/331/2526414129/205527/11b1b27b/5aa5f151Nf20af9d3.jpg;https://img30.360buyimg.com/sku/jfs/t2467/315/1479078334/2361/4757d7d6/566010f4N01f5d17a.png\",\n" +
                "\t\t\t\t\"remark\": null,\n" +
                "\t\t\t\t\"createDate\": null,\n" +
                "\t\t\t\t\"updateDate\": null,\n" +
                "\t\t\t\t\"clickRate\": 543,\n" +
                "\t\t\t\t\"buyRate\": 0,\n" +
                "\t\t\t\t\"stock\": 0,\n" +
                "\t\t\t\t\"isHot\": \"0\",\n" +
                "\t\t\t\t\"isNew\": \"1\",\n" +
                "\t\t\t\t\"classifyId\": null,\n" +
                "\t\t\t\t\"discount\": \"9.6\",\n" +
                "\t\t\t\t\"activityId\": 2,\n" +
                "\t\t\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\t\t\"desc\": null\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"name\": \"欧莱雅（LOREAL）三合一卸妆洁颜水深层清洁魔力水套装（倍润型400ml+95mlx3（随机发)）\",\n" +
                "\t\t\t\t\"price\": 129,\n" +
                "\t\t\t\t\"privilegePrice\": 134,\n" +
                "\t\t\t\t\"imgUrl\": \"https://m.360buyimg.com/mobilecms/s750x750_jfs/t15238/58/712902288/156770/2353e01c/5a364885N51145b5f.jpg!q80.jpg\",\n" +
                "\t\t\t\t\"details\": \"https://img30.360buyimg.com/sku/jfs/t14401/144/2085783970/231641/69229849/5a7ab846N8f9106b2.jpg;https://img30.360buyimg.com/sku/jfs/t2467/315/1479078334/2361/4757d7d6/566010f4N01f5d17a.png;https://img30.360buyimg.com/sku/jfs/t20563/281/1399665309/202489/eda62271/5b27aabaNd42e4aa1.jpg;https://img30.360buyimg.com/sku/jfs/t21274/261/1374564555/286328/3c29ac9c/5b27ab05Nc91ab167.jpg;https://img30.360buyimg.com/sku/jfs/t23767/308/172580340/208361/fef0db6/5b27aabfNa0b1602c.jpg;https://img30.360buyimg.com/sku/jfs/t7525/166/1132029644/187066/d63ee227/599aaa3eN99d283ae.jpg;https://img30.360buyimg.com/sku/jfs/t7882/103/1148017296/231718/90bd1c2d/599aaa3eNda158c72.jpg;https://img30.360buyimg.com/sku/jfs/t7636/202/1167823696/378127/73068b16/599aaa3eNefe16087.jpg\",\n" +
                "\t\t\t\t\"remark\": null,\n" +
                "\t\t\t\t\"createDate\": null,\n" +
                "\t\t\t\t\"updateDate\": null,\n" +
                "\t\t\t\t\"clickRate\": 658,\n" +
                "\t\t\t\t\"buyRate\": 0,\n" +
                "\t\t\t\t\"stock\": 0,\n" +
                "\t\t\t\t\"isHot\": \"0\",\n" +
                "\t\t\t\t\"isNew\": \"1\",\n" +
                "\t\t\t\t\"classifyId\": null,\n" +
                "\t\t\t\t\"discount\": \"9.6\",\n" +
                "\t\t\t\t\"activityId\": 2,\n" +
                "\t\t\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\t\t\"desc\": null\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"name\": \"欧莱雅(LOREAL)金致臻颜化妆品护肤套装(洁面+活肤水+乳液+眼霜；赠活源液*3+日霜+眼霜旅行装)\",\n" +
                "\t\t\t\t\"price\": 899,\n" +
                "\t\t\t\t\"privilegePrice\": 912,\n" +
                "\t\t\t\t\"imgUrl\": \"https://img10.360buyimg.com/evalpic/s750x750_jfs/t18412/313/1972566277/119773/84b93707/5adfe0c0N2d3afb08.jpg.dpg\",\n" +
                "\t\t\t\t\"details\": \"https://img30.360buyimg.com/sku/jfs/t20773/174/189321095/124383/34d408e5/5b027095N114edd30.jpg;https://img30.360buyimg.com/sku/jfs/t22054/195/194589200/113441/6d7cc199/5b027096N5250a046.jpg;https://img30.360buyimg.com/sku/jfs/t21415/23/192126494/138668/126bd835/5b027095N41797db2.jpg;https://img30.360buyimg.com/sku/jfs/t18187/26/2640598371/206476/b9bd39a9/5b027096Nfb2fe414.jpg;https://img30.360buyimg.com/sku/jfs/t19744/242/2669201655/117277/503ff0db/5b027095Na8564fbc.jpg;https://img30.360buyimg.com/sku/jfs/t19675/281/2657017683/76454/6ee7c792/5b027094N2cff2eab.jpg;https://img30.360buyimg.com/sku/jfs/t21412/25/192896743/80548/558c9d21/5b027095Na7af23f1.jpg\",\n" +
                "\t\t\t\t\"remark\": null,\n" +
                "\t\t\t\t\"createDate\": null,\n" +
                "\t\t\t\t\"updateDate\": null,\n" +
                "\t\t\t\t\"clickRate\": 548,\n" +
                "\t\t\t\t\"buyRate\": 0,\n" +
                "\t\t\t\t\"stock\": 0,\n" +
                "\t\t\t\t\"isHot\": \"0\",\n" +
                "\t\t\t\t\"isNew\": \"1\",\n" +
                "\t\t\t\t\"classifyId\": null,\n" +
                "\t\t\t\t\"discount\": \"9.9\",\n" +
                "\t\t\t\t\"activityId\": 2,\n" +
                "\t\t\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\t\t\"desc\": null\n" +
                "\t\t\t}]";
        List<GoodsInfo> list = JSON.parseArray(jsonStr,GoodsInfo.class);
        boolean save = goodsInfoService.saveBatch(list);
        System.out.println(save);

    }
}
