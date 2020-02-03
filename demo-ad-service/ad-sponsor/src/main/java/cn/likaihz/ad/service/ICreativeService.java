package cn.likaihz.ad.service;

import cn.likaihz.ad.vo.CreativeRequest;
import cn.likaihz.ad.vo.CreativeResponse;

/**
 * @author Li Kai
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
