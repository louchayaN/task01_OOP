package com.corporation.task01.service.validation;

import java.util.Map;

import com.corporation.task01.entity.criteria.Criteria;

public interface ApplianceValidator {

	<E> Map<String, String> validate(Criteria<E> criteria);
}
