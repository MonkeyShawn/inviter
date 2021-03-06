package cn.doodlister.api.app.zs;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ZSServiceTest {
    ZSService service = new ZSService();
    @Test
    void sendCode() throws Exception {
        Map<String, String> dataMap = service.sendCode("");
        System.out.println(dataMap);
        //{phone=8613230282281, region=cn, request_id=1516345485950895}
    }

    @Test
    void login() throws Exception {
        Map<String, String> dataMap = new HashMap<String, String>();
        dataMap.put("request_id","");
        dataMap.put("phone","");
        service.login("", dataMap);
        System.out.println(dataMap);
        //{uid=7852456, code=739087, phone=8613230282281, session=30j4i0BbGoq1zJUCrvDncoIgbemIbkPf2BuEwE79qxb8XYYHgi3i3, request_id=1516345485950895, platform=phone}
    }

    @Test
    void bindInviteCode() throws Exception {
        Map<String, String> dataMap = new HashMap<String, String>();
        dataMap.put("request_id","");
        dataMap.put("phone","");
        dataMap.put("uid","");
        dataMap.put("code","");
        dataMap.put("session","");
        service.bindInviteCode("",dataMap);
        System.out.println(dataMap);
    }

}