package cn.likaihz.ad.service;

import cn.likaihz.ad.entity.AdPlan;
import cn.likaihz.ad.exception.AdException;
import cn.likaihz.ad.vo.AdPlanGetRequest;
import cn.likaihz.ad.vo.AdPlanRequest;
import cn.likaihz.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * @author Li Kai
 */
public interface IAdPlanService {
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
