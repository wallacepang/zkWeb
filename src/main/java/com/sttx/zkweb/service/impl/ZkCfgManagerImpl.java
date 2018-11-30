package com.sttx.zkweb.service.impl;

import com.sttx.zkweb.mapper.ZkConfigMapper;
import com.sttx.zkweb.model.ZkConfig;
import com.sttx.zkweb.service.ZkCfgManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 
 * @ClassName: ZkCfgManagerImpl
 * @Description: zookeeper 配置实现类
 * @author: chenchaoyun0
 * @date: 2016年8月21日 下午2:35:06
 */
@Service
@Slf4j
public class ZkCfgManagerImpl implements ZkCfgManager {

  @Autowired
  private ZkConfigMapper zkConfigMapper;

  @Override
  public void add(ZkConfig zkConfig) throws Exception {
    try {
      log.info("add zkConfig:{}" + zkConfig);
      zkConfigMapper.save(zkConfig);
    } catch (Exception e) {
      log.error("add zkCfg error : {}", e.getMessage(), e);
      throw new Exception("insert zkconfig exception");
    }
  }

  @Override
  public List<ZkConfig> query() throws Exception {
    try {
      log.info("query List<ZkConfig>.");
      return zkConfigMapper.findAll();
    } catch (Exception e) {
      log.error("queryzkCfg error : {}", e.getMessage(), e);
      throw new Exception("select zkconfig exception");
    }
  }

  @Override
  public void update(ZkConfig zkConfig) throws Exception {
    try {
      log.info("update List<ZkConfig> : {}", zkConfig);
      zkConfigMapper.save(zkConfig);
    } catch (Exception e) {
      log.error("update kCfg error : {}", e.getMessage(), e);
      throw new Exception("update zkconfig exception");
    }
  }

  @Override
  public void delete(String zkId) throws Exception {
    try {
      log.info("delete ZkConfig by zkId : {}", zkId);
      zkConfigMapper.deleteById(zkId);
    } catch (Exception e) {
      log.error("delete id={} zkCfg error : {}", zkId, e.getMessage(), e);
      throw new Exception("delete zkconfig exception");
    }
  }

  @Override
  public ZkConfig findById(String zkId) throws Exception {
    try {
      log.info("find ZkConfig by zkId : {}", zkId);
      Optional<ZkConfig> byId = zkConfigMapper.findById(zkId);
      return byId.orElse(null);
    } catch (Exception e) {
      log.error("findById id={} zkCfg error : {}", zkId, e.getMessage(), e);
      throw new Exception("SELECT zkconfig exception");
    }
  }

  @Override
  public List<ZkConfig> query(int page, int rows) throws Exception {
    try {
      log.info("query ZkConfig pages : {},{}", page, rows);
      return zkConfigMapper.findAll();
    } catch (Exception e) {
      log.error("query ZkConfig pages error : {}", e.getMessage(), e);
      throw new Exception("SELECT page zkconfig exception");
    }
  }

  @Override
  public int count() throws Exception {
    try {
      log.info("query ZkConfig count : {}");
      return zkConfigMapper.findAll().size();
    } catch (Exception e) {
      log.error("count id={} zkCfg error : {}", e.getMessage(), e);
      throw new Exception("SELECT page zkconfig exception");
    }
  }

}
