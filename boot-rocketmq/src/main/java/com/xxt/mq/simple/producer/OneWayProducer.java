package com.xxt.mq.simple.producer;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.nio.charset.Charset;

/**
 * @Auther: haytt.xiang
 * @Date: 2020/5/20 19:47
 * @Description: 单向消息的发送
 */
public class OneWayProducer {

    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException {
        DefaultMQProducer producer = new DefaultMQProducer("OneWayGroup");
        producer.setNamesrvAddr("49.235.190.5:9876");
        producer.start();
        for (int i = 0; i < 10; i++) {
            Message message = new Message("OneWayTopoc", "OneWay", ("单向消息" + i).getBytes(Charset.forName("UTF-8")));
            producer.sendOneway(message);
        }
        producer.shutdown();
    }

}
