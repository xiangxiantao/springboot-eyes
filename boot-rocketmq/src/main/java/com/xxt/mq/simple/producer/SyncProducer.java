package com.xxt.mq.simple.producer;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * @Auther: haytt.xiang
 * @Date: 2020/5/20 15:02
 * @Description: 发送同步消息
 */
public class SyncProducer {

    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("GroupA");
        producer.setNamesrvAddr("49.235.190.5:9876");
        producer.start();
        for (int i = 0; i < 10; i++) {
            Message message=new Message("SimpleTopic","SpecTag",("Hello MQ"+i).getBytes());
            SendResult sendResult = producer.send(message);
            System.out.println(sendResult);
        }
        producer.shutdown();
    }

}
