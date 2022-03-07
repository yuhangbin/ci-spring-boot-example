package com.yu.ci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuhangbin
 * @date 2022/3/7
 **/
public class EchoBotTest {

	@Test
	void testEcho() {
		String expect = "hello";
		EchoBot echoBot = new EchoBot();
		Assertions.assertEquals(expect, echoBot.echo(expect));
	}
}
