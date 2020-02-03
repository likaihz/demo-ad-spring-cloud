package cn.likaihz.ad.service.impl;

import cn.likaihz.ad.dao.CreativeRepository;
import cn.likaihz.ad.entity.Creative;
import cn.likaihz.ad.service.ICreativeService;
import cn.likaihz.ad.vo.CreativeRequest;
import cn.likaihz.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Li Kai
 */
@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
