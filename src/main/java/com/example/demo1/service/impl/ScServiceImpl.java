package com.example.demo1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo1.entity.Sc;
import com.example.demo1.mapper.ScMapper;
import com.example.demo1.service.ScService;
import org.springframework.stereotype.Service;

@Service
public class ScServiceImpl extends ServiceImpl<ScMapper, Sc> implements ScService {
}
