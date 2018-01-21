package com.corporation.task01.dao.impl.builder;

import java.util.Map;

import com.corporation.task01.dao.ApplianceEntityBuilder;
import com.corporation.task01.entity.Appliance;
import com.corporation.task01.entity.Speakers;

public class SpeakersEntityBuilder implements ApplianceEntityBuilder {

	@Override
	public Appliance build(Map<String, String> applianceCharacteristics) {
		
		Speakers speakers = new Speakers();
		
		speakers.setPowerConsumption(Double.parseDouble(applianceCharacteristics.get("POWER_CONSUMPTION")));
		speakers.setNumberOfSpeakers(Double.parseDouble(applianceCharacteristics.get("NUMBER_OF_SPEAKERS")));
		speakers.setFrequencyRange(applianceCharacteristics.get("FREQUENCY_RANGE"));
		speakers.setCordLength(Double.parseDouble(applianceCharacteristics.get("CORD_LENGTH")));
		
		return speakers;
	}

}
