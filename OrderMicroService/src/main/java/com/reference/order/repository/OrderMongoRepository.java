package com.reference.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.reference.order.entity.OrderEntity;
@Transactional
public interface OrderMongoRepository extends MongoRepository<OrderEntity,String>{

}
