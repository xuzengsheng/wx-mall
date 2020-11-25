package com.wx.mall;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.wx.mall.entity.GoodsInfo;
import com.wx.mall.service.GoodsInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

        String jsonStr = "[\n" +
                "\t{\n" +
                "\t\t\"name\": \"韩国进口 A.by Bom艾柏梵超能婴儿冰凝叶子面膜10片\",\n" +
                "\t\t\"price\": 129,\n" +
                "\t\t\"privilegePrice\": 138,\n" +
                "\t\t\"imgUrl\": \"https://m.360buyimg.com/n12/jfs/t16969/88/1564110409/175802/5a26675e/5acf2422N76c30469.png!q70.jpg\",\n" +
                "\t\t\"details\": \"https://img10.360buyimg.com/imgzone/jfs/t15079/250/1378141301/90210/c5411bbb/5a4ce51aNda84dc5a.jpg;https://img10.360buyimg.com/imgzone/jfs/t14554/230/1355421978/43906/d1b2e3d/5a4ce518N95b58aa5.jpg;https://img10.360buyimg.com/imgzone/jfs/t16174/26/1128731260/160481/c88be136/5a4ce512N58d61b46.jpg;https://img10.360buyimg.com/imgzone/jfs/t14737/209/1338124278/63666/481bb308/5a4ce520Nb26519d4.jpg;https:////img30.360buyimg.com/sku/jfs/t19075/243/1609006120/266561/710d3aa3/5ad06f17N4f7f152b.jpg;https://img10.360buyimg.com/imgzone/jfs/t15916/327/1199031650/68490/b0082cc/5a4ce521N64d24657.jpg\\n\",\n" +
                "\t\t\"remark\": null,\n" +
                "\t\t\"createDate\": null,\n" +
                "\t\t\"updateDate\": null,\n" +
                "\t\t\"clickRate\": 162,\n" +
                "\t\t\"buyRate\": 0,\n" +
                "\t\t\"stock\": 0,\n" +
                "\t\t\"isHot\": \"0\",\n" +
                "\t\t\"isNew\": \"1\",\n" +
                "\t\t\"classifyId\": null,\n" +
                "\t\t\"discount\": \"9.3\",\n" +
                "\t\t\"activityId\": null,\n" +
                "\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\"desc\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"韩国进口 A.by Bom艾柏梵超能婴儿基因再生桃花面膜5片\",\n" +
                "\t\t\"price\": 89,\n" +
                "\t\t\"privilegePrice\": 101,\n" +
                "\t\t\"imgUrl\": \"https://m.360buyimg.com/n12/jfs/t17983/118/1563399958/139443/efd76f63/5acf23d7Nd76e0a77.png!q70.jpg\",\n" +
                "\t\t\"details\": \"https://img10.360buyimg.com/imgzone/jfs/t15802/158/1316273396/120942/2d01b87d/5a4efea2N8cc2fbe3.jpg;https://img10.360buyimg.com/imgzone/jfs/t14800/333/1703088600/38534/80f023c7/5a55855fNd5ef51de.jpg;https://img10.360buyimg.com/imgzone/jfs/t16276/276/1177227900/150449/af90e7d4/5a4efea2N0318e978.jpg;https://img10.360buyimg.com/imgzone/jfs/t14197/175/1423119730/94268/fc1265f1/5a4efe9bNc80c86d0.jpg;https://img10.360buyimg.com/imgzone/jfs/t14506/328/1440386772/118215/43d5e0b6/5a4efea2Ncef088fa.jpg;https://img10.360buyimg.com/imgzone/jfs/t14611/174/1709964950/130347/76ddd87d/5a558557N1873ca8e.jpg;https://img10.360buyimg.com/imgzone/jfs/t15082/240/1448420653/68120/a4cfb8f7/5a4efe8eNdd413c20.jpg;https://img10.360buyimg.com/imgzone/jfs/t14605/306/1440959264/63911/a25b2d3b/5a4efea2N2abb2c5e.jpg\",\n" +
                "\t\t\"remark\": null,\n" +
                "\t\t\"createDate\": null,\n" +
                "\t\t\"updateDate\": null,\n" +
                "\t\t\"clickRate\": 85,\n" +
                "\t\t\"buyRate\": 0,\n" +
                "\t\t\"stock\": 0,\n" +
                "\t\t\"isHot\": \"0\",\n" +
                "\t\t\"isNew\": \"1\",\n" +
                "\t\t\"classifyId\": null,\n" +
                "\t\t\"discount\": \"8.8\",\n" +
                "\t\t\"activityId\": null,\n" +
                "\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\"desc\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"品牌直采 捷俊（JAYJUN）防雾霾透白修护面膜27ml 10片/盒\",\n" +
                "\t\t\"price\": 170,\n" +
                "\t\t\"privilegePrice\": 189,\n" +
                "\t\t\"imgUrl\": \"https://m.360buyimg.com/n12/jfs/t8449/52/2392309676/452472/94321a74/59cca5d0Nce6b2c02.jpg!q70.jpg\",\n" +
                "\t\t\"details\": \"https://img13.360buyimg.com/cms/jfs/t17965/171/354796120/303498/7f82de87/5a6eb0a8N578f2343.jpg;https://img13.360buyimg.com/cms/jfs/t17947/171/361108889/190428/dda759b/5a6eb0afN8ea3ec36.jpg;https://img12.360buyimg.com/cms/jfs/t16561/339/1923038925/133524/1143567d/5a6eb0b6N2b31e442.jpg;https://img20.360buyimg.com/cms/jfs/t16711/196/352610166/148325/6dde9ab7/5a6eb0cfN2c4746af.jpg;https://img30.360buyimg.com/cms/jfs/t19267/208/346999378/156410/1c807d8c/5a6eb0d2N7dbac4b3.jpg;https://img30.360buyimg.com/cms/jfs/t15454/106/2105960102/124164/d99166ef/5a6eb12eN19dcc83a.jpg;https://img11.360buyimg.com/cms/jfs/t16606/208/349833968/155296/6d8db454/5a6eb147Nf8344ead.jpg;https://img20.360buyimg.com/cms/jfs/t15748/64/2000451802/89546/7fedc0f7/5a6eb153Neee61999.jpg;https://img10.360buyimg.com/cms/jfs/t17749/303/356150240/232440/52fed16a/5a6eb169N778e8c12.jpg\",\n" +
                "\t\t\"remark\": null,\n" +
                "\t\t\"createDate\": null,\n" +
                "\t\t\"updateDate\": null,\n" +
                "\t\t\"clickRate\": 131,\n" +
                "\t\t\"buyRate\": 0,\n" +
                "\t\t\"stock\": 0,\n" +
                "\t\t\"isHot\": \"0\",\n" +
                "\t\t\"isNew\": \"1\",\n" +
                "\t\t\"classifyId\": null,\n" +
                "\t\t\"discount\": \"9.0\",\n" +
                "\t\t\"activityId\": null,\n" +
                "\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\"desc\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"品牌直采 捷俊(JAYJUN)玫瑰精华面膜25ml*10 补水保湿\",\n" +
                "\t\t\"price\": 135,\n" +
                "\t\t\"privilegePrice\": 168,\n" +
                "\t\t\"imgUrl\": \"https://m.360buyimg.com/n12/jfs/t3085/190/8770910845/187674/11f0949d/58c89972N2e5c175a.jpg!q70.jpg\",\n" +
                "\t\t\"details\": \"https://img20.360buyimg.com/vc/jfs/t5140/134/330610343/294446/9e31bdf4/58fdcd46N6419e6f3.jpg;http://img20.360buyimg.com/vc/jfs/t4684/19/4035557253/114995/7d35afc3/59092f1dN6860e95d.jpg;https://img20.360buyimg.com/vc/jfs/t4438/148/4036236532/135006/14271bef/59092f1cNbffc9a5f.jpg;https://img10.360buyimg.com/cms/jfs/t11683/102/133142231/306297/f0da95c6/59e8606aNbefec256.jpg;https://img20.360buyimg.com/vc/jfs/t5131/283/899507858/141629/75e93696/59092f21N58eba3d9.jpg;https://img13.360buyimg.com/cms/jfs/t11245/200/139867059/59473/256356fc/59e8608fNdb60d364.jpg;https://img11.360buyimg.com/cms/jfs/t7873/161/2797699140/225589/d34008c6/59e855a5N6539c5a5.jpg\",\n" +
                "\t\t\"remark\": null,\n" +
                "\t\t\"createDate\": null,\n" +
                "\t\t\"updateDate\": null,\n" +
                "\t\t\"clickRate\": 182,\n" +
                "\t\t\"buyRate\": 0,\n" +
                "\t\t\"stock\": 0,\n" +
                "\t\t\"isHot\": \"0\",\n" +
                "\t\t\"isNew\": \"1\",\n" +
                "\t\t\"classifyId\": null,\n" +
                "\t\t\"discount\": \"8.0\",\n" +
                "\t\t\"activityId\": null,\n" +
                "\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\"desc\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"SNP 熊猫动物面膜贴 10片/盒 嫩白嫩肤\",\n" +
                "\t\t\"price\": 99,\n" +
                "\t\t\"privilegePrice\": 128,\n" +
                "\t\t\"imgUrl\": \"https://m.360buyimg.com/n12/jfs/t4636/150/2567807586/195397/84a288e3/58f08f6dN6e4d3f68.jpg!q70.jpg\",\n" +
                "\t\t\"details\": \"https://img20.360buyimg.com/vc/jfs/t4420/82/2561615509/99651/26cf187b/58f03228N816bf65b.jpg;https://img20.360buyimg.com/vc/jfs/t4576/357/2914412627/102245/601e8bcf/58f48268N29c4b295.jpg;https://img20.360buyimg.com/vc/jfs/t4546/61/2903516973/91037/4e0ffab5/58f48268N988c19da.jpg;https://img20.360buyimg.com/vc/jfs/t4504/72/2480847299/100868/6ac17ea5/58f0322bNadf17bec.jpg;https://img20.360buyimg.com/vc/jfs/t5722/225/4553703286/98604/5c7b7ab5/5950ac14N2916289f.jpg;https://img20.360buyimg.com/vc/jfs/t4432/211/2365321936/102059/705ff735/58f0322dNb83b7327.jpg;https://img20.360buyimg.com/vc/jfs/t4654/71/2479480452/70583/4d08c08b/58f0322cNa845be74.jpg\",\n" +
                "\t\t\"remark\": null,\n" +
                "\t\t\"createDate\": null,\n" +
                "\t\t\"updateDate\": null,\n" +
                "\t\t\"clickRate\": 127,\n" +
                "\t\t\"buyRate\": 0,\n" +
                "\t\t\"stock\": 0,\n" +
                "\t\t\"isHot\": \"0\",\n" +
                "\t\t\"isNew\": \"1\",\n" +
                "\t\t\"classifyId\": null,\n" +
                "\t\t\"discount\": \"7.7\",\n" +
                "\t\t\"activityId\": null,\n" +
                "\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\"desc\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"朵玺Dr.Douxi赋活新生卵壳膜100g 紧致毛孔 锁水保湿 白色\",\n" +
                "\t\t\"price\": 249,\n" +
                "\t\t\"privilegePrice\": 280,\n" +
                "\t\t\"imgUrl\": \"https://m.360buyimg.com/n12/jfs/t15760/240/2364180613/156292/ef903739/5aa1f8d5Ndd42acd3.jpg!q70.jpg\",\n" +
                "\t\t\"details\": \"https://img10.360buyimg.com/imgzone/jfs/t15274/79/2422919843/349134/17bcd260/5a9e880fNff929e75.jpg;https://img10.360buyimg.com/imgzone/jfs/t17044/228/668258528/204068/838bea39/5a9e880fNaea3579d.jpg;https://img10.360buyimg.com/imgzone/jfs/t18841/260/639063252/306396/137e665f/5a9e8810N06aedfa4.jpg;https://img10.360buyimg.com/imgzone/jfs/t19258/148/662223497/297520/28ff243a/5a9e8810Nf2f538c2.jpg;https://img10.360buyimg.com/imgzone/jfs/t19453/254/653770633/308718/77c99727/5a9e8811Nc19aac86.jpg;https://img10.360buyimg.com/imgzone/jfs/t15340/267/2439419638/355328/e0b26f3f/5a9e8811Na42a7292.jpg\",\n" +
                "\t\t\"remark\": null,\n" +
                "\t\t\"createDate\": null,\n" +
                "\t\t\"updateDate\": null,\n" +
                "\t\t\"clickRate\": 1434,\n" +
                "\t\t\"buyRate\": 0,\n" +
                "\t\t\"stock\": 0,\n" +
                "\t\t\"isHot\": \"0\",\n" +
                "\t\t\"isNew\": \"1\",\n" +
                "\t\t\"classifyId\": null,\n" +
                "\t\t\"discount\": \"8.9\",\n" +
                "\t\t\"activityId\": null,\n" +
                "\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\"desc\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"韩国进口 蒂佳婷（Dr.Jart+）水动力活力水润面膜25ml*5片/盒\",\n" +
                "\t\t\"price\": 99.9,\n" +
                "\t\t\"privilegePrice\": 102.5,\n" +
                "\t\t\"imgUrl\": \"https://m.360buyimg.com/n12/jfs/t5551/160/329741133/205414/3ac1307/58fdb6a5N68dde194.jpg!q70.jpg\",\n" +
                "\t\t\"details\": \"https://img10.360buyimg.com/imgzone/jfs/t4837/126/1458842939/76890/a7ef907e/58f0a2e4Nff3c0aba.jpg;https://img10.360buyimg.com/imgzone/jfs/t4504/150/2557666272/35785/f46a13c7/58f0a2e9N308932a6.jpg;https://img10.360buyimg.com/imgzone/jfs/t4801/250/1450796110/65450/aaafe714/58f0a306Nab80de4f.jpg;https://img10.360buyimg.com/imgzone/jfs/t5284/49/1157123501/91674/aba646af/590c40ccN65851c26.jpg;https://img10.360buyimg.com/imgzone/jfs/t5449/47/1129291465/91044/d2388fc2/590bdfe7N117b6701.jpg;https://img10.360buyimg.com/imgzone/jfs/t4660/38/4268046310/44601/dc55f658/590c4089Nb198ef2b.jpg\",\n" +
                "\t\t\"remark\": null,\n" +
                "\t\t\"createDate\": null,\n" +
                "\t\t\"updateDate\": null,\n" +
                "\t\t\"clickRate\": 103,\n" +
                "\t\t\"buyRate\": 0,\n" +
                "\t\t\"stock\": 0,\n" +
                "\t\t\"isHot\": \"0\",\n" +
                "\t\t\"isNew\": \"1\",\n" +
                "\t\t\"classifyId\": null,\n" +
                "\t\t\"discount\": \"9.7\",\n" +
                "\t\t\"activityId\": null,\n" +
                "\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\"desc\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"品牌直采 韩国 捷俊(JAYJUN)水光樱花面膜三部曲25ml 10片/盒\",\n" +
                "\t\t\"price\": 150,\n" +
                "\t\t\"privilegePrice\": 172.5,\n" +
                "\t\t\"imgUrl\": \"https://m.360buyimg.com/n12/jfs/t3124/255/8602351009/241617/559927c2/58c899b3N8df4bd72.jpg!q70.jpg\",\n" +
                "\t\t\"details\": \"https://img14.360buyimg.com/cms/jfs/t12343/316/887057782/88519/4f284e41/5a150e8aN196a8ddf.jpg;https://img30.360buyimg.com/cms/jfs/t17017/2/340545752/172027/27e48839/5a6e88e9Nce1160de.jpg;https://img13.360buyimg.com/cms/jfs/t14668/344/2119312842/177873/384d37a2/5a6e88f0Ned4ec6c6.jpg;https://img30.360buyimg.com/cms/jfs/t18931/364/367076441/98073/4ee13acd/5a6e88f7Ne742e30c.jpg;https://img30.360buyimg.com/cms/jfs/t18766/341/352628783/129184/442b28ec/5a6e88feN3b1d4730.jpg;https://img30.360buyimg.com/cms/jfs/t19456/339/358546634/110763/719b8d65/5a6e8906N286d8766.jpg;https://img10.360buyimg.com/cms/jfs/t15085/282/2032906665/182238/569f4f77/5a6e890eNabd2ced7.jpg;https://img13.360buyimg.com/cms/jfs/t18466/357/345693950/213982/77f33df5/5a6e8916N22aa3a4e.jpg;https://img20.360buyimg.com/cms/jfs/t19513/79/353672782/227873/3ff2ee4f/5a6e8928N04049c5a.jpg;https://img14.360buyimg.com/cms/jfs/t16141/300/1987302595/122333/2ecaa01c/5a6e8930N5d6fd252.jpg;https://img14.360buyimg.com/cms/jfs/t13543/219/2385328042/225589/d34008c6/5a6e893fNf0560a14.jpg\",\n" +
                "\t\t\"remark\": null,\n" +
                "\t\t\"createDate\": null,\n" +
                "\t\t\"updateDate\": null,\n" +
                "\t\t\"clickRate\": 46,\n" +
                "\t\t\"buyRate\": 0,\n" +
                "\t\t\"stock\": 0,\n" +
                "\t\t\"isHot\": \"0\",\n" +
                "\t\t\"isNew\": \"1\",\n" +
                "\t\t\"classifyId\": null,\n" +
                "\t\t\"discount\": \"8.7\",\n" +
                "\t\t\"activityId\": null,\n" +
                "\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\"desc\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"韩国 美迪惠尔(Mediheal) 可莱丝 N.M.F针剂水库面膜贴10片/盒 \",\n" +
                "\t\t\"price\": 109,\n" +
                "\t\t\"privilegePrice\": 118,\n" +
                "\t\t\"imgUrl\": \"https://m.360buyimg.com/n12/jfs/t15052/115/2139262461/423349/5957e91f/5a712387N0365d980.jpg!q70.jpg\",\n" +
                "\t\t\"details\": \"https://img14.360buyimg.com/cms/jfs/t12343/316/887057782/88519/4f284e41/5a150e8aN196a8ddf.jpg;https://img10.360buyimg.com/imgzone/jfs/t17545/197/418825931/103385/d0e303f0/5a742eb2Nc1421032.jpg;https://img10.360buyimg.com/imgzone/jfs/t18136/283/404256508/300888/436357fe/5a742eb2N8499ed83.jpg;https://img10.360buyimg.com/imgzone/jfs/t16789/337/414130656/298203/7d33cfb7/5a742eb3Nf4153453.jpg;https://img10.360buyimg.com/imgzone/jfs/t17578/18/409122228/224890/6ab90be6/5a742eb2N894426b2.jpg;https://img10.360buyimg.com/imgzone/jfs/t16696/347/430880407/17875/f0fa9615/5a742eb2Nbca4e689.jpg;https://img14.360buyimg.com/cms/jfs/t11032/271/1584395193/57051/a878fd8/5a043166N881eb0c9.jpg;https://img20.360buyimg.com/cms/jfs/t13240/263/5509684/245444/712e644/5a018433N8469d2b1.jpg;https://img10.360buyimg.com/cms/jfs/t12544/274/7251752/305141/5f03d2f4/5a018436N11ec41e5.jpg;https://img11.360buyimg.com/cms/jfs/t14026/244/7105757/296438/9f8b0330/5a018435Nb2209323.jpg;https://img14.360buyimg.com/cms/jfs/t13528/244/7720805/205355/5cd86d41/5a018433N937a3a6f.jpg\",\n" +
                "\t\t\"remark\": null,\n" +
                "\t\t\"createDate\": null,\n" +
                "\t\t\"updateDate\": null,\n" +
                "\t\t\"clickRate\": 36,\n" +
                "\t\t\"buyRate\": 0,\n" +
                "\t\t\"stock\": 0,\n" +
                "\t\t\"isHot\": \"0\",\n" +
                "\t\t\"isNew\": \"1\",\n" +
                "\t\t\"classifyId\": null,\n" +
                "\t\t\"discount\": \"9.2\",\n" +
                "\t\t\"activityId\": null,\n" +
                "\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\"desc\": null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"name\": \"日本肌美精（Kracie）3D浸透高保湿补水面膜4片/盒（玫红）\",\n" +
                "\t\t\"price\": 60,\n" +
                "\t\t\"privilegePrice\": 81,\n" +
                "\t\t\"imgUrl\": \"https://m.360buyimg.com/n12/jfs/t12682/83/568380680/582254/a6481400/5a0e8e23Nc9175fe5.jpg!q70.jpg\",\n" +
                "\t\t\"details\": \"https://img14.360buyimg.com/cms/jfs/t12343/316/887057782/88519/4f284e41/5a150e8aN196a8ddf.jpg;https://img30.360buyimg.com/popWaterMark/jfs/t11434/316/2014606650/429795/65aa49a9/5a0e8e57N9dcafb7b.jpg;https://img30.360buyimg.com/popWaterMark/jfs/t13564/216/573238045/312020/520e1cc6/5a0e8e2eNce0011c3.jpg;https://img30.360buyimg.com/popWaterMark/jfs/t14155/191/564000039/355656/1af845be/5a0e8e57N69a2c7fa.jpg;https://img30.360buyimg.com/popWaterMark/jfs/t13738/205/551957394/367934/5a1c4046/5a0e8e54N0cf8650e.jpg;https://img30.360buyimg.com/popWaterMark/jfs/t14074/213/560401806/495535/e8d3f7dd/5a0e8e47Nd5aeb138.jpg\",\n" +
                "\t\t\"remark\": null,\n" +
                "\t\t\"createDate\": null,\n" +
                "\t\t\"updateDate\": null,\n" +
                "\t\t\"clickRate\": 1193,\n" +
                "\t\t\"buyRate\": 0,\n" +
                "\t\t\"stock\": 0,\n" +
                "\t\t\"isHot\": \"0\",\n" +
                "\t\t\"isNew\": \"1\",\n" +
                "\t\t\"classifyId\": null,\n" +
                "\t\t\"discount\": \"7.4\",\n" +
                "\t\t\"activityId\": null,\n" +
                "\t\t\"shopGoodsImageList\": null,\n" +
                "\t\t\"desc\": null\n" +
                "\t}\n" +
                "]";
        List<GoodsInfo> list = JSON.parseArray(jsonStr,GoodsInfo.class);
        boolean save = goodsInfoService.saveBatch(list);
        System.out.println("》》》》插入结果："+save);

    }
}
