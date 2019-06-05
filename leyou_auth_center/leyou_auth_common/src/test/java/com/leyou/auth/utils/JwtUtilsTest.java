package com.leyou.auth.utils;


import com.leyou.auth.entity.UserInfo;
import org.junit.Before;
import org.junit.Test;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @author bystander
 * @date 2018/10/1
 */
public class JwtUtilsTest {

    private static final String publicKeyPath = "D:\\ducoment\\key\\rsa.pub";
    private static final String privateKeyPath = "D:\\ducoment\\key\\rsa.pri";

    private PrivateKey privateKey;
    private PublicKey publicKey;





    @Test
    public void testRsa() throws Exception {
        RsaUtils.generateKey(publicKeyPath, privateKeyPath, "23454554454");
    }

    @Before
    public void testGetRsa() throws Exception {
        privateKey = RsaUtils.getPrivateKey(privateKeyPath);
        publicKey = RsaUtils.getPublicKey(publicKeyPath);
    }

    @Test
    public void generateToken() {
        //生成Token
        String s = JwtUtils.generateToken(new UserInfo(10L, "Jack"), privateKey, 5);
        System.out.println("s = " + s);
        System.out.println("publicKey:"+publicKey);
    }


    @Test
    public void parseToken() {
       String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6MTAsInVzZXJuYW1lIjoiSmFjayIsImV4cCI6MTU1OTc1MDAzOH0.fbXfowhNCMb5-P69wT7fzhiop1rc_cNYv20y58-a7w9-S1z3luVI1MTfxyCOV0BsLtv7rOFmaDqSyv5t9gDqVQUS7sOhtr5Pj6eFuFJ-ObP7vQQfwzw8tZwwIn6BhlSVQx2V8iSW4TiScOqmYPePOYou24OQGXlWsvDJde2GJpo";
       UserInfo userInfo = JwtUtils.getUserInfo(publicKey, token);
        System.out.println("id:" + userInfo.getId());
        System.out.println("name:" + userInfo.getName());
    }

    @Test
    public void parseToken1() {
    }

    @Test
    public void getUserInfo() {
    }

    @Test
    public void getUserInfo1() {
    }
}