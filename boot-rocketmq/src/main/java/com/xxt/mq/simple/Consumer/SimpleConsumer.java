package com.xxt.mq.simple.Consumer;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * @Auther: haytt.xiang
 * @Date: 2020/5/20 20:03
 * @Description:
 */
public class SimpleConsumer {

    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer=new DefaultMQPushConsumer("SimpleConsumerGroup");
        consumer.setNamesrvAddr("49.235.190.5:9876");
        consumer.subscribe("SimpleTopic","*");
        consumer.subscribe("AsynTopic","*");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            /**
             *
             * @param list
             * @param consumeConcurrentlyContext
             * @return
             */
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                System.out.println(Thread.currentThread().getName()+"收到消息数量："+list.size());
                for (MessageExt messageExt : list) {
                    System.out.println("msgid:"+messageExt.getMsgId()+"  详情："+messageExt);
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();
        System.out.println("消费者开始消费消息");
    }

}
